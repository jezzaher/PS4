package CalcEngine;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcGUI {
	
		private JFrame frame;
		private JTextField StartingAmnt;
		private JTextField TtlYears;
		private JTextField AnnualInterest;
		private JTextField FutureVal;
		/**
		* Launch the application.
		*/
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CalcGUI window = new CalcGUI();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		/**
		* Create the application.
		*/
		public CalcGUI() {
			initialize();
		}
		/**
		* Initialize the contents of the frame.
		*/
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel splitPanel = new JPanel();
			splitPanel.setBounds(22, 24, 387, 175);
			frame.getContentPane().add(splitPanel);
			splitPanel.setLayout(null);
			
			JLabel InvestmentAmnt = new JLabel("Investment Amount");
			InvestmentAmnt.setFont(new Font("QuickType II", Font.PLAIN, 14));
			InvestmentAmnt.setBounds(10, 10, 150, 25);
			splitPanel.add(InvestmentAmnt);
			
			StartingAmnt = new JTextField();
			StartingAmnt.setBounds(220, 10, 150, 25);
			splitPanel.add(StartingAmnt);
			StartingAmnt.setColumns(10);
			
			JLabel Years = new JLabel("Years");
			Years.setFont(new Font("QuickType II", Font.PLAIN, 14));
			Years.setHorizontalAlignment(SwingConstants.LEFT);
			Years.setBounds(10, 55, 140, 25);
			splitPanel.add(Years);
			
			TtlYears = new JTextField();
			TtlYears.setBounds(220, 55, 140, 25);
			splitPanel.add(TtlYears);
			TtlYears.setColumns(10);
			
			JLabel AnnualInterestRate = new JLabel("Annual Interest Rate");
			AnnualInterestRate.setHorizontalAlignment(SwingConstants.LEFT);
			AnnualInterestRate.setFont(new Font("QuickType II", Font.PLAIN, 14));
			AnnualInterestRate.setBounds(10, 105, 154, 14);
			splitPanel.add(AnnualInterestRate);
			
			JLabel FutureVal1 = new JLabel("Future Value");
			FutureVal1.setFont(new Font("QuickType II", Font.PLAIN, 14));
			FutureVal1.setHorizontalAlignment(SwingConstants.LEFT);
			FutureVal1.setBounds(10, 150, 130, 20);
			splitPanel.add(FutureVal1);
			
			AnnualInterest = new JTextField();
			AnnualInterest.setBounds(220, 100, 140, 25);
			splitPanel.add(AnnualInterest);
			AnnualInterest.setColumns(10);
			
			FutureVal = new JTextField();
			FutureVal.setBounds(220, 140, 140, 25);
			splitPanel.add(FutureVal);
			FutureVal.setColumns(10);
			
			JButton calculateButton = new JButton("Calculate");
			calculateButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					FutureVal.setBackground(Color.LIGHT_GRAY);
					
					double starting = Double.parseDouble(StartingAmnt.getText());
					double years = Double.parseDouble(TtlYears.getText());
					double rate = Double.parseDouble(AnnualInterest.getText());
					
					double total;
					
					Calc Test1 = new Calc();
					
					total = Test1.FutureVal1(starting, rate, years);
					
					FutureVal.setText("$" + total);
				}
			});
			calculateButton.setBounds(250, 220, 120, 35);
			
			frame.getContentPane().add(calculateButton);
		}
}