package systemdata;
import engine.SystemData;
//import com.google.gson.Gson;

public class SystemJSON extends SystemData<java.lang.String>{
    public SystemJSON(java.lang.String content) {
        super("SystemJSON", true, content);
    }
    @Override
    public void presentToUser() {
//        Gson gson = new Gson();
//        System.out.println("SystemJSON: " + gson.toJson(content));
    }
}
