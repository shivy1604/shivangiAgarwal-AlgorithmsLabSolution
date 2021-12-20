package com.greatlearning.lab4.service;

public class NotesCountService {
	
	
	public void notesCounter(int notes[],int amount) {
		int noteCounter[]=new int[notes.length]; //array variable created...
		
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				noteCounter[i]=amount/notes[i]; // 12/10
				amount = amount-noteCounter[i]*notes[i]; //12-10*
			}
		}
		
		if(amount>0) {
			System.out.println("Exact amount can't be given with the highest denomination");
		} else {
			System.out.println("Your payment approach is ");
			for(int i=0;i<notes.length;i++) {
			if(noteCounter[i] !=0) {
				System.out.println(notes[i]+" rupees : "+noteCounter[i] + " number of notes");
			}	
			}
			
		}
	}

}
