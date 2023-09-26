
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 5.2023
 */
public class StudentManage {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1.Add Student");
            System.out.println("2.Display Student List");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Exit");
            System.out.println("Choose 1-6:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = sc.nextLine();
                    System.out.println("Enter student age:");
                    int age = sc.nextInt();
                    Student student = new Student(name, age);
                    studentList.add(student);
                    System.out.println("Add successfully!");
                    break;
                case 2:
                    System.out.println("Student List:");
                    for (Student s : studentList) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("Enter student name: ");
                    String editName = sc.nextLine();
                    for (Student s : studentList) {
                        if (s.getName().equalsIgnoreCase(editName)) {
                            System.out.println("Enter new name: ");
                            String newName = sc.nextLine();
                            s.setName(newName);
                            System.out.println("OK");
                            break;
                        }
                    }
                case 4:
                    System.out.println("Enter student name");
                    String deleteName = sc.nextLine();
                    for (Student s : studentList) {
                        if(s.getName().equals(deleteName)){
                            studentList.remove(s);
                            System.out.println("OK");
                            break;
                    }
            }
                case 5:
                  System.out.println("Enter student name");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Student s : studentList) {
                        if(s.getName().equals(searchName)){
                            System.out.println("Information of student:");
                            System.out.println(s);
                            found = true;
                            break;
                    }
        }
                    if(!found){
                        System.out.println("Not found");
                    }
                    break;
                case 6:
                    System.out.println("Exit");
                    return;
                default:
                   System.out.println("Enter in range 1-6");        
    }
}
}
}
