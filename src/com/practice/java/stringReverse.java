package com.practice.java;

import java.util.*;
import java.io.*;

public class stringReverse{

	public static void main(String[] args){

		Scanner rd = new Scanner(System.in);
		String origString = rd.next();
		rd.close();
		Integer l = origString.length();
		int i; char[] S = null;

		if(!origString.isEmpty()){
			S = origString.toCharArray();
			for(i=0; i<l/2; i++){
				char c = S[i];
				S[i] = S[l-i-1];
				S[l-i-1] = c;
			}
		}
		else System.out.println("String is empty");
		System.out.println(new String(S));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> arra =new ArrayList<Integer>();
		LinkedList<String> newLl = new LinkedList<String>();
		

	}
}
