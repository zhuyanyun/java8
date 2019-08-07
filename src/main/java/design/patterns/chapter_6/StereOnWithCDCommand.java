package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 20:20
 * @Vertion 1.0
 **/
public class StereOnWithCDCommand implements Command {

    Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("luo da you");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
