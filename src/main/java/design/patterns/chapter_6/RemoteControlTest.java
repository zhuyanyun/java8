package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 17:36
 * @Vertion 1.0
 **/
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
