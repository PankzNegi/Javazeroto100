package com.pankz.Revision.OOPSrev;

public class Student {
    int rno;
    String name;
    float marks = 90.6f;
    void greeting()
    {
        System.out.println("hello my name is" + this.name);
    }

//    public Student() {
//        this.rno = 12;
//        this.name = "karan";
//        this.marks = 56.3f;
//
//
//    }
    public Student()
    {
        this(34,"default",89.9f);
    }
    public Student(Student other)
    {
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}