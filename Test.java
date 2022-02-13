package hw;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static int total=0;

    public static ArrayList<String> fname;
    public static ArrayList<String> lname;
    public static ArrayList<String> dob;
    public static ArrayList<String> gender;
    public static ArrayList<Integer> standard;
    public static ArrayList<Integer> rollno;
    public static ArrayList<Float> maths;
    public static ArrayList<Float> science;
    public static ArrayList<Float> social;
    public static ArrayList<Float> english;
    public static ArrayList<Float> percentage ;

    public static void entry() {

        int num;

        Scanner sc=new Scanner(System.in);
        fname= new ArrayList<>();
        lname= new ArrayList<>();
        dob= new ArrayList<>();
        gender= new ArrayList<>();
        standard= new ArrayList<>();
        rollno= new ArrayList<>();
        maths =new ArrayList<>();
        science = new ArrayList<>();
        social = new ArrayList<>();
        english = new ArrayList<>();
        percentage = new ArrayList<>();

        System.out.print("Enter the number of students you want to enter: ");
        num = sc.nextInt();
        if(num==0 || num<0){
            System.out.println("Invalid Entry!!!!");
        }
        else {
            for (int i = 0; i < num; i++) {
                System.out.println();
                System.out.println("Student: " +(i+1));
                System.out.print("Enter the standard: ");
                standard.add(sc.nextInt());
                System.out.print("Enter the first name: ");
                fname.add(sc.next());
                System.out.print("Enter the last name: ");
                lname.add(sc.next());
                System.out.print("Enter the roll no: ");
                rollno.add(sc.nextInt());
                System.out.print("Enter the date of birth: ");
                dob.add(sc.next());
                System.out.print("Enter the gender: ");
                gender.add(sc.next());
                System.out.print("Enter the marks in Maths: ");
                maths.add(sc.nextFloat());
                System.out.print("Enter the marks in Science: ");
                science.add(sc.nextFloat());
                System.out.print("Enter the marks in Social: ");
                social.add(sc.nextFloat());
                System.out.print("Enter the marks in English: ");
                english.add(sc.nextFloat());
                percentage.add((maths.get(i)+ science.get(i)+ social.get(i)+ english.get(i))/4);
            }
            total=total+num;

        }


    }
    public static void display(){
        if(total==0){
            System.out.println("No data has been entered.");
        }
        else{
            System.out.println();
            System.out.println("Student Details");
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (int i=0;i<total;i++){
                System.out.println();
                System.out.println("Student: " +(i+1));
                System.out.println("Name: " +fname.get(i)+" "+lname.get(i));
                System.out.println("Standard: "+standard.get(i));
                System.out.println("Roll no: " +rollno.get(i));
                System.out.println("Date of birth: " +dob.get(i));
                System.out.println("Gender: " +gender.get(i));
                System.out.println("Percentage: " +percentage.get(i)+"%");
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }
    public static void search(){
        int roll;
        Scanner sc= new Scanner(System.in);
        if(total==0){
            System.out.println("No data has been entered.");
        }
        else{
            System.out.println();
            System.out.print("Enter the roll no of the student to search: ");
            roll = sc.nextInt();
            int s=0;

            for(int i=0;i<total;i++){
                if(roll==rollno.get(i)){
                    s=s+1;
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Name: " +fname.get(i)+" "+lname.get(i));
                    System.out.println("Standard: "+standard.get(i));
                    System.out.println("Roll no: " +rollno.get(i));
                    System.out.println("Maths: "+maths.get(i));
                    System.out.println("Science: "+science.get(i));
                    System.out.println("Social: "+social.get(i));
                    System.out.println("English: "+english.get(i));
                    System.out.println("Percentage: " +percentage.get(i));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                }

            }
            if(s<0) {
                System.out.println("Invalid entry. ");
            }
        }

    }
    public static void sort(){
        if(total==0){
            System.out.println("No data has been entered.");
        }
        else{
            System.out.println();
            int a= percentage.size();
            Collections.sort(percentage);

            System.out.println("Result : ");

            for (int i=0;i<a;i++){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Rank: " +(i+1));
                System.out.println();
                System.out.println("Percentage: "+percentage.get(i));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
            }

        }
    }





    public static void delete(){
        int r;
        Scanner sc= new Scanner(System.in);
        if(total==0){
            System.out.println("No data has been entered.");
        }
        else{
            int choice;
            System.out.println("Enter 1 to delete all record:");
            System.out.println("Enter 2 to delete the record of a student:");
            choice= sc.nextInt();
            if(choice==1){
                total=0;
                System.out.println("All the records have been deleted.");

            }
            else if(choice==2){
                System.out.print("Enter the roll no of the student you want delete the record of: ");
                r= sc.nextInt();

                for(int i=0;i<total;i++){
                    if(r==rollno.get(i)){

                            standard.remove(i);
                            fname.remove(i);
                            lname.remove(i);
                            rollno.remove(i);
                            dob.remove(i);
                            gender.remove(i);
                            percentage.remove(i);

                        total=total-1;
                        System.out.println("Your Required Record is Deleted.");

                    }
                }

            }
            else {
                System.out.println("Invalid input!!!.");
            }

        }

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        char ch;
        do {
            System.out.println("Enter 1 to enter data.");
            System.out.println("Enter 2 to show data.");
            System.out.println("Enter 3 to search data.");
            System.out.println("Enter 4 to view the result in descending order: ");
            System.out.println("Enter 5 to delete data.");
            System.out.println("Enter 6 to exit.");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    entry();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    sort();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!!!!");
                    break;
            }
            System.out.print("Do you want to continue(y/n): ");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}
