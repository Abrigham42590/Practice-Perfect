import java.util.Scanner;
import java.io.*;

public class MidtermDataCollection {
	public static void main (String[] args) throws IOException {
		
		int choosing = 0;
		menu(choosing);	
		
	}
	
	
@SuppressWarnings("resource")
public static void menu(int choosing) throws IOException {

	int choice = 0;
	int choose, id, courseNUM;
	
	int[] StudentIDS = {1, 2, 3, 4, 5, 6, 7, 8}; 
	
	String[] CourseIDS = {"CS902", "Cs917", "BUS101", "MUS101","CS902"};
	
	String student, qid, qid2, qid3, year, semester, address, city, state, courseN, courseIns, courseID, courseDep;
	Scanner choices = new Scanner(System.in);
	Scanner choices2 = new Scanner(System.in);
	Scanner choices3 = new Scanner(System.in);
	Scanner choices4 = new Scanner(System.in);
	Scanner choices5 = new Scanner(System.in);
	Scanner choices6 = new Scanner(System.in);

		
	
	while (choice != 12) {
		
			
			System.out.print("Welcome to University Enrollment\n");
			
			System.out.print("1. Create Student\n");
			System.out.print("a. Create Row 1 for Student\n");
			System.out.print("b. Create Row 2 for Student\n");
			System.out.print("c. Create Row 3 for Student\n");
			System.out.print("2. Create Course\n");
			System.out.print("a. Create Row 1 for Course\n");
			System.out.print("b. Create Row 2 for Course\n");
			System.out.print("c. Create Row 3 for Course\n");
			System.out.print("d. Create Row 4 for Course\n");
			System.out.print("e. Create Row 5 for Course\n");
			System.out.print("3. Create Enrollment\n");
			System.out.print("a. Create Row 1 for Course\n");
			System.out.print("b. Create Row 2 for Course\n");
			System.out.print("c. Create Row 3 for Course\n");
			System.out.print("d. Create Row 4 for Course\n");
			System.out.print("4. Edit Student\n");
			System.out.print("5. Edit Course\n");
			System.out.print("6. Edit Enrollment\n");
			System.out.print("7. Display Student(s)\n");
			System.out.print("8. Display Course(s)\n");
			System.out.print("9. Display Enrollment(s)\n");
			System.out.print("10. Grades Sub Menu\n");
			System.out.print("0. ---Quit---\n");
			
			
			System.out.print("Please enter a valid choice(1-10,0 to Quit): ");
			choose = choices.nextInt();
			
		    if (choose == 10) {
				submenu(choose);
			}
			
		    else if (choose == 0) {
				break;
			}
		    
		    else if (choose == 1) {
		    	System.out.print("Please enter a valid choice for Student Subsection(Lowercase letters a-c): ");
				qid = choices6.nextLine();
				
				
				if (choose == 1 && qid.equals("a")) {
					FileOutputStream fstream2 = new FileOutputStream("Student2.dat");
					DataOutputStream outputFile2 = new DataOutputStream(fstream2);
					
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile2.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile2.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile2.writeUTF(city);
					
					System.out.print("Please enter student's state: " );
					state = choices5.nextLine();
					outputFile2.writeUTF(state);
					outputFile2.close();
					continue;
					
					
				}
				
				if (choose == 1 && qid.equals("b")) {
					FileOutputStream fstream3 = new FileOutputStream("Student3.dat");
					DataOutputStream outputFile3 = new DataOutputStream(fstream3);
					
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile3.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile3.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile3.writeUTF(city);
					
					System.out.print("Please enter student's state: ");
					state = choices5.nextLine();
					outputFile3.writeUTF(state);
					outputFile3.close();

				}
				
				if (choose == 1 && qid.equals("c")) {
					FileOutputStream fstream4 = new FileOutputStream("Student4.dat");
					DataOutputStream outputFile4 = new DataOutputStream(fstream4);
					
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile4.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile4.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile4.writeUTF(city);
					
					System.out.print("Please enter student's state: ");
					state = choices5.nextLine();
					outputFile4.writeUTF(state);
					outputFile4.close();

				}
		    }
		    
	
				
			else if (choose == 4) {
				System.out.print("Please enter a valid choice for Student Subsection(Lowercase letters a-c): ");
				qid = choices6.nextLine();
				if (choose == 4 && qid.equals("a")) {
					
					FileOutputStream fstream2 = new FileOutputStream("Student2.dat");
					DataOutputStream outputFile2 = new DataOutputStream(fstream2);
					
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile2.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile2.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile2.writeUTF(city);
					
					System.out.print("Please enter student's state: ");
					state = choices5.nextLine();
					outputFile2.writeUTF(state);
					outputFile2.close();
					
					
				}
				
				if (choose == 4 && qid.equals("b")) {
					FileOutputStream fstream3 = new FileOutputStream("Student3.dat");
					DataOutputStream outputFile3 = new DataOutputStream(fstream3);
				
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile3.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile3.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile3.writeUTF(city);
					
					System.out.print("Please enter student's state: ");
					state = choices5.nextLine();
					outputFile3.writeUTF(state);
					outputFile3.close();

				}
				
				
				
				if (choose == 4 && qid.equals("c")) {
					
					
					FileOutputStream fstream4 = new FileOutputStream("Student4.dat");
					DataOutputStream outputFile4 = new DataOutputStream(fstream4);
					
					
					System.out.print("Please enter student names: ");
					student = choices2.nextLine();
					outputFile4.writeUTF(student);
					
					System.out.print("Please enter student addresss: ");
					address = choices3.nextLine();
					outputFile4.writeUTF(address);
					
					System.out.print("Please enter student cities: ");
					city = choices4.nextLine();
					outputFile4.writeUTF(city);
					
					System.out.print("Please enter student's state: ");
					state = choices5.nextLine();
					outputFile4.writeUTF(state);
					
					outputFile4.close();
				
				}
				
				}
					
				
		    
		    
		    else if (choose == 2) {
		    	System.out.print("Please enter a valid choice for Course Subsection(Lowercase letters a-d): ");
				qid2 = choices6.nextLine();
				

				 if (choose == 2 && qid2.equals("a")) {
					
					FileOutputStream fstream2 = new FileOutputStream("Course.dat");
					DataOutputStream outputFile2 = new DataOutputStream(fstream2);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile2.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile2.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile2.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile2.writeInt(courseNUM);
					outputFile2.close();
					
				}
				
				else if (choose == 2 && qid2.equals("b")) {
					FileOutputStream fstream3 = new FileOutputStream("Course2.dat");
					DataOutputStream outputFile3 = new DataOutputStream(fstream3);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile3.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile3.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile3.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile3.writeInt(courseNUM);
					outputFile3.close();
				}
				
				else if (choose == 2 && qid2.equals("c")) {
					FileOutputStream fstream4 = new FileOutputStream("Course3.dat");
					DataOutputStream outputFile4 = new DataOutputStream(fstream4);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile4.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile4.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile4.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile4.writeInt(courseNUM);
					outputFile4.close();
					
				}
				
				else if (choose == 2 && qid2.equals("d") ) {
					FileOutputStream fstream5 = new FileOutputStream("Course4.dat");
					DataOutputStream outputFile5 = new DataOutputStream(fstream5);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile5.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile5.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile5.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile5.writeInt(courseNUM);
					outputFile5.close();
				}
				
				else if (choose == 2 && qid2.equals("e")) {
					FileOutputStream fstream6 = new FileOutputStream("Course5.dat");
					DataOutputStream outputFile6 = new DataOutputStream(fstream6);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile6.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile6.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile6.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile6.writeInt(courseNUM);
					outputFile6.close();
				}
		    }
	
	        else if (choose == 5) {
	        	System.out.print("Please enter a valid choice for Course Subsection(Lowercase letters a-d): ");
				qid2 = choices6.nextLine();
				if (choose == 5 && qid2.equals("a")) {
					
					FileOutputStream fstream2 = new FileOutputStream("Course.dat");
					DataOutputStream outputFile2 = new DataOutputStream(fstream2);

					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile2.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile2.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile2.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile2.writeInt(courseNUM);
					outputFile2.close();
					
				}
				
				else if (choose == 5 && qid2.equals("b")) {
					FileOutputStream fstream3 = new FileOutputStream("Course2.dat");
					DataOutputStream outputFile3 = new DataOutputStream(fstream3);
					
					System.out.print("Please enter course ID: ");
					courseID = choices2.nextLine();
					outputFile3.writeUTF(courseID);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile3.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile3.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile3.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile3.writeInt(courseNUM);
					outputFile3.close();
				}
				
				else if (choose == 5 && qid2.equals("c")) {
					FileOutputStream fstream4 = new FileOutputStream("Course3.dat");
					DataOutputStream outputFile4 = new DataOutputStream(fstream4);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile4.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile4.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile4.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile4.writeInt(courseNUM);
					outputFile4.close();
					
				}
				
				else if (choose == 5 && qid2.equals("d")) {
					FileOutputStream fstream5 = new FileOutputStream("Course4.dat");
					DataOutputStream outputFile5 = new DataOutputStream(fstream5);
					
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile5.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile5.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile5.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile5.writeInt(courseNUM);
					outputFile5.close();
				}
				
				else if (choose == 5 && qid2.equals("e")) {
					FileOutputStream fstream6 = new FileOutputStream("Course5.dat");
					DataOutputStream outputFile6 = new DataOutputStream(fstream6);
				
					System.out.print("Please enter course name: ");
					courseN = choices3.nextLine();
					outputFile6.writeUTF(courseN);
					
					System.out.print("Please enter course instructor: ");
					courseIns = choices4.nextLine();
					outputFile6.writeUTF(courseIns);
					
					System.out.print("Please enter Department: ");
					courseDep = choices5.nextLine();
					outputFile6.writeUTF(courseDep);
					
					System.out.print("Please enter course number: ");
					courseNUM = choices.nextInt();
					outputFile6.writeInt(courseNUM);
					outputFile6.close();
				}
				
		    
			
		    else if (choose == 3) {
				System.out.print("Please enter a valid choice for Enrollment Subsection(Lowercase letters a-d): ");
				qid3 = choices6.nextLine();
				
				
		         if (choose == 3 && qid3.equals("a")) {
						
			            System.out.print("Please enter a valid student ID (1-3): ");
			            id = choices.nextInt();
			            
			            if (id > 3 || id <= 0) {
			            	while (id != 1 || id != 2 || id != 3) {
			            		System.out.print("Error: Please enter a valid ID (1-3): ");
				            	id = choices.nextInt();
			            	}
			            }
			            
			            System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
			            courseID = choices.nextLine();
			            
			
						FileOutputStream fstream = new FileOutputStream("Enrollment.dat");
						DataOutputStream OutputFile = new DataOutputStream(fstream);
						
						System.out.print("Please enter year: ");
						year = choices3.nextLine();
						OutputFile.writeUTF(year);
						
						System.out.print("Please enter Semester: ");
						semester = choices4.nextLine();
						OutputFile.writeUTF(semester);
						OutputFile.close();
						
					}
					
				else if (choose == 3 && qid3.equals("b")) {
						
					
					  System.out.print("Please enter a valid student ID (1-3): ");
			            id = choices.nextInt();
			            
			            if (id > 3 || id <= 0) {
			            	while (id != 1 || id != 2 || id != 3) {
			            		System.out.print("Error: Please enter a valid ID (1-3): ");
				            	id = choices.nextInt();
			            	}
			            }
			            
			            System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
			            courseID = choices.nextLine();
					
						FileOutputStream fstream2 = new FileOutputStream("Enrollment2.dat");
						DataOutputStream OutputFile2 = new DataOutputStream(fstream2);
						
						System.out.print("Please enter year: ");
						year = choices3.nextLine();
						OutputFile2.writeUTF(year);
						
						System.out.print("Please enter Semester: ");
						semester = choices4.nextLine();
						OutputFile2.writeUTF(semester);
						OutputFile2.close();
						
					}
					
				else if (choose == 3 && qid3.equals("c")) {
					

					  System.out.print("Please enter a valid student ID (1-3): ");
			            id = choices.nextInt();
			            
			            if (id > 3 || id <= 0) {
			            	while (id != 1 || id != 2 || id != 3) {
			            		System.out.print("Error: Please enter a valid ID (1-3): ");
				            	id = choices.nextInt();
			            	}
			            }
			            
			            System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
			            courseID = choices.nextLine();
					
					FileOutputStream fstream3 = new FileOutputStream("Enrollment3.dat");
					DataOutputStream OutputFile3 = new DataOutputStream(fstream3);
					
					System.out.print("Please enter year: ");
					year = choices3.nextLine();
					OutputFile3.writeUTF(year);
					
					System.out.print("Please enter Semester: ");
					semester = choices4.nextLine();
					OutputFile3.writeUTF(semester);
					OutputFile3.close();
					
				}
					
				else if (choose == 3 && qid3.equals("d")) {
					

					  System.out.print("Please enter a valid student ID (1-3): ");
			            id = choices.nextInt();
			            
			            if (id > 3 || id <= 0) {
			            	while (id != 1 || id != 2 || id != 3) {
			            		System.out.print("Error: Please enter a valid ID (1-3): ");
				            	id = choices.nextInt();
			            	}
			            }
			            
			            System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
			            courseID = choices.nextLine();
					
					
					FileOutputStream fstream4 = new FileOutputStream("Enrollment4.dat");
					DataOutputStream OutputFile4 = new DataOutputStream(fstream4);

					
					System.out.print("Please enter year: ");
					year = choices3.nextLine();
					OutputFile4.writeUTF(year);
					
					System.out.print("Please enter Semester: ");
					semester = choices4.nextLine();
					OutputFile4.writeUTF(semester);
					OutputFile4.close();
				}
		    }
	        }

			else if (choose == 6) {
				
				System.out.print("Please enter a valid choice for Enrollment Subsection(Lowercase letters a-d): ");
				qid3 = choices6.nextLine();
				
				if (choose == 6 && qid3.equals("a")) {
				
					
					  System.out.print("Please enter a valid student ID (1-3): ");
			            id = choices.nextInt();
			            
			            if (id > 3 || id <= 0) {
			            	while (id != 1 || id != 2 || id != 3) {
			            		System.out.print("Error: Please enter a valid ID (1-3): ");
				            	id = choices.nextInt();
			            	}
			            }
			            
			            System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
			            courseID = choices.nextLine();
					
					
					FileOutputStream fstream = new FileOutputStream("Enrollment.dat");
					DataOutputStream OutputFile = new DataOutputStream(fstream);

					
					System.out.print("Please enter year: ");
					year = choices3.nextLine();
					OutputFile.writeUTF(year);
					
					System.out.print("Please enter Semester: ");
					semester = choices4.nextLine();
					OutputFile.writeUTF(semester);
					OutputFile.close();
					
				}
				
			else if (choose == 6 && qid3.equals("b")) {
					

				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = choices.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = choices.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseID = choices.nextLine();
				
				    FileOutputStream fstream2 = new FileOutputStream("Enrollment2.dat");
					DataOutputStream OutputFile2 = new DataOutputStream(fstream2);
					
					System.out.print("Please enter year: ");
					year = choices3.nextLine();
					OutputFile2.writeUTF(year);
					
					System.out.print("Please enter Semester: ");
					semester = choices4.nextLine();
					OutputFile2.writeUTF(semester);
					OutputFile2.close();
					
				}
				
			else if (choose == 6 && qid3.equals("c")) {
				

				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = choices.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = choices.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseID = choices.nextLine();
				
				FileOutputStream fstream3 = new FileOutputStream("Enrollment3.dat");
				DataOutputStream OutputFile3 = new DataOutputStream(fstream3);
				
				System.out.print("Please enter year: ");
				year = choices3.nextLine();
				OutputFile3.writeUTF(year);
				
				System.out.print("Please enter Semester: ");
				semester = choices4.nextLine();
				OutputFile3.writeUTF(semester);
				OutputFile3.close();
				
			}
				
			else if (choose == 6 && qid3.equals("d")) {
				

				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = choices.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = choices.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseID = choices.nextLine();
				
				
				FileOutputStream fstream4 = new FileOutputStream("Enrollment4.dat");
				DataOutputStream OutputFile4 = new DataOutputStream(fstream4);
				
				System.out.print("Please enter year: ");
				year = choices3.nextLine();
				OutputFile4.writeUTF(year);
				
				System.out.print("Please enter Semester: ");
				semester = choices4.nextLine();
				OutputFile4.writeUTF(semester);
				OutputFile4.close();
			}
		    }
	
			
	else if (choose == 7) {
		        System.out.print("\nstid " + " name" + "   address" + "      city" + "      state\n");
		        
		        System.out.print(StudentIDS[0] + "     ");
		
		        FileInputStream fstream2 = new FileInputStream("Student2.dat");
				DataInputStream inputFile2 = new DataInputStream(fstream2);
				
				
				student = inputFile2.readUTF();
				System.out.print(student + "     ");
				
				address = inputFile2.readUTF();
				System.out.print(address + "   ");
				
				city = inputFile2.readUTF();
				System.out.print(city + "  ");
				
				state = inputFile2.readUTF();
				System.out.print(state + "   ");
				inputFile2.close();
				
				System.out.print("\n");
				
				System.out.print(StudentIDS[1] + "    ");
				
				FileInputStream fstream3 = new FileInputStream("Student3.dat");
				DataInputStream inputFile3 = new DataInputStream(fstream3);
				
				
				student = inputFile3.readUTF();
				System.out.print(student + "     ");
				
				address = inputFile3.readUTF();
				System.out.print(address + "   ");
				
				city = inputFile3.readUTF();
				System.out.print(city + "  ");
				
				state = inputFile3.readUTF();
				System.out.print(state + "  \n");
				
				inputFile3.close();
				System.out.print("\n");
				
				System.out.print(StudentIDS[2] + "    ");

				FileInputStream fstream4 = new FileInputStream("Student4.dat");
				DataInputStream inputFile4 = new DataInputStream(fstream4);
				
				
				student = inputFile4.readUTF();
				System.out.print(student + "     ");
				
				address = inputFile4.readUTF();
				System.out.print(address + "   ");
				
				city = inputFile4.readUTF();
				System.out.print(city + "  ");
				
				state = inputFile4.readUTF();
				System.out.print(state + "   ");
				
				inputFile4.close();
				System.out.print("\n");
					
				
			}
			
			else if(choose == 8) {
				
				System.out.print("\nCID " + "   Cname" + "     intsr" + "      Department" + "        CNUM\n");
				
				System.out.print(CourseIDS[0] + "    ");
				
				FileInputStream fstream2 = new FileInputStream("Course.dat");
				DataInputStream inputFile2 = new DataInputStream(fstream2);
				
				courseN = inputFile2.readUTF();
				System.out.print(courseN + "     ");
				
				courseIns = inputFile2.readUTF();
				System.out.print(courseIns + "   ");
				
				courseDep = inputFile2.readUTF();
				System.out.print(courseDep + "   ");
				
				courseNUM = inputFile2.readInt();
				System.out.print(courseNUM + "   ");
				inputFile2.close();
				System.out.print("\n");
				
				
				System.out.print(CourseIDS[1] + "    ");
				
				FileInputStream fstream3 = new FileInputStream("Course2.dat");
				DataInputStream inputFile3 = new DataInputStream(fstream3);
				
				courseN = inputFile3.readUTF();
				System.out.print(courseN + "     ");
				
				courseIns = inputFile3.readUTF();
				System.out.print(courseIns + "   ");
				
				courseDep = inputFile3.readUTF();
				System.out.print(courseDep + "   ");
				
				courseNUM = inputFile3.readInt();
				System.out.print(courseNUM + "   ");
				inputFile3.close();
				System.out.print("\n");
				
				System.out.print(CourseIDS[2] + "    ");
				
				FileInputStream fstream4 = new FileInputStream("Course3.dat");
				DataInputStream inputFile4 = new DataInputStream(fstream4);
				
				courseN = inputFile4.readUTF();
				System.out.print(courseN + "     ");
				
				courseIns = inputFile4.readUTF();
				System.out.print(courseIns + "   ");
				
				courseDep = inputFile4.readUTF();
				System.out.print(courseDep + "   ");
				
				courseNUM = inputFile4.readInt();
				System.out.print(courseNUM + "   ");
				inputFile4.close();
				System.out.print("\n");
				
				System.out.print(CourseIDS[3] + "    ");
				
				FileInputStream fstream5 = new FileInputStream("Course4.dat");
				DataInputStream inputFile5 = new DataInputStream(fstream5);
				
				courseN = inputFile5.readUTF();
				System.out.print(courseN + "     ");
				
				courseIns = inputFile5.readUTF();
				System.out.print(courseIns + "   ");
				
				courseDep = inputFile5.readUTF();
				System.out.print(courseDep + "   ");
				
				courseNUM = inputFile5.readInt();
				System.out.print(courseNUM + "   ");
				inputFile5.close();
				System.out.print("\n");
				
				
				System.out.print(CourseIDS[4] + "    ");
				
				FileInputStream fstream6 = new FileInputStream("Course5.dat");
				DataInputStream inputFile6 = new DataInputStream(fstream6);
				
				
				courseN = inputFile6.readUTF();
				System.out.print(courseN + "     ");
				
				courseIns = inputFile6.readUTF();
				System.out.print(courseIns + "   ");
				
				courseDep = inputFile6.readUTF();
				System.out.print(courseDep + "   ");
				
				courseNUM = inputFile6.readInt();
				System.out.print(courseNUM + "   ");
				inputFile6.close();
				System.out.print("\n");
			}
			
			else if (choose == 9) {
				
				System.out.print("\nstid " + "   Cid" + "     Year" + "      Semester" + "        Grade\n");
				
			    System.out.print(StudentIDS[0] + "    ");
			    System.out.print(CourseIDS[0] + "     ");
				
				FileInputStream fstream = new FileInputStream("Erollment.dat");
				DataInputStream inputFile = new DataInputStream(fstream);
		
		
				
				year = inputFile.readUTF();
				System.out.print(year + "   ");
				
				semester = inputFile.readUTF();
				System.out.print(semester + "   ");
				
				inputFile.close();
				System.out.print("\n");
				
			    System.out.print(StudentIDS[1] + "    ");
				System.out.print(CourseIDS[1] + "    ");
				
				FileInputStream fstream2 = new FileInputStream("Enrollment2.dat");
				DataInputStream inputFile2 = new DataInputStream(fstream2);
				
				
				year = inputFile2.readUTF();
				System.out.print(year + "   ");
				
				semester = inputFile2.readUTF();
				System.out.print(semester + "   ");
				
				inputFile2.close();
				System.out.print("\n");
				
				System.out.print(StudentIDS[2] + "    ");
				System.out.print(CourseIDS[2] + "    ");
				
				FileInputStream fstream3 = new FileInputStream("Enrollment3.dat");
				DataInputStream inputFile3 = new DataInputStream(fstream3);
				
				
				year = inputFile3.readUTF();
				System.out.print(year + "   ");
				
				semester = inputFile3.readUTF();
				System.out.print(semester + "   ");
				
				inputFile3.close();
				System.out.print("\n");
				
				System.out.print(StudentIDS[3] + "    ");
				System.out.print(CourseIDS[3] + "     ");
				
				FileInputStream fstream4 = new FileInputStream("Enrollment4.dat");
				DataInputStream inputFile4 = new DataInputStream(fstream4);
				
				year = inputFile4.readUTF();
				System.out.print(year + "   ");
				
				semester = inputFile4.readUTF();
				System.out.print(semester + "   ");
				
				inputFile4.close();
				System.out.print("\n");
				
			}
	        }
	}
	
			
		


public static void submenu(int choose) throws IOException {
	System.out.print("Grades Sub Menu:\n");
	System.out.print("\n");
	
     int[] StudentIDS = {1, 2, 3, 4, 5, 6, 7, 8}; 
	
	String[] CourseIDS = {"CS902", "Cs917", "BUS101", "MUS101","CS902"};
	
	int choice = 0;
	int choosing, id;
	@SuppressWarnings("unused")
	String semester, Grade, row, year2, courseids;
	
	@SuppressWarnings("resource")
	Scanner words1 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words2 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words3 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words4 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words5 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words6 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words7 = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner words8 = new Scanner(System.in);
	while (choice != 12) {
		
		System.out.print("Grades Menu\n");
		System.out.print("1. Add Grades\n");
		System.out.print("a. Add Grades for Row 1\n");
		System.out.print("b. Add Grades for Row 2\n");
		System.out.print("c. Add Grades for Row 3\n");
		System.out.print("d. Add Grades for Row 4\n");
		System.out.print("2. View Grades by Student\n");
		System.out.print("3. View Grades by Course\n");
		System.out.print("4. Edit Grades by Student\n");
		System.out.print("5. Edit Grades by Course\n");
		System.out.print("0 -- Exit to Menu --\n");
		
		System.out.print("Please enter a valid choice(1-5, 0 to Exit): ");
		choosing = words1.nextInt();
		
		if (choosing == 0) {
			menu(choosing);
		}
		
		else if (choosing == 1) {
			System.out.print("Please enter a valid choice for Grades Subsection(a-c)");
			row = words2.nextLine();
			if (choosing == 1 && row.equals("a")) {
				
				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = words3.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = words4.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseids = words5.nextLine();
				
		           FileOutputStream fstream1 = new FileOutputStream("GradeManagement.dat");
				   DataOutputStream outputFile1 = new DataOutputStream(fstream1);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile1.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile1.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile1.writeUTF(Grade);
				    outputFile1.close();
				
			}
			else if (choosing == 1 && row.equals("b")) {
				
				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = words3.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = words4.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseids = words5.nextLine();
				
		           FileOutputStream fstream2 = new FileOutputStream("GradeManagement2.dat");
				   DataOutputStream outputFile2 = new DataOutputStream(fstream2);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile2.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile2.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile2.writeUTF(Grade);
				    outputFile2.close();
				
			}
			else if (choosing == 1 && row.equals("c")) {
				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = words3.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = words4.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseids = words5.nextLine();
		          
				
		           FileOutputStream fstream3 = new FileOutputStream("GradeManagement3.dat");
				   DataOutputStream outputFile3 = new DataOutputStream(fstream3);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile3.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile3.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile3.writeUTF(Grade);
				    outputFile3.close();
			}
			
			else if (choosing == 1 && row.equals("d")) {
				  System.out.print("Please enter a valid student ID (1-3): ");
		          id = words3.nextInt();
		          
		          if (id > 3 || id <= 0) {
		          	while (id != 1 || id != 2 || id != 3) {
		          		System.out.print("Error: Please enter a valid ID (1-3): ");
			            	id = words4.nextInt();
		          	}
		          }
		          
		          System.out.print("Please enter a valid course ID (CS902, CS917, BUS101, MUS101, CS902): ");
		          courseids = words5.nextLine();
				
		           FileOutputStream fstream3 = new FileOutputStream("GradeManagement3.dat");
				   DataOutputStream outputFile3 = new DataOutputStream(fstream3);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile3.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile3.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile3.writeUTF(Grade);
				    outputFile3.close();
			}
		}
	
		
     else if (choosing == 2) {
    	 
    	 System.out.print("\nstid " + "     Year" + "      Semester" + "        Grade\n");
    	 
    	    System.out.print(StudentIDS[0] + "     ");
			
    	 
    	    FileInputStream fstream1 = new FileInputStream("GradeManagement.dat");
			DataInputStream inputFile1 = new DataInputStream(fstream1);
			

			year2 = inputFile1.readUTF();
			System.out.print(year2 + "             ");
			
			semester = inputFile1.readUTF();
			System.out.print(semester + "              ");
			
			Grade = inputFile1.readUTF();
			System.out.print(Grade + "                        \n");
			
			inputFile1.close();
    	    System.out.print("\n");
    	    
    	    System.out.print(StudentIDS[1] + "     ");
			
    	    
    	    FileInputStream fstream2 = new FileInputStream("GradeManagement2.dat");
    	 	DataInputStream inputFile2 = new DataInputStream(fstream2);
    	 			

    	 	year2 = inputFile2.readUTF();
    	 	System.out.print(year2 + "             ");
    	 			
    	 	semester = inputFile2.readUTF();
    	 	System.out.print(semester + "              ");
    	 			
    	 	Grade = inputFile2.readUTF();
    	 	System.out.print(Grade + "                        \n");
    	 			
    	 	inputFile2.close();
    	    System.out.print("\n");
    	    
    	    
           System.out.print(StudentIDS[2] + "     ");
			
    	    
    	    FileInputStream fstream3 = new FileInputStream("GradeManagement3.dat");
    	 	DataInputStream inputFile3 = new DataInputStream(fstream3);
    	 			

    	 	year2 = inputFile3.readUTF();
    	 	System.out.print(year2 + "             ");
    	 			
    	 	semester = inputFile3.readUTF();
    	 	System.out.print(semester + "              ");
    	 			
    	 	Grade = inputFile3.readUTF();
    	 	System.out.print(Grade + "                        \n");
    	 			
    	 	inputFile3.close();
    	    System.out.print("\n");
    	     	 
    	     	 
    	 
     }
		
     else if (choosing == 3) {
    	 
    	 System.out.print("\nCID " + "     Year" + "      Semester" + "        Grade\n");
    	 
 	    System.out.print(CourseIDS[0] + "     ");
			
 	 
 	       FileInputStream fstream1 = new FileInputStream("GradeManagement.dat");
			DataInputStream inputFile1 = new DataInputStream(fstream1);
			

			year2 = inputFile1.readUTF();
			System.out.print(year2 + "             ");
			
			semester = inputFile1.readUTF();
			System.out.print(semester + "              ");
			
			Grade = inputFile1.readUTF();
			System.out.print(Grade + "                        \n");
			
			inputFile1.close();
 	        System.out.print("\n");
 	    
 	        
 	       System.out.print(CourseIDS[1] + "     ");
			
 	  	 
 	       FileInputStream fstream2 = new FileInputStream("GradeManagement2.dat");
			DataInputStream inputFile2 = new DataInputStream(fstream2);
			

			year2 = inputFile2.readUTF();
			System.out.print(year2 + "             ");
			
			semester = inputFile2.readUTF();
			System.out.print(semester + "              ");
			
			Grade = inputFile2.readUTF();
			System.out.print(Grade + "                        \n");
			
			inputFile2.close();
 	        System.out.print("\n");
 	        
 	       System.out.print(CourseIDS[2] + "     ");
			
 	  	 
 	       FileInputStream fstream3 = new FileInputStream("GradeManagement3.dat");
			DataInputStream inputFile3 = new DataInputStream(fstream3);
			

			year2 = inputFile3.readUTF();
			System.out.print(year2 + "             ");
			
			semester = inputFile3.readUTF();
			System.out.print(semester + "              ");
			
			Grade = inputFile3.readUTF();
			System.out.print(Grade + "                        \n");
			
			inputFile3.close();
 	        System.out.print("\n");  
    	 
     }
		
     else if (choosing == 4) {
    	 System.out.print("Please enter a valid choice for Grades Subsection(a-c)");
			row = words2.nextLine();
			if (choosing == 4 && row.equals("a")) {

		           FileOutputStream fstream1 = new FileOutputStream("GradeManagement.dat");
				   DataOutputStream outputFile1 = new DataOutputStream(fstream1);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile1.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile1.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile1.writeUTF(Grade);
				    outputFile1.close();
				
			}
			else if (choosing == 4 && row.equals("b")) {
		          
				
		           FileOutputStream fstream2 = new FileOutputStream("GradeManagement2.dat");
				   DataOutputStream outputFile2 = new DataOutputStream(fstream2);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile2.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile2.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile2.writeUTF(Grade);
				    outputFile2.close();
				
			}
			else if (choosing == 4 && row.equals("c")) {
		          
				
		           FileOutputStream fstream3 = new FileOutputStream("GradeManagement3.dat");
				   DataOutputStream outputFile3 = new DataOutputStream(fstream3);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile3.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile3.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile3.writeUTF(Grade);
				    outputFile3.close();
			}
			
			else if (choosing == 4 && row.equals("d")) {
		          
				
		           FileOutputStream fstream3 = new FileOutputStream("GradeManagement3.dat");
				   DataOutputStream outputFile3 = new DataOutputStream(fstream3);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile3.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile3.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile3.writeUTF(Grade);
				    outputFile3.close();
			}
			
			else if(choosing == 5) {
				 System.out.print("Please enter a valid choice for Grades Subsection(a-c)");
				 row = words2.nextLine();
				
				if (choosing == 5 && row.equals("a")) {
				
		          FileOutputStream fstream1 = new FileOutputStream("GradeManagement.dat");
				   DataOutputStream outputFile1 = new DataOutputStream(fstream1);
				
				
					System.out.print("Please enter year: ");
					year2 = words6.nextLine();
					outputFile1.writeUTF(year2);
					
					System.out.print("Please enter Semester: ");
					semester = words7.nextLine();
					outputFile1.writeUTF(semester);
				
				    System.out.print("Please enter Grade: ");
				    Grade = words8.nextLine();
				    outputFile1.writeUTF(Grade);
				    outputFile1.close();
				}
				    
				    else if (choosing == 5 && row.equals("b")) {
				    	
			          FileOutputStream fstream1 = new FileOutputStream("GradeManagement.dat");
					  DataOutputStream outputFile1 = new DataOutputStream(fstream1);
					
					
						System.out.print("Please enter year: ");
						year2 = words6.nextLine();
						outputFile1.writeUTF(year2);
						
						System.out.print("Please enter Semester: ");
						semester = words7.nextLine();
						outputFile1.writeUTF(semester);
					
					    System.out.print("Please enter Grade: ");
					    Grade = words8.nextLine();
					    outputFile1.writeUTF(Grade);
					    outputFile1.close();
				    	
				    }
				
				    else if (choosing == 5 && row.equals("c")) {
						
				          FileOutputStream fstream2 = new FileOutputStream("GradeManagement2.dat");
						  DataOutputStream outputFile2 = new DataOutputStream(fstream2);
						
						
							System.out.print("Please enter year: ");
							year2 = words6.nextLine();
							outputFile2.writeUTF(year2);
							
							System.out.print("Please enter Semester: ");
							semester = words7.nextLine();
							outputFile2.writeUTF(semester);
						
						    System.out.print("Please enter Grade: ");
						    Grade = words8.nextLine();
						    outputFile2.writeUTF(Grade);
						    outputFile2.close();
				    }
				
				    else if (choosing == 5 && row.equals("d")) {
						
				          FileOutputStream fstream3 = new FileOutputStream("GradeManagement3.dat");
						  DataOutputStream outputFile3 = new DataOutputStream(fstream3);
						
						
							System.out.print("Please enter year: ");
							year2 = words6.nextLine();
							outputFile3.writeUTF(year2);
							
							System.out.print("Please enter Semester: ");
							semester = words7.nextLine();
							outputFile3.writeUTF(semester);
						
						    System.out.print("Please enter Grade: ");
						    Grade = words8.nextLine();
						    outputFile3.writeUTF(Grade);
						    outputFile3.close();
				    }
		}
    	 
     }
		
		
		
		
	}

	
	
	
}
	
}
