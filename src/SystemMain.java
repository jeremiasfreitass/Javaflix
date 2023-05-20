import br.com.alura.javaflix.calculation.TimeCalculator;
import br.com.alura.javaflix.model.Film;
import br.com.alura.javaflix.model.Serie;

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

        Serie serie1 = new Serie();
        serie1.setName("La Casa de Papel");
        serie1.setReleaseYear(2020);
        serie1.setSeasons(2);
        serie1.setEpisodesBySeason(10);
        serie1.setMinutesByEpisode(60);
        serie1.displayTechnicalSheet();
        System.out.println("Maratonar La casa de Papel: " + serie1.getDurationInMinutes());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(film1);
        timeCalculator.includes(serie1);
        System.out.println(timeCalculator.getTotalTime());

    }
}
