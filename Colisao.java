package bosch;

import java.util.Scanner;

public class Colisao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp;
        double tempo, Sa, velocidadeB = 0, velocidadeA = 0;
        double posicaoA = 0, posicaoB = 0;

        String verde = 	"\u001B[32m"; //definindo as cores que vão aparecer no terminal
        String azul = "\u001B[34m";
        String amarelo = "\u001B[33m";

        while (true) { //While true principal
            while (true) { //try catch para verificação da posição dos trens. Se estiver fora das exigências ele voltára o código através do "CONTINUE"
                try {
                    System.out.print(verde+"Digite a posição do trem A: ");
                    posicaoA = s.nextDouble();

                    if ((posicaoA >10000) || (posicaoA < 0)) {
                        System.out.println("A posição do trem A é inválida! ");
                        continue;
                    }
                    System.out.print("Digite a velocidade do trem A: ");
                    velocidadeA = s.nextDouble();
                    System.out.println("----------------------------------------------");
                    break;
                } catch (Exception e) { //Retornar erro em qualquer situação EX: se colocar letra, acentos
                    System.out.println("ERRO");
                    s.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.print(azul+"Digite a posição do trem B: ");
                    posicaoB = s.nextDouble();

                    if ((posicaoB > 10000) || (posicaoB < 0)) {
                        System.out.println("A posição do trem B é inválida! ");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("ERRO!! ");
                    s.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem B: ");
                    velocidadeB = s.nextDouble();
                    System.out.println("----------------------------------------------");
                    if (velocidadeB < -300.0 || velocidadeB > 0) {
                        System.out.println("Digite a velocidade negativa");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Erro!!");
                    s.nextLine();
                }
            }
            tempo = ((posicaoA - posicaoB) / (velocidadeB - velocidadeA));
            Sa = posicaoA + (velocidadeA * tempo);

            if (tempo <= 0) {
                System.out.println(amarelo + "Eles não vão colidir");
            } else {
                System.out.println("A colisão dos trens acontecerá no KM " + Sa + "e ocorrerá após" + tempo * 3600 + "segundos");
            }
            System.out.print("Deseja continuar? ");
            resp = s.nextInt();

            if(resp == 1){
                continue;
            }
            else{
                System.out.println("Tchau user! ");

                break;
            }
        }
    }
}
