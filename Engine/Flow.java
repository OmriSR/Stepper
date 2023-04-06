package engine;


public class Flow {
    public abstract class Step {

        //SystemData inputs;

        //SystemData outputs;

        private boolean readonly = false;

        public boolean isReadonly()
        {
            return readonly;
        }

        public void setReadonly(boolean readonly)
        {
            this.readonly = readonly;
        }
    }

}