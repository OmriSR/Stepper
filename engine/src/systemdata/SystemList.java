package systemdata;
import engine.SystemData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

public class SystemList extends SystemData<List<SystemData<Object>>> {
    public SystemList() {
        super("System String", false,null);
    }

    public SystemList(List<SystemData<Object>> content) {
        super("System String", false, content);
    }

    public SystemList(SystemData<Object>... items) {
        this(new ArrayList<>(Arrays.asList(items)));
    }

    public void addItem(SystemData<Object> item){
        content.add(item);
    }

    public void removeItem(SystemData<Object> item){
        content.remove(item);
    }
    @Override
    public void presentToUser() {
        if(content.size() > 0){
            out.println("The System List contains: ");
            for (int i = 1; i <= content.size(); ++i) {
                out.print(i + ". ");content.get(i - 1).presentToUser();
            }
        }
        else{
            out.println("System List is empty");
        }
    }
}
