package br.com.alura.javaflix.model;

import br.com.alura.javaflix.calculation.Sortable;

import java.lang.System;
public class Film extends Title implements Sortable {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getSortable() {
        return (int) getAverage() / 2;
    }
}
