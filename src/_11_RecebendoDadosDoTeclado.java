import java.util.Scanner;

public class _11_RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        System.out.println("Recebendo dados do Teclado");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite o sua idade: ");
        String idade = teclado.next();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);

    }
}
