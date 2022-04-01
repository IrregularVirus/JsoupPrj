package Testing;

import java.util.List;

public class family_groups {
    private List<parts> parts;

    @Override
    public String toString() {
        return "family_groups{" +
                "parts=" + parts +
                '}';
    }

    public List<Testing.parts> getParts() {
        return parts;
    }

    public void setParts(List<Testing.parts> parts) {
        this.parts = parts;
    }

    public family_groups(List<Testing.parts> parts) {
        this.parts = parts;
    }
}
