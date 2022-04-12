import edu.gdpu.mybatisdemo.dao.CardMapper;
import edu.gdpu.mybatisdemo.dao.PersonMapper;
import edu.gdpu.mybatisdemo.pojo.Card;
import edu.gdpu.mybatisdemo.pojo.Person;
import edu.gdpu.mybatisdemo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test01(){
        SqlSession session = MybatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        Card card = mapper.queryCardById(1);
        System.out.println(card);
    }
    @Test
    public void test02(){
        SqlSession session = MybatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = mapper.queryPersonWithCards(2);
        System.out.println(person);
    }
    @Test
    public void test03(){
        SqlSession session = MybatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        mapper.addCard(new Card(5,"1005",1));
    }
    @Test
    public void test4(){
        SqlSession session = MybatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        mapper.deleteCard(5);
    }
    @Test
    public void test5(){
        SqlSession session = MybatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = mapper.queryPersonById(2);
        System.out.println(person);
    }
}