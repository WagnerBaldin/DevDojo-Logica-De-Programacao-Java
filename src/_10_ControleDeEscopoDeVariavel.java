public class _10_ControleDeEscopoDeVariavel {
    public static void main(String[] args) {

        // O escopo dessa variáveis é fora do IF ELSE, é Global
        double salario = 2000.0;
        double resultado = 0;
        String porcentagem = "";

        if (salario > 1000) {
            resultado = salario * 0.3;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1;
            porcentagem = "10%";
        }
        //Essa linha precisa ficar fora do IF e do ELSE.
        //System.out.println("Porcentagem = " + porcentagem + " Valor : " + resultado);
        System.out.println("Porcentagem = " + porcentagem + " Valor: R$ " + String.format("%.2f", resultado));
    }
}

