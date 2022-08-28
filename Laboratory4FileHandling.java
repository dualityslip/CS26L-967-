package kristhelsimon;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;;
public class Laboratory4FileHandling {
	static String name,address;
	static int numofunits;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter storage = new PrintWriter(new FileWriter("cust.txt",true));
		
		do {
			//ask input
			name = JOptionPane.showInputDialog("Enter Name");
			address = JOptionPane.showInputDialog("Enter address");
			numofunits = Integer.parseInt(JOptionPane.showInputDialog("Enter numofunits"));
			
			// write file
			 storage.printf("%s %s %d %n", name,address, numofunits);
			 JOptionPane.showMessageDialog(null, "saved");
			 storage.close();
			 
		}while(JOptionPane.showConfirmDialog(null,"More Entries?")==0);
		
		String nameStorage = JOptionPane.showInputDialog("Enter Name");
		Scanner read = new Scanner(new FileReader("cust.txt"));
		
		while(read.hasNext()) {
			String dataN = read.next();
			String dataA = read.next();
			int dataB = read.nextInt();
			read.nextLine();
			if(nameStorage.equalsIgnoreCase(dataN))
				JOptionPane.showMessageDialog(null,dataN+"\n"+dataA+"\n"+dataB);
			
		}
		read.close();
		}

}
