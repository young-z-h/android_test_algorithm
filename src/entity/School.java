package entity;

public class School {
    private Integer id;
    private String name;
    private Integer rank;
    private boolean belong985;
    private boolean belong211;

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", belong985=" + belong985 +
                ", belong211=" + belong211 +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public boolean isBelong985() {
        return belong985;
    }

    public void setBelong985(boolean belong985) {
        this.belong985 = belong985;
    }

    public boolean isBelong211() {
        return belong211;
    }

    public void setBelong211(boolean belong211) {
        this.belong211 = belong211;
    }
}
