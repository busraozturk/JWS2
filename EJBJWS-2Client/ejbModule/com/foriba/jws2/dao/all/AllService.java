package com.foriba.jws2.dao.all;
import java.util.List;


import javax.ejb.Local;

import com.foriba.jws2.jpa.entity.Product;

@Local
public interface AllService {
	
	public String add(Product product) throws Exception;
	public long remove(long id);
	public List<Product> getAllLesson();
	public List<Product> getId(int id);
	public List<Product> getName(String name);
	public List<Product> getTranier(String tranier);
	
}
