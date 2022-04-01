package Testing;

import java.util.List;

public class Info {
    private boolean first_page;
    private List<assortment_groups> assortment_groups;

    @Override
    public String toString() {
        return "Info{" +
                "first_page=" + first_page +
                ", assortment_groups=" + assortment_groups +
                '}';
    }

    public boolean isFirst_page() {
        return first_page;
    }

    public void setFirst_page(boolean first_page) {
        this.first_page = first_page;
    }

    public List<Testing.assortment_groups> getAssortment_groups() {
        return assortment_groups;
    }

    public void setAssortment_groups(List<Testing.assortment_groups> assortment_groups) {
        this.assortment_groups = assortment_groups;
    }

    public Info(boolean first_page, List<Testing.assortment_groups> assortment_groups) {
        this.first_page = first_page;
        this.assortment_groups = assortment_groups;
    }
}
