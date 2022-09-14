package bosch;

public class Aula4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.printf("x=%d y=%d\n", x, y);
        x++;
        y++;
        System.out.println();

        //ORDEM DE PRECEDÊNCIA
        System.out.println(10 + 2 * 20);
        System.out.println(16 > 8 + 8);
        System.out.println(10 + 2 == 6 * 2);

        int x = 3, y = 4, z = 5;
        System.out.println(x < y && z > y);

        System.out.println(!(x < y) == x > y);
        System.out.println(!(y < x) && x > z || z < y);
        System.out.println(x == z - y && z != y - x || y != z - x);


        String resultado;
        double media = 4.9;

        //IF TERNÁRIO DE UMA LINHA
        resultado = media >= 5 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


    }
}
