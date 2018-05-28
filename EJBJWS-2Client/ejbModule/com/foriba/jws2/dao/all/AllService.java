package com.foriba.jws2.dao.all;

import java.sql.Date;

import java.util.List;
import javax.ejb.Local;

import com.foriba.jws2.jpa.entity.Product;

@Local
public interface AllService {

	public String addProductt(Product product) throws Exception;

	public String addProduct(long id, String prodName, String consDate,
			java.util.Date prodDate, String prodPicture, String prodDesc,
			Date sysLastUpdate, long sysVersion) throws Exception;

	public List<Product> getProductList() throws Exception;

	public int updateProductName(String name, long l);

	public String removeProduct(long id);

	public List<Product> getProductByID(long id);

	public List<Product> getProductByProdName(String name);

	public List<Product> getProductListByProdName(String name);

	public List<Product> getProductListByProdDate(Date date);

	public List<Product> getProductListByMultipleProdDate(java.util.Date date,
			java.util.Date date2) throws Exception;

}
