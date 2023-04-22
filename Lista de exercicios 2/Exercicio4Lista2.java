import java.util.Scanner;

public class Exercicio4Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo, digitando apenas o número correspondente a opção:");
        System.out.println("1: calcular e imprimir o perímetro do círculo.");
        System.out.println("2: calcular e imprimir a área do círculo.");
        System.out.println("3: calcular e imprimir o volume da esfera.");
        int opcao = scanner.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3){
            System.out.println("Escolha uma opção valida!!");

            System.out.println("Escolha uma das opções abaixo, digitando apenas o número correspondente a opção:");
            System.out.println("1: calcular e imprimir o perímetro do círculo.");
            System.out.println("2: calcular e imprimir a área do círculo.");
            System.out.println("3: calcular e imprimir o volume da esfera.");
            opcao = scanner.nextInt();
        }
        System.out.println("Informe o valor do raio do circulo ou esfera: ");
        double raio = scanner.nextDouble();
        scanner.close();

        double perimetro = 2 * Math.PI * raio;
        double area = 3.14 * Math.pow(raio, 2);
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        if(opcao == 1){
            System.out.println("O perímetro do circulo é: " + perimetro);
        }
        if(opcao == 2){
            System.out.println("A área do circulo é: " + area);
        }
        if(opcao == 3){
            System.out.println("O volume da esfera é: " + volume);
        }
    }
}
