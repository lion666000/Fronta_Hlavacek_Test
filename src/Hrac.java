public class Hrac {
    private String name;
    private String favClass;
    private int skill;

    public Hrac(String name, String favClass, int skill) {
        this.name = name;
        this.favClass = favClass;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getFavClass() {
        return favClass;
    }

    public int getSkill() {
        return skill;
    }

    public String toString() {
        return "Hráč: " + name + " | " + favClass + " | " + skill;
    }
}
