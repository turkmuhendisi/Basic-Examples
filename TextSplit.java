package ExamQuestions;

/**
 * Windows işletim sisteminde dosya tam adları noktayla ayrılmış iki bölümden oluşur.
 * Birinci bolüm dosya adı, ikinci bolüm dosya uzantısını gosterir.
 * Kullanıcıdan "Bir dosya tam adi giriniz: " şeklinde giriş isteyen ve kullanıcının girişine göre
 * dosya adını ve dosya uzantısını alt alta yazdıran programı Java programlama dilinde kodlayınız.
 * (örnek-1 dosya tam adı: algoritma.prog.docx için dosya adı: algoritma.prog, dosya uzantısı: docx olmalı)
 * (örnek-2 dosya tam adı: merhaba.txt için dosya adı: merhaba, dosya uzantısı: txt olmalı)
 * */

import java.util.Arrays;
import java.util.Scanner;

public class TextSplit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dosya adını uzantısı ile birlikte giriniz.");

        String dosyaAdi = input.nextLine(); // Tüm satırı almak için .nextLine ifadesini kullandık. Çünkü .next ifadesi yalnızca tek kelime tutmaktadır.

        int len = dosyaAdi.length(); // En son index i almak için değişkenin tuttuğu metin uzunluğunu alıyoruz.
        int index = dosyaAdi.lastIndexOf("."); // Metnin en sonundan başlayarak ilk noktayı arar ve bulduğu index i "index" değişkenine atar.

        System.out.println(dosyaAdi.substring(0,index)); // Başlangıçtan son nokataya kadar olan kısmı yazdırır.
        System.out.println(dosyaAdi.substring((index + 1), len)); // Son noktanın sonrasından itibaren en son index e kadar yazdırır.


    }
}
