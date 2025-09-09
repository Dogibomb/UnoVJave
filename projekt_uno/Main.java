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

            Uvitani(kartyHrace1list, kartyHrace2list, na_rade, Jednakarta);

            String input = scanner.nextLine();
            input = input.toLowerCase().trim();

            if(input.equals("liz")){
                if(hrac1){
                    kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                }
                else{
                    kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                }
            }
            else if (hrac1) {
                for(int i = 0; i < kartyHrace1list.size(); i++){

                    if (input.equals(kartyHrace1list.get(i).toString().toLowerCase())) {
                        kartaExistuje = true;

                    }
                }
            } 
            else {
                for(int i = 0; i < kartyHrace2list.size(); i++){
                    if (input.equals(kartyHrace2list.get(i).toString().toLowerCase())) {
                        kartaExistuje = true;
                    }
                }
            }
            Jednakarta = Jednakarta.toLowerCase();
            if (!kartaExistuje) {
                System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                System.out.println("Neplatná karta. / Nebo si liznul (bug ktery urcite opravovat nebudu)"); 
                System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                continue;
            }
            else{
                    if (Jednakarta.charAt(0) == input.charAt(0)){
                        if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }
                    }
                    else if (Jednakarta.contains("m")){
                        if(input.contains("m")){

                        SpecialKarty(input, hrac1, kartyHrace1list, kartyHrace2list, karty);

                        if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }
                    }
                    else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Neplatná Karta? Stupid!");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        continue;
                    }
                }
                else if (Jednakarta.contains("zl")){
                    if(input.contains("zl")){

                        SpecialKarty(input, hrac1, kartyHrace1list, kartyHrace2list, karty);

                        if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }
                    }
                    else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Neplatná Karta? Stupid!");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        continue;
                    }
                }
                else if (Jednakarta.contains("z")){
                    if(input.contains("z")){

                        SpecialKarty(input, hrac1, kartyHrace1list, kartyHrace2list, karty);

                        if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }
                    }
                    else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Neplatná Karta? Stupid!");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        continue;
                    }
                }
                else if (Jednakarta.contains("cer")) {
                    if(input.contains("cer")){

                        SpecialKarty(input, hrac1, kartyHrace1list, kartyHrace2list, karty);

                        if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(input)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }
                    }
                    else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Neplatná Karta? Stupid!");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
                        continue;
                    }
                }
                Jednakarta = input;

                na_rade++;
                if (kartyHrace1list.size() == 0){
                System.out.println("Vyhrál hráč 1.");
                hra = false;
                }
                else if(kartyHrace2list.size() == 0){
                System.out.println("Vyhrál hráč 2.");
                hra = false;
                }   
            
            Konzole.clearConsole();
            }
        }
        while(hra);
        scanner.close();

    }
    public static void SpecialKarty(String karta, boolean hrac1, ArrayList<String> kartyHrace1list, ArrayList<String> kartyHrace2list, Karty karty){
        karta = karta.toLowerCase();
        if (karta.equals("2+m") || karta.equals("2+z") || karta.equals("2+zl") || karta.equals("2+cer")){
            if (hrac1){
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
            }
            else{
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
            }
            }
        else if (karta.equals("4+m") || karta.equals("4+z") || karta.equals("4+zl") || karta.equals("4+cer")){
            if (hrac1){
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace2list.add(karty.getOneKard() + karty.getOneColor());
                }
            else{
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                kartyHrace1list.add(karty.getOneKard() + karty.getOneColor());
                }
            }
        else{
            System.out.println("XXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Neplatná Karta? Stupid!");
            System.out.println("XXXXXXXXXXXXXXXXXXXXX");
        }

            if(hrac1){
                            for (int i = 0; i < kartyHrace1list.size(); i++) {
                            if (kartyHrace1list.get(i).equalsIgnoreCase(karta)) {
                                kartyHrace1list.remove(i);
                                break;
                            }
                        }
                        }
                        else{
                            for (int i = 0; i < kartyHrace2list.size(); i++) {
                            if (kartyHrace2list.get(i).equalsIgnoreCase(karta)) {
                                kartyHrace2list.remove(i);
                                break;
                            }
                        }
                        }

        }    

    public static void Uvitani(ArrayList<String> kartyHrace1list, ArrayList<String> kartyHrace2list, int na_rade, String Jednakarta){
            System.out.println("1. Hráč");
            System.out.println("Počet karet: " + kartyHrace1list.size());
            

            System.out.println("\n");


            System.out.printf("Na stole je: %s\n", Jednakarta);

            System.out.println("\n");


            System.out.println("2. Hráč");
            System.out.println("Počet karet: " + kartyHrace2list.size());
            
            System.out.println();
            System.out.println("Jakou kartu chceš zahrát?");
            System.out.println("Pokud nemáš žádně legalni tahy lízni si :) (napis liz)");
            System.out.println();
    }
}
