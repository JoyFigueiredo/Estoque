package com.example.model;

public class Acessorios {
    private String tipo;
    private int quantidade;
    private String cor;
    private int tamanho;
    private boolean emEstoque;

    public Acessorios(String tipo, int quantidade, String cor, int tamanho, boolean emEstoque) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.cor = cor;
        this.tamanho = tamanho;
        this.emEstoque = emEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
    }
}
