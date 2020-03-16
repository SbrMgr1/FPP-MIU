package com.fpp.Ass7_2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

	/**
	 * X coordinate of the frame default origin point
	 */
	private static final int FRAME_X_ORIGIN = 450;

	/**
	 * Y coordinate of the frame default origin point
	 */
	private static final int FRAME_Y_ORIGIN = 250;

	/**
	 * Default frame width
	 */
	private static final int FRAME_WIDTH = 640;

	/**
	 * Default frame height
	 */
	private static final int FRAME_HEIGHT = 280;

	private static final int TEXT_BOX_WIDTH = 200;
	private static final int TEXT_BOX_HEIGHT = 40;
	private static final int TOP_ROW_MARGIN = 40;
	private static final int SPAN = 8;

	private static final long serialVersionUID = 1L;

	JButton countBtn;
	JButton reverseBtn;
	JButton removeDupBtn;

	private JTextField inputTxtField;
	private JTextField outputTxtField;

	public Form() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("String Utility");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);

		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 78, 258, 112);
		getContentPane().add(panel);
				panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
				countBtn = new JButton("Count Letters");
				panel.add(countBtn);
				
						reverseBtn = new JButton("Reverse Letters");
						panel.add(reverseBtn);
						
								removeDupBtn = new JButton("Remove Duplicates");
								panel.add(removeDupBtn);
																				
																						inputTxtField = new JTextField();
																						inputTxtField.setBounds(359, 93, 146, 26);
																						getContentPane().add(inputTxtField);
																						
																								outputTxtField = new JTextField();
																								outputTxtField.setBounds(359, 142, 146, 26);
																								getContentPane().add(outputTxtField);
																								
																								JLabel inputLabel = new JLabel("Input");
																								inputLabel.setBounds(359, 78, 61, 16);
																								getContentPane().add(inputLabel);
																								
																								JLabel outputLabel = new JLabel("Output");
																								outputLabel.setBounds(359, 131, 61, 16);
																								getContentPane().add(outputLabel);
								removeDupBtn.addActionListener(new RemoveDupBtnListner());
						reverseBtn.addActionListener(new ReverseBtnListner());
				countBtn.addActionListener(new CountBtnListner());

	}

	class CountBtnListner implements ActionListener {

		public void actionPerformed(ActionEvent evt) {

			String str = inputTxtField.getText();
			if (str != null) {
				outputTxtField.setText(String.valueOf(str.length()));
			} else {
				outputTxtField.setText("0");
			}
		}
	}

	class ReverseBtnListner implements ActionListener {

		public void actionPerformed(ActionEvent evt) {
			String str = inputTxtField.getText();
			if (str != null) {
				StringBuffer sb = new StringBuffer("");
				for (int i = str.length()-1; i >= 0; i--) {
					sb.append(str.charAt(i));
				}
				outputTxtField.setText(sb.toString());
			} else {
				outputTxtField.setText("");
			}
		}
	}

	class RemoveDupBtnListner implements ActionListener {

		public void actionPerformed(ActionEvent evt) {
			String str = inputTxtField.getText();
			if (str != null) {
				StringBuffer sb = new StringBuffer("");
				for (int i = 0; i < str.length(); i++) {
					if(sb.indexOf(String.valueOf(str.charAt(i)))<0) {
						sb.append(str.charAt(i));
					}
					
				}
				outputTxtField.setText(sb.toString());
			} else {
				outputTxtField.setText("");
			}
		}
	}
}
