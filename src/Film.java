import java.lang.System;
public class Film {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRatings;
    int durationInMinutes;

    public int getTotalRatings() {
        return totalRatings;
    }

    void displayTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void evaluate(double note){
        sumOfRatings += note;
        totalRatings ++;
    }

    double getAverage(){
        return sumOfRatings / totalRatings;
    }

}
