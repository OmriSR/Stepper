package engine.step;
import engine.SystemData;

public class FilesContentExtractor extends Step {
    private SystemData<String> fileContent;

    // --- constructors ---
    public FilesContentExtractor() {
        super();
    }

    public FilesContentExtractor(SystemData<String> fileContent) {
        super();
        this.fileContent = fileContent;
    }

    // --- getters ---
    public SystemData<String> getFileContent() {
        return fileContent;
    }

    // --- setters ---
    public void setFileContent(SystemData<String> fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public void presentToUser() {
        System.out.println("FilesContentExtractor: " + fileContent);
    }
}