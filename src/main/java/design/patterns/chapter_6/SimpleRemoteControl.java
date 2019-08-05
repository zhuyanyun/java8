package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 17:35
 * @Vertion 1.0
 **/
public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
