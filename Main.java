import java.util.Scanner;

public class limpador {

    public static String limpar(String p) {
        if (p == null) {
            return "";
        }

        String resultado = "";
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);

            // ignora espaço e pontuação manualmente
            if (!Character.isWhitespace(c) && !isPontuacao(c)) {
                resultado = resultado + c;
            }
        }

        return resultado;
    }

    public static boolean isPontuacao(char c) {
        String pontuacao = ".,;:!?()[]{}\"'-";
        return pontuacao.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int indice = 0;

        System.out.println("Informe a palavra para cifrar:");
        String p = ler.nextLine();

        String textoLimpo = limpar(p);
        textoLimpo = textoLimpo.toUpperCase();

        int tamanhoP = textoLimpo.length();

        System.out.println("Texto limpo: " + textoLimpo);

        String cifra = "";

        for (int i = 0; i < tamanhoP; i++) {
            char letra = textoLimpo.charAt(indice);

            System.out.print("indice: " + indice + " Letra: " + letra);

            indice = indice + 3;
            if (indice >= tamanhoP) {
                indice = indice % tamanhoP;
            }

            cifra = cifra + letra;
        }

        System.out.println();
        System.out.println(cifra);
    }
}
