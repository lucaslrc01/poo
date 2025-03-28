import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Mês(letras minúsculas):");
        String mes = leitor.nextLine();

        System.out.println("Dia:");
        int dia = leitor.nextInt();

        String estacao = "";

        // Considerando as informações obtidas em https://www.calendarr.com/brasil/estacoes-do-ano/
        switch (mes) {
            case "janeiro", "fevereiro":
                estacao = "Verão";
                break;
            case "março":
                estacao = (dia > 19) ? "Outono" : "Verão"; // Outono: 20/03 -> 20/06
                break;
            case "abril", "maio":
                estacao = "Outono";
            case "junho":
                estacao = (dia > 20) ? "Inverno" : "Outono"; // Inverno: 21/06 -> 21/09
                break;
            case "julho", "agosto":
                estacao = "Inverno";
                break;
            case "setembro": 
                estacao = (dia > 21) ? "Primavera" : "Inverno"; // Primavera: 22/09 -> 20/12
                break;
            case "outubro", "novembro":
                estacao = "Primavera";
                break;
            case "dezembro":
                estacao = (dia > 20) ? "Verão" : "Primavera";  // Verão: 21/12 -> 19/03
            default:
                break;
        }

        System.out.println("O dia " + dia + " de " + mes + " cai na seguinte estação: " + estacao);
    }
}