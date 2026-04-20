package com.TimeAndSpaceComplexity;

import java.util.*;

public class ArrayVsHashsetVsTreeset{
    //Linear search on array
    public static boolean arraySearch(int[] arr, int target){
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int N = 1_000_000;      
        int target = N-1;     

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        //Data preparation
        for(int i=0; i<N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        //Array Search 
        long startArray = System.nanoTime();
        boolean foundArray = arraySearch(array, target);
        long endArray = System.nanoTime();

        //HashSet Search
        long startHashSet = System.nanoTime();
        boolean foundHashSet = hashSet.contains(target);
        long endHashSet = System.nanoTime();

        //TreeSet Search
        long startTreeSet = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(target);
        long endTreeSet = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Target Element: " + target);

        System.out.println("\nArray Search Found: "+foundArray);
        System.out.println("Time Taken (Array): "
                + (endArray - startArray)/1_000_000.0+" ms");

        System.out.println("\nHashSet Search Found: "+foundHashSet);
        System.out.println("Time Taken (HashSet): "
                + (endHashSet - startHashSet)/1_000_000.0+" ms");

        System.out.println("\nTreeSet Search Found: "+foundTreeSet);
        System.out.println("Time Taken (TreeSet): "+(endTreeSet - startTreeSet)/1_000_000.0+" ms");
    }
}
