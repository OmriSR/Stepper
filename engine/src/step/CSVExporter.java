package step;

import engine.Step;
import engine.SystemData;
import systemdata.*;
import systemdata.String;

public class CSVExporter extends Step {
    private Relation SOURCE;
    private String RESULT;
    public CSVExporter(Relation SOURCE){
        super(true);
        this.SOURCE = SOURCE;
        //source.setName("SOURCE"); ??
    }

    @Override
    public void presentToUser() {

    }

    @Override
    public void run() {
        //wait for refactor of Relation
        //parse SOURCE which is a table.
        // each row incl. header is turned into a ',' seperated values.
        // to differentiate rows - rows ends with '\n'.
        // H1,H2,H3\nval1,val2,val3\n
        // translates to
        // H1  | H2 | H3
        // val1|val2|Val3

    }
}
