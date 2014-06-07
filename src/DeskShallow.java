/**
 * Created by SiyuanZeng's on 6/7/2014.
 */
public class DeskShallow implements Cloneable {
    private String skin;
    private String color;
    private DeskDeep desk;

    public DeskDeep getDesk() {
        return desk;
    }

    public void setDesk(DeskDeep desk) {
        this.desk = desk;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DeskShallow{" +
                "skin='" + skin + '\'' +
                ", color='" + color + '\'' +
                ", desk=" + desk +
                '}';
    }
}
