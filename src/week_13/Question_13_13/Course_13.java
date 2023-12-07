package week_13.Question_13_13;

import java.util.ArrayList;

public class Course_13 implements Cloneable {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>() ;
    private int numberOfStudents ;
    public Course_13 (String courseName){
        this.courseName = courseName;
    }
    public void addStudent (String student) {
      students.add(student);
    }
  public ArrayList<String> getStudents(){
        return students;
  }
    public int getNumberOfStudents() {
        return students.toArray().length;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
    public Course_13 clone() throws CloneNotSupportedException {
        Course_13 clone = (Course_13) super.clone();
        clone.students = new ArrayList<>(students);
        return clone;
    }

}
