package day_04;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {

         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen bir tam sayi daha giriniz");
        int sayi2 =scan.nextInt();

                                                               //False ise hangisi büyük diye bakip
         // soru(sayilar esit mi?  True ise bu ifade yazilacak://büyük olani yazdiracak
 System.out.println(sayi1==sayi2? ( "Sayilar Birbirine Esit"):(sayi1>sayi2 ?  sayi1: sayi2 ) );











    }
}
