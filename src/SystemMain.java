import br.com.alura.javaflix.model.Film;

public class SystemMain {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.setName("Eu sou a Lenda");
        film1.setReleaseYear(2008);
        film1.setDurationInMinutes(131);

        film1.displayTechnicalSheet();

        film1.evaluate(8);
        film1.evaluate(5);
        film1.evaluate(10);

        System.out.println("Total de avaliações: " + film1.getTotalRatings());
        System.out.println(film1.getAverage());

    }
}
