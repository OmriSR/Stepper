package systemdata;
import engine.SystemData;
public class String extends SystemData<java.lang.String> {

    public String(java.lang.String content) {
        super("String", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("String: " + content);
    }

}
