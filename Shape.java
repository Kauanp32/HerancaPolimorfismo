package entities.HerancaPolimorfismo;

import entities.enums.Heranca.Color;
// Importa a enumeração Color do pacote entities.enums.Heranca

// Declaração do pacote onde a classe Shape está localizada

public abstract class Shape {
    // Declaração da classe Shape como abstrata

    private Color color;
    // Declaração de uma variável de instância privada para armazenar a cor da forma

    // Construtor padrão da classe Shape
    public Shape() {
    }
    
    // Construtor da classe Shape que recebe a cor como parâmetro
    public Shape(Color color) {
        this.color = color;
        // Inicializa a variável de instância color com a cor fornecida como argumento
    }

    // Método getter para obter a cor da forma
    public Color getColor() {
        return color;
    }

    // Método setter para definir a cor da forma
    public void setColor(Color color) {
        this.color = color;
    }
    
    // Método abstrato area() que será implementado nas classes filhas para calcular a área da forma
    public abstract double area();
    // Não há implementação neste método aqui, pois ele é abstrato e será implementado nas subclasses.
}