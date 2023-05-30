package br.com.alura.javaflix.main;

import br.com.alura.javaflix.model.Film;
import br.com.alura.javaflix.model.Serie;
import br.com.alura.javaflix.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListWithMain {
    public static void main(String[] args) {

        Film film1 = new Film("bNome Filme1",2008 );
        film1.evaluate(10);
        Film film2 = new Film("cNome Filme2",2009 );
        film2.evaluate(5);
        Film film3 = new Film("aNome Filme3",2010);
        film3.evaluate(7);

        Serie serie1 = new Serie("Nome Série1",2020);

        ArrayList<Title> listOfTitle = new ArrayList<>();
        listOfTitle.add(film1);
        listOfTitle.add(film2);
        listOfTitle.add(film3);
        listOfTitle.add(serie1);

        System.out.println(listOfTitle.size());

        for (Title item: listOfTitle) {
            System.out.println(item.getName());
            if (item instanceof Film film && film.getAverage() > 2) {
                System.out.println("Classificação" + film.getAverage());
            }
        }

        Collections.sort(listOfTitle);
        System.out.println("\nOrdenando lista de titulos em ordem alfabetica:");
        System.out.println(listOfTitle);

        listOfTitle.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("\nOrdenando lista de titulos em ordem do ano de lançamento:");
        System.out.println(listOfTitle);

        //listOfTitle.forEach(item -> System.out.println(item.getName()));
        //listOfTitle.forEach(System.out::println);
    }
}
