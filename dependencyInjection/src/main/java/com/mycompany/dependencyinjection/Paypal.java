
package com.mycompany.dependencyinjection;
public class Paypal implements Payment{

    @Override
    public void process() {
        System.out.println("Paypal.......");
    }
    
}
