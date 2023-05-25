package day_01;

public class C03_Ortalama {

    public static void main(String[] args) {

  /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;
        // double data türünde ismi toplam olan bir Variable olusturalim
        // ve bu Variable a yazdigimiz 5 sayinin toplamini assign edelim (atayalim)

        double toplam = num1 + num2 + num3 + num4 + num5 ;
        //sayisal yani (nümerik) datalarda + isareti matematiksel toplama isareti yapar

        System.out.println("toplam = " + toplam); //609.7
        double ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama);//121.9400000000000XS



    }
}
