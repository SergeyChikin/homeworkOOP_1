public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int witchcraft, int transgression, int industriousness,
                      int loyalty, int honesty) {
        super(fullName, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public void print() {
        System.out.println("Имя студента - " + getFullName() + ";\nСила магии - " + getWitchcraft() +
                ";\nДальность трансгрессии - " + getTransgression() + "\nТрудолюбие - " +
                getIndustriousness() + ";\nВерность - " + getLoyalty() + ";\nЧестность - " +
                getHonesty() + ";");
        System.out.println();
    }
}
