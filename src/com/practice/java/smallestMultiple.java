package com.practice.java;

import java.io.*;
import java.util.*;

public class smallestMultiple{

	public static void main(String[] args){
	
		Integer result = 2520;
		int i;
		for(i=1;i<21;i++){
			if((result%i)!=0){
				result+=2;
				i=1;
			}
		}
		System.out.println("The smallest even multiple: "+result);
		
	}


}