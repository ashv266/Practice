package com.practice.java;

import java.io.*;
import java.util.*;
import java.math.*;

public class steadyGeneString {

    private static Map<String, Integer> baseMap = new HashMap<String, Integer>();
    private static String geneString="";
    private static Integer idealWeight=0;

    public static void main(String[] args) throws Exception{
    	StringBuilder sb;
     	Scanner rd = new Scanner(System.in);
        Integer N = rd.nextInt();
        if(N%4 != 0){ rd.close(); throw new Exception("Illegal length of string!");}
        
        idealWeight = N/4;       
        
        //Creating default map
        setDefaultMap();  
        Integer endSubStringIndex, diff=0;
        geneString = rd.next(); 
        
        Integer startSubStringIndex = setBaseMap(N);
		
		rd.close();
        if(startSubStringIndex == -1){
            System.out.println(""+0); System.out.println("Start: "+startSubStringIndex);
        }
        else{
        	endSubStringIndex = startSubStringIndex;
            System.out.println("Start: "+startSubStringIndex+" End: "+endSubStringIndex);
            String replacementBases="", basesToBeReplaced="";
            
	       for(String b : baseMap.keySet()){
	            Integer weight = baseMap.get(b);
                diff = idealWeight - weight;
        		if(diff > 0){
                    while(diff>0){
                        replacementBases=replacementBases+b;
                        diff-=1;
                    }
                }
	       }
	       System.out.println(replacementBases);
    	   Integer sizeOfSubStringWindow = replacementBases.length();
	       endSubStringIndex = startSubStringIndex + sizeOfSubStringWindow;
	       System.out.println("Start: "+startSubStringIndex+" End: "+endSubStringIndex);
            
	       while(endSubStringIndex < N && startSubStringIndex < N && endSubStringIndex >= startSubStringIndex){
              System.out.println("Start: "+startSubStringIndex+" End: "+endSubStringIndex);
              if(endSubStringIndex >0 && startSubStringIndex >0){ 
		      if(verifyRepString(geneString.substring(startSubStringIndex, endSubStringIndex) , replacementBases) == true){
	               System.out.println(geneString.substring(startSubStringIndex, endSubStringIndex).length());
                   break;
		      }
		      else{
			       startSubStringIndex=startSubStringIndex+1;
			       endSubStringIndex=startSubStringIndex+sizeOfSubStringWindow-1;
                 // System.out.println("Start: "+startSubStringIndex+" End: "+endSubStringIndex);
              }
              }
	       }
        }
    }
    
    private static void setDefaultMap(){
        baseMap.put("A", 0);
        baseMap.put("G", 0);
        baseMap.put("T", 0);
        baseMap.put("C", 0);
    }
    
    private static Integer setBaseMap(Integer N){
        String inB="";Integer diff = 0,startSubStringIndex=-1;
        int i;
        for(i=0;i<N;i++){
    	   inB = String.valueOf(geneString.charAt(i));
	       if(baseMap.keySet().contains(inB)){
	        Integer weight = baseMap.get(inB);
        	weight+=1;
            baseMap.put(inB, weight);
		    diff = idealWeight - weight;
    		if(diff < 0 && startSubStringIndex == -1)
	       		startSubStringIndex = i;
          }
        }
        return startSubStringIndex;
    }
        private static Boolean verifyRepString(String subString, String replacementBases){
        Boolean isCorrect = false;
        StringBuilder sb = new StringBuilder(subString);
        int i;
        for(i=0;i<sb.length();i++){
        	String baseFromSubString = subString.substring(i,i);
    	   if(replacementBases.contains(baseFromSubString)){
		      sb.deleteCharAt(i); 
		      isCorrect=true;
           }
	       else isCorrect=false;
        }
        return isCorrect;
    }

    }



