public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ivanov I.I.", 1, new int[]{5, 6, 7, 8, 5});
        students[1] = new Student("Petrov V.V.", 1, new int[]{5, 6, 7, 8, 5});
        students[2] = new Student("Sidorov D.I.", 1, new int[]{9, 10, 10, 9, 9});
        students[3] = new Student("Kozlov K.A.", 2, new int[]{5, 6, 7, 8, 5});
        students[4] = new Student("Smirnov A.I.", 2, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("Lopata D.A.", 2, new int[]{8, 6, 4, 8, 5});
        students[6] = new Student("Bagor V.K.", 3, new int[]{9, 9, 9, 9, 7});
        students[7] = new Student("Topor I.S.", 3, new int[]{6, 6, 9, 8, 4});
        students[8] = new Student("Sergeev S.S.", 4, new int[]{7, 6, 7, 8, 9});
        students[9] = new Student("Belov R.A.", 4, new int[]{5, 5, 4, 4, 4});

        getHonourStudents(students);
    }

    private static void getHonourStudents(Student[] students) {
        for (Student student : students) student.printHonourStudents();
    }
}
