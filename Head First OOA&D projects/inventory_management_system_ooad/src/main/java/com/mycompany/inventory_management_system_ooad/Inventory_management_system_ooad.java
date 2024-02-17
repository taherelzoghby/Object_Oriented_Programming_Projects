package com.mycompany.inventory_management_system_ooad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Inventory_management_system_ooad {

    public static void main(String[] args) {
                Map<String, Object> properties = new HashMap();
        Inventory inventory = new Inventory();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        inventory.addInstrument("11277", 3999.95,new InstrumentSpec(properties));
        properties.put("builder", Builder.MARTIN);
        properties.put("model", "D-18");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.ADIRONDACK);
        inventory.addInstrument("122784", 5495.95,
                new InstrumentSpec(properties));
        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95,
                new InstrumentSpec(properties));
        inventory.addInstrument("V9512", 1549.95,
                new InstrumentSpec(properties));
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("70108276", 2295.95,
                new InstrumentSpec(properties));
        properties.put("model", "SG ‘61 Reissue");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.MAHOGANY);
        inventory.addInstrument("82765501", 1890.95,
                new InstrumentSpec(properties));
        properties.put("instrumentType", InstrumentType.DOBRO);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        properties.remove("numStrings");
        inventory.addInstrument("9019920", 5495.99,
                new InstrumentSpec(properties));
        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("model", "RB-3 Wreath");
        properties.remove("topWood");
        properties.put("numStrings", 5);
        inventory.addInstrument("8900231", 2945.95,
                new InstrumentSpec(properties));
        List<Instrument> instruments = inventory.getInstruments();
        for (Instrument inv1 : instruments) {
            Map<String, Object> pr = inv1.getSpec().getProperties();
            for (Map.Entry m : pr.entrySet()) {
                System.out.println(m.getKey() + " : " + m.getValue());
            }
            System.out.println("--------------------");
        }
    }
}
