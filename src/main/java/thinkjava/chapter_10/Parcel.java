package thinkjava.chapter_10;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-22 20:27
 * @Vertion 1.0
 **/
public class Parcel {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.ship("Testmani");
    }
}
