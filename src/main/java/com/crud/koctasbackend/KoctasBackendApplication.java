package com.crud.koctasbackend;

import com.crud.koctasbackend.model.Customer;
import com.crud.koctasbackend.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class KoctasBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KoctasBackendApplication.class, args);
	}

/*

	@Autowired
	private ICustomerRepository customerRepository;
*/


	@Override
	public void run(String... args) throws Exception {


		//get requestinde gorebilmek icin burada musteri olusturdum.
		/*Customer customer1 = new Customer();
		customer1.setFirstName("erdem");
		customer1.setLastName("canturk");
		customer1.setPhoneNum("+90 0543 111 22 33");
		customer1.setCustMail("canturkerdem@hotmail.com");
		customer1.setStreet("kozyatagi");

		customerRepository.save(customer1);

		Customer customer2 = new Customer();
		customer2.setFirstName("emre");
		customer2.setLastName("canturk");
		customer2.setPhoneNum("+90 0543 555 66 77");
		customer2.setCustMail("canturkemre@hotmail.com");
		customer2.setStreet("acibadem");

		customerRepository.save(customer2);*/

	}
}
