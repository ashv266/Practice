package com.practice.java;

import java.util.*;

public class LonelyInteger {
	     private static int lonelyInteger(int[] a) {
		   int j=0, uniqueEl=0; int isUnique=1;
	       Set<Integer> nonUniques = new HashSet<Integer>();
		   for(int i=0; i<=a.length-1; i++){
			  j=i+1; isUnique = 1;
	          if(!nonUniques.contains(a[i])){
			      while(j<a.length){
				     if((a[i]^a[j]) == 0){
	                    nonUniques.add(a[i]);
	                    isUnique = 0;
					    break;
				     }
	                else
	                    j++;
	             }
	            if (isUnique == 1  && !nonUniques.contains(a[i])){
		           uniqueEl = a[i];
	                break;	
	            }
	         }
	       }
	        return uniqueEl;
	    }
	     
	     private static int lonelyInteger_Efficiency(int[] a) {
	     
	    	 int unique = Arrays.stream(a).reduce(0, (x,y) -> x^y);
	    	 
	    	 return unique;
	     }
	    
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }
	        in.close();
	        System.out.println(lonelyInteger_Efficiency(a));
	    }

	}

