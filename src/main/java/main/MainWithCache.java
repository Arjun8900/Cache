package main;

import data.DBDetail;
import manager.CacheManager;

public class MainWithCache {

    public static void main(String[] args) throws Exception {
        String dbName = "user_tables";

//        List<String> allTales = awsdbManager.getTables(dbName);
//        System.out.printf("Size = %s, allTables = %s%n", allTales.size(), allTales);

        // Using cache
//        allTales = awsdbManager.getTables(dbName);
//        System.out.printf("Size = %s, allTables = %s%n", allTales.size(), allTales);
        CacheManager cacheManager = new CacheManager();
        System.out.println(cacheManager.generateOrgMonitoringResponse(new DBDetail(1, dbName)));

        // Using cachel
        System.out.println(cacheManager.generateOrgMonitoringResponse(new DBDetail(2, dbName)));
        System.out.println(cacheManager.generateOrgMonitoringResponse(new DBDetail(3, dbName)));
        System.out.println(cacheManager.generateOrgMonitoringResponse(new DBDetail(4, dbName)));
//        oracleDBManager.print("pam12cr2", "ORDERS");
    }


}
