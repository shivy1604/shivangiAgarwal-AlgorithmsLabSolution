package com.greatlearning.lab4;

import java.util.Scanner;

public class TransactionApp {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of transaction array");
			int sizeOfTran=sc.nextInt();
			int numberOfTran[] = new int[sizeOfTran];
			System.out.println("Enter the transaction amount one by one");
			for(int i=0;i<sizeOfTran;i++) {
				numberOfTran[i]=sc.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achieved");
			int numberOfTarget = sc.nextInt();
			while(numberOfTarget != 0) {
				int flag = 0;
				System.out.println("Enter the target value");
				int target = sc.nextInt();
				int sum=0;
				for(int i=0;i<sizeOfTran;i++) {
					sum = sum + numberOfTran[i];
					if(sum>=target) {
						System.out.println("Target Achieved after "+(i+1)+" transaction done!");
						flag = 1;
						break;
					}
				}
					if(flag==0) {
						System.out.println("Given Target is not achieved");
					}
					numberOfTarget--;
				
			}
	}

}
