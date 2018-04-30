public class StudentTester
{
    public static void main(String[] args)
    {
        Student maggie = new Student("Maggie", 1);
        System.out.println(maggie.getName());

        Student tim = new Student("Tim", 2);
        System.out.println(tim.getName());

        Student joseph = new Student("Joseph", 3);
        System.out.println(joseph.getName());

        Student josiah = new Student("Josiah", 4);
        System.out.println(josiah.getName());

        Student christy = new Student("Christy", 5);
        System.out.println(christy.getName());

        Student luke = new Student("Luke", 6);
        System.out.println(luke.getName());

        Student[] frontRowStudents = new Student[3];
        frontRowStudents[0] = maggie;
        frontRowStudents[1] = tim;
        frontRowStudents[2] = joseph;
        printStudents(frontRowStudents);

        Student[] backRowStudents = new Student[3];
        backRowStudents[0] = josiah;
        backRowStudents[1] = christy;
        backRowStudents[2] = luke;
        printStudents(backRowStudents);
    }
    private static void printStudents(Student[] students)
    {
        for (Student student :students)
        {
            System.out.println(student.getName());
        }
    }
}