package kristhelsimon;

import javax.swing.JOptionPane;

public class Laboratory2oneDarrayAct2 {
	static String students;
	static int numofstudents;
	static String names;

	public static void main(String[] args) {
		// ACT 2 Class List (AUG162022)
		 students = JOptionPane.showInputDialog(" Number of students : ");
		 numofstudents =Integer.parseInt(students);
		 String[] sizeofnumofstudent = new String[numofstudents];
		 
		 PopulateArray(sizeofnumofstudent);
		 DisplayArray(sizeofnumofstudent);
		 JOptionPane.showMessageDialog(null, sizeofnumofstudent);

	}
	static void PopulateArray(String[] x) {
		for(int i=0;i<x.length;i++) {
			x[i]= JOptionPane.showInputDialog(" Name of students : ");
		}
	}
	static String[] DisplayArray(String[] x) {
		for(int i=0;i<x.length;i++) {
			names += x[i];
		}
		return x;
	}

}
