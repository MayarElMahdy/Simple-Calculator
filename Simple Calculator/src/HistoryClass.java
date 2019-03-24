import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HistoryClass {
	private double num1[];
	private double num2[];
	private String operation[];
	private double answer[];
    int i;
    int Next;
    int Previous;
public HistoryClass(){
	i=0;
	num1 = new double [6];
	num2 = new double [6];
	operation = new String [6];
	answer = new double [6];
	Previous = -1;
	Next = 6;
	}
	public void setNum1(double num1) {
		this.num1[i] = num1;
	}
	public double getNum2() {
		return num2[i];
	}
	public void setNum2(double num2) {
		this.num2[i] = num2;	
	}
	public String getOperation() {
		return operation[i];
	}
	public void setOperation(String operation) {
		this.operation[i] = operation;
	}
	public double getAnswer() {
		return answer[i];
	}
	public void setAnswer(double answer) {
		this.answer[i] = answer;
	}
	public void checkI()
	{
		Previous = i;
		i++;
		if(i>=6)
		{
			i=5;	
			num1[0]=num1[1];
			num2[0]=num2[1];
			operation[0]=operation[1];
			answer[0]=answer[1];
			num1[1]=num1[2];
			num2[1]=num2[2];
			operation[1]=operation[2];
			answer[1]=answer[2];
			num1[2]=num1[3];
			num2[2]=num2[3];
			operation[2]=operation[3];
			answer[2]=answer[3];
			num1[3]=num1[4];
			num2[3]=num2[4];
			operation[3]=operation[4];
			answer[3]=answer[4];
			num1[4]=num1[5];
			num2[4]=num2[5];
			operation[4]=operation[5];
			answer[4]=answer[5];
			
			
			
				}
	}
	public void previousButton (JLabel TheAnswerIs)
	{	
		if(Previous<0||operation[Previous]==null)
			{JOptionPane.showMessageDialog(null,
					   "There is no history.",
					   "An Error Has Occurred",
					    JOptionPane.WARNING_MESSAGE);
			Previous=0;
			Next=0;
			}
		
		else
		TheAnswerIs.setText(Double.toString(num1[Previous]) +operation[Previous]+ Double.toString(num2[Previous]) + "=" + Double.toString(answer[Previous]) );
		Previous--;
		Next=Previous;
	}
	
	public void nextButton (JLabel TheAnswerIs)
	{
		if(Next>=6||operation[Next]==null)
		{
			JOptionPane.showMessageDialog(null,
					   "There is no history.",
					   "An Error Has Occurred",
					    JOptionPane.WARNING_MESSAGE);	
			Next=5;
			Previous=5;
		}
		else
		TheAnswerIs.setText(Double.toString(num1[Next]) +operation[Next]+ Double.toString(num2[Next]) + "=" + Double.toString(answer[Next]) );
		Previous=Next;
	}
}
