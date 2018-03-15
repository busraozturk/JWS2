package com.foriba.jws2.bean.all;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.foriba.jws2.dao.all.AllService;
import com.foriba.jws2.jpa.entity.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AllServiceBean implements AllService  {

	@PersistenceContext(unitName = "JPAJWS-2")
	public EntityManager em;

	@Override
	public String add(Product product) {
	em.persist(product);
			
			return "Kayıt başarılı bir şekilde eklendi";
	}

	@Override
	public List<Product> getAllLesson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getTranier(String tranier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long remove(long id) {
		// TODO Auto-generated method stub
		return 0;
	}
}

