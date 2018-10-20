package test;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.testng.annotations.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBeanByType;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ControllerTest extends BaseTest {

    @SpringBeanByType private RequestMappingHandlerAdapter handlerAdapter;
    @SpringBeanByType private RestTemplate template;
    private MockHttpServletRequest request=new MockHttpServletRequest();
    private MockHttpServletResponse response=new MockHttpServletResponse();

    @Test
    @DataSet("./xls/initialize.xls")
    public void testUnit(){
    }

    @Test
    public void testIntegration() throws Exception{
        //  example
        MultiValueMap<String,String>map=new LinkedMultiValueMap<String,String>();
        String url="http://127.0.0.1:8080";
        String result=template.postForObject(url,map,String.class);
        assertTrue(result.contains(""));
    }

}
