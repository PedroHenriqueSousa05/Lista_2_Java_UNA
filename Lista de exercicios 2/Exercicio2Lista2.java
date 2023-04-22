import java.util.Scanner;

public class Exercicio2Lista2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor da compra: ");
        double compra = scanner.nextDouble();
        
        System.out.println("Valor pago: ");
        double pago = scanner.nextDouble();
        if(pago < compra){
            while(pago < compra){
                System.out.println("Valor pago insuficiente, insira um valor maior: ");
                pago = scanner.nextDouble();
            }
        }
        
        double valor = pago - compra;
        
        scanner.close();  
        int contaNota1 = 0;
        int contaNota5 = 0;
        int contaNota10 = 0;
        int contaNota20 = 0;
        int contaNota50 = 0;
        
        while(valor >= 50){
            contaNota50++;
            valor = valor - 50;
        }
        while(valor >= 20){
            contaNota20++;
            valor = valor - 20;
        }
        while(valor >= 10){
            contaNota10++;
            valor = valor - 10;
        }
        while(valor >= 5){
            contaNota5++;
            valor = valor - 5;
        }
        while(valor >= 1){
            contaNota1++;
            valor = valor - 1;
        }
        System.out.print("Moedas de 1 real: " + contaNota1+ "\n");
        System.out.print("Notas de 5 reais: " + contaNota5+ "\n");
        System.out.print("Notas de 10 reais: " + contaNota10+ "\n");
        System.out.print("Notas de 20 reais: " + contaNota20 + "\n");
        System.out.print("Notas de 50 reais: " + contaNota50 + "\n");
    }
}
