package com.company;

public class Main {

    public static void main(String[] args) {
	int sample[]={-987,56,987,33,0,-66,-457,6,9,-12,4,-8};
	int i, b, t;
	int size;
	size=12;

        System.out.println("Первоначальный массив:");
        for (i=0; i<size; i++)
            System.out.print(sample[i]+" ");

        for (i=0; i<size; i++)
            for (b=size-1; b>0; b--)
                if (sample[b-1]<sample[b]) {
                    t = sample[b - 1];
                    sample[b - 1] = sample[b];
                    sample[b] = t;
                }
        System.out.println();
        System.out.println("Новый массив:");
                for(i=0; i<size;i++)
                    System.out.print(sample[i]+" ");
    }
}
