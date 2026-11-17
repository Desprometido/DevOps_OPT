package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        
        // Ler o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        char operacao = ' ';
        boolean operacaoValida = false;

        // Ciclo while que repete até que o operador seja válido
        while (!operacaoValida) {
            System.out.print("Digite a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);

            if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {
                operacaoValida = true; // Sai do ciclo se a opção for válida
            } else {
                System.out.println("Erro: Operação inválida! Tente novamente.");
            }
        }

        // Ler o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        // Processar a operação com base no operador validado
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    scanner.close();
                    return; // Encerra o programa se houver divisão por zero
                }
                break;
        }

        // Mostrar o resultado final
        System.out.println("Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);

        scanner.close();
    }
}