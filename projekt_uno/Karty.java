package projekt_uno;

import java.util.Random;

public class Karty {
    
        Random rand = new Random();

    String[] karty = {
        "0" , "1", "2", "3", "4", "5", "6", "7", "8", "9",
    };
    String[] specialniKarty = {
    "2+", "4+"
    };
    String[] barvy = {
        "M", "Z", "Cer", "Zl"
    };

    public String[] getKartyInHands() {
        String[] KartyInHands = new String[7];
        String[] barvyKaret = new String[7];
        for(int i = 0; i<7; i++){

            int randomBarvaNumber;
            int randomKardNumber;
            int specialniKarta;

            if (rand.nextInt(100) < 50) {
                randomKardNumber = (int)(Math.random() * karty.length);
                randomBarvaNumber = (int)(Math.random() * barvy.length);
                KartyInHands[i] = karty[randomKardNumber];
                barvyKaret[i] = barvy[randomBarvaNumber];
                KartyInHands[i] += barvyKaret[i];
                
            } 
            else{
                specialniKarta = (int)(Math.random() * specialniKarty.length);
                randomBarvaNumber = (int)(Math.random() * barvy.length);
                KartyInHands[i] = specialniKarty[specialniKarta] + barvy[randomBarvaNumber];
            }


        }
        return KartyInHands;
    }



}
