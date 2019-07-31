package pracurrent;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-20 20:50
 * @Vertion 1.0
 **/
public class EcrciseChild extends ecrcise {

    public synchronized void dosome(){
        System.out.println("========");
        super.dosome();
    }

    public static void main(String[] args) {
        EcrciseChild ecrciseChild = new EcrciseChild();
        ecrciseChild.dosome();
    }

}
