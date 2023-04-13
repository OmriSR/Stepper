package engine;

abstract public class SystemData<T> {
    protected String name;
    protected String alias;
    final protected Boolean userFriendly;
    protected  T content;

    protected SystemData(String name, Boolean userFriendly) {
        this.name = name;
        this.userFriendly = userFriendly;
    }
    protected SystemData(String name, Boolean userFriendly, T content) {
        this.name = name;
        this.userFriendly = userFriendly;
        this.content = content;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public T getContent() {
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
