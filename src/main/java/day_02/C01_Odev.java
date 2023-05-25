package day_02;

public class C01_Odev {
    public static void main(String[] args) {

        //Iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun
        //main methodun icinde tanimladigim iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun

        int a=2;
        int b=3;

        kareToplaYazdir(a,b);//Buradaki parantez icindeki variablle lere argüment denir
    }
    public static void kareToplaYazdir(int sayi1, int sayi2){//method parantezinin icine method body de kullanacagimiz variabllari tanimliyoruz
                                  //bunlara parametre diyoruz

        int toplam =(sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);

    }

}
