package com.algarithoms;

import java.util.Scanner;

public class Utility {

static Scanner scanner = new Scanner(System.in);

public static String getWord() {

return scanner.next();

}

public static int getInteger() {

return scanner.nextInt();

}

public static  <T> void display(T [] words, String message) {

StringBuilder builder = new StringBuilder("Array "+message+": [");

for (int pos = 0; pos < words.length; pos++) {

builder.append(words[pos]).append(" ");

}

builder.append("]");

System.out.println(builder.toString());

}

public static void display(String[] words, String message) {
	
}

}