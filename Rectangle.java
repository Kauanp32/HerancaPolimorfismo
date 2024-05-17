package entities.HerancaPolimorfismo;

import entities.enums.Heranca.Color; // Importa o enum Color do pacote entities.enums.Heranca

public class Rectangle extends Shape { // Declaração da classe Rectangle que herda da classe Shape

    private Double width; // Largura do retângulo
    private Double height; // Altura do retângulo
    
    // Construtor padrão
    public Rectangle() {
        super(); // Chama o construtor da classe pai (Shape)
    }

    // Construtor com parâmetros
    public Rectangle(Color color, Double width, Double height) {
        super(color); // Chama o construtor da classe pai (Shape) e passa a cor como parâmetro
        this.width = width; // Inicializa a largura
        this.height = height; // Inicializa a altura
    }

    // Método para obter a largura
    public Double getWidth() {
        return width;
    }

    // Método para definir a largura
    public void setWidth(Double width) {
        this.width = width;
    }

    // Método para obter a altura
    public Double getHeight() {
        return height;
    }

    // Método para definir a altura
    public void setHeight(Double height) {
        this.height = height;
    }

    // Método para calcular a área do retângulo
    @Override
    public double area() {
        return width * height; // Retorna a área do retângulo (largura * altura)
    }
}