/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blooddonationandlabs;

/**
 *
 * @author vbbvi
 */
public class TestModel {
    int id;
    String name;
    String price;
    String email;
    String password;
   /* public TestModel(String email, String password) {
        this.id = id;
        this.name = name;
        this.price =price;
        
    }*/
    public TestModel(){
        
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public TestModel(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price =price;
        
    }

    public TestModel(String name, String price) {
        this.name = name;
        this.price = price;
    }

  
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
  
    

    
}
