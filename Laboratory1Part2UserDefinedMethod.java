package kristhelsimon;

import javax.swing.JOptionPane;

public class Laboratory1Part2UserDefinedMethod {
static String inputsquare,inputcircle,width,lenght,name;
static int circle,square,rectanglel,rectanglew;
	public static void main(String[] args) {
		name= JOptionPane.showInputDialog("Name:");
		welcome(name);
	do {
		String[]shapes = {"square","circle","rectangle","exit"};
		String choice=(String)JOptionPane.showInputDialog(null,"Choose your shape", "Calculate Perimeter",
				JOptionPane.QUESTION_MESSAGE,null,shapes,shapes[0]);
		switch(choice){
			case "square": 
				inputsquare =JOptionPane.showInputDialog("One Side Value:");
				square = Integer.parseInt(inputsquare);
				JOptionPane.showMessageDialog(null, "The Perimeter of Square is "+square(square));
		    break;
			case "circle":
				inputcircle = JOptionPane.showInputDialog("Radius:");
				circle = Integer.parseInt(inputcircle);
				JOptionPane.showMessageDialog(null, "The Perimeter of Circle is "+circle(circle));
				break;
			case "rectangle":
				lenght = JOptionPane.showInputDialog("lenght:");
				width = JOptionPane.showInputDialog("width:");
				rectanglel = Integer.parseInt(lenght);
				rectanglew = Integer.parseInt(width);
				rectangle(rectanglel,rectanglew);
				break;
			case "exit":
				return;	
		}
	}while(1==1);
	}
	public static void welcome(String name) {
		JOptionPane.showMessageDialog(null, "Welcome "+name+"!");
	}
	static int square(int v) {
		 int vv= v*4;
		 return vv;
	}
	static double circle(double v) {
        double vv = 2 * Math.PI * v;
		return vv;
	}
	static void rectangle(int v, int vv) {
		int vvv = (v+vv)*2;
		JOptionPane.showMessageDialog(null, "The Perimeter of Rectangle is "+vvv);
	}

}
