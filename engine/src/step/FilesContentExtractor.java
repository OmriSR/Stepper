package step;
import engine.Flow;
import engine.SystemData;
import java.util.*;

public class FilesContentExtractor extends Flow.Step {

    private Map<SystemData<String>, ArrayList<SystemData<Number>>> FileName2Rows;


    // --- constructors ---
    public FilesContentExtractor() {
        super(true );
    }

    public FilesContentExtractor(SystemData<String> fileContent) {
        super(true);

    }

    @Override
    public void presentToUser() {
        System.out.println("test123");
    }
}