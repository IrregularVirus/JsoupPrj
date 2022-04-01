package Testing;

import java.util.List;

public class assortment_groups {
    @Override
    public String toString() {
        return "assortment_groups{" +
                "family_groups=" + family_groups +
                '}';
    }

    public List<Testing.family_groups> getFamily_groups() {
        return family_groups;
    }

    public void setFamily_groups(List<Testing.family_groups> family_groups) {
        this.family_groups = family_groups;
    }

    public assortment_groups(List<Testing.family_groups> family_groups) {
        this.family_groups = family_groups;
    }

    private List<family_groups> family_groups;
}
