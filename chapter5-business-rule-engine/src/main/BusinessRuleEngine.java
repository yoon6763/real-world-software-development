package main;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {

    private final List<Action> actions;
    private Facts facts;

    public BusinessRuleEngine(final Facts facts) {
        this.facts = facts;
        this.actions = new ArrayList<>();
    }

    public void addAction(final Action action) {
        actions.add(action);
    }

    public int count() {
        return actions.size();
    }

    public void run() {
        actions.forEach(action -> action.execute(facts));
    }

}
