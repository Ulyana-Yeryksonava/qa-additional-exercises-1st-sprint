package inheritance_and_abstraction_classes.abstract_classes;

public abstract class StarSystem {
    protected int messageCounter;

    public abstract void sendMessage(String message);
    protected abstract void incrementMessageCounter();
}
