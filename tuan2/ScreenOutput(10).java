package com.example.bai0;

public class main {

	public static void main(String[] args) {
	int n=12;
	for(int i=0;i<n/2;i++) {
		for(int j=0;j<2*n+2;j++) {
			int a=(j<n+2)?j:(n+1-(j-n));
			if(a<n-2*i)
				System.out.print(a);
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	for(int i=n/2-2;i>=0;i--) {
		for(int j=0;j<2*n+2;j++) {
			int a=(j<n+2)?j:(n+1-(j-n));
			if(a<n-2*i)
				System.out.print(a);
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	

	}

}
