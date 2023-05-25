package day_03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi aralarinda birer bosluk olacak srkilde yaziniz" +
                "Yalnizca bir ad ve bir soyad girilmeli");
        String adSoyad = input.nextLine();
        System.out.println(adSoyad);
//Substring methodunun iki formu vardir
        //1,cisi substring(index)-> index dahil olmak üzere stringin soonunan kadar olan kismi yeni
        //bir strin olaarak döndürür
        //2,cisi Sabstring (index1 ve index2-> index1 dahil index 2 haric olmak üzere ywnei bir string döndürür
        int spaceIndex =adSoyad.trim().indexOf(" ");
        //Ad soyad vaiable in ilk space kadar olan kismini ad isimli String bir variable a koyduk

        String ad = adSoyad.substring(0, spaceIndex); //sifir dahil spaceIndex haric
        System.out.println(ad);
        String soyad=adSoyad.substring(spaceIndex+1);
        System.out.println(soyad);
        //ad isimli variable nin ilk karakterini büyük harf olacak sekilde alaliim
        char adIlkHarf =ad.toUpperCase().charAt(0);
        //ad isimli variablenin geri kalan kismini kücük harf olarak alalim
        String adGeriKalan =ad.substring(1).toLowerCase();
        ad=adIlkHarf+adGeriKalan; //concatination
        System.out.println(ad);

        //Soyad isimli variablaa in ilk hardini büyük olarak alalim
        char soyAdIlkHarf =soyad.toUpperCase().charAt(0);
        String soyadGeriKalan=soyad.substring(1).toLowerCase();
        soyad=soyAdIlkHarf+soyadGeriKalan; //concatination
        System.out.println("ad : " + ad);
        System.out.println("soyad = " + soyad);






    }
}
