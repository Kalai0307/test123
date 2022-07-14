package com.surprise;

import java.util.Scanner;

public class Pairing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfElem=sc.nextInt();
		int  a[]= {1,2,3,4,5,6};
	//	int a[]= new int [numOfElem];
		int k=5;
		
		for(int i=0;i<numOfElem-1;i++)
		{
			for(int j=i+1;j<numOfElem;j++)
			{
				if((a[i]+a[j])%k==0)
				{
					System.out.print ("["+a[i]+","+a[j]+"]");
				}
			}
		}

	}

}
