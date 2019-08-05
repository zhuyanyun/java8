package design.patterns.chapter_6;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 17:30
 * @Vertion 1.0
 **/
public class Stereo {

    String CD;
    Integer volume;

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void on (){
        System.out.println("Stereo on");
    }

    public void off (){
        System.out.println("Stereo off");
    }
}
