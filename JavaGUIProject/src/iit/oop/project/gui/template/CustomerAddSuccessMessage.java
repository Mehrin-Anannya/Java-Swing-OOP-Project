package iit.oop.project.gui.template;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class CustomerAddSuccessMessage extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CustomerAddSuccessMessage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnBack = new JButton("Back");
		CustomerUI customerUI = new CustomerUI();
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				customerUI.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Customer Added Successfully");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(138)
							.addComponent(btnBack))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addComponent(lblNewLabel)))
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addGap(38)
					.addComponent(btnBack)
					.addContainerGap(152, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
