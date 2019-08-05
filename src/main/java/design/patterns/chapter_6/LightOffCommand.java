package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 20:16
 * @Vertion 1.0
 **/
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
