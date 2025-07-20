public class Student_object
{
    String name;
    int rollNo;
    double marks;

    void displaydetails()

    {
        System.out.println("My name is " + name + ", my roll number is " +rollNo + " and my marks are " +marks);
    }

    public static void main(String[] args)
    {
        Student_object s1 = new Student_object();
        Student_object s2 = new Student_object();

        s1.name = "Niraj";
        s1.rollNo = 2;
        s1.marks = 99.99;
        s2.name = "Neha";
        s2.rollNo = 3;
        s2.marks = 100;
        s1.displaydetails();
        s2.displaydetails();


    }
}