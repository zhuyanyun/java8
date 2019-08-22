package thinkjava.chapter_8;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-22 17:51
 * @Vertion 1.0
 **/
class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{

    @Override
    Wheat process() {
        return new Wheat();
    }
}



public class CovarianReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain process = mill.process();
        System.out.println(process);
        mill = new WheatMill();
        process = mill.process();
        System.out.println(process);
    }
}
