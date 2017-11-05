package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataRunner implements CommandLineRunner {

	private PersonRepository personRepository;
	
	@Autowired
	public InitDataRunner(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Person billGates = new Person();
		billGates.setFirstName("Bill");
		billGates.setLastName("Gates");
		
		Person michaelJordan = new Person();
		michaelJordan.setFirstName("Michael");
		michaelJordan.setLastName("Jordan");
		
		Person satoshiNakamoto = new Person();
		satoshiNakamoto.setFirstName("Satoshi");
		satoshiNakamoto.setLastName("Nakamoto");
		
		personRepository.save(billGates);
		personRepository.save(michaelJordan);
		personRepository.save(satoshiNakamoto);
	}

}
