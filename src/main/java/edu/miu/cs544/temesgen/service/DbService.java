package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: XmlConfigFilesWithEnvProfile
 * @Author: Temesgen D.
 * @Date: 3/4/22
 */

public class DbService {
    private String dbUrl;

    public DbService() {
    }

    public void connect() {
        System.out.println("Database connection: " + dbUrl);
    }

    public DbService(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String toString() {
        return "DbService{" +
                "dbUrl='" + dbUrl + '\'' +
                '}';
    }
}
