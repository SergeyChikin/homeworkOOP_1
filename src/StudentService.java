import javax.management.RuntimeErrorException;

public class StudentService {
    public static Hogwarts getStudent(String fullName) {
        Hogwarts student = null;
        for (Hogwarts stud : Main.students) {
            if (stud.getFullName().replace(" ", "").equalsIgnoreCase(fullName.
                                   replace(" ", ""))) {

                student = stud;
                break;
            }
        }
        return student;
    }

    public static Griffindor getGriffendorStudent(String fullName) {
        return (Griffindor) getStudent(fullName);
    }
    public static Hufflepuff getHufflepuffStudent(String fullName) {
        return (Hufflepuff) getStudent(fullName);
    }
    public static Ravenclaw getRavenclawStudent(String fullName) {
        return (Ravenclaw) getStudent(fullName);
    }
    public static Slytherin getSlytherinStudent(String fullName) {
        return (Slytherin) getStudent(fullName);
    }



    public static void printStudent(Hogwarts student) {
        if (student != null) {
            student.print();
        } else {
            System.out.println("Введите имя студента корректно!");
            System.out.println();
        }
    }

    //    Подсчитывает силу магии студента Хогвардса.
    public static int countingPowerMagic(Hogwarts student) {
        int power = 0;
        if (student != null) {
            power = student.getWitchcraft() + student.getTransgression();
        }
        return power;
    }
//    Сравнивает силу магии студентов Хогвардса.
    public static void comparingMagic(Hogwarts firstStudent, Hogwarts secondStudent) {
        int a  = countingPowerMagic(firstStudent);
        int b = countingPowerMagic(secondStudent);
         if (a == 0 || b == 0) {
            System.out.println("Введите имена студентов корректно!");
        } else  if ( a > b ) {
            System.out.println(firstStudent.getFullName() + " обладает большей мощностью магии, чем " + secondStudent.getFullName());
             System.out.println();
        }else if (b > a) {
            System.out.println(secondStudent.getFullName() + " обладает большей мощностью магии, чем " + firstStudent.getFullName());
             System.out.println();
        }else if (a == b ){
            System.out.println("Сила магии студентов равна");
        }
    }

//    Подсчитывают силу магии студентов факультетов.
    public static int countingPowerMagicGriffindor(Griffindor student) {
        int power = 0;
        if (student != null) {
            power = student.getWitchcraft() + student.getTransgression() + student.getNobility() +
            student.getHonor() + student.getBravery();
        }
        return power;
    }

    public static int countingPowerMagicHufflepuff(Hufflepuff student) {
        int power = 0;
        if (student != null) {
            power = student.getWitchcraft() + student.getTransgression() + student.getIndustriousness() +
            student.getLoyalty() + student.getHonesty();
        }
        return power;
    }

      public static int countingPowerMagicRavenclaw(Ravenclaw student) {
          int power = 0;
          if (student != null) {
              power = student.getWitchcraft() + student.getTransgression() + student.getMind() +
              student.getWisdom() + student.getWit() + student.getCreativity();
          }
          return power;
      }

      public static int countingPowerMagicSlytherin(Slytherin student) {
        int power = 0;
        if (student != null) {
            power = student.getWitchcraft() + student.getTransgression() + student.getTheTrick() +
            student.getDetermination() + student.getAmbition() + student.getResourcefulness() +
            student.getLustForPower();
        }
        return power;
    }

    public static void comparingMagicGriffindor(Griffindor firstStudent, Griffindor secondStudent) {
        int a  = countingPowerMagic(firstStudent);
        int b = countingPowerMagic(secondStudent);
        if (a == 0 || b == 0) {
            System.out.println("Введите имена студентов корректно!");
        } else  if ( a > b ) {
            System.out.println(firstStudent.getFullName() + " лучший Гриффиндорец, чем " + secondStudent.getFullName());
            System.out.println();
        }else if (b > a) {
            System.out.println(secondStudent.getFullName() + " лучший Гриффиндорец, чем " + firstStudent.getFullName());
            System.out.println();
        }else if (a == b ){
            System.out.println("Сила магии студентов равна");
        }
    }

    public static void comparingMagicHufflepuff (Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int a  = countingPowerMagic(firstStudent);
        int b = countingPowerMagic(secondStudent);
        if (a == 0 || b == 0) {
            System.out.println("Введите имена студентов корректно!");
        } else  if ( a > b ) {
            System.out.println(firstStudent.getFullName() + " лучший Пуффендуец, чем " + secondStudent.getFullName());
            System.out.println();
        }else if (b > a) {
            System.out.println(secondStudent.getFullName() + " лучший Пуффендуец, чем " + firstStudent.getFullName());
            System.out.println();
        }else if (a == b ){
            System.out.println("Сила магии студентов равна");
        }
    }

    public static void comparingMagicRavenclaw (Ravenclaw firstStudent, Ravenclaw  secondStudent) {
        int a  = countingPowerMagic(firstStudent);
        int b = countingPowerMagic(secondStudent);
        if (a == 0 || b == 0) {
            System.out.println("Введите имена студентов корректно!");
        } else  if ( a > b ) {
            System.out.println(firstStudent.getFullName() + " лучший Когтевранец, чем " + secondStudent.getFullName());
            System.out.println();
        }else if (b > a) {
            System.out.println(secondStudent.getFullName() + " лучший Когтевранец, чем " + firstStudent.getFullName());
            System.out.println();
        }else if (a == b ){
            System.out.println("Сила магии студентов равна");
        }
    }


    public static void comparingMagicSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        int a  = countingPowerMagic(firstStudent);
        int b = countingPowerMagic(secondStudent);
        if (a == 0 || b == 0) {
            System.out.println("Введите имена студентов корректно!");
        } else  if ( a > b ) {
            System.out.println(firstStudent.getFullName() + " лучший Слизеринец, чем " + secondStudent.getFullName());
            System.out.println();
        }else if (b > a) {
            System.out.println(secondStudent.getFullName() + " лучший Слизеринец, чем " + firstStudent.getFullName());
            System.out.println();
        }else if (a == b ){
            System.out.println("Сила магии студентов равна");
        }

    }

}
