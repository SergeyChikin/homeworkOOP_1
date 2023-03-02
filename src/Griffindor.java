public class Griffindor extends Hogwarts{
   private int nobility;
   private int honor;
   private int bravery;

    public Griffindor(String fullName, int witchcraft, int transgression,int nobility, int honor, int bravery) {
        super(fullName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public void print() {
        System.out.println("Имя студента - " + getFullName() + ";\nСила магии - " + getWitchcraft() +
                ";\nДальность трансгрессии - " + getTransgression() + ";\nБлагородство - "
                  + getNobility() + ";\nЧесть - " + getHonor() + ";\nХрабрость - " + getBravery() + ";");
        System.out.println();
    }
}
