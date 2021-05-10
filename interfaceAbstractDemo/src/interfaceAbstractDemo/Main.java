package interfaceAbstractDemo;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		 customerManager.save(new Customer(1, "Büþra", "Öztürk", "25838256290", LocalDate.of(1995, 11, 24)) );
		
		};
		
	
		

	}


