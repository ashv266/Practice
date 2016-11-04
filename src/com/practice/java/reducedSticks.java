package com.practice.java;

import java.io.*;
import java.util.*;

public class reducedSticks {

    public static void main(String[] args) {
        Integer min =Integer.MAX_VALUE, count=0, l; Integer newMin = min;
        Scanner rd = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        int N = rd.nextInt();
        int i;
        for(i=0; i<N; i++){
            l = rd.nextInt();
            arr.add(l);
            if(l < min)
                min = l;
        }
        
int remainder;

Integer[] curr = new Integer[10];

for(int j=0;j<N ; j++){
    count = 0;
    for(i=0; i <N; i++){
        int el = arr.get(i); remainder = 0;
        if(el == 0) continue;
        else{
            remainder = el - min;
            if(remainder >= 0){
                arr.set(i, remainder);
                count+=1;
                if(remainder < newMin && remainder != 0)
                    newMin = remainder;
            }
            else arr.set(i, 0);
        }
       
    }
    min = newMin; 
    newMin = Integer.MAX_VALUE;
    if(count > 0)
        System.out.println(count);
    else break;
}     
        
    }
}