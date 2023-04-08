package engine;

import java.util.ArrayList;

public class Flow {
    public static abstract class Step {
        protected ArrayList<SystemData> inputs;
        protected ArrayList<SystemData> outputs;
        private boolean readonly = false;

        public Step(boolean readonly)
        {
            this.readonly = readonly;
        }

        public boolean isReadonly()
        {
            return readonly;
        }

        public void setReadonly(boolean readonly)
        {
            this.readonly = readonly;
        }

        public abstract void presentToUser();
    }

}