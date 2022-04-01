package Testing;

public class parts {
    private String id;
    private String part_id;
    private String name;
    private String number;

    @Override
    public String toString() {
        return "parts{" +
                "id='" + id + '\'' +
                ", part_id='" + part_id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPart_id() {
        return part_id;
    }

    public void setPart_id(String part_id) {
        this.part_id = part_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public parts(String id, String part_id, String name, String number) {
        this.id = id;
        this.part_id = part_id;
        this.name = name;
        this.number = number;
    }
}
