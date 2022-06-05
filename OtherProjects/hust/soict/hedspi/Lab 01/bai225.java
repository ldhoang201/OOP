package LabExercise;

import javax.swing.JOptionPane;

public class bai225 {
	
	static double Sum(Double a,Double b) {
		return a + b;
	}
	
	static double Difference(Double a,Double b) {
		return a - b;
	}
	
	static double Product(Double a,Double b) {
		return a * b;
	}
	
	static double Quotient (Double a,Double b) {
		return a / b;
	}
	
	static boolean CheckDivisor(Double a,Double b) {
		if (a % b == 0) {
			return true;
		}
		return false;	
	}
	
	public static void main(String args[]) {
		String strNum1,strNum2;
		Double Num1,Num2;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		
		Num1 = Double.parseDouble(strNum1);
		Num2 = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, "Sum of 2 double numbers is: " + Sum(Num1, Num2),"Sum",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Difference of 2 double numbers is: " + Difference(Num1, Num2),"Difference", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Product of 2 double numbers is: " + Product(Num1, Num2),"Product", JOptionPane.INFORMATION_MESSAGE);
		if (CheckDivisor(Num1, Num2)) {
			JOptionPane.showMessageDialog(null, "Quotient of 2 double numbers is: " + Quotient(Num1, Num2) + "\n" + "And the divisors of division are " + Num2 + " And " + Quotient(Num1, Num2),"Quotient", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Quotient of 2 double numbers is: " + Quotient(Num1, Num2),"Quotient", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
