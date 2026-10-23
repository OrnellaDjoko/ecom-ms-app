package com.ornela.customerservice;

import com.ornela.customerservice.entities.Customer;
import com.ornela.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository repository){
        return args -> {
            repository.save(Customer.builder()
                    .name( "Mohamed")
                    .email( "mohamed@gmail.com").build());

            repository.save(Customer.builder()
                    .name( "Ornela")
                    .email( "ornela@gmail.com").build());

            repository.save(Customer.builder()
                    .name( "Owen")
                    .email( "owen@gmail.com").build());
        };
    }

}
