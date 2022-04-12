import edu.gdpu.mybatisdemo.dao.OrderMapper;
import edu.gdpu.mybatisdemo.dao.ProductMapper;
import edu.gdpu.mybatisdemo.pojo.Order;
import edu.gdpu.mybatisdemo.pojo.Product;
import edu.gdpu.mybatisdemo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class MyTest {
    @Test
    public void test01(){
        SqlSession session = MybatisUtil.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderWithProducts(1);
        System.out.println(order);
    }

    @Test
    public void test02(){
        SqlSession session = MybatisUtil.getSession();
        ProductMapper mapper = session.getMapper(ProductMapper.class);
        Product product = mapper.queryProductWithOrders(1);
        System.out.println(product);
    }
}
