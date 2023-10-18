package com.sunbeam;

import java.util.Scanner;

public class count {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence: ");
    String input = sc.nextLine();
    input = input.trim();
    String[] words = input.split("\\s+");
    int wordCount = words.length;
    System.out.println("Number of words: " + wordCount);
}
}



