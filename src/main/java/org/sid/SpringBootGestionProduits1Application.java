package org.sid;

import org.sid.dao.*;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
public class SpringBootGestionProduits1Application implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGestionProduits1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*productDao.save(new Produit("PC", 1500, true));
		productDao.save(new Produit("TEL", 1700, true));
		productDao.save(new Produit("TV", 1800, true));
		productDao.save(new Produit("MACHINE", 5, true));*/
	}

}
