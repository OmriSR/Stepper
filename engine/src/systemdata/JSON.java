package systemdata;
import engine.SystemData;
import com.google.gson.Gson;
public class JSON extends SystemData<java.lang.String>{
    public JSON(java.lang.String content) {
        super("JSON", true, content);
    }
    @Override
    public void presentToUser() {
        Gson gson = new Gson();
        System.out.println("JSON: " + gson.toJson(content));
    }
}
