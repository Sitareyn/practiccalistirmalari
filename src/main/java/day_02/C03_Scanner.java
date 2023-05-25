package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
//yani alınan iki sayının kareleri esıt ıse true, degıl ıse false döndürsün

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 =scan.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 =scan.nextInt();

        boolean sonuc = karelerEsitMi (sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);
    }
    //Method icin ilk önce access modifier yaziyoruz
    public static boolean karelerEsitMi(int a,int b){
       boolean snc = (a*a) ==  (a*b);

       return snc;
    //Javada tek esittir isareeti atama operatörüdür, cift esittir isareti ise matemetkteki esittir isaretidr
    }
}
