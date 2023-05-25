package day_04;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        // Kullanıcıdan uc basamaklı bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayi giriniz");
        int sayi =scan.nextInt();

        //125(yüz-yirmi-bes)

        if (sayi<100 || sayi>999){ //bu kisim sayinin 3 basamakli olmama durumu
            System.out.println("3 basamakli sayi girmelisiniz");
        }else{//Sayinin 3 basamakli olma durumunda yapilacak islemler
            //%a->a ya bölümünden kalani verir
            int birler=sayi%10; //birler basamagini verir
            int onlar=(sayi/10)%10; //onlar basamagi
            int yüzler=sayi/100; //yüzler basamagi

            switch (yüzler){
                case 1:
                    System.out.println("Yüz");break;
                case 2:
                    System.out.println("Iki yüz"); break;
                case 3:
                    System.out.println("Üc yüz"); break;
                case 4:
                    System.out.println("Dört yüz"); break;
                case 5:
                    System.out.println("Bes yüz"); break;
                case 6:
                    System.out.println("Alti yüz"); break;
                case 7:
                    System.out.println("Yedi yüz"); break;
                case 8:
                    System.out.println("Sekiz yüz"); break;
                case 9:
                    System.out.println("Dokuz yüz"); break;
            }
            switch (onlar){
                case 1:
                    System.out.println("On");break;
                case 2:
                    System.out.println("Yirmi"); break;
                case 3:
                    System.out.println("Otuz"); break;
                case 4:
                    System.out.println("Kirk"); break;
                case 5:
                    System.out.println("Elli"); break;
                case 6:
                    System.out.println("Altmis"); break;
                case 7:
                    System.out.println("Yetmis"); break;
                case 8:
                    System.out.println("Seksen"); break;
                case 9:
                    System.out.println("Doksan"); break;

            }
            switch (birler){
                case 1:
                    System.out.println("Bir");break;
                case 2:
                    System.out.println("Iki"); break;
                case 3:
                    System.out.println("Üc"); break;
                case 4:
                    System.out.println("Dört"); break;
                case 5:
                    System.out.println("Bes"); break;
                case 6:
                    System.out.println("Alti"); break;
                case 7:
                    System.out.println("Yedi"); break;
                case 8:
                    System.out.println("Sekiz"); break;
                case 9:
                    System.out.println("Dokuz"); break;

            }
        }



    }
}
