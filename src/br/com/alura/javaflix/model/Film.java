package br.com.alura.javaflix.model;

import java.lang.System;
public class Film extends Title{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
