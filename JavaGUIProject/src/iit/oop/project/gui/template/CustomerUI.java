package iit.oop.project.gui.template;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import iit.oop.project.controller.CustomerController;
import iit.oop.project.model.Customer;

public class CustomerUI extends JFrame {

	private JPanel contentPane;
	private JTextField custNameTextField;
	private JTextField custNIdTextField;

	CustomerController controller = new CustomerController();
	Customer customer = new Customer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerUI frame = new CustomerUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel custLblName = new JLabel("Customer Name");
		custLblName.setHorizontalAlignment(SwingConstants.LEFT);
		custLblName.setVerticalAlignment(SwingConstants.TOP);

		
		custNameTextField = new JTextField();
		custNameTextField.setColumns(10);
		
		custNIdTextField = new JTextField();
		custNIdTextField.setColumns(10);
		
		JLabel custLblNid = new JLabel("National Id");
		custLblNid.setVerticalAlignment(SwingConstants.TOP);
		custLblNid.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		JLabel custLblStatus = new JLabel("Customer Status");
		custLblStatus.setVerticalAlignment(SwingConstants.TOP);
		custLblStatus.setHorizontalAlignment(SwingConstants.LEFT);
		
		String status[] = {"Active", "Inactive"};
		JComboBox custStatusDropDown = new JComboBox(status);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(0, 0, 0));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer.setCustomerName(custNameTextField.getText().toString());
				customer.setNid(Integer.parseInt(custNIdTextField.getText()));
				customer.setCustomerStatus(custStatusDropDown.getSelectedItem().toString());
				try {
					controller.saveCustomer(customer);
					CustomerAddSuccessMessage addSuccessMessage = new CustomerAddSuccessMessage();
					addSuccessMessage.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBackground(new Color(0, 174, 87));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(custLblName, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(custNameTextField, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(custLblNid, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(custLblStatus, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(custStatusDropDown, 0, 208, Short.MAX_VALUE)
								.addComponent(custNIdTextField, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSave))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(custLblName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(custNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(custLblNid, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(custNIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(custLblStatus, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(custStatusDropDown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btnSave)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

