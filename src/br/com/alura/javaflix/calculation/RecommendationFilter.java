package br.com.alura.javaflix.calculation;

public class RecommendationFilter {
    private String recommendation;
    public void filter(Sortable sortable){
        if (sortable.getSortable() >= 4){
            System.out.println("É muito recomendado!");
        }else if (sortable.getSortable() >= 2){
            System.out.println("É pouco recomendado!");
        }else {
            System.out.println("No momento, não recomendamos!");
        }
    }
}
