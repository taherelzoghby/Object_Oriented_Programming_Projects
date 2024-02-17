package com.mycompany.inventory_management_system_ooad;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Instrument> instruments;

    // default constructor
    public Inventory() {
        this.instruments = new ArrayList<>();
    }

    // parameterize constructor
    public Inventory(List guitars) {
        this.instruments = new ArrayList<>();
        instruments.addAll(guitars);
    }

    // add guitar to inventory
    public void addInstrument(String serialNumber, double price, InstrumentSpec gs) {
        Instrument instru = new Instrument(serialNumber, price, gs);
        instruments.add(instru);
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    
    // get Instrument
    Instrument getInstrument(String serial) {
        for (int i = 0; i < instruments.size(); i++) {
            Instrument inst = (Instrument) instruments.get(i);
            if (inst.getSerialNumber().equals(serial)) {
                return inst;
            }
        }
        return null;
    }

    // search Instrument
    List<Instrument> searchInstrument(InstrumentSpec g) {
        List<Instrument> lists = new ArrayList();
        for (int i = 0; i < instruments.size(); i++) {
            Instrument instru = (Instrument) instruments.get(i);
            InstrumentSpec gs = instru.getSpec();
            if (g.matches(gs)) {
                lists.add(instru);
            }
        }
        return lists;
    }

}
