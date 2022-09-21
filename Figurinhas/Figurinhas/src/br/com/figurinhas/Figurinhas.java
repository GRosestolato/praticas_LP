package br.com.figurinhas;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class Figurinhas {
    public static void main(String[] args) {

        String nome[] = new String[5];
        String selecao[] = new String[5];
        int idade[] = new int[5];
        int sumIdade = 0, mediaIdade = 0;
        String[] posicao = new String[5];
        int[] numJogador = new int[5];
        String formacao1 = "4-3-3";
        String[] desenhoFormacao1 = new String[11];
        desenhoFormacao1[0] = "GL";
        desenhoFormacao1[1] = "LD";
        desenhoFormacao1[2] = "ZAG";
        desenhoFormacao1[3] = "ZAG";
        desenhoFormacao1[4] = "LE";
        desenhoFormacao1[5] = "MC";
        desenhoFormacao1[6] = "MC";
        desenhoFormacao1[7] = "MC";
        desenhoFormacao1[8] = "ATA";
        desenhoFormacao1[9] = "ATA";
        desenhoFormacao1[10] = "ATA";
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

            for (int i = 0; i < nome.length; i++) {
                System.out.print("Informe o nome do jogador da figurinha: ");
                nome[i] = entrada.nextLine();
                System.out.print("Qual a idade do jogador? ");
                idade[i] = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Em qual seleção este jogador joga? ");
                selecao[i] = entrada.nextLine();
                System.out.print("Qual o número da camisa do jogador?");
                numJogador[i] = entrada.nextInt();
                System.out.print("Qual a posição desse jogador? ");
                posicao[i] = ler.nextLine();
            }
            desenhoFormacao1[] =
                System.out.print( desenhoFormacao1[i]);
                System.out.println("Nome: " + nome[i]);
                System.out.println("Numero: " + numJogador[i]);
                    
            
        
            for (int i = 0; i < idade.length; i++) {
                if (nome[i].equals("Marquinhos")) {
                    System.out.println("Marquinhos vai levantar a taça do Hexa");
                } else if (nome[i].equals("Hulk")) {
                    System.out.println("Dessa vez não vai dar para você!");
                }
                if (selecao[i].equals("Argentina")) {
                    System.out.println("Adeus los hermanos!!!");
                }
                    sumIdade = sumIdade + idade[i];
                }

                    mediaIdade = (sumIdade / idade.length);
                    System.out.println("A copa do mundo possui média de idade " + mediaIdade);

            }


}