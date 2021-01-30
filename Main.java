public class Main {
  public static void main(String[] args) {
    // 2 objects for 2 students
    Student s1 = new Student("nick", 34785, classNum);
    Student s2 = new Student("lindsey", 75689, classNum);

    //i objects for 1 teacher
    Teacher t1 = new teacher("programming", "gaber", 128);


    //call enrolled method on t1 object
     boolean enrolled = t1.enrolled(classNum);

     if(enrolled)
     {
       s1.printStudent();
       s2.printStudent();
       t1.printTeacherInfo();

     }
  }
}