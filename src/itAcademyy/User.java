package itAcademyy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String userName;
    List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribe(User user){
        for  (User courent : subscriptions ){
            if(courent.getUserName().equals(user.getUserName())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void sendMessage(User user, String text){
        MessageDataBase.addNewMessage(this, user, text);

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return userName;
    }
}
