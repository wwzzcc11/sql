import edu.gdpu.mybatisdemo.dao.UserMapper;
import edu.gdpu.mybatisdemo.pojo.User;
import edu.gdpu.mybatisdemo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test01() {
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
//        user.setId(1);
        user.setName("wu");
        user.setJob("teacher");
//        user.setSalary(100000);
        List<User> users = mapper.queryUsersByCondition(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }
    @Test
    public void test02(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("hyb");
        user.setSalary(100);
        mapper.updateUser(user);
    }
    @Test
    public void test03(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Integer> ids =new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(5);
        List<User> users = mapper.queryUsersByIds(ids);
        for (User user : users) {
            System.out.println(user);

        }
    }
}
