package week_13.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course_13 course13 = new Course_13("Inar Academy");
        course13.addStudent("Burak");
        course13.addStudent("Besim");
        course13.addStudent("Selçuk");
        course13.addStudent("Gürkan");
        Course_13 course131 = course13.clone();
        course131.addStudent("Jack");
        course131.addStudent("Hector");
        System.out.println("Number of students in the course1 : " + course13.getNumberOfStudents());
        for (String name: course13.getStudents()) {
            System.out.print(name + " " );
        }
        System.out.println("\n---------------------------");
        System.out.println("Number of students in the course two is : " + course131.getNumberOfStudents());
        for (String name:course131.getStudents()) {
            System.out.print(name + " ");
        }


    }
}
