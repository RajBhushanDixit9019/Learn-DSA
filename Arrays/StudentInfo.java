// this java code represents the illustration of the array of objects.
class Students {
    
   private String name;
   private int age;
   private String course;
   private int rolnum;
    
   public Students(String name, int age, String course, int rolnum) {
    this.name = name;
    this.age=age;
    this.course=course;
    this.rolnum=rolnum;
   }

   public void getStdInfo(){
    System.out.println("--------------------");
    System.out.println("Name:"+this.name);
    System.out.println("Age:"+this.age);
    System.out.println("Course:"+this.course);
    System.out.println("Roll Number:"+this.rolnum);
    System.out.println("--------------------");
   }
}
public class StudentInfo{
    public static void main(String[] args) {
        Students[] student = new Students[3];

        student[0]= new Students("Raj",23,"MCA",80);

        student[1]= new Students("Raju", 22, "BCA", 70);

        student[2] = new Students("Ramesh", 23, "MTech",56);

        for(int i=0;i<student.length;i++){
            student[i].getStdInfo();
        }
    }
}
