package com.raf;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class Run {
	static JTextField textField;
	static String inputName;

	public static void main(String[] args) throws SQLException {
		JFrame frame = new JFrame("First Desktop App");

		frame.setLayout(new FlowLayout());

		textField = new JTextField("Type your name..");

		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputName != null) {
					inputName = "null";
				} else {
					inputName = textField.getText();
				}
				System.out.println("Name:" + textField.getText());
			}
		});

		frame.add(textField);

		try {
			DBConnect.connect();
		} catch (SQLException e) {

		}

		JButton buttonLeft = new JButton("Enter");
		frame.add(buttonLeft, BorderLayout.LINE_START);

		frame.setVisible(true);
		frame.setSize(new Dimension(800, 600));

	}
}
