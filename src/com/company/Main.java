package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner skaneris = new Scanner(System.in);
        int a = 0 ;
        int b = 0;
        while (true) {
            System.out.println("Iveskite skaicius: ");
            try {
                a = skaneris.nextInt();
            } catch (Exception e) {

                skaneris.nextLine();
                continue;

            }

            if (a != 0) {

                b += a;
            } else {
                System.out.println(b);
                return;
            }
        }

        // write your code here
    }
}
