import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Mês(letras minúsculas):");
        String mes = leitor.nextLine();

        System.out.println("Dia:");
        int dia = leitor.nextInt().toLowerCase();

        // Considerando as informações obtidas em https://www.calendarr.com/brasil/estacoes-do-ano/
        String estacao = switch (mes) {
            case "janeiro", "fevereiro" -> "Verão";
            case "março" -> (dia > 19) ? "Outono" : "Verão"; // Outono: 20/03 -> 20/06
            case "abril", "maio" -> "Outono";
            case "junho" -> (dia > 20) ? "Inverno" : "Outono"; // Inverno: 21/06 -> 21/09
            case "julho", "agosto" -> "Inverno";
            case "setembro" -> (dia > 21) ? "Primavera" : "Inverno"; // Primavera: 22/09 -> 20/12
            case "outubro", "novembro" -> "Primavera";
            case "dezembro" -> (dia > 20) ? "Verão" : "Primavera";  // Verão: 21/12 -> 19/03
            default -> "Inexistente";
        };

        System.out.println("O dia " + dia + " de " + mes + " cai na seguinte estação: " + estacao);
    }
}