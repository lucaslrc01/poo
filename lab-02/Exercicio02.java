import java.util.Random;
import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);
        
        int numAleatorio = aleatorio.nextInt(99)+1;

        System.out.println("          Acerte o número");        
        System.out.println("===================================");
        System.out.println("          Digite o número: ");
        int num = leitor.nextInt();

        int tentativas = 1;

        while(num != numAleatorio) {
            if(numAleatorio > num) {
                System.out.println("    ERRADO! O número aleatório é maior: ");
            } else {
                System.out.println("    ERRADO! O número aleatório é menor: ");
            }
            System.out.println("      _________________________ ");
            tentativas++;
            num = leitor.nextInt();
        }

        System.out.println("     CORRETO! O número é " + numAleatorio);
        System.out.println("Foram necessárias " + tentativas + " tentativas.");
        System.out.println("====================================");
        
        leitor.close();
    }
}
