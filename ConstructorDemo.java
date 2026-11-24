public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rashmika",101);
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s2);
        s1.setName("Rashmika.O");
        System.out.println(s1.getName());
    }
}

class Student {
    private  String name;
    private int rollno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getRollno() {
        return rollno;
    }
    public Student(){
    }
    public Student(String name,int rollno){
        this.name = name;
        this.rollno=rollno;
    }

    public Student(Student s1){
        this.name = s1.name;
        this.rollno= s1.rollno;
    }

    @Override 
    public String toString(){
        return "name :" + name + " " +"rollno :" + rollno;
    }

}