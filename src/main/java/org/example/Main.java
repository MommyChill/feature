package org.example;

import java.util.Scanner;

public class Main {
    public static int countVNchar(String inputStr) {
        int count = 0;
        int length = inputStr.length();
        for (int i = 0; i < length - 1; i++) {
            char currentChar = inputStr.charAt(i);
            char nextChar = inputStr.charAt(i + 1);
            if ((currentChar == 'a' && nextChar == 'w')
                    || (currentChar == 'a' && nextChar == 'a')
                    || (currentChar == 'd' && nextChar == 'd')
                    || (currentChar == 'e' && nextChar == 'e')
                    || (currentChar == 'o' && nextChar == 'o')
                    || (currentChar == 'o' && nextChar == 'w')
            ) {
                count++;
                i++;
            } else if (currentChar == 'w'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String inputStr = "hfdawhwhcoomdd";
        String inputStr=sc.nextLine();
        System.out.println(countVNchar(inputStr));
    }
}