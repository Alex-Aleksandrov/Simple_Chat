package itAcademyy;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    private static List<Message> message = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        message.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessage(){
        getMessage().addAll(message);
        return getMessage();
    }
    public static void showDialog(User u1, User u2){
        for (Message message: message) {
            if (message.getSender() == u1 && message.getReceiver() == u2 ||
                    message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender() + ":" + message.getText());
            }
        }
    }
}
