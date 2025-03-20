package com.example.atividade_lanche02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lanches")
public class Lanche {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    @Column(name = "img_url")
    private String img_url;

    @Column(name = "preco")
    private double preco;

    @Column(name = "codigo")
    private int codigo;

    public Lanche(String nome, String img_url, double preco, int codigo) {
        this.nome = nome;
        this.img_url = img_url;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double calcularLanche(int quantidade){
        return getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Lanche [nome=" + nome 
            + ", img_url=" + img_url 
            + ", preco=" + preco 
            + ", codigo=" + codigo + "]";
    }
    
}
