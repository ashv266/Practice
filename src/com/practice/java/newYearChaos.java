package com.practice.java;

import java.io.*;
import java.util.*;

public class newYearChaos {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
	    Integer T = rd.nextInt();
	    for(int i=0; i<T; i++){
           getTotalSwaps(rd);
        }
        rd.close();
}

    private static void getTotalSwaps(Scanner rd){
	    int n = rd.nextInt();
        int i,j, temp=0, swapCount=0, bribe = 0; 
        Integer[] curr = new Integer[n];
        for(i=0; i<n; i++){
            curr[i] = rd.nextInt();
        }
        
        for(i=0;i<n;i++){
            for(j=0; j<(curr.length-1-i); j++){
                if(curr[j] != temp)
                    bribe=0;
                
              
                    if(curr[j] > curr[j+1]){
                        temp = curr[j];
                        curr[j] = curr[j+1];
                        curr[j+1] = temp;
                        swapCount+=1; bribe+=1;
                    }
                
                if(bribe > 2){
                    swapCount=-1; break;
                }
            }
            if(swapCount == -1){
                        break;
            }
        }
        
        if(swapCount >= 0)
            System.out.println(swapCount);
        else System.out.println("Too chaotic");
        
    }
}