package nLayeredApp.api;

import nLayeredApp.business.concretes.IndividualCustomerManager;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer customer1 = new IndividualCustomer(1,"12345","Serhat","Dalcicek","123456789");
        IndividualCustomer customer2 = new IndividualCustomer(2,"12335","Engin","Demiroğ","1234567811");
        IndividualCustomer customer3 = new IndividualCustomer(3,"12335","Engin","Demiroğ","1234567811");


        IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager();
        individualCustomerManager.add(customer1);
        individualCustomerManager.add(customer2);
        individualCustomerManager.add(customer3);


        for (IndividualCustomer customer: individualCustomerManager.getAll()) {
            System.out.println(customer.getFirstName()+ customer.getId());
        }

    }
}