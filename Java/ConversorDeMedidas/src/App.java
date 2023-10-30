import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            // Menu
            System.out.println(
                    "Qual conversão será utilizada? (1) Celsius para Fahrenheit (2) Fahrenheit para Celsius (3) Centímetros para polegadas (4) Polegadas para centímetros (5) Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    celsiusParaFahrenheit();
                    break;

                case 2:
                    fahrenheitParaCelsius();
                    break;

                case 3:
                    centimetrosParaPolegadas();
                    break;

                case 4:
                    polegadasParaCentimetros();
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida, digite novamente um valor entre 1 e 5");
                    break;
            }
        }
    }

    // Métodos
    static void celsiusParaFahrenheit() {
        System.out.println("Informe a temperatura em Celsius:");
        float valor = lerFloatComValidacao();
        float valorConvertido = (valor * 9 / 5) + 32;
        System.out.println("O valor convertido: " + valorConvertido + " Fahrenheit");
    }

    static void fahrenheitParaCelsius() {
        System.out.println("Informe a temperatura em Fahrenheit:");
        float valor = lerFloatComValidacao();
        float valorConvertido = (valor - 32) * 5 / 9;
        System.out.println("O valor convertido: " + valorConvertido + " Celsius");
    }

    static void centimetrosParaPolegadas() {
        System.out.println("Informe o valor em centímetros:");
        float valor = lerFloatComValidacao();
        float valorConvertido = valor / 2.54f;
        System.out.println("O valor convertido: " + valorConvertido + " polegadas");
    }

    static void polegadasParaCentimetros() {
        System.out.println("Informe o valor em polegadas:");
        float valor = lerFloatComValidacao();
        float valorConvertido = valor * 2.54f;
        System.out.println("O valor convertido: " + valorConvertido + " centímetros");
    }

    static float lerFloatComValidacao() {
        float valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            try {
                valor = scanner.nextFloat();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, digite novamente:");
                scanner.next(); // Limpa o buffer do teclado
            }
        }
        return valor;
    }
}