package com.practice.java;

import java.io.*;
import java.util.*;

public class SuperReducedString{
	
	public static void main(String args[]){
		
		Scanner reader = new Scanner(System.in);
		String S = reader.nextLine();
		Integer N = S.length();
		StringBuilder sb = new StringBuilder(S);
		int i=0;
		S.matches("[A-Z]");
		while(sb.length()!=0 && i<sb.length()-1){
			if(sb.charAt(i)==sb.charAt(i+1)) {sb.deleteCharAt(i+1); sb.deleteCharAt(i); i=0;} 
			else i=i+1;
		}
		Integer min = Integer.MIN_VALUE;
		Integer test = N/4;
		System.out.println(test);
		if(sb.length()==0)
			System.out.println("Empty String");
		else System.out.println(sb.toString());
	}
	
}