package com.example;

import com.example.model.Product;
import com.example.repositories.ProductRepository;
import net.datafaker.Faker;
import net.datafaker.providers.food.Coffee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	ProductRepository repository;

	public Demo3Application(ProductRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Faker faker=new Faker();
		Coffee coffee=faker.coffee();
		for (int i = 0; i <20 ; i++) {
			Product product=new Product(coffee.name2(),coffee.descriptor());
			repository.save(product);
		}
	}
}
