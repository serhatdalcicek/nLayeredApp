package nLayeredApp.business.concretes;

import java.util.List;

import nLayeredApp.dataAccess.concretes.IndividualCustomerDao;
import nLayeredApp.entities.concretes.IndividualCustomer;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class IndividualCustomerManager {
	IndividualCustomerDao individualCustomerDao = new IndividualCustomerDao();

public void add(IndividualCustomer customer) {
	individualCustomerDao.add(customer);
}
public List<IndividualCustomer> getAll(){
	return individualCustomerDao.getAll();
}
}
