import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double peso, altura, resultado;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        
        resultado = peso / (altura*altura);
        
        System.out.printf("Com o peso de %.2fKg e altura de %.2f, seu IMC é de: %.2f\n", peso, altura, resultado);
        
        if (resultado < 17) {
          System.out.println("Você está muito abaixo do peso");
        }
        else if (resultado >=17 && resultado < 18.5) {
          System.out.println("Você está abaixo do peso");
        }
        else if (resultado >=18.5 && resultado < 25) {
          System.out.println("Você está com o peso ideal");
        }
        else if (resultado >=25 && resultado < 30) {
          System.out.println("Você está acima do peso");
        }
        else if (resultado >=30 && resultado < 35) {
          System.out.println("Você está com obesidade grau 1");
        }
        else if (resultado >=35 && resultado < 40) {
          System.out.println("Você está com obesidade grau 2");
        }
        else {
          System.out.println("Você está com obesidade grau 3");
        }
        scanner.close();
    }
}
