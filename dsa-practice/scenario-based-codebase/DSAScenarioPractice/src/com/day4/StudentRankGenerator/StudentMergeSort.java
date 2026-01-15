package com.day4.StudentRankGenerator;

public class StudentMergeSort {

    public static void mergeSort(Student[] students) {
        if(students.length <= 1) return;

        int mid = students.length/2;

        Student[] left = new Student[mid];
        Student[] right = new Student[students.length-mid];

        System.arraycopy(students, 0, left, 0, mid);
        System.arraycopy(students, mid, right, 0,students.length-mid);

        mergeSort(left);
        mergeSort(right);

        merge(students, left, right);
    }

    private static void merge(Student[] result, Student[] left, Student[] right) {

        int i=0, j=0, k=0;

        while(i<left.length && j<right.length) {
            if(left[i].getScore() >= right[j].getScore()) {
                result[k++] = left[i++];
            }else {
                result[k++] = right[j++];
            }
        }

        while(i<left.length) result[k++] = left[i++];
        while(j<right.length) result[k++] = right[j++];
    }
}
