import java.util.Locale;
public class _4_ReutilizandoVariaveis {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        float salario = 1000.00f;
        float resultado = salario * 0.3F;
        System.out.println("30% do salario: " + resultado);
        resultado = salario * 0.15F;
        System.out.println("15% do salario: " + resultado);
        resultado = salario * 0.05F;
        System.out.print(" 5% do salario:  " + resultado);
    }
}
