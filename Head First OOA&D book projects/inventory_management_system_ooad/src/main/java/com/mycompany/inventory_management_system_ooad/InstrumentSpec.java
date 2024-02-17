package com.mycompany.inventory_management_system_ooad;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {

    private final Map<String,Object> properties;

    public InstrumentSpec(Map<String,Object> propertie) {
            properties = new HashMap();
            properties.putAll(propertie);
    }

    //this method compare two guitarSpec together
    public boolean matches(InstrumentSpec gs) {
        for (int i = 0; i < properties.keySet().size(); i++) {
            String proName = properties.get(i).toString();
            if (proName.equals(gs.properties.containsKey(proName))) {
                return false;
            }
        }
        return true;
    }

    public Object getProperties(String p) {
        return properties.get(p);
    }

    public Map getProperties() {
        return properties;
    }

}
