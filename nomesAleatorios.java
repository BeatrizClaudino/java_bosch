package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class nomesAleatorios {
    public static void main(String[] args) {
        int sorteio = 0;

        //Criando a lista de nomes dos alunos
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Adhayne", "Beatriz", "Emilly", "Gabriel Batista",
                "Gabriel Tejero", "Graziely", "Guilherme", "Gustavo", "José", "Lucas Capovilla", "Lucas Macharete", "Livia", "Luisa", "Michael", "Naely"));

        //Criando a variável do número aleatório
        Random aleatorio = new Random();
        int tamanho;

        //Se o tamanho da lista dividido por 2 restar 0. O tamanho da lista será dividido por 2
        if (nomes.size()%2 == 0) {
            tamanho = nomes.size()/2;

        }
        //Se não. O tamanho da lista será dividido por 2 e acrescentará mais 1 nome
        else {
            tamanho = (nomes.size()/2)+1;
        }

        //removendo os nomes da lista de forma aleatória
        for (int i = 0; i < tamanho; i++) {
            sorteio = aleatorio.nextInt(nomes.size());
            nomes.remove(sorteio);

        }
        System.out.println(nomes);

    }
}
