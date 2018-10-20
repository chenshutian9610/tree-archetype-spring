package org.dbunit;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.ext.oracle.OracleDataTypeFactory;
import org.unitils.dbunit.DbUnitModule;
import org.unitils.dbunit.util.DbUnitDatabaseConnection;
/**
 * @author er_dong_chen
 * @date 18-10-19
 *
 * 详见 MySqlDbUnitModule
 * ps：此类未经测试
 */
public class OracleDbUnitModule extends DbUnitModule {
    @Override
    public DbUnitDatabaseConnection getDbUnitDatabaseConnection(final String schemaName) {
        DbUnitDatabaseConnection result = dbUnitDatabaseConnections.get(schemaName);
        if (null != result) {
            return result;
        }
        result = super.getDbUnitDatabaseConnection(schemaName);
        result.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new OracleDataTypeFactory());
        return result;
    }
}
