package calisma01;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Alistirma {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
                //dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
                int number1 =scan.nextInt();
                int number2= scan.nextInt();

        System.out.println("Please enter which mathematical operation you want to perform");

        char mathOp = scan.next().charAt(0);

        if (mathOp=='+'){
            System.out.println("result" + (number1+number2));
        } else if (mathOp=='-') {
            System.out.println("result" + (number1-number2));
        } else if (mathOp=='*') {
            System.out.println("result" + (number1*number2));
        }else if (mathOp=='/'){
            System.out.println("result" + (number1/number2));
        }else
            System.out.println("Please enter a valid transaction");

    }
}
