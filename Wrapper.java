package bosch;

public class Wrapper {
    public static void main(String[] args) {
        //WRAPPER INT
        Integer i = 1000;
        Byte b = 100;
        Short s = 100;
        Long l = 1000L;
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);

        //WRAPPER FLOAT
        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        //WRAPPER BOOLEAN
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        //CONVERSÃO DE NÚMEROS

        //CONVERTENDO UM N° INTEGER PARA STRING
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        //VARIÁVEL INT SENDO TRANSFORMADA EM STRING ATRAVÉS DO INTEGER.TO STRING
        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        //Transformando double para string e mostrando o tamanho
        Double pi = 3.50;
        System.out.println(Double.toString(pi).length());

        //TRANSFORMANDO STRING EM N° INTEIRO
        String numero1 = "12";
        int x = Integer.parseInt(numero1);

        //TRANSFORMANDO STRING EM N° DOUBLE
        String numero = "3.14";
        Double y = Double.parseDouble(numero);

        double soma = x + y;
        System.out.println(soma);

        //TRANSFORMANDO DOUBLE PARA FLOAT
        double a = 1.222245;
        System.out.println(a);

        double b = (float) a;
        System.out.println(b);

        //DOUBLE PARA INT
        double e = 1.9999;
        int f = (int) e;
        System.out.println(f);

    }
}
