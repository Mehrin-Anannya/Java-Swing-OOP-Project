package iit.oop.project.sao;

import java.io.IOException;

import iit.oop.project.model.Customer;

public interface CustomerService {
	public void getCustomer(Customer customer);
	public void saveCustomer(Customer customer) throws IOException;
}
