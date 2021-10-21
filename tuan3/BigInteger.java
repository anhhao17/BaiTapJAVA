package com.example;

import java.util.Scanner;

public class BigInteger {
	public char[]dec=new char[100];
	char []digit=new char[10];
	public int n1,n2;
	public BigInteger(String a) {
		int index=a.indexOf('.');
		char [] str1;
		char [] str2= {0};
		if(index!=-1) {
			str1=a.substring(0,index).toCharArray();
			str2=a.substring(index+1,a.length()).toCharArray();
			n1=index;
			n2=a.length()-index-1;
		}
		else {
			str1=a.toCharArray();
			n1=a.length();
			n2=0;
		}
		for(int i=0;i<n1;i++) {
			dec[i]=str1[n1-i-1];
		}
		for(int i=n1;i<100;i++) {
			dec[i]='0';
		}
		for(int i=0;i<10-n2;i++) {
			digit[i]='0';
		}
		for(int i=10-n2;i<10;i++) {
			digit[i]=str2[9-i];
		}

	}
	public BigInteger() {
		
	}
	public BigInteger add(BigInteger b) {
		BigInteger sum=new BigInteger();
		int carry=0;
		int count=(n2 > b.n2)?n2:b.n2;
		sum.n2=count;
		for(int i=10-count;i<10;i++) {
			int s=Character.getNumericValue(digit[i])+Character.getNumericValue(b.digit[i])+carry;
			sum.digit[i]=(char)(s%10+'0');
			carry=s/10;
		}
		count=(n1 > b.n1)?n1:b.n1;
		count++;
		sum.n1=count;
		for(int i=0;i<count;i++) {
			int s=Character.getNumericValue(dec[i])+Character.getNumericValue(b.dec[i])+carry;
			sum.dec[i]=(char)(s%10+'0');
			carry=s/10;
		}
		if(sum.dec[count-1]=='0') {
			sum.n1--;
		}
		return sum;
		
	}
	
	
	
	public void print() {
		for(int i=n1-1;i>=0;i--) {
			System.out.print(dec[i]);
		}
		if(n2!=0)
			System.out.print('.');
		for(int i=9;i>=10-n2;i--)
			System.out.print(digit[i]);
		System.out.println();
	}
}
