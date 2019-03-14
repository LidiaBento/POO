package com.calc;

public class Jogador {
    public int numero;
    public String nome;
    public int idade;
    public String posicao;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
    }

    public void cadastrarJogador(int numero, String nome, int idade, String posicao){
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }//cadastrarJogador
}
