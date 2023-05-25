package day_03;

import java.util.Scanner;

public class C03_IfElse {

    //kullanıcıdan iki sayı isteyin
    //sayıların ikisi de pozitifse sayıların toplamını yazdırın
    //ikisi de negatifse sayıların çarpımını yazdırın
    //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
    //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 =input.nextInt();

        //Sayilarin ikisinin de + olmasi --> sayi1 >0 && sayi1 >0
        //Sayilarin nikisinin de - olmasi --> sayi1 <0 && sayi2<0
        //Sayilarin farkli isarette olmasi demek -->Sayi1<0 && sayi2>0 || sayi1>0 && sayi2<0

        if (sayi1>0 &&sayi2>0){
            System.out.println(sayi1+sayi2);
        }
        else if (sayi1 <0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        }
        else if (sayi1<0 && sayi2>0 || sayi1>0 && sayi2<0){
            System.out.println("Farkli isaretli sayilarla islem yapamazsin");
        }else{
            System.out.println("Sifir carpmaya göre yutan elemandir");
        }


    }





}
