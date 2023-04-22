import java.util.Scanner;

public class Exercicio1Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um outro valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite um outro valor: ");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;

        if(num1 > num2 && num1 > num3){
            System.out.println("O número: " + num1 + " é o menor numero!");
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("O número: " + num2 + " é o menor numero!");
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("O número: " + num3 + " é o menor numero!");
        }
        if(num1 < num2 && num1 < num3){
            System.out.println("O número: " + num1 + " é o menor numero!");
        }
        if(num2 < num1 && num2 < num3){
            System.out.println("O número: " + num2 + " é o menor numero!");
        }
        if(num3 < num1 && num3 < num2){
            System.out.println("O número: " + num3 + " é o menor numero!");
        }
        if(num1 == num2 && num1 != num3){
            System.out.println("O primeiro numeros: " + num1 + " e o segundo número: " + num2 + " são iguais");
        }
        if(num2 == num3 && num2 != num1){
            System.out.println("O segundo numero: " + num2 + " e o terceiro número: " + num3 + " são iguais");
        }
        if(num3 == num1 && num3 != num2){
            System.out.println("O primeiro numero: " + num1 + " e o ultimo numero: " + num3 + " são iguais");
        }
        if(num3 == num1 && num3 == num2){
            System.out.println("Todos os numeros " + num1 + ", " + num2 + " e o numero" + num3 + " são iguais");
        }
        scanner.close();
        System.out.printf("A média aritmética dos valores é: %.2f", media);

    }
}
