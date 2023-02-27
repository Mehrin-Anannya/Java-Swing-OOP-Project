package iit.oop.project.model;

public class Customer {
	private Integer customerId;
	private String customerName;
	private Integer nid;
	private String customerStatus;
	
	public Customer(Integer customerId, String customerName, Integer nid, String customerStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.nid = nid;
		this.customerStatus = customerStatus;
	}
	
	public Customer() {
		
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	
	
	

}
