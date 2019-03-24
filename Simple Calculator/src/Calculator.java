import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.DropMode;

public class Calculator {
	private JButton button0;  //Declaration 
	private JLabel TheAnswerIs;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton plus;
	private JButton minus;
	private JButton divide;
	private JButton Equal;
	private JButton Times;
	private JButton point;
	private JButton Clear;
	private JTextField Numbers;
	private JFrame Calculator;
	private JButton PreviousButton;
	private JButton NextButton;
	LogicClass logicClass = new LogicClass();  //objects
	HistoryClass historyClass = new HistoryClass();
	String operation;  //used to take the operation used 
	double answer; //stores the answer of the two numbers
	int pointError; //checks if it has more than one point
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.Calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculator = new JFrame();
		Calculator.setBackground(Color.WHITE);
		Calculator.setTitle("Calculator");
		Calculator.getContentPane().setBackground(new Color(224, 255, 255));
		Calculator.setBounds(100, 100, 420, 446);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		Numbers = new JTextField();
		Numbers.setEditable(false);
		Numbers.setHorizontalAlignment(SwingConstants.RIGHT);
		Numbers.setBounds(12, 44, 279, 49);
		Calculator.getContentPane().add(Numbers);
		Numbers.setFont(new Font("Tahoma", Font.BOLD, 20));
		Numbers.setColumns(10);	
		JButton button1 = new JButton("1");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"1");
			}
		});
		button1.setBounds(12, 106, 66, 49);
		button1.setBackground(new Color(255, 218, 185));
		button1.setForeground(Color.BLACK);
		Calculator.getContentPane().add(button1);		
		button2 = new JButton("2");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"2");
			}
		});
		button2.setBounds(113, 107, 75, 47);
		button2.setBackground(new Color(255, 228, 196));
		Calculator.getContentPane().add(button2);		
		button3 = new JButton("3");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button3.setBounds(225, 106, 66, 49);
		button3.setBackground(new Color(255, 228, 196));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Numbers.setText(Numbers.getText()+"3");
			}
		});
		Calculator.getContentPane().add(button3);		
	    button4 = new JButton("4");
	    button4.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    button4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Numbers.setText(Numbers.getText()+"4");
	    	}
	    });
		button4.setBounds(12, 168, 66, 50);
		button4.setBackground(new Color(255, 228, 196));
		Calculator.getContentPane().add(button4);		
	    button5 = new JButton("5");
	    button5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button5.setBounds(113, 169, 75, 49);
		button5.setBackground(new Color(255, 228, 196));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"5");
			}
		});
		Calculator.getContentPane().add(button5);		
		button6 = new JButton("6");
		button6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button6.setBounds(225, 168, 66, 50);
		button6.setBackground(new Color(255, 228, 196));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"6");
			}
		});
		Calculator.getContentPane().add(button6);		
		button7 = new JButton("7");
		button7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"7");
			}
		});
		button7.setBounds(12, 230, 66, 49);
		button7.setBackground(new Color(255, 228, 196));
		Calculator.getContentPane().add(button7);	
		button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"8");
			}
		});
		button8.setBounds(113, 231, 75, 48);
		button8.setBackground(new Color(255, 228, 196));
		Calculator.getContentPane().add(button8);		
		button9 = new JButton("9");
		button9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"9");
			}
		});
		button9.setBounds(225, 230, 66, 48);
		button9.setBackground(new Color(255, 228, 196));
		Calculator.getContentPane().add(button9);	
		 button0 = new JButton("0");
		 button0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button0.setBounds(113, 292, 75, 47);
		button0.setBackground(new Color(255, 228, 196));
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numbers.setText(Numbers.getText()+"0");
			}
		});
		Calculator.getContentPane().add(button0);	
		TheAnswerIs = new JLabel("");
		TheAnswerIs.setBackground(new Color(0, 0, 128));
		TheAnswerIs.setForeground(new Color(25, 25, 112));
		TheAnswerIs.setBounds(12, 0, 254, 38);
		TheAnswerIs.setFont(new Font("Tahoma", Font.BOLD, 13));
		Calculator.getContentPane().add(TheAnswerIs);
	    plus = new JButton("+");
	    plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Numbers.getText().equals("")||operation !=null)
				{
				JOptionPane.showMessageDialog(null,
						   "ERROR!!",
						   "An Error Has Occurred",
						    JOptionPane.WARNING_MESSAGE); 
				}
				else
				{	
			    logicClass.setNum1(Double.parseDouble(Numbers.getText()));
				operation = "+";
				Numbers.setText("");
			    TheAnswerIs.setText(Double.toString(logicClass.getNum1())+operation);
			    pointError=0;
				}
			}
		});
		plus.setBackground(Color.ORANGE);
		plus.setBounds(323, 106, 67, 49);
		Calculator.getContentPane().add(plus);
		
		minus = new JButton("-");
		minus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Numbers.getText().equals("")||operation!=null)
				{
					JOptionPane.showMessageDialog(null,
						   "ERROR!!",
						   "An Error Has Occurred",
						    JOptionPane.WARNING_MESSAGE); 
				}
				else
				{	logicClass.setNum1(Double.parseDouble(Numbers.getText()));
				operation = "-";
				Numbers.setText("");
				TheAnswerIs.setText(Double.toString(logicClass.getNum1())+operation);
				pointError=0;
				}
			}
		});
		minus.setBackground(Color.ORANGE);
		minus.setBounds(323, 170, 67, 47);
		Calculator.getContentPane().add(minus);
		
		divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Numbers.getText().equals("")||operation !=null)
				{
					JOptionPane.showMessageDialog(null,
						   "ERROR!!",
						   "An Error Has Occurred",
						    JOptionPane.WARNING_MESSAGE); 
				}
				else
				{
				logicClass.setNum1(Double.parseDouble(Numbers.getText()));
				operation = "/";
				Numbers.setText("");
				TheAnswerIs.setText(Double.toString(logicClass.getNum1())+operation);
				pointError=0;
				}
			}
		});
		divide.setBackground(Color.ORANGE);
		divide.setBounds(323, 230, 67, 49);
		Calculator.getContentPane().add(divide);
		
		Times = new JButton("*");
		Times.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Numbers.getText().equals("")||operation!=null)
				{
					JOptionPane.showMessageDialog(null,
						   "ERROR!!",
						   "An Error Has Occurred",
						    JOptionPane.WARNING_MESSAGE); 
				}
				else
				{
				logicClass.setNum1(Double.parseDouble(Numbers.getText()));	
				operation = "*";
				Numbers.setText("");
				TheAnswerIs.setText(Double.toString(logicClass.getNum1())+operation);
				pointError=0;
				}
			}
		});
		Times.setBackground(Color.ORANGE);
		Times.setForeground(Color.BLACK);
		Times.setBounds(225, 291, 66, 47);
		Calculator.getContentPane().add(Times);
		 point = new JButton(".");
		 point.setFont(new Font("Tahoma", Font.PLAIN, 20));
		point.setBackground(new Color(255, 228, 196));
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Numbers.getText().equals("")||pointError!=0)
					JOptionPane.showMessageDialog(null,
							   "ERROR!!",
							   "An Error Has Occurred",
							    JOptionPane.WARNING_MESSAGE);
				else if(Numbers.getText()!="")
				{
				Numbers.setText(Numbers.getText() + ".");
				pointError=1;
				}
			}
		});
		point.setBounds(12, 291, 66, 47);
		Calculator.getContentPane().add(point);
		
		 Equal = new JButton("=");
		 Equal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Equal.setBackground(Color.ORANGE);
		Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation==null || Numbers.getText().equals(""))
				{JOptionPane.showMessageDialog(null,
							   "ERROR!!",
							   "An Error Has Occurred",
							    JOptionPane.WARNING_MESSAGE); 
				}
				else 
				{	logicClass.setNum2(Double.parseDouble(Numbers.getText()));
					
				if(operation!="/")
				{
				if (operation=="+")
				{
				 answer=logicClass.calculations(1); 
				 TheAnswerIs.setText("The Answer For "  + Double.toString(logicClass.getNum1())+ operation + Double.toString(logicClass.getNum2())+ "= " + Double.toString(answer));
				}
				else if (operation=="-")
				{
					answer=logicClass.calculations(4); 
					TheAnswerIs.setText("The Answer For "  + Double.toString(logicClass.getNum1()) + operation + Double.toString(logicClass.getNum2())+ "= " + Double.toString(answer));
				}
				
				else if (operation == "*")
				{
					answer = logicClass.calculations(2); 
					TheAnswerIs.setText("The Answer For "  + Double.toString(logicClass.getNum1()) + operation + Double.toString(logicClass.getNum2())+ "= " + Double.toString(answer));
				}
				
				Numbers.setText("");
				historyClass.setNum1(logicClass.getNum1());
				historyClass.setNum2(logicClass.getNum2());
				historyClass.setAnswer(answer);
				historyClass.setOperation(operation);
				historyClass.checkI();
				pointError=0;
				operation=null;
				}
				else if (operation == "/")
				{	if(logicClass.checkDivide(Numbers)==1)
					{
				    answer = logicClass.calculations(3);
					TheAnswerIs.setText("The Answer For "  + Double.toString(logicClass.getNum1()) + operation + Double.toString(logicClass.getNum2())+ "= " + Double.toString(answer));
					Numbers.setText("");	
					historyClass.setNum1(logicClass.getNum1());
					historyClass.setNum2(logicClass.getNum2());
					historyClass.setAnswer(answer);
					historyClass.setOperation(operation);
					historyClass.checkI();
					pointError=0;
					operation=null;
					}		
				}
				}
			}
		});
		Equal.setBounds(323, 291, 67, 47);
		Calculator.getContentPane().add(Equal);
		
		Clear = new JButton("C");
		Clear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Numbers.getText().equals(""))
				{
				JOptionPane.showMessageDialog(null,
						   "ERROR!!",
						   "An Error Has Occurred",
						    JOptionPane.WARNING_MESSAGE); 
				}
				else
				Numbers.setText("");
			}
		});
		Clear.setBackground(Color.LIGHT_GRAY);
		Clear.setBounds(323, 48, 67, 47);
		Calculator.getContentPane().add(Clear);
		 PreviousButton = new JButton("Previous");
		 PreviousButton.setBackground(SystemColor.activeCaption);
		 PreviousButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PreviousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				historyClass.previousButton(TheAnswerIs);	
			}
		});
		PreviousButton.setBounds(225, 351, 165, 38);
		Calculator.getContentPane().add(PreviousButton);
		NextButton = new JButton("Next");
		NextButton.setBackground(SystemColor.activeCaption);
		NextButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				historyClass.Next++;
				historyClass.nextButton(TheAnswerIs);
			}
		});
		NextButton.setBounds(12, 351, 165, 38);
		Calculator.getContentPane().add(NextButton);
	}
}
