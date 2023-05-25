package day_01;

public class C04_MethodCreation {
    //konsola;
        /*

        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
         */
    public static void main(String[] args) {

        yazdir();
        yazdir();
        yazdir();
    }
    //method olusturmak icin syntax imiz: access modifier + static keyword + return type + methodismi(){}
    //süslü parantezler body kisimdir esas kodlarimizi body a yazariz

    public static void yazdir (){

        System.out.println("hello world");
        System.out.println(" Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");


    }


}
