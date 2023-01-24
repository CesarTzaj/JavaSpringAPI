package com.Maket.Market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.platzi.market.persistence.mapper.ProductMapper"})
public class MarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}
