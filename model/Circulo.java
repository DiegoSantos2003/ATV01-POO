package model;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

   
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para calcular a área do círculo
    public double getArea() {
        return Math.PI * raio * raio;
    }

    }

