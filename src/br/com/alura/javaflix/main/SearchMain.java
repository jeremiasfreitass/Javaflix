package br.com.alura.javaflix.main;

import br.com.alura.javaflix.exception.ConversionYearException;
import br.com.alura.javaflix.model.Title;
import br.com.alura.javaflix.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Buscar filme: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")){
                break;
            }

            String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=45c3eb3f";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);


                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Titulo convertido: " + myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro!");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ConversionYearException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("film.json");
        writer.write(gson.toJson(titles));
        writer.close();

        System.out.println("Finalizou corretamente.");

    }
}
