package systemdata;
import engine.SystemData;

public class SystemDouble extends SystemData<java.lang.Double> {

    public SystemDouble(java.lang.Double content) {
        super("SystemDouble", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("SystemDouble: " + content);
    }
}
