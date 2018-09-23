package test;

import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;
import org.unitils.UnitilsTestNG;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;
import org.unitils.spring.annotation.SpringBeanByType;

@SpringApplicationContext("beans.xml")
public class BaseTest extends UnitilsTestNG {
    @SpringApplicationContext public ApplicationContext context;
    /*
        // mockito
        Object object=mock(Object.class);
        when(object.equals("object")).thenReturn(true);
        verify(object,times(1)).equals("object");

        // ReflectionTestUtils 可以向某一个类注入私有属性
        ReflectionTestUtils.setField(object,fieldName,value);

        // XlsDataSetBeanFactory 可以从 xls 文件对应的 sheet 中读取数据,然后包装成 bean
        List<returnType>beans= XlsDataSetBeanFactory.createBeans(this.getClass(),xlsFileName,xlsSheetName,returnType);
    */
}