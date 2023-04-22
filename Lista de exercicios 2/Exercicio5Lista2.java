import java.util.Scanner;

public class Exercicio5Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Informe um número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Informe qual operação será feita com os seguintes símbolos(+, -, /, *, ^): ");
        String simbolo = scanner.next();
        
        while(!simbolo.equals("+") && !simbolo.equals("-") && !simbolo.equals("*") && !simbolo.equals("/") && !simbolo.equals("^")){
            System.out.println("Símbolo inválido. Informe qual operação será feita com os seguintes símbolos(+, -, /, *, ^): ");
            simbolo = scanner.next();
        }
        double resultado = 0;
        scanner.close();
        
        if (simbolo.equals("+")) {
            resultado = num1 + num2;
        } 
        else if (simbolo.equals("-")) {
            resultado = num1 - num2;
        } 
        else if (simbolo.equals("*")) {
            resultado = num1 * num2;
        } 
        else if (simbolo.equals("/")) {
            resultado = num1 / num2;
        } 
        else if (simbolo.equals("^")) {
            resultado = Math.pow(num1, num2);
        }
        
        System.out.println("O resultado é: " + resultado);
    }
}
