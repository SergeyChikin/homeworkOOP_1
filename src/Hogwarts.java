public class Hogwarts {
    private String fullName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String fullName, int witchcraft, int transgression) {
        this.fullName = fullName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }


    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print() {
        System.out.println("Имя студента - " + getFullName() + ";\nСила магии - " + getWitchcraft() +
                           ";\nДальность трансгрессии - " + getTransgression());
        System.out.println();
    }



}





