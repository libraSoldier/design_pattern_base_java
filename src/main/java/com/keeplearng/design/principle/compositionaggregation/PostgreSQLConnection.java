package com.keeplearng.design.principle.compositionaggregation;

/**
 * Created by liangyu
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
