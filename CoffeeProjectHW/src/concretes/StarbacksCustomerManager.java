package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbacksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService _customerCheckService;
	
	public public StarbacksCustomerManager (CustomerCheckService customerCheckService()) 
	{
		this._customerCheckService = customerCheckService();
	}
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
		CheckIfRealPerson(customer);
		
		System.out.println("Save to db  : " + customer.getFirstName());
		}

	private void CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
