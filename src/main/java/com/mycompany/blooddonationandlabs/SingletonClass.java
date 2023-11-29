/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blooddonationandlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author prern
 */
class SingletonClass {
    Connection connection = null;
    private static SingletonClass singletonclass = null;
    
    
    private SingletonClass() {
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
        if (connection != null){
           String registerTable = "CREATE TABLE IF NOT EXISTS registerUser(id INT AUTO_INCREMENT, FullName VARCHAR(255), PhoneNo VARCHAR(255), Address VARCHAR(255),  Email VARCHAR(255), Password VARCHAR(255), PRIMARY KEY(id))";
           PreparedStatement psRegister = connection.prepareStatement(registerTable);
           psRegister.execute();
            
            String donorTable = "CREATE TABLE IF NOT EXISTS donorTable(id INT AUTO_INCREMENT, Name VARCHAR(255), PhoneNumber VARCHAR(255), Address VARCHAR(255),gender VARCHAR(255),bloodGroup VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement pdDonor = connection.prepareStatement(donorTable);
            pdDonor.execute();
            
            String donorActivityTable = "CREATE TABLE IF NOT EXISTS donorActivityTable(id INT AUTO_INCREMENT,DateOfDonation VARCHAR(255), PlaceOfDonation VARCHAR(255),Temperature VARCHAR(255), Height VARCHAR(255), Weight VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement psDonorActivity = connection.prepareStatement(donorActivityTable);
            psDonorActivity.execute();
            
            String labTest = "CREATE TABLE IF NOT EXISTS labTest(id INT AUTO_INCREMENT,  Name VARCHAR(255), Description VARCHAR(255), Price VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement psLabTest = connection.prepareStatement(labTest);
            psLabTest.execute();
            
            
             
        }
        
        }catch(SQLException sqlException){
                System.out.println("in exception12" + sqlException.getMessage());}
        
    }
    
    public static SingletonClass getInstance() {
                    if(singletonclass == null){
                        singletonclass = new SingletonClass();
                    }
        return singletonclass;}
    
}


