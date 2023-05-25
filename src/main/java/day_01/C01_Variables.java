package day_01;

public class C01_Variables {


    public static void main(String[] args) {

        //Bir variable olustur ve yazdir
        int yas = 35;
        //syntax: variable data turu+variable isim+atama operatoru+variable deger
        int sayi = 50;

        System.out.println(yas);
        //sayi = 50 sekilde yazdir
        System.out.println("sayi=" + sayi); //buna etiketiyle beraber yazdir demek
        //bir variable i etiketiyle birlikte yazdirmanin kisa yolu = soutv

        //string bir variable olusturalim-> non-primitive data türü,"" icinde yazilir ve büyük harf ile baslar
        String isim = "Ali";
        System.out.println("isim = " +isim);
        //Olusturdugun variable i farkli bir variable a kopyala
        //yeni bir variable olusturacagim:benimYasim ve bu variable in degeri yas variablenin degerine esit olsun
        //benimYasim variable degeri de yas variablenin degeri gibi 36 olsun
        
        int benimYasim = yas;
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklare et

        int yil = 2023, ay = 5 , gun = 15;
        System.out.println(yil);
        System.out.println(ay);
        System.out.println(gun);

        //Bir Variable degerini güncelle
        //Az önce olusturdugunuz isim variable ina veli degerini ata
        isim = "Veli";
        System.out.println(isim);
        System.out.println(onunIsmi);
        System.out.println("onunIsmi = "+ onunIsmi);
        //Java yukaridan asagi ve soldan saga calisir

        //Degiskenleri(variable) yazdir

        //Bir variable deklere et : x ==> deklare etmek:tanimlamak dmeek==> data turu+data ismi
        double x;

        //Bir variable baslat : y
        double y = 12.5;

        //Başka bir variable başlat : z
        double z = 33; //Java buraya yazdigimiz 33 degerini basinda double yazdigi icin 33.0 olarak algiladi ve hata vermedi

        //x degişkenini y degişkeni ile başlat
         x=y; // bir scope(main methot) da sadece bir kez deklare edilebilir

        //Variable y'i guncelle
        y=13.9; //ondalikli sayilarda virgül degil nokta kullaniriz

        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


        //camelCase : kucuk harf ile baslayip sonraki kelimelerin buyuk harf ile devam etmesi
        //PascalCase: büyük harf ile baslayip sonraki kelimelerin buyuk harf ile devam etmesi
        //snace_Case : alttire kullanilen kelimelere denir
        //kebab-Case: tire ile kullanilan kelimelere denir

        





    }

}
