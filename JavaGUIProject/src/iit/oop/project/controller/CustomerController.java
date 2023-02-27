package iit.oop.project.controller;

import java.io.IOException;

import iit.oop.project.model.Customer;
import iit.oop.project.sao.CustomerServiceImpl;

public class CustomerController {
	CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

	public void getCustomer(Customer customer) {
		customerServiceImpl.getCustomer(customer);
	}
	
	public void saveCustomer(Customer customer) throws IOException {
		customerServiceImpl.saveCustomer(customer);
	}
}
