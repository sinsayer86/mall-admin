package cafe.jjdev.mall.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cafe.jjdev.mall.admin.mapper.ProductCommonMapper;
import cafe.jjdev.mall.admin.vo.Product;
import cafe.jjdev.mall.admin.vo.ProductCommon;

@Service
@Transactional
public class ProductCommonService {
	@Autowired ProductCommonMapper productCommonMapper;
	
	public Map<String, Object> getProductOne(Map<String, Object> map){
		return map;
	}
	
	public List<ProductCommon> getProductCommonName(int productCommonNo) {
		return productCommonMapper.selectProductCommonName(productCommonNo);
	}
	
	public int addProductCommon(ProductCommon productCommon, Product product) {
		int productCommonNo = productCommonMapper.insertProductCommon(productCommon);
		product.setProductCommenNo(productCommonNo);
		return productCommonMapper.insertProduct(product);
	}
}
