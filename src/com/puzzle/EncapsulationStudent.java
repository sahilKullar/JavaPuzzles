package com.puzzle;

class StudentKlass {
     private String name, rollNumber;

     public StudentKlass() {
         this.name = "Unknown";
         this.rollNumber = "N/A";
     }

     public String getName() {
         return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getRollNumber() {
         return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
         this.rollNumber = rollNumber;
    }
}

public class EncapsulationStudent {
    public static void main(String[] args) {
        StudentKlass x = new StudentKlass();
        System.out.println(x.getName());
        x.setName("Samantha");
        String student_name = x.getName();
        System.out.println(student_name);

        System.out.println(x.getRollNumber());
        x.setRollNumber("2211");
        String student_rollnum = x.getRollNumber();
        System.out.println(student_rollnum);
    }
}
