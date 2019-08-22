package thinkjava.chapter_8.constructor;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-22 09:42
 * @Vertion 1.0
 **/
class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius=" + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(),radius=" + radius);
    }
}


public class PloyConstructors{
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
