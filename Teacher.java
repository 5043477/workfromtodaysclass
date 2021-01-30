public class Teacher
{
  //instance variables declared
  private String subject;
  private String name;
  private int classNum;

  //constructor initializes variables
  public Teacher(String classNum, String teacherName, int classNumber);

  {
    subject = className;
    name = teacherName;
    classNum = classNumber;
  }

  //method prints teacher info
  public void printTeacherInfo()
  {
    System.out.println(subject + " " + name + " " + classNum);
  }

  public boolean enrolled(int classNumber)
  {
    if(classNum == classNumber)
    {
      return true;
    }else{
      return false;
    }
  }
}