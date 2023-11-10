package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ProductRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitServiceRest {
	
	@Autowired
	private ProductRepository produitRepository;
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public List<Produit> getAllProducts(){
		return produitRepository.findAll();
	}
	
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public Optional<Produit> getProduct(@PathVariable String id){
		return produitRepository.findById(id);
	}
	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public boolean addProduct(@RequestBody Produit prd){
		produitRepository.save(prd);
		return true;
	}
	
	@RequestMapping(value="/deleteProduct/{idToDelete}", method=RequestMethod.GET)
	public boolean deleteProduct(@PathVariable String idToDelete){
		produitRepository.deleteById(idToDelete);
		return true;
	}
}
