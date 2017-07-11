package com.demo.spring;

/**
 * Created by hackerfreak on 9/7/17.
 */
public class Database {
    String port;

    public Database(String port, String name) {
        this.port = port;
        this.name = name;
    }

    @Override

    public String toString() {
        return "Database{" +
                "port='" + port + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    String name;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
