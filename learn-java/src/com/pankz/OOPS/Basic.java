package com.pankz.OOPS;

public class Basic {
    public static void main(String[] args) {
        Student stud=new Student();   //call constructor with 0 values
        Student stud2=new Student(45,"chitwan",78.4f); //call constructor with three values
        Student random=new Student(stud);
        Student random2=new Student();
//        stud.rollno=35;
        System.out.println(stud.rollno);
        System.out.println(stud.marks); //by default value of float
        stud.changeName("Pankz");

        System.out.println(stud2.name);
       stud.greeting();
        System.out.println(random.name);
        System.out.println(random2.marks);

    }
}
//for every single student
//class creation
    class Student
    {
        int rollno;
        String name;
        float marks;
        void greeting()   //creating function within a class
        {
            System.out.println("hello my name is"+" "+this.name);
        }
        void changeName(String newname) //here we can use "name" also
        {
            this.name=newname;
        }
//        Student()     //constructor
//        {
//            this.rollno=14;
//            this.name="pankaj";  //this will be replaced by the ref variable here is stud
//            this.marks=78.9f;
//        }
       Student()    //calling constructor from other constructor
       {
            this(00,"shanky",90.89f);
       }
        Student(int rno,String name,float marks)   //constructor with arguments
                //arguments can be same as  that in class as we're using this
        {
            this.rollno=rno;
            this.name=name;
            this.marks=marks;

        }

        Student(Student other)  //constructor taking values from other constructor
        {
            this.rollno=other.rollno;
            this.name=other.name;     //random.name=stud.name
            this.marks=other.marks;   //random.marks=stud.marks

        }






    }

