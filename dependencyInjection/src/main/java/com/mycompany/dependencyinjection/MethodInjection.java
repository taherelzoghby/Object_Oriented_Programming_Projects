package com.mycompany.dependencyinjection;

public class MethodInjection {

    private Payment service;

    public void setService(Payment payment) {
        this.service = payment;
    }

    public void process() {
        this.service.process();
    }
}
