/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programpractice3;

/**
 *
 * @author pc
 */
public class ElectronicsProduct {
    int productID;
    String name;
    Double price;
    

    //Constructor
    public ElectronicsProduct(int productID, String name, Double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
    
    
    
    
    public void applyDiscount(Double discountPercentage){
       double discountAmount = price * discountPercentage/100;
       price-= discountAmount;
    }
    
    
    public double finalPrice(){
        return price;
    }
    
 public int getproductID(){
     return productID;
 }
 
 public void setproductID(int productID){
     this.productID = productID;
 }
 
 public String getname(){
     return name;
 }
 
   public Double getprice(){
     return price;
 }
 
 public void setname(String name){
     this.name = name;
 }
 

 
 public void setprice(Double price){
     this.price = price;
 }
 

    
    
}
