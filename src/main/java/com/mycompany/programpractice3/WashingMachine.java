/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programpractice3;

/**
 *
 * @author pc
 */
public class WashingMachine extends ElectronicsProduct{
    
private int warranty;

    public WashingMachine(int productID, String name, Double price, int warranty) {
        super(productID, name, price);
        this.warranty = warranty;
    }
    
   
    
    
    public int getwarranty(){
        return warranty;
    }
    
    public void setwarranty(int warranty){
        this.warranty = warranty;
    }
    
    public void extendWarranty(int additionalMonths){
        warranty+=additionalMonths;
    }
    
@Override
      public void applyDiscount(Double discountPercentage){
      super.applyDiscount(discountPercentage);
        
    }
    
    
    
    
    
    
    
    

    
    
}
