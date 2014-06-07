public class Main {

    public static void main(String[] args) {
        DeskDeep deskDeep = deepCopy();
        shallowCopy(deskDeep);
    }

    private static DeskDeep deepCopy() {
        DeskDeep deskDeep = new DeskDeep();
        deskDeep.setSkin("original skin");
        deskDeep.setColor("original mouth");

        DeskDeep deskDeepClone = null;
        try {
            deskDeepClone = (DeskDeep) deskDeep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        boolean e = deskDeep == deskDeepClone;

        System.out.println("");
        System.out.println("desk == deskClone: "+e);
        System.out.println(deskDeep);
        System.out.println(deskDeepClone);
        return deskDeep;
    }

    private static void shallowCopy(DeskDeep deskDeep) {
        DeskShallow deskShallow = new DeskShallow();
        deskShallow.setColor("original mouth");
        deskShallow.setSkin("original skin");
        deskShallow.setDesk(deskDeep);
        DeskShallow deskShallowClone = null;

        try {
            deskShallowClone = (DeskShallow)deskShallow.clone();
        } catch (CloneNotSupportedException e1) {
            e1.printStackTrace();
        }

        deskShallow.setColor("change primitive mouth");
        deskShallow.getDesk().setColor("change object field mouth");


        boolean shallow = (deskShallow == deskShallowClone);

        System.out.println("");
        System.out.println("desk == deskClone: "+shallow);
        System.out.println(deskShallow);
        System.out.println(deskShallowClone);
    }
}
