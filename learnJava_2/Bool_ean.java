package learnJava_2;

import java.util.Scanner;

public class Bool_ean {
    int age;

    public void result(){
        Scanner scan =new Scanner(System.in);

        age = scan.nextInt();
        if (age >= 18){
            System.out.println("He is able to vote");
        }
        else {
            System.out.println("Call the officer on duty");
        }

    }
}
