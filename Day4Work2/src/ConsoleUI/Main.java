package ConsoleUI;

import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckService() {
			
			@Override
			public boolean CheckIfRealPerson(Customer customer) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		customerManager.save(new Customer(1,"Ali","Konar","12345678910",new GregorianCalendar(1999,12,9).getTime()));
		
	}

}
