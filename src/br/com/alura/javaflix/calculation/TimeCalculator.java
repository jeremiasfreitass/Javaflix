package br.com.alura.javaflix.calculation;

import br.com.alura.javaflix.model.Film;
import br.com.alura.javaflix.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }
    public void includes(Title title){
        totalTime += title.getDurationInMinutes();
    }
}
