package com.greatlearning.lab4.main;

import java.util.Scanner;
import com.greatlearning.lab4.service.*;


public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value one by one");
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		BubbleSortImp bb=new BubbleSortImp();
		bb.bubbleSort(notes);
		//System.out.println("After sort");
		//for(int i:notes) {
		//	System.out.print(i+" ");
		//}
		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();
		NotesCountService ncs=new NotesCountService();
		ncs.notesCounter(notes, amount);
		
	}

}
