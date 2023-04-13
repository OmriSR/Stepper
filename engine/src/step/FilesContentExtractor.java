package step;
import engine.Step;
import engine.SystemData;
import java.util.*;

public class FilesContentExtractor extends Step {

    private Map<SystemData<String>, ArrayList<SystemData<Number>>> FileName2Rows;


    // --- constructors ---
    public FilesContentExtractor() {
        super(true );
    }

    public FilesContentExtractor(SystemData<String> fileContent) {
        super(true);

    }
    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void presentToUser() {
        System.out.println("test123");
    }
}