package foriba.com.jws2product;

import java.sql.Date;

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
	JWS2ProductList jws2 = new JWS2ProductList();
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
			foriba.com.jws2product.AddProductRequest parameter)
			throws Exception {
		AddProductResponse response = new AddProductResponse();
		product.setProdName(parameter.getProdName());
		product.setProdConsdate(parameter.getConsDate());
		product.setProdDesc(parameter.getProdDesc());
		product.setProdPicture(parameter.getProdPicture());
		product.setProdProddate(parameter.getProdDate());
		productService.addProductt(product);
		response.result = "Kayıt başarılı bir şekilde eklendi";
		return response;

	}

	@Override
	public foriba.com.jws2product.UpdateProductNameResponse updateProductName(
			foriba.com.jws2product.UpdateProductNameRequest parameter) {
		UpdateProductNameResponse response = new UpdateProductNameResponse();
		int Product = productService.updateProductName(parameter.getProdName(),
				parameter.getID());
		if (Product == 1) {
			response.result = "Kayıt güncellendi";
		} else {
			response.result = "Kayıt güncelleme başarısız";
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
				.getProductListByProdDate((Date) parameter.getDate());
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
		RemoveProductResponse response = new RemoveProductResponse();
		String product = productService.removeProduct(parameter.getID());
		response.result = "Silindi";
		return response;
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