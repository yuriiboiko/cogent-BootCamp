package com.cogent.assignments.inheritancepolymorphism.q3;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine [] meds= new Medicine[10];
		int min = 1;
		int max = 3;
		int rand;
		for (int i = 0; i < meds.length; i++) {
			rand =(int)Math.floor(Math.random() *(max - min + 1) + min);
			switch(rand) {
			case 1:
				meds[i] = new Tablet("Aspirin ","123 Main St."); 
				break;
			case 2:
				meds[i] = new Syrup("Benadryl Dry Cough ","456 Broadway St."); 
				break;
			case 3:
				meds[i] = new Ointment("Neosporin ","789 Colby Ave."); 
				break;
			}
		}
		
		for (int i = 0; i < meds.length; i++) {
			meds[i].displayLabel();
		}
		
	}

}
