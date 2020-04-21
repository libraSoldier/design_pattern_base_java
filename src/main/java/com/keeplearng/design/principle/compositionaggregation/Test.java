package com.keeplearng.design.principle.compositionaggregation;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
