package engine.common;
abstract public class SystemData<T> {
    final private String name;
    private String alias;
    final private Boolean userFriendly;
    private  T content;

    protected SystemData(String name, Boolean userFriendly) {
        this.name = name;
        this.userFriendly = userFriendly;
    }
    protected SystemData(String name, Boolean userFriendly, T content) {
        this.name = name;
        this.userFriendly = userFriendly;
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Boolean isUserFriendly() {
        return userFriendly;
    }

//  a simple form of representation that can be understandable by a user with no technical background
    public abstract void presentToUser();


}
