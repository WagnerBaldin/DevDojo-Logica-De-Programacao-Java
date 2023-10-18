// Condições do JAVA Verdadeira ou Falsa

// && (AND) | || (OR)
// VV = V   | VV = F
// VF = F   | VF = F
// FV = F   | FV = F
// FF = F   | FF = V

public class _9_OperadoresLogicos {
    public static void main(String[] args) {

    double salario = 4500;

        if (salario < 2112.01) {
            System.out.println("Isento");

        } else if (salario >= 2112.01 && salario <= 2826.66) {
            double desconto = salario * 0.075;
            System.out.println("Aliquota de 7,5%: " + String.format("%.2f", desconto));

        } else if (salario >= 2826.67 && salario <= 3751.06) {
            double desconto = salario * 0.15;
            System.out.println("aliquota de 15%: " + String.format("%.2f", desconto));

        } else if (salario >= 3751.06 && salario <= 4667.68) {
            double desconto = salario * 22.50;
            System.out.println("aliquota de 22,50%: " + String.format("%.2f", desconto));

        } else if (salario > 4467.68) {
            double desconto = salario * 22.50;
            System.out.println("aliquota de 27,50%: " + String.format("%.2f", desconto));
        }

    }
}
