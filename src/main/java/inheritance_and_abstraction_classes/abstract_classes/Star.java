package inheritance_and_abstraction_classes.abstract_classes;

public class Star extends StarSystem {
   @Override
   public void sendMessage(String message) {
       for (int i = 1; i <= 2; i++) {
           System.out.println("Star message #" + i + ": " + message);
           incrementMessageCounter();
       }

   }

   @Override
    public void incrementMessageCounter() {
        messageCounter++;
   }

    public static void main(String[] args) {
        StarSystem star = new Star();
        System.out.println("Message counter before: " + star.messageCounter);
        star.sendMessage("foo");
        assert star.messageCounter == 2;
    }
}
