
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//Scanner para ler as variáveis
        Scanner scanner = new Scanner(System.in);

//Variáveis
        double raio = scanner.nextDouble();
        double pi = Math.round(Math.PI * 100000.0) / 100000.0;

//processamento 
        double area = pi * Math.pow(raio, 2);
//Saída
        System.out.printf("A=%.4f%n", +area);

    }

}
