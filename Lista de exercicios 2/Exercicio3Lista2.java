import java.util.Scanner;

public class Exercicio3Lista2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double numA = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double numB = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double numC = scanner.nextDouble();
        
        while(numA == 0 && numB == 0 && numC != 0){
            System.out.println("Coeficientes informados incorretamente! Ensira corretamente os valores:");
            
            System.out.println("Digite o valor de a: ");
            numA = scanner.nextDouble();

            System.out.println("Digite o valor de b: ");
            numB = scanner.nextDouble();

            System.out.println("Digite o valor de c: ");
            numC = scanner.nextDouble();
        }
        double delta = Math.pow(numB, 2) - (4 * numA * numC);
        
        while(numA == 0 && numB != 0){
            Double x1 = (-numB / numA);
            System.out.println("Essa é uma equação de primeiro grau! Ensira novamente os valores para uma equação de segundo grau: ");
            System.out.println("A raiz real: " + x1);

            System.out.println("Digite o valor de a: ");
            numA = scanner.nextDouble();

            System.out.println("Digite o valor de b: ");
            numB = scanner.nextDouble();

            System.out.println("Digite o valor de c: ");
            numC = scanner.nextDouble();
        }

        if(delta < 0){
            System.out.println("Esta equação não possui raízes reais!");
        }

        else if(delta == 0){
            Double x1 = (-numB + Math.pow(delta, 2)) / 2 * numA;
            Double x2 = (-numB - Math.pow(delta, 2)) / 2 * numA;
            System.out.println("Esta equação possui duas raízes reais iguais: x1: " + x1 + " e x2: " + x2);
        }

        else if(delta > 0){
            Double x1 = (-numB + Math.pow(delta, 2)) / 2 * numA;
            Double x2 = (-numB - Math.pow(delta, 2)) / 2 * numA;
            System.out.println("Esta equação possui duas raízes reais diferentes: x1: " + x1 + " e x2: " + x2);
        }
        scanner.close();
    }         
}
