import java.util.*;
class student 
{   String name;
    int usn;

    
public void accept(){
    Scanner S = new Scanner(System.in);
    System.out.println("Enter student name : ");
    name = S.nextLine();
    System.out.println("Enter student usn : ");
    usn = S.nextInt();  

	}
public void display(){
    System.out.println("Student name : "+name);
    System.out.println("Student usn :"+usn);

	}

	
	public static void main(String[] args)
	    {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int n = S.nextInt();
		student[] s = new student[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter details of student"+(i+1));
			s[i] = new student();
			s[i].accept();
	  		}
		
		System.out.println("Student details");
		for(int i=0;i<n;i++){
			System.out.println("student"+(i+1));
			s[i].display();
	          }
	     }

	}
		
	