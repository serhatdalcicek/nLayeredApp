package nLayeredApp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredApp.entities.concretes.IndividualCustomer;

public class IndividualCustomerDao {
	List<IndividualCustomer> customers;
	
	public IndividualCustomerDao() {
		customers = new ArrayList<IndividualCustomer>();
	}
 public void add(IndividualCustomer customer) {
	 customers.add(customer);
 }
 public void delete(IndividualCustomer customer) {
	 customers.remove(customer);
 }
 public void update(IndividualCustomer customer) {
	 
 }
 public List<IndividualCustomer> getAll(){
	 return customers;
 }
}
