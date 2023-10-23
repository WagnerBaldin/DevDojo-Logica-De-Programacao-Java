// Condições do JAVA Verdadeira ou Falsa

// && (AND) | || (OR)
// VV = V   | VV = F
// VF = F   | VF = F
// FV = F   | FV = F
// FF = F   | FF = V

public class _9_CalculadorImpostoComCondicional {
    public static void main(String[] args) {

    double salario = 7200;

        if (salario < 2112.01) {
            System.out.println("Isento, paga nada!!!");

        } else if (salario >= 2112.01 && salario <= 2826.66) {
            double desconto = salario * 0.075;
            System.out.println("Aliquota de 7,5%: R$ " + String.format("%.2f", desconto));

        } else if (salario >= 2826.67 && salario <= 3751.06) {
            double desconto = salario * 0.15;
            System.out.println("aliquota de 15%: R% " + String.format("%.2f", desconto));

        } else if (salario >= 3751.06 && salario <= 4667.68) {
            double desconto = salario * 0.2250;
            System.out.println("aliquota de 22,50%: R$ " + String.format("%.2f", desconto));

        } else if (salario > 4467.68) {
            double desconto = salario * 0.2750;
            System.out.println("aliquota de 27,50%: R$ " + String.format("%.2f", desconto));
        }

    }
}
