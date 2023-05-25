package day_03;

import java.util.Scanner;

public class C02IfElse {
    //Kullanicidan ayri ayri sisteme iki sayi girmasini isteyiniz
    //Ilk sayinin ikinci sayidan büyük olup olmadigini yazdirin
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 =scan.nextInt();

        System.out.println("Lütfen ikinci sayiyi girirniz");
        int sayi2 =scan.nextInt();

        if (sayi1>sayi2){
            System.out.println("Ilk sayi ikinci sayidan büyüktür");
        } else{
            System.out.println("ilk sayi ikinci sayidan büyük degildir");
        }






    }
}
