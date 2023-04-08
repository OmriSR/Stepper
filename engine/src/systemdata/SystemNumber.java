package systemdata;
import engine.SystemData;

public class SystemNumber extends SystemData<java.lang.Number> {

    public SystemNumber(java.lang.Number content) {
        super("SystemNumber", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("SystemNumber: " + content);
    }
}
