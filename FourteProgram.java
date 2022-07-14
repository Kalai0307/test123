package com.pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class FourteProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ab= new ArrayList<Integer>();
		int target=10;
		for(int i=0;i<4;i++)
		{
		//	a.add(sc.nextInt());
		}
		int a[]= {1,2,3,4};
		char  o[] ={'+','-','*','/'};
		int resop[]= new int [o.length];
		for(int i=0;i<4-3;i++)
		{
			for(int j=i;j<4-2;j++)
			{
				for(int k=j;k<4-1;k++)
				{
					for(int l=k;l<4;l++)
					{
						resop[0]=o[i];
						resop[1]=o[j];
						resop[2]=o[k];
						resop[3]=o[l];
//						ab.add(o[i]);
//						ab.add(o[j]);
//						ab.add(o[k]);
//						ab.add(o[l]);
						int var=1;
						int res = 0;
						for(int p=0;p<a.length;p++)
						{
							for(int q=p+1;q<a.length;q++) {
								for(int r=q+1;r<a.length;r++)
								{
									for(int s=r+1;s<a.length;s++)
									{
								
										System.out.println(a[p]+o[j]+a[q]+o[k]+a[r]+o[l]+a[s]);
									}
							}
							}
						}
							if(res==target)
							{
								System.out.println("res");
								break;
							}
							else
							{
								System.out.println("jjj");
							}
							res=0;
						  System.out.println(o[i]+" "+o[j]+" "+o[k]+" "+o[l]+" ");
						}
					}
				}
			}
		

	}

}
