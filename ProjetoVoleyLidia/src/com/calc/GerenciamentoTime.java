package com.calc;

import java.util.Scanner;

public class GerenciamentoTime {

    public Time[] times = new Time[5];
    public int indice =0;



    public static void main(String[] args) {
        // write your code here
        GerenciamentoTime gerenciador = new GerenciamentoTime();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            //loop
            //Menu
            System.out.println("Menu Principal");
            System.out.println("1..Cadastrar Time");
            System.out.println("2..Cadastrar Jogador");
            System.out.println("3..Listar Jogadores");
            System.out.println("4..Listar Times");
            System.out.println("9..Sair");
            System.out.println("Digite a opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                        gerenciador.cadastrarTime();
                    break;
                case 2:
                        System.out.println("Digite a posicao em que quer cadastrar: ");
                        int posicao = Integer.parseInt(sc.nextLine());
                         gerenciador.cadastrarJogador(posicao);
                     break;
                case 3:
                    System.out.println("Digite a posicao do times em que quer listar os jogadores: ");
                     posicao = Integer.parseInt(sc.nextLine());
                    gerenciador.listarJogadores(posicao);
                    break;
                case 4:
                    gerenciador.listarTimes();
                    break;
                case 9:
                    System.out.println("Fim!");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        } while (opc != 9);


    }//

    private void listarTimes() {
        if(indice != 0){
            for (int i=0; i < indice; i++){
                if(times[i] != null){
                    System.out.println(times[i].nome);
                }
            }
        }
    }//listarTimes

    private void listarJogadores(int posicao) {
        if(times[posicao] != null) {
            times[posicao].listarJogador();
        }else{
            System.out.println("Impossivel listar jogadores");
        }
    }//listarJogadores

    private void cadastrarTime() {
        if(indice < 6){
            Time time = new Time();
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o nome do times: ");
            time.nome = in.nextLine();

            System.out.println("Digite o id do times: ");
            time.id = Integer.parseInt(in.nextLine());

            time.jogadores = new Jogador[6];
            times[indice] = time;
            indice++;

            System.out.println("Time " + time.nome + " cadastrado com sucesso!");
        }else {
            System.out.println("Impossivel cadastrar times");
        }

    }//cadastrarTime

    private void cadastrarJogador(int posicao) {
        if(times[posicao] != null){
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < 6; i ++){
                Jogador jogador = new Jogador();
                int j = i + 1;
                System.out.println("Digite os dados do " + j +"° jogador");
                System.out.println("Digite o numero do jogador: ");
                jogador.numero = Integer.parseInt(in.nextLine());
                System.out.println("Digite o nome do jogador: ");
                jogador.nome = in.nextLine();
                System.out.println("Digite a idade do jogador: ");
                jogador.idade = Integer.parseInt(in.nextLine());
                System.out.println("Digite a posicao do jogador: ");
                jogador.posicao = in.nextLine();
                times[posicao].addJogador(jogador);
            }//for
        }else{
            System.out.println("Impossivel adicionar jogador");
        }
    }//cadastrarJogador
}
