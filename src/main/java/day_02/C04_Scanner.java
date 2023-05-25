package day_02;

import java.util.Scanner;

public class C04_Scanner {

    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir karakter giriniz");
            char ch=input.next().charAt(0); // scanner objesinin nextchar diye bir methodu yok.
                                            //bu yüzden kullanicinin girdigi datayi once string olarak aiyorum#
                                            //daha sonra bu stringin 0.indexindeki karakteri charAt(0)methdu olark aliyrm
            
            //String variablelarda index yapisi vardir ve index 0 dan baslar.
            //charAt(0) demek -> sifirinci index yani ilk karakter demektir
            System.out.println("ch = " + ch);
            System.out.println("====================CEVAP====================");
            /*
                A
               A A
              A A A */
            //Konsolda bosluk yani space yapmak icin sout'un icinde space i mutlaka ""icinde yazmaliyiz

            System.out.println("  "+ch+"  "); //1.satir
            System.out.println(" "+ch+" "+ch+" "); //2.satir
            System.out.println(ch+" "+ch+" "+ch);

            // \n isareti bir alt satira gecmeye yarar " " icine yazilir

            System.out.println("  "+ch+"\n "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);

            

        }
}
