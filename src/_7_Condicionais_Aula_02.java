// Receba uma idade como entrada
// Se a idade for maior que 18 imprima "Adulto"
// Se não imprima "Ainda não aduto"

// int idade = 30;
// if (idade >= 18) {
//    System.out.println("Adulto");
//}else{
//    System.out.println("Ainda não Adulto");
//}

public class _7_Condicionais_Aula_02 {
    public static void main(String[] args) {
        int idade = 19;
        char genero = 'M';
        if (genero == 'M' && idade >=18) {
            System.out.println("MASCULINO de MAIOR");
        } else if (genero == 'M' && idade <=18) {
            System.out.println("Masculino de menor");
        } else if (genero == 'F' && idade <=18) {
            System.out.println("Feminino de menor");
        } else {
            System.out.println("FEMININO de MAIOR");
        }
    }
}
