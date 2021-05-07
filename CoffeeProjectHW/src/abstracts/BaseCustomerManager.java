package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Save to db  : " + customer.getFirstName());
	}

}
