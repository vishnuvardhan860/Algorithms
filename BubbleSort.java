package com.algarithoms;

public class BubbleSort {

public static void main(String[] args) {

// Read the Integer list from the user

Integer[] intArray = getIntegerList();

// Before sorting

Utility.display(intArray, "Before Sorting");

// Sort using insertion algorithm

applyBubbleSort(intArray);

// After sorting

Utility.display(intArray, "After Sorting");

}

private static void applyBubbleSort(Integer[] intArray) {

int n = intArray.length;

for (int i = 0; i < n - 1; i++) 

for (int j = 0; j < n - i - 1; j++)

if (intArray[j] > intArray[j + 1]) {

int temp = intArray[j];

intArray[j] = intArray[j + 1];

intArray[j + 1] = temp;

}

}

private static Integer[] getIntegerList() {

System.out.println("Enter the Size of the int array.");

int size = Utility.getInteger();

Integer[] intArray = new Integer[size];

for (int pos = 0; pos < intArray.length; pos++) {

System.out.println("Enter the int value for position " + pos);

intArray[pos] = Utility.getInteger();

}

return intArray;

 }

}