package view;
import model.Circulo;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();


    Circulo circulo = new Circulo(raio);

    System.out.println("Raio do círculo: " + circulo.raio);
    System.out.println("Perímetro do círculo: " + circulo.getPerimetro());
    System.out.println("Área do círculo: " + circulo.getArea());

    scanner.close();
}
}