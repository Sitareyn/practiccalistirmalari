package day_04;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

              seviyesini yazdırınız

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz

             harf notunu yazdırınız
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen puaninizi ");
        double puan = scan.nextDouble();

        String seviye= "";
        if (puan<0 || puan>4){  //Puan 0 dan kücük veya 4 den büyükse hata mesaji veriniz
            System.out.println("0-4 arasi puan girmelisiniz");
            seviye="Yok";
        } else if (puan<1) {
            seviye="Kaldi";
        } else if (puan<2) {
            seviye="Gecti";
        } else if (puan<3) {
            seviye="Iyi";
        } else if (puan<2.5) {
            seviye="Ust";
        } else{
            seviye="Harika";
        }
        System.out.println("seviye = " + seviye);

        char harfNotu =' ';

        switch (seviye){
            case "Kaldi" :
                harfNotu='F'; break;
            case "Gecti" :
                harfNotu='D'; break;
            case "Iyi" :
                harfNotu='C'; break;
            case "Ust" :
                harfNotu='B'; break;
            case "Harika" :
                harfNotu='A'; break;
        }
        System.out.println("harfNotu = " + harfNotu);
    }
}
