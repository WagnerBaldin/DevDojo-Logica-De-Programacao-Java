// Receba uma idade como entrada
// Se a idade for maior que 18 imprima "de maior"
// Se não imprima "de menor"
// Também se é masculino ou feminino

public class _7_Condicionais_Aula_02 {
    public static void main(String[] args){
        int idade = 25;
        char genero = 'f';
        if (genero == 'M' || genero =='m'&& idade >=18) {
            System.out.println("MASCULINO de MAIOR");
        } else if (genero == 'M' || genero =='m' && idade <=18) {
            System.out.println("Masculino de menor");
        } else if (genero == 'F' || genero =='f' && idade <= 18) {
            System.out.println("Feminino de menor");
        } else {
            System.out.println("FEMININO de MAIOR");
        }
    }
}
