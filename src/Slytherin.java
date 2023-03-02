public class Slytherin extends Hogwarts {
    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int witchcraft, int transgression, int theTrick, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(fullName, witchcraft, transgression);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void print() {
        System.out.println("Имя студента - " + getFullName() + ";\nСила магии - " + getWitchcraft() +
                            ";\nДальность трансгрессии - " + getTransgression() + ";\nХитрость - " +
                          getTheTrick() + ";\nРешительность - " + getDetermination() + ";\nАмбициозность" +
                          getAmbition() + ";\nНаходчивость - " + getResourcefulness() +
                          ";\nЖажда власти -" + getLustForPower() + ";");
        System.out.println();
    }
}
