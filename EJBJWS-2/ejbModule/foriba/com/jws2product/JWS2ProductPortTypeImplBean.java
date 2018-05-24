package foriba.com.jws2product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.foriba.jws2.jpa.entity.Product;
import com.foriba.jws2.dao.all.AllService;



@WebService(portName = "JWS2ProductPort", serviceName = "JWS2ProductService", endpointInterface = "foriba.com.jws2product.JWS2ProductPortType", targetNamespace = "http://com.foriba/JWS2Product", wsdlLocation = "META-INF/wsdl/foriba/com/jws2product/JWS2ProductPortTypeImplBean/JWS2ProductPortTypeImplBean.wsdl")
@Stateless
public class JWS2ProductPortTypeImplBean implements JWS2ProductPortType {

	@EJB
	private AllService productService;
	Product product = new Product();
	
	@Override
	public foriba.com.jws2product.GetProductListResponse getProductList(
			foriba.com.jws2product.GetProductListRequest parameter)
			throws Exception {
		GetProductListResponse response = new GetProductListResponse();
		List<Product> product = productService.getProductList();
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdName(prod.getProdName());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}
		}
		return response;
	}

	public foriba.com.jws2product.AddProductResponse addProduct(
			foriba.com.jws2product.AddProductRequest parameter) throws Exception {
		AddProductResponse response = new AddProductResponse();
		Product prod = new Product();
		return null;
	}

	@Override
	public foriba.com.jws2product.UpdateProductNameResponse updateProductName(
			foriba.com.jws2product.UpdateProductNameRequest parameter) {
		UpdateProductNameResponse response = new UpdateProductNameResponse();
		List<Product> product = productService.updateProductName(parameter.getProdName(), parameter.getID());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdName(prod.getProdName());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
				
			}
		}
		return response;
	}

	@Override
	public foriba.com.jws2product.GetProductByProdNameResponse getProductByProdName(
			foriba.com.jws2product.GetProductByProdNameRequest parameter) {
		GetProductByProdNameResponse response = new GetProductByProdNameResponse();
		List<Product> product = productService.getProductByProdName(parameter
				.getProdName());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setProdName(prod.getProdName());
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}

		}
		return response;
	}

	@Override
	public foriba.com.jws2product.GetProductListByMultipleProdDateResponse getProductListByMultipleProdDate(
			foriba.com.jws2product.GetProductListByMultipleProdDateRequest parameter)
			throws Exception {
		GetProductListByMultipleProdDateResponse response = new GetProductListByMultipleProdDateResponse();
		List<Product> product = productService
				.getProductListByMultipleProdDate(parameter.getStartDate(),
						parameter.getEndDate());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setProdName(prod.getProdName());
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}
		}

		return response;
	}

	@Override
	public foriba.com.jws2product.GetProductListByProdDateResponse getProductListByProdDate(
			foriba.com.jws2product.GetProductListByProdDateRequest parameter) {
		GetProductListByProdDateResponse response = new GetProductListByProdDateResponse();
		List<Product> product = productService
				.getProductListByProdDate(parameter.getDate());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setProdName(prod.getProdName());
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}
		}

		return response;

	}

	@Override
	public foriba.com.jws2product.GetProductListByProdNameResponse getProductListByProdName(
			foriba.com.jws2product.GetProductListByProdNameRequest parameter) {
		GetProductListByProdNameResponse response = new GetProductListByProdNameResponse();
		List<Product> product = productService
				.getProductListByProdName(parameter.getName());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setProdName(prod.getProdName());
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}
		}

		return response;
	}

	@Override
	public foriba.com.jws2product.RemoveProductResponse removeProduct(
			foriba.com.jws2product.RemoveProductRequest parameter) {
		 List<Product> product = productService.removeProduct(parameter.getID()); 
		 if (product != null && !product.isEmpty()) {	
			 String message = "Kayıt başarıyla silindi";
			 String str[] = message.split(" ");
			 List deger = new ArrayList();
			 deger = Arrays.asList(str);
			 return (RemoveProductResponse) deger;
		 }
			
		 return null;
			
	}

	@Override
	public foriba.com.jws2product.GetProductByIDResponse getProductByID(
			foriba.com.jws2product.GetProductByIDRequest parameter) {

		GetProductByIDResponse response = new GetProductByIDResponse();
		List<Product> product = productService
				.getProductByID(parameter.getID());
		if (product != null && !product.isEmpty()) {
			for (Product prod : product) {
				JWS2ProductList type = new JWS2ProductList();
				type.setProdName(prod.getProdName());
				type.setID(prod.getIdx());
				type.setProdConsDate(prod.getProdConsdate());
				type.setProdDate(prod.getProdProddate());
				type.setProdDesc(prod.getProdDesc());
				type.setProdPicture(prod.getProdPicture());
				response.getResult().add(type);
			}
		}
		return response;
	}
}