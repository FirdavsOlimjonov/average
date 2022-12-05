package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
         int num = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while(num!=0){
            sum+=num;
            count++;
           num =  scanner.nextInt();
        }

        System.out.print(sum/count);


    }

}
