package test;

import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.spring.annotation.SpringBeanByType;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

public class ServiceTest extends BaseTest{

    @Test
    public void testUnit(){
    }

    @Test
    @DataSet("initialize.xls")
    public void testIntegration(){
    }

}