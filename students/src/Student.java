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
