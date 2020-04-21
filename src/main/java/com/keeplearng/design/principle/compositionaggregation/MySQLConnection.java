package com.keeplearng.design.principle.compositionaggregation;

/**
 * Created by liangyu
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
