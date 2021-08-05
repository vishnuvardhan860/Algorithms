package com.algarithoms;

import java.util.ArrayList;

import java.util.List;

public class Permutation {

static List<String> recurPermutations = new ArrayList<>();

public static void main(String[] args) {

String s = "ABC";

recursiveApproach(s.toCharArray(), 0);



System.out.println("Result : "  + recurPermutations);

}

// Recursive function to generate all permutations of a string

private static void recursiveApproach(char[] ch, int currentIndex) {

if (currentIndex == ch.length - 1) {

recurPermutations.add(String.valueOf(ch));

}

for (int i = currentIndex; i < ch.length; i++) {

swap(ch, currentIndex, i);

recursiveApproach(ch, currentIndex + 1);

swap(ch, currentIndex, i);

}

}

private static void swap(char[] ch, int i, int j) {

char temp = ch[i];

ch[i] = ch[j];

ch[j] = temp;

}

}	
