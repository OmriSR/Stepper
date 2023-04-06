package systemdata;
import engine.SystemData;

public class Double extends SystemData<java.lang.Double> {

    public Double(java.lang.Double content) {
        super("Double", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("Double: " + content);
    }
}
