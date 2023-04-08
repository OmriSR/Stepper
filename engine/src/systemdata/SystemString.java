package systemdata;
import engine.SystemData;
public class SystemString extends SystemData<java.lang.String> {

    public SystemString(java.lang.String content) {
        super("String", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("String: " + content);
    }

}
