package com.calc;

public class Time {
    public int id;
    public String nome;
    public Jogador[] jogadores = new Jogador[6];
    public int indice = 0;

    public void listarJogador(){
        for (int i = 0; i < 6 ; i++) {
            if(jogadores[i] != null)
                 System.out.println(jogadores[i].nome);
        }
    }

    public void cadastrarTime(int id, String nome, Jogador [] jogadores) {
        this.id = id;
        this.nome = nome;
        this.jogadores = jogadores;
    }//cadastrarTime

    public void addJogador(Jogador jogador){
        if(indice < 6){
            jogadores[indice] = jogador;
            indice++;
        }//if

    }//addJogador

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);

        for(int i = 0; i < 6; i++) {
            if (jogadores[i] != null) {
                jogadores[i].imprimir();
                System.out.println("--------------------------");
            }

        }
    }//imprimir
}//Time
