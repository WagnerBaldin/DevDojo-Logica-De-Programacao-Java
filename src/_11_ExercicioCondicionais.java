// Dado um determinado numero inteiro
//Imprima se ele é impar ou par
// Se o resto da divisão por par, então sempre vai ser zero0
//how to check if a number is even or odd
// aSe não vai escnnno

    public class _11_ExercicioCondicionais {
        public static void main(String[] args) {

            double numero = 20;
            double resultado = 0.0;
            // Se o módulo da divisão for igual a Zero, ele é par
            // Caso contrário será impar e cai pro else
            if ((numero % 2) == 0) {
                resultado = numero;
                    System.out.println("Resultado = " +resultado+ ", então é par!");
            }else{
                resultado = numero;
                    System.out.println("Resultado = " +resultado+ ", então é impar");
                }
            }
    }
