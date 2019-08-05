package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 20:20
 * @Vertion 1.0
 **/
public class StereOffWithCDCommand implements Command {

    Stereo stereo;

    public StereOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
