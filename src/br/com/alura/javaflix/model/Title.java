package br.com.alura.javaflix.model;

import com.google.gson.annotations.SerializedName;

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

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
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

    @Override
    public String toString() {
        return "(Name = " + name + " - Release Year = " + releaseYear + " - Duration in minutes: " + durationInMinutes+")";
    }
}
