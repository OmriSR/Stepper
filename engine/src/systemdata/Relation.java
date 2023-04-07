package systemdata;
import engine.SystemData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Relation extends SystemData<Map<String,List<Object>>> {
    private Integer numOfRows = 0;
//    This ctor receives:
//      * a ready-made table
    protected Relation(Map<String,List<Object>> content) {
        super("relation", false, content);
    }
//    This ctor receives:
//      * a list of string -> titles of the columns in the table (no data = 0 rows)
    protected Relation(List<String> tableTitles) {
        super("relation", false, null);

        Map<String,List<Object>> content = new HashMap<>();
        for(int i=0; i< tableTitles.size();++i){
            content.put(tableTitles.get(i), new ArrayList<>());
        }

        super.setContent(content);
    }
//    This ctor receives:
//      * a list of string (title of the columns in the table)
//        * a list of (list of) objects -> every item in the list is data of that column
    protected Relation(List<String> tableTitles, List<List<Object>> tableData) {
        super("relation", false, null);

        Map<String,List<Object>> content = new HashMap<>();
        for(int i=0; i< tableTitles.size();++i){
            content.put(tableTitles.get(i), tableData.get(i));
        }
        this.numOfRows = tableData.size();

        super.setContent(content);
    }

    @Override
    public void presentToUser() {

    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }
}
