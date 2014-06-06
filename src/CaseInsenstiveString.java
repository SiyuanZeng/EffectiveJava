/**
 * Created by SiyuanZeng's on 6/6/2014.
 */
public class CaseInsenstiveString {

    private String s;

    public CaseInsenstiveString(String abc) {
        this.s=abc;

    }

    // Broken – violates symmetry
    @Override public boolean equals (Object o) {
        if (o instanceof CaseInsenstiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsenstiveString) o).s);
        if (o instanceof String) // Not Symmetric!
        return s.equalsIgnoreCase((String) o);
        return false;
    }


}
