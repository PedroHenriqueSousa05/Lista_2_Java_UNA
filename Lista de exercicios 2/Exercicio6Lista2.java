import java.util.Scanner;
import java.util.Random;

public class Exercicio6Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe um número: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Informe um número: ");
        int num2 = scanner.nextInt();

        scanner.close();
        int sorteio = 0;
        if(num1 > num2){
            sorteio = random.nextInt(num1 - num2 + 1) + num2;
        }
        if(num2 > num1){
            sorteio = random.nextInt(num2 - num1 + 1) + num1;
        }
        System.out.println("O número sorteado foi: " + sorteio);
        if(sorteio % 2 == 0){
            System.out.println("O numero sorteado é par!!");
        }
        else{
            System.out.println("O numero sorteado é impar!!");
        }
    }
}
