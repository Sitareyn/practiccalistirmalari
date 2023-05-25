package calisma01;

import java.util.Scanner;

public class Alistirma01 {
    public static void main(String[] args) {

       /* Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
                BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your Height");
        double height = scan.nextDouble();
        System.out.println("Please enter your weight ");
        double weight = scan.nextDouble();
        double bmi = height/(weight*weight);

        if (bmi<20){
            System.out.println("You are pretty weak");
        }else if (bmi>20 && bmi<25) {
            System.out.println("You ar within normal limits");
        }else if (bmi>25 && bmi<30){
            System.out.println("You are in the fat category");
        } else if (bmi>30) {
            System.out.println("You are in the obese category");
        }else{
            System.out.println("Please enter from a valid");
        }


    }
}
