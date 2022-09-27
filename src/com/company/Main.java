package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayInt=new ArrayList<>();
        arrayInt.add(1);
        arrayInt.add(1);
        arrayInt.add(1);
        arrayInt.add(8);
        arrayInt.add(9);
        arrayInt.add(6);
        LinkedHashSet<Integer> integers = new LinkedHashSet<>(arrayInt);

        /*for(int i=integers.size()-1; i>=0;i--){
            System.out.println("Value :"+integers.contains(i));
        }*/
        Collections.reverse(arrayInt);
        System.out.println(arrayInt);
	// write your code here
    }
}
