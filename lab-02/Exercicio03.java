import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com a idade do morador (digite um número negativo para encerrar): ");
        int idade = leitor.nextInt();

        int[] qtd = new int[6];

        while(idade >= 0){
            if (idade <=18){
                qtd[0]++;
            } else if (idade <= 35) {
                qtd[1]++;
            } else if (idade <= 50) { 
                qtd[2]++;
            } else if (idade <= 65) {
                qtd[3]++;
            } else if (idade <= 80) {
                qtd[4]++;
            } else if (idade <= 100) {
                qtd[5]++;
            }
            System.out.println("Entre com a idade do morador (digite um número negativo para encerrar): ");  
            idade = leitor.nextInt();         
        }

        System.out.println("=======================");
        System.out.println("0 a 18: " + "*".repeat(qtd[0]));
        System.out.println("19 a 35: " + "*".repeat(qtd[1]));
        System.out.println("36 a 50: " + "*".repeat(qtd[2]));
        System.out.println("51 a 65: " + "*".repeat(qtd[3]));
        System.out.println("66 a 80: " + "*".repeat(qtd[4]));
        System.out.println("80 a 100: " + "*".repeat(qtd[5]));
        System.out.println("=======================");
    }
}
