import systemdata.Relation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        List titles = new ArrayList<String>();
        List values = new ArrayList<List>();
        List val1 = new ArrayList<>();
        List val2 = new ArrayList<>();
        List val3 = new ArrayList<>();

        val1.add("Hello");
        val1.add("world");

        val2.add("Tomer");
        val2.add("Gay");

        val3.add("Fortnite");

        values.add(val1);
        values.add(val2);
        values.add(val3);

        titles.add("first");
        titles.add("second");
        titles.add("third and last");
        Relation rel = new Relation(titles);
        Relation rel2 = new Relation(titles,values);

        out.println("this is a test of the second ctor:");
        rel.presentToUser();
        out.println("\n");
        out.println("this is a test of the third ctor");
        rel2.presentToUser();

    }
}