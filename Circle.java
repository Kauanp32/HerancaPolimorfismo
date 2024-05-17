package entities.HerancaPolimorfismo;

import entities.enums.Heranca.Color; // Importa o enum Color do pacote entities.enums.Heranca

public class Circle extends Shape { // Declaração da classe Circle que herda da classe Shape

    private Double radius; // Raio do círculo

    // Construtor padrão
    public Circle() {
        super(); // Chama o construtor da classe pai (Shape)
    }
    
    // Construtor com parâmetros
    public Circle(Color color, Double radius) {
        super(color); // Chama o construtor da classe pai (Shape) e passa a cor como parâmetro
        this.radius = radius; // Inicializa o raio
    }

    // Método para obter o raio do círculo
    public Double getRadius() {
        return radius;
    }

    // Método para definir o raio do círculo
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Método para calcular a área do círculo
    @Override
    public double area() {
        return Math.PI * radius * radius; // Retorna a área do círculo (π * raio^2)
    }
}