package com.example.atividade_lanche02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lanches")
public class Lanche {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private double preco;

    public Lanche() {
    }

    public Lanche(String imgUrl, String nome, double preco) {
        this.imgUrl = imgUrl;
        this.nome = nome;
        this.preco = preco;
    }

    public Lanche(int id, String nome, String imgUrl, double preco) {
        this.id = id;
        this.nome = nome;
        this.imgUrl = imgUrl;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularLanche(int quantidade){
        return getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
