package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 20:25
 * @Vertion 1.0
 **/
public class RemoteLoaderTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(7);

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereOnWithCDCommand stereOnWithCDCommand = new StereOnWithCDCommand(stereo);
        StereOffWithCDCommand stereOffWithCDCommand = new StereOffWithCDCommand(stereo);

        System.out.println("remoteControl======");
        remoteControl.setConmand(0, lightOnCommand, lightOffCommand);
        remoteControl.setConmand(1, stereOnWithCDCommand, stereOffWithCDCommand);

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
    }
}
