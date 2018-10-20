package test;

import org.testng.annotations.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.dbunit.dataset.util.XlsDataSetBeanFactory;

public class DaoTest extends BaseTest {

    @Test
    @DataSet("./xls/initialize.xls")
    public void initTables(){
    }

    @Test
    @ExpectedDataSet("./xls/expected.xls")
    public void saveCustomers() throws Exception{
    }

}