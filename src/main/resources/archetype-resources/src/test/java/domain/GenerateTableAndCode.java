package domain;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author er_dong_chen
 * @date 18-10-19
 *
 * 使用 hibernate 的正向工程将 domain（当前包）中的 POJO 变成表
 * 然后使用 mybatis 的逆向工程生成接下来需要的代码
 * ps：使用之前清检查好连接的数据库名和将生成的表名，谨防丢失数据
 */
public class GenerateTableAndCode {
    public static void main(String args[]) throws Exception{
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-test.xml");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        Resource configFile = new ClassPathResource("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile.getFile());
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}