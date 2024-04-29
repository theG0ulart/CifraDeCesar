package edu.fatec;

import java.util.Scanner;

public class CifraDeCesar {

    static String palavra;
    static char[] letras;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Cifra de César!!");
        System.out.println("===================================");
        System.out.println("Informe uma palavra: ");
         palavra = entrada.nextLine();
        letras = palavra.toCharArray();

        System.out.println("Informe o valor do deslocamento: ");
        int desloca = entrada.nextInt();
        String novaFrase = "";

        for(byte indice = 0; indice < letras.length; indice++){
            int numero = (int)letras[indice];
            char novaLetra = (char)(numero + desloca);
            novaFrase += novaLetra;
            System.out.println(novaLetra);
        }
        System.out.println("");

        System.out.println("\n desfazendo a cifra");
        letras = novaFrase.toCharArray();
        for(byte indice = 0; indice < letras.length; indice++){
            int numero = (int)letras[indice];
            char novaLetra = (char)(numero - desloca);

            System.out.println(novaLetra);
        }
    }
}