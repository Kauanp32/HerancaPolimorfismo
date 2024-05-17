package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import java.text.ParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca.Company;
import entities.heranca.Individual;
import entities.heranca.TaxPayer;

public class Taxes { // Declaração da classe Taxes

    public static void main(String[] args) throws ParseException { // Método principal

        Locale.setDefault(Locale.US); // Define o local como EUA para entrada de dados com ponto decimal
        Scanner sc = new Scanner(System.in); // Objeto Scanner para entrada de dados

        List<TaxPayer> list = new ArrayList<>(); // Lista para armazenar os contribuintes

        System.out.print("Enter the number of tax payers: "); // Solicita o número de contribuintes
        int n = sc.nextInt(); // Lê o número de contribuintes

        for (int i = 1; i <= n; i++) { // Loop para inserir os dados de cada contribuinte
            System.out.println("Tax payer #" + i + " data:"); // Mensagem para inserção dos dados do contribuinte
            System.out.print("Individual or company (i/c)? "); // Pergunta se é pessoa física ou jurídica
            char type = sc.next().charAt(0); // Lê o tipo de contribuinte
            System.out.print("Name: "); // Pede o nome do contribuinte
            sc.nextLine(); // Limpa o buffer do teclado
            String name = sc.nextLine(); // Lê o nome do contribuinte
            System.out.print("Annual income: "); // Pede a renda anual do contribuinte
            double income = sc.nextDouble(); // Lê a renda anual do contribuinte
            if (type == 'i') { // Se for pessoa física
                System.out.print("Health expenditures: "); // Pede os gastos com saúde
                double healthExpenditures = sc.nextDouble(); // Lê os gastos com saúde
                list.add(new Individual(name, income, healthExpenditures)); // Adiciona um novo contribuinte Individual à lista
            } else { // Se for pessoa jurídica
                System.out.print("Number of employees: "); // Pede o número de funcionários
                int numberOfEmployees = sc.nextInt(); // Lê o número de funcionários
                list.add(new Company(name, income, numberOfEmployees)); // Adiciona uma nova Company à lista
            }
        }

        double sum = 0.0; // Variável para armazenar a soma dos impostos pagos
        System.out.println(); // Pula uma linha
        System.out.println("TAXES PAID:"); // Título para os impostos pagos
        for (TaxPayer tp : list) { // Loop para calcular e exibir os impostos pagos por cada contribuinte
            double tax = tp.tax(); // Calcula o imposto do contribuinte atual
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax)); // Exibe o imposto do contribuinte atual
            sum += tax; // Adiciona o imposto atual à soma total
        }

        System.out.println(); // Pula uma linha
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum)); // Exibe o total de impostos pagos

        sc.close(); // Fecha o Scanner
    }
}