import java.util.Locale;

public class _3_CalculoDeSalario {
    public static void main (String [] args){

        /*
        double salario = 2000.00;
        double porcentagem = 0.1;
        double resultado = salario * porcentagem;
        System.out.println("A porcentagem eh: " + resultado);
        */

        /*
        float salario = 2500.00F;
        float porcentagem = 30L;
        float porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.printf("A porcentagem eh: " + porcentagemDoSalario);
        */


        Locale.setDefault(Locale.US);
        float salario = 2500.00F;
        float porcentagem = 0.3F;
        float porcentagemDoSalario = salario * porcentagem;
        System.out.printf("A porcentagem eh: R$ %.2f", porcentagemDoSalario);

/*

            Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu salário?");
        double salario = Double.parseDouble(scanner.nextLine());
        System.out.println("Qual a porcentagem que você quer saber desse salario?");
        double porcentagemSaber = Double.parseDouble(scanner.nextLine());
        double porcentagemFato = salario * (porcentagemSaber/100);
        System.out.println(porcentagemSaber +"% de " + salario + " é " + porcentagemFato);

       */

    }
}
