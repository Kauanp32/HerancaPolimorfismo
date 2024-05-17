package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import java.text.ParseException;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca.ImportedProduct;
import entities.heranca.Product;
import entities.heranca.UsedProduct;

public class Produtos { // Declaração da classe Produtos

    public static void main(String[] args) throws ParseException { // Método principal

        Locale.setDefault(Locale.US); // Define o local como EUA para entrada de dados com ponto decimal
        Scanner sc = new Scanner(System.in); // Objeto Scanner para entrada de dados

        List<Product> list = new ArrayList<>(); // Lista para armazenar os produtos

        System.out.print("Entre com o numero de produtos: "); // Solicita o número de produtos
        int n = sc.nextInt(); // Lê o número de produtos

        for (int i = 1; i <= n; i++) { // Loop para inserir os dados de cada produto
            System.out.println("Dados do produto #" + i + ":"); // Mensagem para inserção dos dados do produto
            System.out.print("Comum, usado, importado (c/u/i)? "); // Pergunta sobre o tipo de produto
            char type = sc.next().charAt(0); // Lê o tipo de produto
            System.out.print("Nome: "); // Pede o nome do produto
            sc.nextLine(); // Limpa o buffer do teclado
            String name = sc.nextLine(); // Lê o nome do produto
            System.out.print("Preco: "); // Pede o preço do produto
            double price = sc.nextDouble(); // Lê o preço do produto
            if (type == 'c') { // Se for um produto comum
                list.add(new Product(name, price)); // Adiciona um novo produto à lista
            } else if (type == 'u') { // Se for um produto usado
                System.out.print("Data de fabricacao (DD/MM/YYYY): "); // Pede a data de fabricação
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Lê e converte a data de fabricação
                list.add(new UsedProduct(name, price, date)); // Adiciona um novo produto usado à lista
            } else { // Se for um produto importado
                System.out.print("Taxa de importacao: "); // Pede a taxa de importação
                double customsFee = sc.nextDouble(); // Lê a taxa de importação
                list.add(new ImportedProduct(name, price, customsFee)); // Adiciona um novo produto importado à lista
            }
        }

        System.out.println(); // Pula uma linha
        System.out.println("ETIQUETAS DE PRECO:"); // Título para as etiquetas de preço
        for (Product prod : list) { // Loop para exibir as etiquetas de preço de cada produto
            System.out.println(prod.priceTag()); // Exibe a etiqueta de preço do produto atual
        }

        sc.close(); // Fecha o Scanner
    }
}