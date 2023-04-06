package engine;
import java.util.*;

public class Flow {
    public abstract class Step {

        private ArrayList<SystemData> inputs;
        private ArrayList<SystemData> outputs;

        private boolean readonly = false;

        public boolean isReadonly()
        {
            return readonly;
        }

        public void setReadonly(boolean readonly)
        {
            this.readonly = readonly;
        }

        public void pre
    }

}