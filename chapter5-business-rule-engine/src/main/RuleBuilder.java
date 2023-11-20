package main;

public class RuleBuilder {
    private Condition condition;
    private Action action;

    private RuleBuilder(final Condition condition) {
        this.condition = condition;
    }

    public static RuleBuilder when(final Condition condition) {
        return new RuleBuilder(condition);
    }

    public Rule then(final Action action) {
        this.action = action;
        return new Rule(condition, action);
    }
}
