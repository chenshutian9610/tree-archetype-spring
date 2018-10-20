package org.dbunit;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.ext.mysql.MySqlMetadataHandler;
import org.unitils.dbunit.DbUnitModule;
import org.unitils.dbunit.util.DbUnitDatabaseConnection;
/**
 * @author er_dong_chen
 * @date 18-10-19
 *
 * DbUnitModule 相当于一个抽象类，不能直接使用
 * 需要根据具体的数据源类型修改特定的配置（在 jar 包中可以找到）
 */
public class MySqlDbUnitModule extends DbUnitModule {
    @Override
    public DbUnitDatabaseConnection getDbUnitDatabaseConnection(final String schemaName) {
        DbUnitDatabaseConnection result = dbUnitDatabaseConnections.get(schemaName);
        if (null != result) {
            return result;
        }
        result = super.getDbUnitDatabaseConnection(schemaName);
        /*
         *  原来的方法在重新创建一个数据源的时候没有设置以下两个配置
         *  如果将以下两行代码删除，其实就相当于原方法，将报错
         */
        result.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new MySqlDataTypeFactory());
        result.getConfig().setProperty( DatabaseConfig.PROPERTY_METADATA_HANDLER, new MySqlMetadataHandler());
        return result;
    }
}