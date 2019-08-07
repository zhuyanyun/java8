package design.patterns.chapter_6;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 18:33
 * @Vertion 1.0
 **/
public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo(int m) {
        this.onCommands = new Command[m];
        this.offCommands = new Command[m];

        Command noCommand = new NoCommand();
        for(int i=0; i < m; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setConmand(int slot, Command onCommand, Command offCommond){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommond;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
