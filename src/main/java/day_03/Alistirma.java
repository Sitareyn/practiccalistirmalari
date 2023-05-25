package day_03;

import java.util.Scanner;

public class Alistirma {
    public static void main(String[] args) {
        //Kullanicidan isim soy isim iste ve bu isim ve soy ismin isminin heosini büyük
        //Soy ismin sadece bas harfini büyük yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soy adinizi aralarinda bosluk birakarak yaziniz");
        String isimSoyisim = input.nextLine();

        int Space = isimSoyisim.trim().indexOf(" ");

        String ad = isimSoyisim.substring(0,Space);
        System.out.println("ad = " + ad);
        String soyad = isimSoyisim.substring(Space+1);
        System.out.println("soyad = " + soyad);

        System.out.println("====================================================================");

        String buyukad = ad.toUpperCase();
        System.out.println("ISIM= " + buyukad);

        char soyadd =soyad.toUpperCase().charAt(0);
        String geriKalan = soyad.substring(1).toLowerCase();
        System.out.println(soyadd+geriKalan);



    }
}
