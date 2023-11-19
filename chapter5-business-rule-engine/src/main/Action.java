package main;

@FunctionalInterface
public interface Action {
    void execute(Facts facts);
}
