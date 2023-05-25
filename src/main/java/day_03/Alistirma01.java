package day_03;

import java.util.Scanner;

public class Alistirma01 {
    public static void main(String[] args) {
        //Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen islem yapmak istediginiz ilk sayiyi giriniz. . . ");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen islem yapmak istediginiz ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        int toplama = sayi1+sayi2;
        System.out.println("toplama = " + toplama);

        int cikarma = sayi1-sayi2;
        System.out.println("cikarma = " + cikarma);

        int carpma = sayi1*sayi2;
        System.out.println("carpma = " + carpma);

        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cevresini bulmak istesiginiz karenin bir kenar uzunlugunu yaziniz");
        int kareKenar =scan.nextInt();

        int sonuc = kareKenar*4;
        int alanSonuc= kareKenar*kareKenar;

        System.out.println("Karenin Alani = " + alanSonuc);

        System.out.println("Karenin Cevresi = " + sonuc);












    }
}
