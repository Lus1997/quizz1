package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr={12,98,36,200,122,14,65,202};
        int max=arr[0];
        int secondMax=arr[0];
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i=0; i< arr.length; i++) {

            if (secondMax<arr[i] && max>arr[i])
                secondMax=arr[i];
        }
        System.out.println("second maximum element " + secondMax);
            }
        }



