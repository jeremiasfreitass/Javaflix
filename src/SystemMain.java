public class SystemMain {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.name = "Eu sou a Lenda";
        film1.releaseYear = 2008;
        film1.durationInMinutes = 131;

        film1.displayTechnicalSheet();

        film1.evaluate(8);
        film1.evaluate(5);
        film1.evaluate(10);

        System.out.println("Total de avaliações: " + film1.getTotalRatings());
        System.out.println(film1.getAverage());

    }
}
