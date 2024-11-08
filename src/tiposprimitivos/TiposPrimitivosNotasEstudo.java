package tiposprimitivos;

/*
 * Notas de estudo sobre os tipos primitivos.
 */

public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
        //Caracteres ou Characters
        char primeiraLetraDoNome = 'I';
        char primeiraLetraDoNomeASCIII = 71;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCIII);

        //Inteiros ou Integers

        byte nota = 10; // -128 ate 127
        short itensComprados = 2; //-32768 32767
        int quantidadeEstoque = 23366; // -2_147_483_648 ate 2_147_483_647
        long numeroMuitoGrande = 231372814781230L; //19 digitos.

        //Decimais

        float peso = 1.5f; //6 a 7 casas decimais
        double preco = 24.99; // ~15 casas decimais

        //Booleanos ou Booleans

        boolean verdadeiro = true;
        boolean falso = false;
    }
}
