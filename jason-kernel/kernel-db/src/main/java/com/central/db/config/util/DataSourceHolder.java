package com.central.db.config.util;


/**
 * 用于数据源切换
 *
 */
public class DataSourceHolder {

    private static final ThreadLocal<DataSourceKey> dataSourceKey = new ThreadLocal<>();

    public static DataSourceKey getDataSourceKey() {
        return dataSourceKey.get();
    }

    public static void setDataSourceKey(DataSourceKey type) {
        dataSourceKey.set(type);
    }

    public static void clearDataSourceKey() {
        dataSourceKey.remove();
    }


}