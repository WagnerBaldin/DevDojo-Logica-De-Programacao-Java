import java.util.Locale;
import java.util.Scanner;

public class _3_CalculoDeSalario {
    public static void main (String [] args){

        double salario = 5450.89;
        double porcentagem = 0.3;
        double resultado = salario * porcentagem;
        System.out.println("A porcentagem é: " + resultado);

        double salario2 = 5450.89F;
        double porcentagem2 = 0.3F;
        double resultado2 = salario2 * porcentagem2;
        System.out.println("A porcentagem é: " + resultado2);

        float salario3 = 5450.89F;
        float porcentagem3 = 30L;
        float porcentagemDoSalario3 = salario3 * (porcentagem3 / 100);
        System.out.println("A porcentagem é: " + porcentagemDoSalario3);

        Locale.setDefault(Locale.US);
        float salario4 = 5450.89F;
        float porcentagem4 = 0.3F;
        float porcentagemDoSalario4 = salario4 * porcentagem4;
        System.out.printf("A porcentagem é: R$ %.2f\n", porcentagemDoSalario4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu salário?");
        double salario5 = Double.parseDouble(scanner.nextLine());
        System.out.println("Qual a porcentagem que você quer saber desse salario?");
        double porcentagemSaber = Double.parseDouble(scanner.nextLine());
        double porcentagemFato = salario5 * (porcentagemSaber/100);
        System.out.println(porcentagemSaber +"% de " + salario5 + " é " + porcentagemFato);

        System.out.println("-----------------------------");

        /*
        * Números sem casas decimais
        * "Em 1995, a família média tinha 2,3 filhos."
        * Neste ponto, sempre tem um espertinho que observa
        * que nenhuma família real tem exatamente 2,3 filhos.
        * Claramente, números inteiros desempenham um papel
        * neste mundo. Portanto, em Java, você pode declarar
        * uma variável para armazenar apenas números inteiros.
        * O Exemplo abnaixo mostra um programa que utiliza
        * variáveis de números inteiros.
        */

        int weightOfAPerson;
        int elevatorWeightLimit;
        int numberOfPeople;

        weightOfAPerson = 150;
        elevatorWeightLimit = 1400;
        numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        // 1400:150 = 9.333333333333333
        // O sistema arredonda

        System.out.print("You can fit ");
        System.out.print(numberOfPeople);
        System.out.println(" people on the elevator.");
    }
}
