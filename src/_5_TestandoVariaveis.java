public class _5_TestandoVariaveis {
    public static void main(String[] args) {

        // variavel char usada com aspas simples ''

        char masculino = 'M';
        char feminino  = 'F';

        // variavel String para cadeia de caracteres

        String nome = "Java eh uma linguagem fortemente Tipada";

        String masculino2 = "Masc";
        String feminino2  = "Fem";

        // Booleanos -> Verdadeiro ou Falso

        boolean condicao_1 = true;
        boolean condicao_2 = false;

        //nesse caso o Java pensa que queremos o valor do caractere e soma
        System.out.println(masculino + feminino);
        // quando as aspas sao utilizadas, o Java ja pensa como string
        System.out.println("" + masculino + feminino);
        System.out.println(masculino + " " + feminino);
        // imnprimindo somenmte a variavel, ele também traz a string do caracter
        // System.out.println(masculino);
        System.out.println(feminino);

        System.out.println(nome);

        // aqui as variaveis string são concatenadas
        System.out.println(masculino2 + feminino2);

        // Imprimindo as condições
        System.out.println("Gosto de programar em Java:     Foi também! " + condicao_1);
        System.out.println("Tambem gosto de musica caipira: " + condicao_2);
    }
}
