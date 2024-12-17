package com.example.model;

public class GizPastel {
    private String cor;
    private boolean emEstoque;

    public GizPastel(String cor, boolean emEstoque) {
        this.cor = cor;
        this.emEstoque = emEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
    }
}
