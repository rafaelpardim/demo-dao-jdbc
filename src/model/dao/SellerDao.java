package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findByid(Integer id);
	static List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	static List<Seller>findByDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
