abstract public class SystemData {
    private String name;
    private Boolean user_friendly;
    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Boolean getUserFriendly() {
        return user_friendly;
    }

//  a simple form of representation that can be understandable by a user with no technical background
    public abstract void presentToUser();


}
