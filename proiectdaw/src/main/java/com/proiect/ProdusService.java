package com.proiect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ProdusService {
	@Autowired
	private ProdusRepository repo;
	public List<Produs> listAll(){
		return repo.findAll();
	}
	
	public void save(Produs produs) {
		repo.save(produs);
	}
	
	public Produs get(Long Id) {
		return repo.findById(Id).get();
	}
	public void delete(Long Id) {
		repo.deleteById(Id);
	}
	
}
