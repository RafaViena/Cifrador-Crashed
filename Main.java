import java.util.Scanner;


public class Main {

public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);


    System.out.println("Bem Vindo esse é o crifrador devisate:");
    String fraseorign = "QHSAVOIPOPRERRDTJIERSSMVGIEROEEMNAAARDAAANL";

    System.out.println(fraseorign);
    
    System.out.println("INFORME A FRASE");
    String frase = scanner.nextLine();

    String resultado = frase + " eu sou doido";
    System.out.println(resultado);


scanner.close();
}

}
