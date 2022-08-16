import javax.swing.JOptionPane;

public class Laboratory2oneDArray {

	public static void main(String[] args) {
		// ACT 1 CALCULATE SALARY (AUG162022)
		String[] salary = new String[7];
		int[] salaryinput = new int[7];
		int total=0;

		for(int i=0;i<salary.length;i++) {
			salary[i] = JOptionPane.showInputDialog("Input the salary of the "+(i+1)+" day of the week : ");
			salaryinput[i] = Integer.parseInt(salary[i]);
		}

		for(int i=0;i<salaryinput.length;i++) {
	        JOptionPane.showMessageDialog(null,"Salary for the "+(i+1)+" day of the week: "+salaryinput[i]);
	        total += salaryinput[i];    ///total=total+salaryinput[i];
		}
        JOptionPane.showMessageDialog(null, "Total salary of the week : "+total);


	}

}
