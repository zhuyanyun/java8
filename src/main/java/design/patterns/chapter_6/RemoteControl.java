package design.patterns.chapter_6;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 18:33
 * @Vertion 1.0
 **/
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(int m) {
        this.onCommands = new Command[m];
        this.offCommands = new Command[m];

        Command noCommand = new NoCommand();
        for(int i=0; i < m; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setConmand(int slot, Command onCommand, Command offCommond){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommond;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
