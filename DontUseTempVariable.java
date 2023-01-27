package ExamQuestions;

public class DontUseTempVariable {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("a değeri: " + a); // İlk a değeri
        System.out.println("b değeri: " + b); // İlk b değeri
        System.out.println("------------");

        b = a + b; // En küçük değere iki değerin toplamını atıyoruz.

        a = b - a; // Yeni 'b' değerinden 'a' değerini çıkararak 'b' nin eski değerinin 'a' ya atamış oluyoruz.
        b = b - a; // Yeni 'b' değerinden yeni 'a' değerini çıkardığımızda ise 'a' nın ilk baştaki değerini 'b' ye atıyoruz.

        System.out.println("Yeni a değeri: " + a);
        System.out.println("Yeni b değeri: " + b);

    }
}
