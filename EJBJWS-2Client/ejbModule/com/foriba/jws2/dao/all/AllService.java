package com.foriba.jws2.dao.all;

import java.sql.Date;

import java.util.List;
import javax.ejb.Local;
import javax.xml.datatype.XMLGregorianCalendar;

import com.foriba.jws2.jpa.entity.Product;

@Local
public interface AllService {

	public String addProductt(Product product) throws Exception;

	public String addProduct(long id, String prodName, String consDate,
			java.util.Date prodDate, String prodPicture, String prodDesc,
			Date sysLastUpdate, long sysVersion) throws Exception;

	public List<Product> getProductList() throws Exception;

	public List<Product> updateProductName(String name, long l);

	public List<Product> removeProduct(long id);

	public List<Product> getProductByID(String id);

	public List<Product> getProductByProdName(String name);

	public List<Product> getProductListByProdName(String name);

	public List<Product> getProductListByProdDate(XMLGregorianCalendar date);

	public List<Product> getProductListByMultipleProdDate(XMLGregorianCalendar startDate,
			XMLGregorianCalendar endDate) throws Exception;

}
