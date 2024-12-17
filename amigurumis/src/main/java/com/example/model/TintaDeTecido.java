package com.example.model;

public class TintaDeTecido {
    private String marca;
    private String cor;
    private String codigo;
    private int quantidade;
    private boolean emEstoque;

    public TintaDeTecido(String marca, String cor, String codigo, int quantidade, boolean emEstoque) {
        this.marca = marca;
        this.cor = cor;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.emEstoque = emEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
    }
}
