import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com a idade do morador (digite um número negativo para encerrar): ");
        int idade = leitor.nextInt();

        int qtd0a18 = 0;
        int qtd19a35 = 0;
        int qtd36a50 = 0;
        int qtd51a65 = 0;
        int qtd66a80 = 0;
        int qtd81a100 = 0;

        while(idade >= 0){
            if (idade <=18){
                qtd0a18++;
            } else if (idade <= 35) {
                qtd19a35++;
            } else if (idade <= 50) { 
                qtd36a50++;
            } else if (idade <= 65) {
                qtd51a65++;
            } else if (idade <= 80) {
                qtd66a80++;
            } else if (idade <= 100) {
                qtd81a100++;
            }
            System.out.println("Entre com a idade do morador (digite um número negativo para encerrar): ");  
            idade = leitor.nextInt();         
        }

        System.out.println("=======================");
        System.out.println("0 a 18: " + "*".repeat(qtd0a18));
        System.out.println("19 a 35: " + "*".repeat(qtd19a35));
        System.out.println("36 a 50: " + "*".repeat(qtd36a50));
        System.out.println("51 a 65: " + "*".repeat(qtd51a65));
        System.out.println("66 a 80: " + "*".repeat(qtd66a80));
        System.out.println("80 a 100: " + "*".repeat(qtd81a100));
        System.out.println("=======================");
    }
}
