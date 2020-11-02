public class Student {
    private String lastNameAndInitials;
    private int groupNumber;
    private int[]academicPerformance = new int[5];

    public Student(String lastNameAndInitials, int groupNumber, int[] academicPerformance) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public void printHonourStudents() {
        boolean flag = false;
        for (Integer i : this.academicPerformance) {
            if(i < 9) {
                flag = false;
                break;
            }
            else flag = true;
        }
        if(flag) System.out.println(this);
    }

    @Override
    public String toString() {
        return lastNameAndInitials +
                ", group number " + groupNumber;
    }
}
