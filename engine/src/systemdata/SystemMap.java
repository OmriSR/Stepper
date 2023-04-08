package systemdata;

import engine.SystemData;
import java.util.List;
import static java.lang.System.out;

public class SystemMap extends SystemData<List<SystemData<Object>>> {
    protected SystemMap(List<SystemData<Object>> content) {
        super("Mapping", false, content);
    }

    @Override
    public void presentToUser() {
        out.println("car: " + this.content.get(0));
        out.println("cdr: " + this.content.get(1));
    }
}
