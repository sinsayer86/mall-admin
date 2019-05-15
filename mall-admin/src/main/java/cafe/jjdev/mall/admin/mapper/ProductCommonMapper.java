package cafe.jjdev.mall.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import cafe.jjdev.mall.admin.vo.Product;
import cafe.jjdev.mall.admin.vo.ProductCommon;

@Mapper
public interface ProductCommonMapper {
	public List<ProductCommon> selectProductCommonName(int productCommonNo);
	public List<ProductCommon> selectProductCommonList(Map<String, Object> map);
	public int insertProductCommon(ProductCommon productCommon);
	public int insertProduct(Product product);
}
