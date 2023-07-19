import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        double num1, num2, result;
        int escolha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Escreva o segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Escolha qual operação quer realizar: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
        escolha = scanner.nextInt();

        result = 0;

        switch (escolha) {
            case 1:
                result = num1 + num2;                
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.printf("Resultado: %.2f", result);

        scanner.close();
    }
}

