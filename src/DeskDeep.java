/**
 * Created by SiyuanZeng's on 6/7/2014.
 */
public class DeskDeep implements Cloneable {
    private String skin;
    private String color;


    public Object clone() throws CloneNotSupportedException {
        DeskDeep deskDeepClone = new DeskDeep();
        deskDeepClone.setColor("original color");
        deskDeepClone.setSkin("orignal skin");
        return deskDeepClone;
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
        return "Desk{" +
                "skin='" + skin + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
