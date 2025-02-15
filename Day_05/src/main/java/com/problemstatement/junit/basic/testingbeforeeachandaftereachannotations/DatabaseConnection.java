package com.problemstatement.junit.basic.testingbeforeeachandaftereachannotations;

public class DatabaseConnection {
    private boolean isConnected;

    public void connect(){
        isConnected= true;
        System.out.println("Database is connected");
    }
    public void disconnect(){
        isConnected= false;
        System.out.println("Database is disconnected");
    }
    public boolean isConnected(){
        return isConnected ;
    }
}
