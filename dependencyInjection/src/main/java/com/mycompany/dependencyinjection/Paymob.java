
package com.mycompany.dependencyinjection;
public class Paymob implements Payment {

    @Override
    public void process() {
        System.out.println("Paymob......");
    }
    
}
