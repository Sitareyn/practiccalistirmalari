package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

//Kullanicidan Fahrenheit bir deger alalim

        //1.Adim) Scanner objesi olusturun
        Scanner scan = new Scanner(System.in);

        //2.Adim) Kullaniciya bir mesaj gönderin
        System.out.println("Lütfen Fahrenheit cinsinden bir sicaklik giriniz");

        double fahrenheit = scan.nextDouble(); //Kullanicinin girdigi veriyi fahrenheit variablesine koymus olduj
        System.out.println("fahrenheit = " + fahrenheit);

        //Main method icinden method olustururken                //() bu parantez method parantezidir zorunludur ivine argüment konur
        //methodumuza verecegimiz ismi yaziyoruz
       double celsius = FahrToCels(fahrenheit); //Method paranteyinin icine neyi degistireceksek onu yazariz
        System.out.println("celsius = " + celsius);


    }

    public static double FahrToCels(double fahrenheit) {
       // formül: c = (f-32)/1.8
        double celsius = (fahrenheit-32)/1.8;
        return celsius;

    }

}
