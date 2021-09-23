package inheritance_and_abstraction_classes.abstract_classes;

public class Planet extends StarSystem {

    @Override
    public void sendMessage(String message) {
        System.out.println("Planet message: "  + message);
        incrementMessageCounter();
    }

    @Override
    public void incrementMessageCounter() {
        messageCounter++;
    }

    public static void main(String[] args) {
        StarSystem planet = new Planet();
        System.out.println("Message counter before: " + planet.messageCounter);
        planet.sendMessage("foo");
        assert planet.messageCounter == 1;
    }
}
