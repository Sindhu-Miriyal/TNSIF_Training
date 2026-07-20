package org.tnsif.acc.c2tc.interview_questions;

//import java.util.Scanner;
//
//public class ReverseString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        StringBuilder rev = new StringBuilder();
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev.append(str.charAt(i));
//        }
//
//        System.out.println("Reversed String: " + rev.toString());
//
//        sc.close();
//    }
//}



import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Easy way: use StringBuilder's reverse()
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String: " + rev);
        sc.close();
    }
}
