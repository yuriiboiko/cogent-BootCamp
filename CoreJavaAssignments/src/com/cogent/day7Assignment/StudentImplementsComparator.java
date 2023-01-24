package com.cogent.day7Assignment;

import java.util.Comparator;

public class StudentImplementsComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

        int l1 = o1.getName().length();
        int l2 = o2.getName().length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)o1.getName().charAt(i);
            int str2_ch = (int)o2.getName().charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        if (l1 != l2) {
            return l1 - l2;
        }

        else {
            return 0;
        }
		
	}

	
	

	
}
