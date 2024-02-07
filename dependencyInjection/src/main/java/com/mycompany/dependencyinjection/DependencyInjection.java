package com.mycompany.dependencyinjection;

public class DependencyInjection {

    public static void main(String[] args) {
        //constructor injection
        ConstructorInjection constructorInjection = new ConstructorInjection(new Paypal());
        constructorInjection.process();
        ConstructorInjection constructorInjection2 = new ConstructorInjection(new Paymob());
        constructorInjection2.process();
        //method injection
        MethodInjection methodInjection = new MethodInjection();
        methodInjection.setService(new Paypal());
        methodInjection.process();
        MethodInjection methodInjection2 = new MethodInjection();
        methodInjection2.setService(new Paymob());
        methodInjection2.process();
        //property injection
        PropertyInjection propertyInjection = new PropertyInjection();
        propertyInjection.service = new Paypal();
        propertyInjection.process();
        PropertyInjection propertyInjection2 = new PropertyInjection();
        propertyInjection2.service = new Paymob();
        propertyInjection2.process();
    }
}
