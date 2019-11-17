/*
 * Iván Gamaliel Sánchez Zepeda
 * Github: ivangsanchez
 */

package com.multdos.app;

import java.util.Scanner;
public class Multi_dos_suma_contador 
{

	public static void main(String[] args)
	{
		int cont=0,sum=0,num=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Input a Number: ");
		num=input.nextInt();
		
		for(int i=1; i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum+=i;
				cont++;
			}
		}
		System.out.println("The number of multiples of 2 is: "+cont);
		System.out.println("The sum of the multiples of 2 is: "+sum);

	}

}
