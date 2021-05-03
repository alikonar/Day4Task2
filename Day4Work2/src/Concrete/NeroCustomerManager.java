package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {

			System.out.println("Saved to db : " + customer.getFirstName());
		} else
			System.out.println("Not a valid person");
	}

}
