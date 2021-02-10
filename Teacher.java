public class Teacher {
  // instance variables declared
  private String Subject;
  private String name;
  private int classNum;

  // constructor initializes variables
  public Teacher(String className, String teacherName, int classNumber)
  {
    Subject = className;
    name = teacherName;
    classNum = classNumber;
  }
  // method prints teacher info
  public void printTeacherInfo() {
    System.out.println(Subject + " " + name + " " + classNum);
  }
  public boolean enrolled(int classNumber) {
    if (classNum == classNumber) {
      return true;
    } else {
      return false;
    }
  }
}