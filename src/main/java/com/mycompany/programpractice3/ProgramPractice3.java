/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programpractice3;

/**
 *
 * @author pc
 */
public class ProgramPractice3 {

    public static void main(String[] args) {

       ElectronicsProduct product1 = new ElectronicsProduct(12595, "LG", 3400.00);
       product1.applyDiscount(10.00);
       System.out.println("ProductID: " + product1.getproductID());
       System.out.println("Product name: " + product1.getname());
       System.out.println("Product price after discount: " + product1.finalPrice());
       
       
        System.out.println("*********************************************");
       
       WashingMachine product2 = new WashingMachine(12544, "Samsung", 3900.00, 12);
       product2.applyDiscount(8.00);
       System.out.println("ProductID: " + product2.getproductID());
       System.out.println("Product name: " + product2.getname());
       System.out.println("Product price after discount: " + product2.finalPrice());
       System.out.println("The warranty period is " + product2.getwarranty());
       
        System.out.println("************************************************");
       
       WashingMachine product3 = new WashingMachine(12599, "Bosh", 4400.00, 24);
       product3.applyDiscount(30.00);
        System.out.println("ProductID: " + product3.getproductID());
        System.out.println("Product name: " + product3.getname());
        System.out.println("Product price after discount: " + product3.finalPrice());
        System.out.println("The warranty period is " + product3.getwarranty());
       
       
       
      
       
       
       
        
        
    }
}
