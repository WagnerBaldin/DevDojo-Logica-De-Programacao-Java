/*
imprimir o nome dos participantes
menor que 10 anos = infantil
entre 11 e 15 juvenil
entre 16 e 19 pre-adulto
acuma de 20 adulto
para qu e eu possa classificar rapidamente todos os participantes
 */
public class _10_ControleDeFluxoIfElse {
    public static void main(String[] args) {
        double idade = 15.1;
        if (idade <= 10){
            System.out.println("Infantil");
        }else if (idade >= 11 && idade <= 15){
            System.out.println("Juvenil");
        }else if (idade >= 16 && idade <= 19){
            System.out.println("Pré-adulto");
        }else
            System.out.println("Adulto");
    }
}
