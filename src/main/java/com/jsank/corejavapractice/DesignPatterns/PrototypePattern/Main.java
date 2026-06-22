package com.jsank.corejavapractice.DesignPatterns.PrototypePattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("prototype pattern");

        NetworkConnection originalConnection = new NetworkConnection();
        originalConnection.setIpAddress("192.168.9.0");
        originalConnection.loadVeryImportantData();

        System.out.println("Original Connection: " + originalConnection);


        // Cloning the original connection
        try{
            NetworkConnection clonedConnection = (NetworkConnection) originalConnection.clone();
            NetworkConnection clonedConnection2 = (NetworkConnection) originalConnection.clone();

            System.out.println("Cloned Connection 1: " + clonedConnection);
            System.out.println("Cloned Connection 2: " + clonedConnection2);

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
