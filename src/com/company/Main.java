package com.company;

import java.util.Arrays;


   /* public class Main {
       public static int a;
        public static int b;
        public static void main(String[] args) {
            EvenOdd();
            System.out.println("Сумма четных элементов массива: " + a + "\n" + "Сумма нечетных элементов массива: " + b);
        }
        public static void EvenOdd() {
            final int size = 31;
            int[] c = new int [size];
            for (int i = 0; i < size; i++) {
                c[i]=i;
            }
            System.out.println(Arrays.toString(c));
            for (int i = 0; i < size; i++) {
                if(c[i]!=0) {
                    if (c[i] % 2 == 0) {
                        a++;
                    } else {
                        b++;
                    }}}*/

       /*public class Main {
    public static int min=0;
    public static int max=0;
    public static void main(String[] args) {
        final int size = 25;
        int[] a = new int [size];
        for (int i = 0; i < size; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        Arr(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Максимальный элемент в массиве равен: " + MaxX());
    }
    public static void Arr(int[] a){
        boolean t=true;
        for (int i = 0; i < a.length; i++) {
            if(t){
                min=a[i];
                max=a[i];
                t=false;
            }
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]==min){
                a[i]=max;
            }
            else {
                if(a[i]==max){
                    a[i]=min;
                }}
        }
    }
    public static int MaxX(){
        return max;
    }
}*/

