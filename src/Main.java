import java.util.Arrays;

public class Main {
    public static Hogwarts[] students = {

            new Griffindor("Гарри Потер", 99, 80, 25, 30, 40),
            new Griffindor("Гермиона Грейнджер", 85, 90, 30, 34, 35),
            new Griffindor("Рон Уизли", 54, 60, 24, 29, 33),
            new Hufflepuff("Захария Смит", 60, 35, 40, 30, 28),
            new Hufflepuff("Седрик Диггори", 48, 70, 30, 38, 25),
            new Hufflepuff("Джастин Финч-Флетчли", 29, 80, 25, 23, 35),
            new Ravenclaw("Чжоу Чанг", 68, 37, 23, 31, 28, 15),
            new Ravenclaw("Падма Патил", 40, 65, 34, 25, 22, 39),
            new Ravenclaw("Маркус Белби", 55, 20, 34, 45, 21, 29),
            new Slytherin("Драко Малфой", 59, 69, 40, 20, 22, 24, 55),
            new Slytherin("Грэхэм Монтегю", 37, 62, 35, 22, 21, 34, 12),
            new Slytherin("Грегори Гойл", 47, 57, 33, 19, 23, 43, 25),
    };

    public static void main(String[] args) {

        StudentService.printStudent(StudentService.getStudent("Седрик Диггори"));
        StudentService.comparingMagic(StudentService.getStudent("ГрегориГойл"), StudentService.getStudent("Ч ж о уЧанг"));
        StudentService.comparingMagicGriffindor(StudentService.getGriffendorStudent("Гарри Потер"), StudentService.getGriffendorStudent("Гермиона Грейнджер"));
        StudentService.comparingMagicRavenclaw(StudentService.getRavenclawStudent("Маркус Белби"),StudentService.getRavenclawStudent("Падма Патил"));


    }
}