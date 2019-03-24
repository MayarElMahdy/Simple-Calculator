import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LogicClass {
	private double num1;
	private double num2;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double calculations(int cases)
	{
		switch(cases)
		{
		case 1 : return num1+num2;  
		case 2 : return num1*num2 ;
		case 3 : return num1/num2 ;
		case 4 : return num1 - num2;
		default : return 0;
		}	
	}
	public int checkDivide (JTextField Numbers)
	{
		if (this.num2==0)
		{
			JOptionPane.showMessageDialog(null,
					   "ERROR!!!! There is no such thing as divided zero!!",
					   "An Error Has Occurred",
					    JOptionPane.WARNING_MESSAGE);
			Numbers.setText("");
			return 0;	
		}
		else
			return 1;
	}
}
