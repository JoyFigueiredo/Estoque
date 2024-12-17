package com.example.model;

public class Linha {
    private String tex;
    private String cor;
    private String codigo;
    private int quantidade;
    private boolean emEstoque;
    private String marca;
    private String tipo;

    public Linha(String tex, String cor, String codigo, int quantidade, boolean emEstoque, String marca, String tipo) {
        this.tex = tex;
        this.cor = cor;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.emEstoque = emEstoque;
        this.marca = marca;
        this.tipo = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Em estoque: " + (emEstoque ? "Sim" : "Não"));
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
    }
}
