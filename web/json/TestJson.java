package cn.java.jquery.json;

import cn.java.jquery.domain.person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class TestJson {
    @Test
    public void test1() throws JsonProcessingException {
        person person = new person();
        person.setName("张三");
        person.setAge(21);
        person.setGender("男");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
}
