package com.example.model;

public class Amigurumi {
    private String nome;
    private int quantidade;
    private double tamanho;
    private double preco;
    private boolean emEstoque;

    public Amigurumi(String nome, int quantidade, double tamanho, double preco, boolean emEstoque) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tamanho = tamanho;
        this.preco = preco;
        this.emEstoque = emEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$" + preco);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
    }
}
