import java.util.Scanner;
class Student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter age:");
        int age=sc.nextInt();
        System.out.println("enter marks:");
        int marks=sc.nextInt();
        System.out.println(name);
        System.out.println(age);
        if(marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}