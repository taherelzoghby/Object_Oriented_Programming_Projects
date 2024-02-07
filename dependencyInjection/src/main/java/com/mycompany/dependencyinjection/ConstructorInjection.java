
package com.mycompany.dependencyinjection;

public class ConstructorInjection {

    private final Payment service;

    ConstructorInjection(Payment payment) {
        this.service = payment;
    }

    public void process() {
        this.service.process();
    }
}
