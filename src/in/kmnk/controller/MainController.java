package in.kmnk.controller;

import java.util.Scanner;

import in.kmnk.dto.Student;

public class MainController {
	 Student[]  studentStore = new Student[5];
	 int count=0;
	
	 //change name by id
	public void changeName(int id, String newName) {
		for(Student st:studentStore) {
			if(st!=null) {
				if(st.getSid()==id) {
					System.out.println("Before update name");
					System.out.println(st);
					st.setSnmae(newName);
					System.out.println("After update name");
					System.out.println(st);
				}
			}
		}
	}
	
//	1)add studuent
	public void addStudent(Student student) {
		if(student!=null) {
			studentStore[count]=student;
			System.out.println("Student Added Successfully");
			count++;
		}
	}
	
//	2)find student by id
	public Student getStudentById(int id) {	
		for(Student st:studentStore) {
			if(st!=null) {
				if(st.getSid()==id) {
					return st;
				}
			}
		}
		return null;
	}	
	
	public static void main(String[] args) {
		
		MainController mainController = new MainController();
		Scanner sc = new Scanner(System.in);
//		Student student = new Student();
		
		int option=0;
		while(option !=4) {
			System.out.println("1)add studuent\n"
					+ "2)find student by id\n"
					+ "3)Change name by id\n"
					+ "4)Exit");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("Enter Student id");
				int sid = sc.nextInt();
				System.out.println("Enter Student Name");
				String sname = sc.next();
				System.out.println("Enter Student Roll number");
				int srollno = sc.nextInt();
				
				Student student = new Student();
				student.setSid(sid);
				student.setSnmae(sname);
				student.setRollno(srollno);
				mainController.addStudent(student);
				break;
				
			case 2:
				System.out.println("Enter Student id");
				sid = sc.nextInt();
				Student studentFound = mainController.getStudentById(sid);	
				
				if(studentFound!=null) {
					System.out.println(studentFound);
				}else {
					System.out.println("Student not found with the given id");
				}
				break;
				
			case 3:
				boolean flag=true;
				while(flag) {
					System.out.println("Enter student id which student name you want to update");
					sid = sc.nextInt();
					
					Student studentById = mainController.getStudentById(sid);
					if(studentById!=null) {
						System.out.println("Enter new name for the given student id");
						sname = sc.next();	
						mainController.changeName(sid, sname);	
						flag=false;
					}else {
						System.out.println("Student not found with the given id to change name");
					}
				}
				break;
			}
		}		
		System.out.println("Thank you");		
	}

}
