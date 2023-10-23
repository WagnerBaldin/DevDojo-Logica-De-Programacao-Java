import java.util.Scanner;
/*
Eu como usuário gostaria de ter o nome e a idade de participantes de
um trneio de natação e que o sistema imprimisse da seguinte forma
- Menor que 10 anos: <nome> categoria infantil
- entre 11 e 15 anos: <nome> categoria juvenil
- entre 16 e 19 anos: <nome> categoria Pré-adulto
- acima de 20 anos: <nome> categoria adulto
Para que eu possa rapidamente classificar todos os participantes
 */
public class _13_DigitarDados_ToreneioDeNatacao {
    public static void main(String[] args) {

        Scanner inputNome = new Scanner(System.in); // Criar um objeto Scanner
        System.out.println("Digite o nome do nadador: "); //
        String nomeNadador = inputNome.nextLine(); // usa o input pra ser o nome do nadador

        Scanner inputIdade = new Scanner(System.in); //entra a didade
        System.out.println("Qual a idade do nadador? "); //pega a idade
        int idadeNadador = inputIdade.nextInt(); // joga a idade aqui

        if (idadeNadador <= 10) {
            System.out.println(nomeNadador + ". Idade: " + idadeNadador + " -> Menor que 10 anos. Categ. Infantil" );
        }else if(idadeNadador >= 11 && idadeNadador <= 15) {
            System.out.println(nomeNadador + ". Idade: " + idadeNadador+ " -> Entre 15 e 16 anos. Categ. Juvenil" );
        }else if (idadeNadador >= 16 && idadeNadador <= 19) {
            System.out.println(nomeNadador + ". Idade: " + idadeNadador+ " -> Entre 16 e 19 anos. Categ. Pré-adulto" );
        }else{
        System.out.println(nomeNadador + ". Idade: " + idadeNadador+ " -> Acima de 20 anos. Categ. Adulto" );
        }
    }
}
