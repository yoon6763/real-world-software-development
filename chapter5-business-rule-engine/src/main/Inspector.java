package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inspector {
    private final List<ConditionalAction> conditionalActions;

    public Inspector(final ConditionalAction... conditionalActions) {
        this.conditionalActions = Arrays.asList(conditionalActions);
    }

    public List<Report> inspect(final Facts facts) {
        final List<Report> reports = new ArrayList<>();
        for (ConditionalAction conditionalAction : conditionalActions) {
            final boolean conditionalResult = conditionalAction.evaluate(facts);
            reports.add(new Report(conditionalAction, facts, conditionalResult));
        }

        return reports;
    }
}
