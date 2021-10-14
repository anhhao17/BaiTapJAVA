package com.example.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner fileIn = null ; // initializes fileIn to empty
		try
		{
		// Attempt to open the file
		fileIn = new Scanner( new
		FileInputStream("filename.txt"));
		}
		catch (FileNotFoundException e)
		{
		// If the file could not be found, this code is
		
		// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		System.out.println("File " + (fileIn.hasNextLine() ==Boolean.TRUE ? "có": "không") + " dữ liệu");
		ArrayList<String>adc=new ArrayList<>();
		ArrayList<Double>val=new ArrayList<>();
		try {
			fileIn.useDelimiter(",|\n");
			float sum1=0;
			float sum2=0;
			float sum3=0;
			int n1=0,n2=0,n3=0;
			while(fileIn.hasNextLine()) {
				String c=fileIn.next();
				if(c.charAt(0)=='#') {
					for(int i=0;i<adc.size();i++) {
						if(adc.get(i).compareTo("ADC1")==0) {
							sum1+=val.get(i);
							n1++;
						}	
						else if(adc.get(i).compareTo("ADC2")==0) {
							sum2+=val.get(i);
							n2++;
						}
						else {
							sum3+=val.get(i);
							n3++;
						}
							
					}
					c=c.substring(1,9);
					if(n1!=0)
						System.out.println("ADC1 "+(sum1/n1)+" "+c);
					if(n2!=0)
						System.out.println("ADC2 "+(sum2/n2)+" "+c);
					if(n3!=0)
						System.out.println("ADC3 "+(sum3/n3)+" "+c);
					fileIn.nextLine();
					fileIn.nextLine();
					fileIn.next();
					adc=new ArrayList<>();
				}
				adc.add(fileIn.next());
				val.add(fileIn.nextDouble());
				
			}
		}catch(Exception e){
			System.out.println("No LINE FOUND");
		}
	
		fileIn.close();
		
	}

}

