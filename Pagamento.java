package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca.Employee;
import entities.heranca.OutsourcedEmployee;

public class Pagamento { // Declaração da classe Pagamento

    public static void main(String[] args) { // Método principal

        Locale.setDefault(Locale.US); // Define o local como EUA para entrada de dados com ponto decimal
        Scanner sc = new Scanner(System.in); // Objeto Scanner para entrada de dados

        List<Employee> list = new ArrayList<>(); // Lista para armazenar os funcionários

        System.out.print("Enter the number of employees: "); // Solicita o número de funcionários
        int n = sc.nextInt(); // Lê o número de funcionários

        for (int i = 1; i <= n; i++) { // Loop para inserir os dados de cada funcionário
            System.out.println("Employee #" + i + " data:"); // Mensagem para inserção dos dados do funcionário
            System.out.print("Outsourced (y/n)? "); // Pergunta se é terceirizado
            char ch = sc.next().charAt(0); // Lê a resposta

            System.out.print("Name: "); // Pede o nome do funcionário
            sc.nextLine(); // Limpa o buffer do teclado
            String name = sc.nextLine(); // Lê o nome do funcionário

            System.out.print("Hours: "); // Pede as horas trabalhadas
            int hours = sc.nextInt(); // Lê as horas trabalhadas

            System.out.print("Value per hour: "); // Pede o valor por hora
            double valuePerHour = sc.nextDouble(); // Lê o valor por hora

            if (ch == 'y') { // Se for terceirizado
                System.out.print("Additional charge: "); // Pede a taxa adicional
                double additionalCharge = sc.nextDouble(); // Lê a taxa adicional
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); // Adiciona um novo funcionário terceirizado à lista
            } else { // Se não for terceirizado
                list.add(new Employee(name, hours, valuePerHour)); // Adiciona um novo funcionário à lista
            }
        }

        System.out.println(); // Pula uma linha
        System.out.println("PAYMENTS:"); // Título para os pagamentos
        for (Employee emp : list) { // Loop para calcular e exibir os pagamentos de cada funcionário
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment())); // Exibe o pagamento do funcionário atual
        }

        sc.close(); // Fecha o Scanner
    }
}