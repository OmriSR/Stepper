package step;

import engine.Step;
import systemdata.String;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDumper extends Step {
    private String CONTENT;
    private String FILENAME;

    public FileDumper() {
        super(true);
    }
    public FileDumper(String CONTENT, String FILENAME) {
        super(true);
        this.CONTENT = CONTENT;
        this.FILENAME = FILENAME;
    }
    private boolean validateFileName() {
       int extenstionIdx = FILENAME.getContent().lastIndexOf('.');
       int lastSlashIdx = FILENAME.getContent().lastIndexOf('\\');
       extenstionIdx = extenstionIdx == -1 ? FILENAME.getContent().length() : extenstionIdx;
       return extenstionIdx > lastSlashIdx;
    }
    private boolean validateContent() {
        return CONTENT.getContent().length() > 0;
    }
    private boolean validate() {
        return validateFileName() && validateContent();
    }

    private void createFile() throws IOException {
        File file = new File(FILENAME.getContent());
        if (file.createNewFile())
        {
            FileWriter Writer = new FileWriter(FILENAME.getContent());
            Writer.write(CONTENT.getContent());
            //Log.Success("File created successfully: " + file.getName());
        } else {
            //Log.Failure("File already exists.");
        }

    }


    @Override
    public void presentToUser() {
        System.out.println("FileDumper");
        System.out.println("full name: " + FILENAME.getContent());
        int presentLength = 20 < FILENAME.getContent().length() ? 20 : FILENAME.getContent().length();
        System.out.println("content: " + CONTENT.getContent().substring(0,presentLength) + "...");
    }

    @Override
    public void run() {
        try{
          if(validate()) {
              createFile();
          }
        }
        catch (IOException e)
        {
            //log error
        }
    }
}
