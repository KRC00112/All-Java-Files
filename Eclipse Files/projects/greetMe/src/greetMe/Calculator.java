package greetMe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator implements ActionListener {
	
	static Calculator calc=new Calculator();
	
	static JTextArea area;
	
	static JButton button0;
	static JButton button1;
	static JButton button2;
	static JButton button3;
	static JButton button4;
	static JButton button5;
	static JButton button6;
	static JButton button7;
	static JButton button8;
	static JButton button9;
	static JButton buttonAdd;
	static JButton buttonSubtract;
	static JButton buttonMultiply;
	static JButton buttonDivide;
	static JButton buttonEqual;
	static JButton buttonClear;




	
	public static void main (String[] args) {
		
		JFrame frame=new JFrame();//for me:already in borderlayout
		frame.setSize(520,510);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel=new JPanel();
		mainPanel.setSize(500, 500);
		mainPanel.setBackground(Color.white);
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel TareaPanel=new JPanel();
		TareaPanel.setPreferredSize(new Dimension(500,100));
		TareaPanel.setBackground(Color.white);
		
		JPanel PareaPanel=new JPanel();//for me:in gridlayout
		PareaPanel.setPreferredSize(new Dimension(500,355));
		PareaPanel.setLayout(new GridLayout(4,4,10,10));
		PareaPanel.setBackground(Color.white);

	
		area=new JTextArea("",5,49);
		area.setEditable(false);
		area.setBorder(BorderFactory.createLineBorder(Color.black));
		area.setBackground(Color.white);

	
		
		button0=new JButton("0");
		PareaPanel.add(button0);
		button0.addActionListener(calc);
		
		button1=new JButton("1");
		PareaPanel.add(button1);
		button1.addActionListener(calc);

		
		button2=new JButton("2");
		PareaPanel.add(button2);
		button2.addActionListener(calc);

		button3=new JButton("3");
		PareaPanel.add(button3);
		button3.addActionListener(calc);
		
		button4=new JButton("4");
		PareaPanel.add(button4);
		button4.addActionListener(calc);
		
		button5=new JButton("5");
		PareaPanel.add(button5);
		button5.addActionListener(calc);
		
		button6=new JButton("6");
		PareaPanel.add(button6);
		button6.addActionListener(calc);
		
		button7=new JButton("7");
		PareaPanel.add(button7);
		button7.addActionListener(calc);
		
		button8=new JButton("8");
		PareaPanel.add(button8);
		button8.addActionListener(calc);
		
		button9=new JButton("9");
		PareaPanel.add(button9);
		button9.addActionListener(calc);
		
		buttonAdd=new JButton("+");
		PareaPanel.add(buttonAdd);
		buttonAdd.addActionListener(calc);
		
		buttonSubtract=new JButton("-");
		PareaPanel.add(buttonSubtract);
		buttonSubtract.addActionListener(calc);

		buttonMultiply=new JButton("x");
		PareaPanel.add(buttonMultiply);
		buttonMultiply.addActionListener(calc);

		buttonDivide=new JButton("/");
		PareaPanel.add(buttonDivide);
		buttonDivide.addActionListener(calc);
		
		buttonEqual=new JButton("=");
		PareaPanel.add(buttonEqual);
		buttonEqual.addActionListener(calc);
		
		buttonClear=new JButton("clear");
		PareaPanel.add(buttonClear);
		buttonClear.addActionListener(calc);
		
		
		

		
		mainPanel.add(TareaPanel);
		mainPanel.add(PareaPanel);
		TareaPanel.add(area);
		
		
		
		
		frame.add(mainPanel);
		
		
		
		
		
		
		
		
		frame.setVisible(true);
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		 
	            JButton button = (JButton) e.getSource();
	            String buttonText = button.getText();

	            if ("0123456789".contains(buttonText)) {
	                area.append(buttonText);
	            }  if ("+-x/".contains(buttonText)) {
	                // Handle operators (+, -, x, /)
	                area.append(" " + buttonText + " ");
	            } else if (buttonText.equals("=")) {
	                String[] tokens = area.getText().split(" ");
	                if (tokens.length == 3) {
	                    int a = Integer.parseInt(tokens[0]);
	                    int b = Integer.parseInt(tokens[2]);
	                    int result = 0;

	                    if (tokens[1].equals("+")) {
	                        result = a + b;
	                    } else if (tokens[1].equals("-")) {
	                        result = a - b;
	                    } else if (tokens[1].equals("x")) {
	                        result = a * b;
	                    } else if (tokens[1].equals("/")) {
	                        if (b != 0) {
	                            result = a / b;
	                        } else {
	                            area.setText("Error: Division by zero");
	                            return;
	                        }
	                    }

	                    area.setText(String.valueOf(result));
	                } else {
	                    area.setText("Invalid expression");
	                }
	            } else if (buttonText.equals("clear")) {
	                area.setText("");
			
			
		}

		
		
	}
	
}


