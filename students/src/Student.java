//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
//Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    public String lastNameAndInitials;
    public int groupNumber;
    public int[]academicPerformance = new int[5];

    public Student(String lastNameAndInitials, int groupNumber, int[] academicPerformance) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return lastNameAndInitials +
                ", group number " + groupNumber;
    }
}
