package com.practice.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class marsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        S.concat("$");
        Integer l = S.length();
        if(l % 3 > 0){ System.out.println("Invalid sequence!"); System.exit(0);}
        
        int N = l/3, i=0, count=0;
        
        while(i<l+1){
            String sub = S.substring(i, i+3);
            System.out.println("reached");
            if(!sub.equals("SOS"))
            	count+= getVariantCount(sub);
            S.replaceFirst(sub, "");
            S.trim();
            i=i+3;
        }
        System.out.println(count);
    }
    
    private static Integer getVariantCount(String sub){
        System.out.println(sub);
        Integer diffCount = 0, j=0;
        if(sub.charAt(j) != 'S') diffCount+=1;
        if(sub.charAt(j+1) != 'O') diffCount+=1;
        if(sub.charAt(j+2) != 'S') diffCount+=1;
        System.out.println(diffCount);
        return diffCount;
    }
}