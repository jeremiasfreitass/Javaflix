package br.com.alura.javaflix.model;

public class Title implements Comparable<Title>{
    private String name;
    private int releaseYear;

    private boolean includedInThePlan;

    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displayTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void evaluate(double note){
        sumOfRatings += note;
        totalRatings ++;
    }

    public double getAverage(){
        return sumOfRatings / totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public int compareTo(Title o) {
        return this.getName().compareTo(o.getName());
    }
}
