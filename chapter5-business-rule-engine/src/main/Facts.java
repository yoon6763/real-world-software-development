package main;

import java.util.HashMap;
import java.util.Map;

public class Facts {
    private final Map<String, String> facts = new HashMap<>();

    public Map<String, String> getFacts() {
        return facts;
    }

    public void addFact(String name, String value) {
        facts.put(name, value);
    }
}
