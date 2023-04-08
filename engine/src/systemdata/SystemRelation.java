package systemdata;
import engine.SystemData;

import java.util.*;

import static java.lang.System.out;

public class SystemRelation extends SystemData<Map<String, List<Object>>> {
    private Integer numOfRows = 0;

//    This ctor receives:
//      * a ready-made table
    public SystemRelation(Map<String,List<Object>> content) {
        super("relation", false, content);
        this.numOfRows = content.values().size();
    }
//    This ctor receives:
//      * a list of string -> titles of the columns in the table (no data = 0 rows)
    public SystemRelation(Collection<String> tableTitles) {
        super("relation", false, null);

        Map<String,List<Object>> content = new LinkedHashMap<>();
        for(String title : tableTitles){
            content.put(title, new ArrayList<>());
        }

        super.setContent(content);
    }
//    This ctor receives:
//      * a stream of strings -> unknown amount of titles (no data = 0 rows)
    public SystemRelation(String... tableTitles) {
        this(new ArrayList<>(Arrays.asList(tableTitles)));
    }
//    This ctor receives:
//      * a list of string (title of the columns in the table)
//      * a list of (list of) objects -> every item in the list is data of that column
    public SystemRelation(List<String> tableTitles, List<List<Object>> tableData) {
        super("relation", false, null);

        Map<String,List<Object>> content = new LinkedHashMap<>();
        for(int i=0; i< tableTitles.size();++i){
            content.put(tableTitles.get(i), tableData.get(i));
        }
        this.numOfRows = tableData.size();

        super.setContent(content);
    }

    @Override
    public void presentToUser() {
        if(content.isEmpty()){
            out.println("There is no content to print");
        }
        else{
        out.print("There are " + this.numOfRows + " rows in the " + this.name);
        out.println(" and the column titles are: " + this.content.keySet());
        }


        //testing
//        out.println("the values of the relation are:" + this.content.values().toString());
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }
}
