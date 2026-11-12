import java.util.Scanner;
public class Student {
String USN;
String Name;
String Branch;
String Phone;
public Student(String USN, String Name, String Branch, String Phone) {
this. USN = USN;
this.Name = Name;
this. Branch = Branch;
this. Phone = Phone;
}
public void display() {
System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of students: ");
int N = sc.nextInt();
sc.nextLine();
Student[] students = new Student[N];
for (int i=0; i<N; i++) {
System.out.println("\nEnter details of Student "+(i+1));
System.out.print("Enter USN: ");
String usn = sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();
System.out.print("Enter Branch: ");
String branch = sc.nextLine();
System.out.print("Enter Phone: ");
String phone = sc.nextLine();
students[i] = new Student(usn, name, branch, phone);
}
System.out.println("\nUSN\t\tName\t\tBranch\tPhone");
for (int i=0; i<N; i++) {
students[i].display();
}
}
}