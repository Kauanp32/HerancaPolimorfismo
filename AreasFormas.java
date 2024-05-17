package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca.Circle;
import entities.heranca.Rectangle;
import entities.heranca.Shape;
import entities.enums.Heranca.Color;

public class AreasFormas { // Declaração da classe AreasFormas

    public static void main(String[] args) { // Método principal

        Locale.setDefault(Locale.US); // Define o local como EUA para entrada de dados com ponto decimal
        Scanner sc = new Scanner(System.in); // Objeto Scanner para entrada de dados

        List<Shape> list = new ArrayList<>(); // Lista para armazenar as formas

        System.out.print("Enter the number of shapes: "); // Solicita o número de formas
        int n = sc.nextInt(); // Lê o número de formas

        for (int i = 1; i <= n; i++) { // Loop para inserir os dados de cada forma
            System.out.println("Shape #" + i + " data:"); // Mensagem para inserção dos dados da forma
            System.out.print("Rectangle or Circle (r/c)? "); // Pergunta se é um retângulo ou um círculo
            char ch = sc.next().charAt(0); // Lê a resposta

            System.out.print("Color (BLACK/BLUE/RED): "); // Pede a cor da forma
            Color color = Color.valueOf(sc.next()); // Lê a cor da forma

            if (ch == 'r') { // Se for um retângulo
                System.out.print("Width: "); // Pede a largura
                double width = sc.nextDouble(); // Lê a largura
                System.out.print("Height: "); // Pede a altura
                double height = sc.nextDouble(); // Lê a altura
                list.add(new Rectangle(color, width, height)); // Adiciona um novo retângulo à lista
            } else { // Se for um círculo
                System.out.print("Radius: "); // Pede o raio
                double radius = sc.nextDouble(); // Lê o raio
                list.add(new Circle(color, radius)); // Adiciona um novo círculo à lista
            }
        }

        System.out.println(); // Pula uma linha
        System.out.println("SHAPE AREAS:"); // Título para as áreas das formas

        for (Shape shape : list) { // Loop para calcular e exibir as áreas das formas
            System.out.println(String.format("%.2f", shape.area())); // Exibe a área da forma atual
        }

        sc.close(); // Fecha o Scanner
    }
}