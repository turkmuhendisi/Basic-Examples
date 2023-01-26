
/**
 * Bir bölümdeki 300 öğrencinin numaraları 2023100'den itibaren başlayıp 2023399'a kadar ilerlemektedir.
 * n adet öğrenci rastegele seçielcek.
 * Rastgele seçilen öğrenciler "liste" isimli dizi değişkenine atılacak.
 */

 
 
import java.util.Scanner;

public class OgrenciSecme {
    public static void main(String[] args) {

        int ogrNo = 2023100;
        int[] ogr = new int[300];
        for (int i = 0; i < 300; i++) {
            ogr[i] = ogrNo + i;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç öğrenci seçilecek ->");
        int mevcut = input.nextInt();
        int[] liste = new int[mevcut];

        for (int i = 0; i < mevcut; i++) {
            int random = (int)(Math.random()*300);
            liste[i] = ogr[random];
            System.out.printf("%d. Öğrenci -> %d%n", (i + 1), liste[i]);
        }

    }
}
