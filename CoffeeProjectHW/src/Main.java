import abstracts.BaseCustomerManager;
import concretes.NeroCustomerManager;
import concretes.StarbacksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Erol","Türkkan",2002-12-16,"30496619592"));
		
		
	}

}
