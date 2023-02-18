package com.tp3.billingservice;

import com.tp3.billingservice.entities.Bill;
import com.tp3.billingservice.entities.ProductItem;
import com.tp3.billingservice.feign.CustomerServiceClient;
import com.tp3.billingservice.feign.InventoryServiceClient;
import com.tp3.billingservice.model.Customer;
import com.tp3.billingservice.model.Product;
import com.tp3.billingservice.repositories.BillRepository;
import com.tp3.billingservice.repositories.ProductItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.hateoas.PagedModel;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

@SpringBootApplication
@EnableFeignClients @Slf4j
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Autowired
	BillRepository billRepository;
	@Autowired
	ProductItemRepository productItemRepository;
	@Bean
	public Consumer<Bill> billConsumer()
	{
		log.info("hello");
		return  (bill)->{
			Bill newBill=new Bill(bill.getId(),bill.getBillingDate(),null,bill.getCustomerID(),bill.getCustomer());
			billRepository.save(newBill);
			log.info("**********************************");
			for (ProductItem productItem:bill.getProductItems())
			{
				ProductItem newProductItem=new ProductItem(productItem.getId(),productItem.getProductID(),productItem.getQuantity(),productItem.getPrice(),newBill,productItem.getProduct());
				productItemRepository.save(newProductItem);
			}
		};
	}

}
