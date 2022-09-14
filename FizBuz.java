package bosch;

import java.util.Scanner;

public class FizBuz {
    public static void main(String[] args) {
        float n;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = s.nextInt();

        if(n%2 ==0 && n%5 ==0) {
            System.out.println("FizBuzz");
        }
        else if (n%2 ==0) {
            System.out.println("Fizz");
        }
        else if (n%5 ==0){
            System.out.println("Buzz");
            }
        else{
            System.out.println("ERRO!!");
            }
        }
    }


