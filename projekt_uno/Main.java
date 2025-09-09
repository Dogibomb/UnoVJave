package projekt_uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Karty karty = new Karty();

        int na_rade = 0;
        
        boolean hra = true;


        Konzole.clearConsole();

        String unoLogo = 
            "##     ##  ##   ##   ###### \n" +
            "##     ##  ###  ##  ##   ##\n" +
            "##     ##  #### ##  ##   ##\n" +
            "##     ##  ## ####  ##   ##\n" +
            "##     ##  ##  ###  ##   ##\n" +
            "##     ##  ##   ##  ##   ##\n" +
            " #######   ##   ##   ######";
        
        System.out.println(unoLogo);

        String[] kartyHrace1 = karty.getKartyInHands();
        String[] kartyHrace2 = karty.getKartyInHands();

        ArrayList<String> kartyHrace1list = new ArrayList<String>(Arrays.asList(kartyHrace1));
        ArrayList<String> kartyHrace2list = new ArrayList<String>(Arrays.asList(kartyHrace2));

        String Jednakarta = karty.getOneKard() + karty.getOneColor();

        


        boolean hrac1 = true;
        
        Scanner scanner = new Scanner(System.in);


        boolean kartaExistuje = false;

        do{
            
            if (na_rade % 2 == 0) {
                System.out.println("------------------------");
                System.out.println("Hráč 1 je na řadě");
                System.out.println(String.join(", ", kartyHrace1list));
                System.out.println("------------------------");
                hrac1 = true;
            } else {
                System.out.println("------------------------");
                System.out.println("Hráč 2 je na řadě");
                System.out.println(String.join(", ", kartyHrace2list));
                System.out.println("------------------------");
                hrac1 = false;
            }

    }

}
