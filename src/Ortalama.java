import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);


        System.out.print("Matematik Notunuzu Giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = inp.nextInt();

        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Ortalamanız: " + ortalama);
        String sonuc = ortalama>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(sonuc);

    }
}
