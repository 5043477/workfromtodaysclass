public class Student {
  // instance variables
  private String name;
  private int idNum;
  private int firstClassNum;

  // constructor initalizes variables
  public Student(String studentName, int id, int ClassNum) {
    name = studentName;
    idNum = id;
    firstClassNum = classNum;
  }

  // method prints student info
  public void printStudent() {
    System.out.println(name + " " + idNum + " " + classNum);
  }
}