
public class Flow
{
    public abstract class Step
    {
        public class StepIO
        {
//            private Collection systemData;

            private String name;

        }
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