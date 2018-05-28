package com.foriba.jws2.bean.all;

import java.sql.Date;

import java.util.*;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.foriba.jws2.base.entity.*;
import com.foriba.jws2.bean.ESGenericBean;
import com.foriba.jws2.dao.all.AllService;
import com.foriba.jws2.jpa.entity.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AllServiceBean extends ESGenericBean<BaseEntity> implements
		AllService {

	private static final long serialVersionUID = 1L;
	Product prod = new Product();

	@PersistenceContext(unitName = "JPAJWS-2")
	public EntityManager em;

	public String addProductt(Product product) throws Exception {
		persist(product);
		return "Kayıt başarılı bir şekilde eklendi.";
	}

	@Override
	public String addProduct(long id, String prodName, String consDate,
			java.util.Date prodDate, String prodPicture, String prodDesc,
			Date sysLastUpdate, long sysVersion) throws Exception {
		// java.util.Date cDate = new SimpleDateFormat("dd/MM/yyyy")
		// .parse(consDate);
		// java.sql.Timestamp ts = new java.sql.Timestamp(cDate.getTime());
		byte[] byteData = prodPicture.getBytes("UTF-8");
		// Blob blob = new javax.sql.rowset.serial.SerialBlob(byteData);
		// prod.setIdx(id);
		prod.setProdName(prodName);
		prod.setProdConsdate(consDate);
		prod.setProdProddate(prodDate);
		prod.setProdPicture(byteData);
		prod.setProdDesc(prodDesc);
		// prod.setSysLastUpdate(sysLastUpdate);
		// prod.setSysVersion(sysVersion);
		persist(prod);
		return "Kayıt başarılı bir şekilde eklendi.";

	}

	/**
	 * The method for list all products
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductList() throws Exception {

		return em.createNamedQuery("Product.getProductList").getResultList();
	}

	@Override
	public int updateProductName(String name, long id) {

		em.createNamedQuery("Product.updateProduct").getResultList();
		return 1;

	}

	
	public String removeProduct(long id) {

		em.createNamedQuery("Product.removeProduct").getResultList();
		return "Kayıt silindi";

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByID(long id) {

		return em.createNamedQuery("Product.getProductByID").setParameter("id",
				id).getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByProdName(String name) {

		return em.createNamedQuery("Product.getProductByProdName")
				.setParameter("prodName", name).getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductListByProdName(String name) {
		return em.createNamedQuery("Product.getProductListByProdName")
				.setParameter("prodName", "%" + name + "%").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductListByProdDate(Date date) {
		return em.createNamedQuery("Product.getProductListByProdDate")
				.setParameter("prodProddate", date).getResultList();
	}

	@Override
	public List<Product> getProductListByMultipleProdDate(
			java.util.Date startDate, java.util.Date endDate) throws Exception {
		return findByNamedQuery(Product.class,
				"Product.findByMultipleProdDate", 5, startDate, endDate);

	}

}
