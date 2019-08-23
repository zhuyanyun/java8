package thinkjava.chapter_10.change;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 08:41
 * @Vertion 1.0
 **/
public class Parcel4 {

    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}
