package com.fpp.Ass7_1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressForm extends JFrame {

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
	
	private JTextField nameTxtField;
	private JTextField streetTextField;
	private JTextField cityTextField;
	private JTextField stateTxtField;
	private JTextField zipTxtField;

	public AddressForm() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Address form");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(12, 10, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(nameLabel);

		nameTxtField = new JTextField();
		nameTxtField.setBounds(10, 40, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(nameTxtField);

		JLabel streetLabel = new JLabel("Street");
		streetLabel.setBounds(218, 10, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(streetLabel);

		streetTextField = new JTextField();
		streetTextField.setBounds(216, 40, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(streetTextField);

		JLabel cityLabel = new JLabel("City");
		cityLabel.setBounds(428, 10, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(cityLabel);

		cityTextField = new JTextField();
		cityTextField.setBounds(426, 40, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(cityTextField);

		JLabel stateLabel = new JLabel("State");
		stateLabel.setBounds(140, 70, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(stateLabel);

		stateTxtField = new JTextField();
		stateTxtField.setBounds(138, 100, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(stateTxtField);

		JLabel zipLabel = new JLabel("Zip");
		zipLabel.setBounds(346, 70, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(zipLabel);

		zipTxtField = new JTextField();
		zipTxtField.setBounds(344, 100, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(zipTxtField);

		JButton jButton = new JButton("Submit");
		jButton.setBounds(240, 150, TEXT_BOX_WIDTH, TEXT_BOX_HEIGHT);
		contentPane.add(jButton);

		jButton.addActionListener(new MyButtonListener());

	}

	class MyButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			System.out.println(nameTxtField.getText());
			System.out.println(streetTextField.getText());
			System.out.printf("%s, %s %s",cityTextField.getText(),stateTxtField.getText(),zipTxtField.getText());
		}
	}

}
