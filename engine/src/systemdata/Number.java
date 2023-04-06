package systemdata;
import engine.SystemData;

public class Number extends SystemData<java.lang.Number> {

    public Number(java.lang.Number content) {
        super("Number", true, content);

    }
    @Override
    public void presentToUser() {
        System.out.println("Number: " + content);
    }
}
