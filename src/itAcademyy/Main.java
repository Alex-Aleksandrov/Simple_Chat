package itAcademyy;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hi, user1");
        user1.sendMessage(user2, "How are you");

        user2.sendMessage(user1, "Hi, user2");
        user2.sendMessage(user1, "I'm, fine");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hi, user1");
        user3.sendMessage(user1, "My name user3");
        user3.sendMessage(user1, "What your name?");

        user1.sendMessage(user3, "Hi, user3");
        user1.sendMessage(user3, "Nice to meet you");
        user1.sendMessage(user3, "My name user1");

        MessageDataBase.showDialog(user1, user3);



    }
}
