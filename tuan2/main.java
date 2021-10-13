package com.example.bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

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
		String adc;
		float val1=0;
		float val2=0;
		float val3=0;
		int n1=0,n2=0,n3=0;
		try {
			while(fileIn.hasNext()) {
				String data=fileIn.nextLine();
				char a=data.charAt(0);
				Scanner sc=new Scanner(data);
				if(a=='#') {
					if(fileIn.hasNextLine())
						fileIn.nextLine();
					data=data.substring(1,9);
					if(n1!=0)
						System.out.println("ADC1 "+(val1/n1)+" "+data);
					if(n2!=0)
						System.out.println("ADC2 "+(val2/n2)+" "+data);
					if(n3!=0)
						System.out.println("ADC3 "+(val3/n3)+" "+data);
					val1=0;
					val2=0;
					val3=0;
					n1=0;n2=0;n3=0;
					System.out.println();
				}
				else {
					sc.useDelimiter(",|\n");
					sc.next();
					adc=sc.next();
					if(adc.equals("ADC1")) {
						val1+=sc.nextFloat();
						n1++;
					}
					else if(adc.equals("ADC2")) {
						val2+=sc.nextFloat();
						n2++;
					}
					else {
						val3+=sc.nextFloat();
						n3++;
					}
					
				}
			}
		}catch(Exception e) {
			
		}
	}

}

