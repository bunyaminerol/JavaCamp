package Business;

import Properties.Person;
import Properties.PhoneNumber;

public class PersonManager {
	

	private void addPhoneNumber(PhoneNumber number) {
		
		
	}
	
	public void addPersonPhoneNumber(Person person, PhoneNumber number) {
		addPhoneNumber(number);
		System.out.println(person.firstName + " kiþinin numarasý "+ number.phoneNumber + " olarak eklenmiþtir." );
		
	}
}
