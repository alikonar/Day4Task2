package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	
	public void save(Customer customer) {
		System.out.println("Save to db: " + customer.getFirstName());
		
	}

}
