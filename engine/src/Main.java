import engine.SystemData;
import systemdata.*;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
// ############### RELATION TESTING #############
//        List titles = new ArrayList<String>();
//        List values = new ArrayList<List>();
//        List val1 = new ArrayList<>();
//        List val2 = new ArrayList<>();
//        List val3 = new ArrayList<>();
//
//        val1.add("Hello");
//        val1.add("world");
//
//        val2.add("Tomer");
//        val2.add("Gay");
//
//        val3.add("Fortnite");
//
//        values.add(val1);
//        values.add(val2);
//        values.add(val3);
//
//        titles.add("first");
//        titles.add("second");
//        titles.add("third and last");
//        SystemRelation rel = new SystemRelation(titles);
//        SystemRelation rel2 = new SystemRelation(titles,values);
//
//        out.println("this is a test of the second ctor:");
//        rel.presentToUser();
//        out.println("\n");
//        out.println("this is a test of the third ctor");
//        rel2.presentToUser();
//        out.println("\n");
//        new SystemRelation("check","one","two").presentToUser();
//        out.println("\n");
//        new SystemRelation(rel2.getContent()).presentToUser()
        //#########################################################
// ############### LIST TESTING #############################

        SystemData item = new SystemRelation("check","one","two");
        SystemData item2 = new SystemDouble(2.0);
        SystemData item3 = new SystemNumber(14);
        SystemData item4 = new SystemString("yes yes yes");

        SystemList SL = new SystemList(item,item2,item3);
        SL.presentToUser();
        SL.addItem(item4);
        SL.presentToUser();
        SL.removeItem(item2);
        SL.presentToUser();

    }
}