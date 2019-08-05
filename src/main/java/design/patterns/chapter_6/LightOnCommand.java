package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 17:29
 * @Vertion 1.0
 **/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
