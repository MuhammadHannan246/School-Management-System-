package GroupPro;

// Java Import Package.
import java.util.*;

// Public Main Class Of The School Management System.
public class Project {
//  Public Main Method Of The School Management System.
	public static void main(String[] args) {

		// Scanner dh = new Scanner(System.in); Is Used To Take Input From User
		Scanner dh = new Scanner(System.in);

// Here double result; we declared for the result of admission test in case 'a' of our School Management System
		double result;
//Here int c = 0; we declared for the sum of correct answers of new student in admission test in case 'a' of our School Management System
		int c = 0;
		System.out.println("\n\t\t <<<<< WELCOME TO ORIENTED SMART SCHOOL >>>>> ");
		System.out.println("\t\t ____________________________________________ \n");
		System.out.println("\t\t <<<<< ORIENTED SMART SCHOOL MANAGEMENT SYSTEM >>>>> ");
		System.out.println("\t\t ____________________________________________ \n");
// Switch Cases are defined here
		System.out.println("\t *) PRESS 'a' FOR NEW ADMISSION & ADMISSION TEST. \n");
		System.out.println("\t *) PRESS 'b' FOR ACADEMIC INFORMATION. \n");
		System.out.println("\t *) PRESS 'c' FOR EXAMINATION INFORMATION. \n");
		System.out.println("\t *) PRESS 'd' FOR GRADING SYSTEM. \n");
		System.out.println("\t *) PRESS 'e' FOR TIMETABLE MANAGEMENT. \n");
		System.out.println("\t *) PRESS 'f' FOR COMMUNICATION WITH STUDENTS. \n");
		System.out.println("\t *) PRESS 'g' FOR PROFILE MANAGEMENT. \n");
		System.out.println("\t *) PRESS 'h' FOR HOMEWORK & ASSIGNMENT. \n");
		System.out.println("\t *) PRESS 'i' FOR FEES SECTION. \n");
		System.out.println("\t *) PRESS 'j' FOR HR & PAYROLL MANAGEMENT. \n");
		System.out.println("\t *) PRESS 'k' FOR ATTENDENCE RECORD OF TEACHERS & STUDENTS. \n");

// Taking Input Here To Enter In Any Case Of Switch Of Your Choice
		char d = dh.next().charAt(0);

		System.out.println("\t\t ____________________________________________ \n");
		switch (d) {

// Case 'a' New Admission & Admission Test
		case 'a':

			System.out.println("\t\t \" WELCOME TO ADMISSION PROCESS SECTION \"");
			System.out.println("\t\t ____________________________________________ \n");
			// New Admission Name Input From User
			System.out.print(" Enter Your Name: ");
			String name = dh.next();
//New Admission Father's Name Input From User
			System.out.print(" Enter Your Father's Name: ");
			String fname = dh.next();
//New Admission Address Input From User
			System.out.print(" Enter Your Resisdential Address: ");
			String add = dh.next();
//New Admission Contact No Input From User
			System.out.print(" Enter Your Contact No: ");
			long cno = dh.nextLong();
//New Admission Email Input From User
			System.out.print(" Enter Your Email Address: ");
			String email = dh.next();
//New Admission Date Of Birth Input From User
			System.out.print(" Enter Your Date Of Birth: ");
			int day = dh.nextInt();
//New Admission Month Of Birth Input From User
			System.out.print(" Enter Your Month Of Birth: ");
			int month = dh.nextInt();
//New Admission Year Of Birth Input From User
			System.out.print(" Enter Your Year Of Birth: ");
			int year = dh.nextInt();

			System.out.println("\t x-------x-------x-------x-------x \n");

//Here we make an object of NewAdmission class & Pass The Parameters of it's constructor
			NewAdmission pinfo = new NewAdmission(name, fname, add, cno, email, day, month, year);

// Here we call the method of NewAddInfo. 
			pinfo.NewAddInfo();

// Here we are taking previous record of new admission as an input
			System.out.println("\t <<<<< Enter Your Previous Record Here >>>>> \n   ");

			System.out.print(" *) Enter Your Previous Class: ");
			String pc = dh.next();
			System.out.print(" *) Enter Your Previous School Name: ");
			String ps = dh.next();
			System.out.print(" *) Enter Your Last Percentage In Your Previous School: ");
			double pp = dh.nextDouble();

			System.out.println("\t x-------x-------x-------x-------x \n");
// Here we make an object of PRecord class
			PRecord pr = new PRecord();
// Here we call the method of PreviousrecorD & pass it's parameter which we take input from user
			pr.PreviousrecorD(pc, ps, pp);
// Admission Fees Variables
			int a_fees = 2500;
			int paid_add_fees;

			System.out.println("\t \"WELCOME TO THE ONLINE PAYMENT SYSTEM FOR ADMISSION TEST\" \n");
			System.out.println("Addmission Test Fees Is: " + a_fees);
			System.out.println("Please Deposit Admission Fee --> Rs: 2500, To Start Your Admission Test : ");
//          Input 2500 Admission Fees From User
			paid_add_fees = dh.nextInt();
//            If 'paid_add_fees' is equal to 2500 than the admission test will start otherwise it will not 
			if (paid_add_fees == 2500) {
//            	Here we make an object of class NewAdmission & pass it's parameters
				NewAdmission Add_Fees = new NewAdmission(a_fees, paid_add_fees);

//            here we call the method of AdmissionFees.
				Add_Fees.AdmissionFees();
//   we are taking input from user that in which class he/she wants to take admission & than start the test according their level 
				System.out.println(" Enter Class(1 To 10) In Which You Want To Take Admission: ");
				int nclass = dh.nextInt();

				System.out.println(
						"\t <<< Okay That's Great! Now You Have To Attempt An Admission Test, If You Successfully Cleared That Test Then You'll Be Eligible To Join Our School >>> \n");
//  If the user want to take admission in any class b/w 1 - 5 than he/she have to answers these questions 
				if (nclass >= 1 && nclass <= 5) {

					System.out.println("\t \'INSTRUCTIONS\' \n");
					System.out.println("1) This Test Consist Of Three Sections: \'A\',\'B\' & \'C\'");
					System.out.println("2) Each Section Contains Three Questions, Which Carry Equal Marks. ");
					System.out.println("3) Kindly Read All Questions CArefully Before Giving Your Answer. ");
					System.out.println("4) After Completing Your Test You'll Get Your Final Score On Your Screen. ");
					System.out.println("(NOTE: GIVE YOUR ANSWER IN a,b,c & d FORMAT)");

					System.out.println("\t <<<<< SECTION \"A\" >>>>> \n");
					System.out.println("\t <<<<< \"MATHEMATICS\" >>>>> \n");

					System.out.println(" Q.1) The Place Value Of 1 In 21246 Is: \n");
					System.out.println("a) 2. ");
					System.out.println("b) 4. ");
					System.out.println("c) 1. ");
					System.out.println("d) 6. ");

					String ans;
					ans = dh.next();
// if the user press 'b' or 'B' than the answer will be correct and it will get increment by c++;  otherwise it will print that your answer is wrong & get no increment in total correct answers  
					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					} else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) The Smallest Number Of 2 Digits Is: \n");
					System.out.println("a) 11. ");
					System.out.println("b) 21. ");
					System.out.println("c) 246. ");
					System.out.println("d) 10. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("d")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.3) The Greatest Number Of 3 Digits Is: \n");
					System.out.println("a) 217. ");
					System.out.println("b) 246. ");
					System.out.println("c) 222. ");
					System.out.println("d) 999. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("d")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\n \t <<<<< SECTION \"B\" >>>>> \n");
					System.out.println("\n \t <<<<<  \"ENGLISH\" >>>>> \n");

					System.out.println(" Q.1) I ________ Born In 1992: \n");
					System.out.println("a) was. ");
					System.out.println("b) am. ");
					System.out.println("c) were. ");
					System.out.println("d) is. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("a")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) Write Opposite Words Of: ");
					System.out.println("Big, Hot, Happy, Night, Come.\n");
					System.out.println("a) sad, cold, fat, wet, good. ");
					System.out.println("b) small, cold, sad, day, go. ");
					System.out.println("c) good, sad, day, cold, samll. ");
					System.out.println("d) cold, go, bad, sad, samll. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.3) Fill In The Blans With vowels: \n");
					System.out.println("___________ Elephant.");
					System.out.println("___________ inkpot.");
					System.out.println("___________ Mug.");
					System.out.println("a) The, An, A. ");
					System.out.println("b) An, A, The. ");
					System.out.println("c) An, An, A. ");
					System.out.println("d) The, The, An. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\n \t <<<<< SECTION \"C\" >>>>> \n");
					System.out.println("\n \t <<<<<  \"GENERAL KNOWLEDGE\" >>>>> \n");

					System.out.println(" Q.1) Which Is The Tallest Mountain In The World? \n");
					System.out.println("a) Himalaya Mountain. ");
					System.out.println("b) Mount Everest. ");
					System.out.println("c) Nanga Parbat. ");
					System.out.println("d) K2 Mountain. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) Which Planet Is Known As The Red Planet?  \n");
					System.out.println("a) Earth. ");
					System.out.println("b) Jupiter. ");
					System.out.println("c) Mars. ");
					System.out.println("d) Vinus. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.3) How Many Consonants Are there In English Alphabets?  \n");
					System.out.println("a) 17. ");
					System.out.println("b) 7. ");
					System.out.println("c) 21. ");
					System.out.println("d) 6. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\t <<< " + c + " Correct Out Of 9 >>> \n");
					result = 100 * c / 9;
					System.out.println("\t <<< YOUR SCORE=> " + result + " % >>> \n");
// if the total score of student is >=60 than he/she is eligible for admission in school otherwise not 
					if (result >= 60) {

						System.out.println("\t  \"Great! You Have Cleared The Admission Test\" ");
						System.out.println("\n\t \" WORK UNTIL YOUR IDOLS BECOME YOUR RIVALS \" \n");

						System.out.println("\t <<< NOTE >>> \r\n  "
								+ "*) Now Go To Academic Information To Know The Fee Structure. \r\n  "
								+ "*) Then Pay Your Fees Online. ");

					} else {
						System.out.println("\t \" Sorry! You're Not Eligible  \" ");
						System.out.println("\n\t \" LIFE ONLY HAS ONE RULE.  ");
						System.out.println("\t\t NEVER QUIT \" \n");

					}

				}
//If the user want to take admission in any class b/w 6 - 10 than he/she have to answers these questions
				else if (nclass >= 6 && nclass <= 10) {

					System.out.println("\t \'INSTRUCTIONS\' \n");
					System.out.println("1) This Test Consist Of Three Sections: \'A\',\'B\' & \'C\'");
					System.out.println("2) Each Section Contains Five Questions, Which Carry Equal Marks. ");
					System.out.println("3) Kindly Read All Questions CArefully Before Giving Your Answer. ");
					System.out.println("4) After Completing Your Test You'll Get Your Final Score On Your Screen. ");
					System.out.println("(NOTE: GIVE YOUR ANSWER IN a,b,c & d FORMAT)");

					System.out.println("\t <<<<< SECTION \"A\" >>>>> \n");
					System.out.println("\t <<<<< \"GENERAL KNOWLEDGE\" >>>>> \n");

					System.out.println(" Q.1) Berlin Is The Capital Of Which Country? \n");
					System.out.println("a) Belgium. ");
					System.out.println("b) Netherlands. ");
					System.out.println("c) Germany. ");
					System.out.println("d) Brazil. ");

					String ans;
					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					} else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) Does The Moon Have Gravity? \n");
					System.out.println("a) Yes, It's 1.622m/s^2. ");
					System.out.println("b) No, There's No Gravity Where You Float. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("a")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.3) If You Want To Make Green Paint, Which Colors Do You Mix Together? \n ");
					System.out.println("a) Red & Yellow. ");
					System.out.println("b) Blue & Yellow. ");
					System.out.println("c) Orange & Purple. ");
					System.out.println("d) Black & White. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.4) Which Is The Longest River In The World? \n ");
					System.out.println("a) Amazon. ");
					System.out.println("b) Mississippi. ");
					System.out.println("c) Indus. ");
					System.out.println("d) Nile. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("d")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.5) What Language Do Most People In Austria Speaks? \n ");
					System.out.println("a) German. ");
					System.out.println("b) Austrian. ");
					System.out.println("c) Hungarian. ");
					System.out.println("d) French. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("a")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\n \t <<<<< SECTION \"B\" >>>>> \n");
					System.out.println("\n \t <<<<<  \"MATHEMATICS\" >>>>> \n");

					System.out.println(" Q.1) What Is The Cube Root Of 512? \n");
					System.out.println("a) 9. ");
					System.out.println("b) 7. ");
					System.out.println("c) 8. ");
					System.out.println("d) 10. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) What Is The Square Root Of 144? \n");
					System.out.println("a) 12. ");
					System.out.println("b) 21. ");
					System.out.println("c) 14. ");
					System.out.println("d) 6. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("a")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(
							" Q.3) When The Sum Of The Measures Of Two Angles Is 90°, The Angles Are Called \n");
					System.out.println("a) Supplementary Angles. ");
					System.out.println("b) Complementary Angles. ");
					System.out.println("c) Adjacent Angles. ");
					System.out.println("d) Vertically Opposite Angles. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.4) The Angles In A Linear Pair Are \n");
					System.out.println("a) Supplementary. ");
					System.out.println("b) Complementary. ");
					System.out.println("c) Non Adjacent. ");
					System.out.println("d) Vertically Opposite. ");
					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.5) Which Of The Following Statements Is False? \n");
					System.out.println("a) Two Vertically Opposite Angles Can Be Acute. ");
					System.out.println("b) Two Vertically Opposite Angles Can Be Obtuse. ");
					System.out.println("c) Two Vertically Opposite Angles Can Be Right Angles. ");
					System.out.println("d) Two Vertically Opposite Angles May Be Unequal. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("d")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\n \t <<<<< SECTION \"C\" >>>>> \n");
					System.out.println("\n \t <<<<<  \"ENGLISH\" >>>>> \n");

					System.out.println(" Q.1) The Synonym Of Hide Is? \n");
					System.out.println("a) Seek. ");
					System.out.println("b) To Cover. ");
					System.out.println("c) Conceal. ");
					System.out.println("d) Protect. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("c")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.2) Ali __________ For A Month Because Of Skin Allergy.  \n");
					System.out.println("a) Has Not Swim. ");
					System.out.println("b) Has Not Been Swimming. ");
					System.out.println("c) Is Not Swimming. ");
					System.out.println("d) Swimming. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.3) Sara ___________ For Her Science Test Since 9 O'Clock.  \n");
					System.out.println("a) Has Studied. ");
					System.out.println("b) Has Been Studying. ");
					System.out.println("c) Have Been Studying. ");
					System.out.println("d) Studied. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(
							" Q.4) The Scientist _____________ Been Exploring The Territory Since Last December.  \n");
					System.out.println("a) Has. ");
					System.out.println("b) Have. ");
					System.out.println("c) Had ");
					System.out.println("d) None Of The Above. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("a")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println(" Q.5)McDonalds! I ___ It.  \n");
					System.out.println("a) Loves. ");
					System.out.println("b) Am Loving. ");
					System.out.println("c) Loving. ");
					System.out.println("d) Have Been Loving. ");

					ans = dh.next();

					if (ans.equalsIgnoreCase("b")) {
						System.out.println("Your Answer Is Correct ");
						c++;

					}

					else {

						System.out.println(" Your Answer Is Wrong ");
					}

					System.out.println("\t <<< " + c + " Correct Out Of 15 >>> \n");
					result = 100 * c / 15;
					System.out.println("\t <<< YOUR SCORE=> " + result + " % >>> \n");

//if the total score of student is >=60 than he/she is eligible for admission in school otherwise not 
					if (result >= 60) {

						System.out.println("\t  \"Great! You Have Cleared The Admission Test\" ");
						System.out.println("\n\t \" WORK UNTIL YOUR IDOLS BECOME YOUR RIVALS \" \n");

						System.out.println("\t <<< NOTE >>> \r\n  "
								+ "*) Now Go To Academic Information To Know The Fee Structure. \r\n  "
								+ "*) Then Pay Your Fees Online. ");

					} else {
						System.out.println("\t \" Sorry! You're Not Eligible  \" ");
						System.out.println("\n\t \" LIFE ONLY HAS ONE RULE.  ");
						System.out.println("\t\t NEVER QUIT \" \n");

					}

				}

				else {
					System.out.println(" SYSTEM ERROR ! ");
				}

			} else if (paid_add_fees < 2500 && paid_add_fees > 2500) {
				System.out.println(" Please Pay Your Admission Fees First To Start Your Test !");
			}

			break;

		case 'b':

// Case 'b' Is totally based on Academic info.

			System.out.println("\t\t \" WELCOME TO ACADEMIC INFORMATION OF SCHOOL \"");

			System.out.println("\t\t ____________________________________________ \n");

			System.out.println(
					"All academic matters at Our School are the responsibility of the Studies Department which comprises three sections:\r\n"
							+ "\r\n"
							+ "-Academics (curriculum, assessment & exams, career guidance & counselling, libraries)\r\n"
							+ "-Professional Development & Research (teacher and leader training)\r\n"
							+ "-Inspection & Quality Assurance (school inspection and improvement)\r\n"
							+ "Our School is clear in its strategic intent to provide a high quality educational experience that will motivate, enthuse, and encourage its large student community \n");

			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ \n");
// make an object of class Academic
			Academic Curri = new Academic();

// Calling Curriculum Method 
			Curri.Curriculum();

			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ \n");
// Again make an object of same class
			Academic Do_Dont = new Academic();
// Calling Do's & Don'ts Method
			Do_Dont.Dos_Donts();

			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ \n");
// Again make an object of same class
			Academic Fee_S = new Academic();
// Calling Fee Structure Method.
			Fee_S.Fee_Structure();

			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ \n");
// Again make an object of same class
			Academic Add_pro = new Academic();
// Calling Admission Procedure Method.
			Add_pro.Admission_Pro();

			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ \n");

			break;

		case 'c':
			System.out.println("\t\t \" WELCOME TO THE EXAMINATION INFORMATION \"");
			System.out.println("\t\t ____________________________________________ \n");
// taking input 
			System.out.println("Enter Your Class: ");
			String c_n = dh.next();
// make an object of class Online_EXAM  
			Online_EXAM class_y = new Online_EXAM();
// calling method of y.class & pass it a parameter 
			class_y.y_class(c_n);
// if c_n equals to '1' than it will print the schedule of class 1
			if (c_n.equals("1")) {
// make an object of class Class_1 
				class_1 Schedule = new class_1();
// calling method Exam_1
				Schedule.Exam_1();
// Again make an object of same class
				class_1 Time = new class_1();
// calling method of Exam_Timetable
				Time.Exam_Timetable();

			} else if (c_n.equals("2")) {

				class_2 Schedule = new class_2();
				Schedule.Exam_2();
				class_2 Time = new class_2();
				Time.Exam_Timetable_2();

			} else if (c_n.equals("3")) {

				class_3 Schedule = new class_3();
				Schedule.Exam_3();
				class_3 Time = new class_3();
				Time.Exam_Timetable_3();

			} else if (c_n.equals("4")) {

				class_4 Schedule = new class_4();
				Schedule.Exam_4();
				class_4 Time = new class_4();
				Time.Exam_Timetable_4();

			} else if (c_n.equals("5")) {

				class_5 Schedule = new class_5();
				Schedule.Exam_5();
				class_5 Time = new class_5();
				Time.Exam_Timetable_5();

			} else if (c_n.equals("6")) {

				class_6 Schedule = new class_6();
				Schedule.Exam_6();
				class_6 Time = new class_6();
				Time.Exam_Timetable_6();

			} else if (c_n.equals("7")) {

				class_7 Schedule = new class_7();
				Schedule.Exam_7();
				class_7 Time = new class_7();
				Time.Exam_Timetable_7();

			} else if (c_n.equals("8")) {

				class_8 Schedule = new class_8();
				Schedule.Exam_8();
				class_8 Time = new class_8();
				Time.Exam_Timetable_8();

			} else if (c_n.equals("9")) {

				class_9 Schedule = new class_9();
				Schedule.Exam_9();
				class_9 Time = new class_9();
				Time.Exam_Timetable_9();

			} else if (c_n.equals("10")) {

				class_10 Schedule = new class_10();
				Schedule.Exam_10();
				class_10 Time = new class_10();
				Time.Exam_Timetable_10();

			}

			break;

		case 'd':

			System.out.println("\t\t\t \" WELCOME TO THE GRADING SYSTEM \"");
			System.out.println("\t\t ____________________________________________ \n");
// make an object of class 'Grade'
			Grade g = new Grade();
// calling method 'grading' & return 'per' 
			g.grading(g.per);

			break;

		case 'e':

			System.out.println("\t\t \" WELCOME TO THE TIMETABLE MANAGEMENT \"");
			System.out.println("\t\t ____________________________________________ \n");
//	Taking Input
			System.out.println(" Enter Class :  ");
			int cl = dh.nextInt();
// If input is equals to 1 than print class 1 timetable
			if (cl == 1) {
				System.out.println("\t *) Class -> " + cl);
// make an object of class Time_1. 
				Time_1 Time01 = new Time_1();
// calling method 'Time'
				Time01.Time();
			} else if (cl == 2) {

				System.out.println("\t *) Class -> " + cl);

				Time_2 Time02 = new Time_2();
				Time02.Time();

			} else if (cl == 3) {

				System.out.println("\t *) Class -> " + cl);

				Time_3 Time03 = new Time_3();
				Time03.Time();

			} else if (cl == 4) {

				System.out.println("\t *) Class -> " + cl);

				Time_4 Time04 = new Time_4();
				Time04.Time();

			} else if (cl == 5) {

				System.out.println("\t *) Class -> " + cl);

				Time_5 Time05 = new Time_5();
				Time05.Time();

			} else if (cl == 6) {

				System.out.println("\t *) Class -> " + cl);

				Time_6 Time06 = new Time_6();
				Time06.Time();

			}

			else if (cl == 7) {

				System.out.println("\t *) Class -> " + cl);

				Time_7 Time07 = new Time_7();
				Time07.Time();

			} else if (cl == 8) {

				System.out.println("\t *) Class -> " + cl);

				Time_8 Time08 = new Time_8();
				Time08.Time();

			} else if (cl == 9) {

				System.out.println("\t *) Class -> " + cl);

				Time_9 Time09 = new Time_9();
				Time09.Time();

			}

			else if (cl == 10) {

				System.out.println("\t *) Class -> " + cl);

				Time_10 Time10 = new Time_10();
				Time10.Time();

			}

			break;

		case 'f':

			System.out.println("\t \" WELCOME TO THE COMMUNICATION WITH STUDENTS SYSTEM \"");
			System.out.println("\t\t ____________________________________________ \n");
//   make an object of communication class
			communication com = new communication();
//	take a message as a input.
			System.out.println("\t\t  <<< Enter Your New Message >>> \n");
			String ms = dh.next();
			System.out.println("\t\t Press \'a\' If You Want To Send Message Via Email \n");
			System.out.println("\t\t Press \'b\' If You Want To Send Message Via Contact Number \n");
//	User Choice To Send Message via email or contact No.        
			String msgType = dh.next();

			switch (msgType) {
//	        case 'a' will be run if user want to send message via email
			case "a":
				System.out.println("\t\t <<< Via Email >>> \n");
//	        calling method of 'msg' & pass a parameter
				com.msg(ms);
				break;

//	        case 'b' will be run if user want to send message via contact no.
			case "b":
				System.out.println("\t\t <<< Via Contact Number >>> \n");
//	        calling method 'msg' & pass a parameter
				com.msg(ms);
				break;
			default:
				System.out.println("\t\t System Error ! \n");
			}

			break;

		case 'g':

			System.out.println("\t\t \" WELCOME TO PROFILE MANAGEMENT \"");
			System.out.println("\t\t ____________________________________________ \n");
			System.out.println(" Press 't' For Teacher's Information");
			System.out.println(" Press 's' For Student's Information");

			char i_t = dh.next().charAt(0);

			switch (i_t) {
//	case 't' is for teachers info
			case 't':
//		taking input
				System.out.println(" Enter Department Name ");
				String dep = dh.next();

//		make an object of class Profile_ & than pass a parameter of dep to it's constructor
				Profile_ p = new Profile_(dep);

				break;

//		case 's' is for students info
			case 's':
//	taking input
				System.out.println(" Enter Class:  ");
				int cl_student = dh.nextInt();
//		make an onject of class Profile_ & than pass a parameter to cl_student it's constructor 
				Profile_ p_s = new Profile_(cl_student);

				break;

			default:

				System.out.println("System Error ! ");

			}

			break;

		case 'h':

			System.out.println("\t\t \" WELCOME TO HOMEWORK & ASSIGNMENT SECTION \"");
			System.out.println("\t\t ____________________________________________ \n");
//   taking input
			System.out.print("\nEnter your class: ");
			String classname = dh.next();
//   if class is equals to '1' than it will print the homework & assignments pf class 1  
			if (classname.equals("1")) {
//	make an object
				hw_1 work = new hw_1();
//  calling method of work_1
				work.work_1();
			} else if (classname.equals("2")) {
				hw_1 work = new hw_2();
				work.work_1();
			} else if (classname.equals("3")) {
				hw_2 work = new hw_3();
				work.work_1();
			} else if (classname.equals("4")) {
				hw_3 work = new hw_4();
				work.work_1();
			} else if (classname.equals("5")) {
				hw_4 work = new hw_5();
				work.work_1();
			} else if (classname.equals("6")) {
				hw_5 work = new hw_6();
				work.work_1();
			} else if (classname.equals("7")) {
				hw_6 work = new hw_7();
				work.work_1();
			} else if (classname.equals("8")) {
				hw_7 work = new hw_8();
				work.work_1();
			} else if (classname.equals("9")) {
				hw_8 work = new hw_9();
				work.work_1();
			} else if (classname.equals("10")) {
				hw_9 work = new hw_10();
				work.work_1();
			} else {
				System.out.println("SYSTEM ERROR!");
			}

			break;

		case 'i':

			System.out.println("\t\t \" WELCOME TO FEES SECTIONS \"");
			System.out.println("\t\t ____________________________________________ \n");
			System.out.println("\nEnter '1' If You Are A Management Member");
			System.out.println("\nEnter '2' If You Are A Parent");
			char d7 = dh.next().charAt(0);

			switch (d7) {

//     This case Consist of generate fees voucher of any class, This case is for school management
			case '1':
//		it will ask you a pswrd, if you entered correct (pswrd:@admin01) than it will run
				System.out.print("\nEnter the school management password: ");
				String password = dh.next();

				if (password.equals("@admin01")) {
					System.out.println(" Enter The Class ->  ");
					int cll = dh.nextInt();
					System.out.println(
							" \tNote: \r\n" + " *) Monthly Tuition Fees From Class 1 To 5 --> Rupees: 2000 \r\n"
									+ " *) Monthly Tuition Fees From Class 6 To 8 --> Rupees: 2500 \r\n"
									+ " *) Monthly Tuition Fees From Class 9 To 10 --> Rupees: 3000 \r\n");

					System.out.println(" Enter Student's Tuition Monthly Fees ->  ");
					double m = dh.nextDouble();
					System.out.println(" Enter Student's Extra Curriculum Activity Fees ->  ");
					double e = dh.nextDouble();
					System.out.println(" Enter Student's Laboratory Fees ->  ");
					double l = dh.nextDouble();

// making an object of class s_f & than pass it's overloaded constructor's parameters 
					s_f d1 = new s_f(cll, m, e, l);

					System.out.println(
							" Write \" Sent\" & Press \" Enter\" To Sent The Vouchers To The Students Via Email:  ");
					String sent = dh.next();

					String enter = (sent.equalsIgnoreCase("sent"))
							? "<<< \" VOUCHERS HAS BEEN SENT TO THE STUDENTS SUCCESSFULLY \" >>>"
							: " \" EXIT \"";
					System.out.println(enter);
					System.out.println(" \t_______________________________ \n");
				} else {
					System.out.println("\nYour password is incorrect!");
				}

				break;
//  This Case is for parents Use for pay the school fees
			case '2':
				System.out.println(" \t\t <<<<< WELCOME TO THE ONLINE FEES PAYMENT >>>>> \n");
				Scanner info = new Scanner(System.in);
				System.out.println("\t\t The Annual Fees Structure of Our School is =>");
				annual_fees fees = new annual_fees();
				fees.fees_structure();

				System.out.println("\t\t Enter the Student Name: ");
				String student1 = info.next();

				System.out.println("\t\t Enter the Student's Roll NO: ");
				int roll_no = info.nextInt();

				System.out.println("\t\t Enter the amount you deposited : ");
				double amount = info.nextInt();
//	 make an object s1 & than pass it's constructor's parameter
				Student s1 = new Student(roll_no, "student1", amount);
//	  calling method display_info
				s1.display_info();

				System.out.println("\t\t <<<<< THANKYOU FOR YOUR PAYMENT >>>>> \n");

				break;

			default:
				System.out.println(" System Error !");
			}

			break;

		case 'j':

			System.out.println("\n\t\t\t<<<WELCOME TO HR AND PAYROLL MANAGEMENT>>>>");
			System.out.println("\t\t ____________________________________________ \n");

			System.out.println("\nEnter 'a' for New Employee");
			System.out.println("\nEnter 'b' for Daily work");
			System.out.println("\nEnter 'c' for Salary Slips");
			char d6 = dh.next().charAt(0);
			switch (d6) {
			case 'a':
//		MAKE AN OBJECT
				emp obj = new emp();
				System.out.print("\nID: ");
				String id = dh.next();
				System.out.print("\nFirst Name: ");
				String f_name = dh.next();
				System.out.print("\nLast Name: ");
				String l_name = dh.next();
				System.out.print("\nCNIC Number [WITHOUT USE ( - ) ]: ");
				Long cnic = dh.nextLong();
				System.out.print("\nPhone Number: ");
				Long p_no = dh.nextLong();
				System.out.print("\nEmail Address: ");
				String Email = dh.next();
				System.out.print("\nPost: ");
				String post = dh.next();
				System.out.print("\nSalary: ");
				double sal = dh.nextDouble();
				System.out.print("\nEmergency Phone Number: ");
				Long e_no = dh.nextLong();
				System.out.print("\nDate of Hiring: ");
				String doh = dh.next();

//	CALLING OVERLOADED METHOD 'Employee' & pass it's parameters 
				obj.Employee(id, f_name, l_name, cnic, p_no, Email, post, sal, e_no, doh);

				break;

			case 'b':
//    	make an object
				emp obj1 = new emp();
				System.out.print("\nID: ");
				String id1 = dh.next();
				System.out.print("\nAttendance: ");
				String att = dh.next();
				System.out.print("\nDaily work: ");
				String d_work = dh.next();
//	calling method 'Employee' & pass it's parameter
				obj1.Employee(id1, att, d_work);
				break;

			case 'c':
				System.out.print("\nID: ");
				String id2 = dh.next();
				System.out.print("\nCNIC Number[WITHOUT USE ( - ) ]: ");
				Long cnic2 = dh.nextLong();
				System.out.print("\nPhone Number: ");
				Long p_no2 = dh.nextLong();
				System.out.print("\nEmail Address: ");
				String email2 = dh.next();
				System.out.println("\n\t\t\t_____________________________________________________________");
				System.out.println("\nPress 1 for Principal");
				System.out.println("\nPress 2 for Vice Principal");
				System.out.println("\nPress 3 for Head of a subject");
				System.out.println("\nPress 4 for Teacher");
				System.out.println("\nPress 5 for Peon");
				int post_1 = dh.nextInt();
				if (post_1 == 1) {
					System.out.println("\n\t\t\t_____________________________________________________________");
					double bp = 35000;
//	make an object of class principal
					principal pri = new principal();
//	call the method sal_slips
					pri.sal_slips();
				} else if (post_1 == 2) {
					System.out.println("\n\t\t\t_____________________________________________________________");
					double bp = 25000;
//	make an object of class vice_pri
					vice_pri v_pri = new vice_pri();
//	       calling the method sal_slips
					v_pri.sal_slips();
				} else if (post_1 == 3) {
					System.out.println("\n\t\t\t_____________________________________________________________");
					double bp = 20000;
//	make an object of class head_sub
					head_sub h_sub = new head_sub();
//	       calling the method sal_slips
					h_sub.sal_slips();
				} else if (post_1 == 4) {
					System.out.println("\n\t\t\t_____________________________________________________________");
					double bp = 15000;
//	make an object of class teacher
					teacher teach = new teacher();
//	       calling the method sal_slips
					teach.sal_slips();
				} else if (post_1 == 5) {
					System.out.println("\n\t\t\t_____________________________________________________________");
					double bp = 5000;
//	make an object of class peon
					peon p = new peon();
//	       calling the method sal_slips
					p.sal_slips();
				}
				break;

			default:
				System.out.println(" <<<\"EXIT CASE\">>>");

			}

			break;

		case 'k':

			System.out.println("\t\t \" WELCOME TO ATTENDENCE RECORD OF TEACHERS & STUDENTS \"");
			System.out.println("\t\t ____________________________________________ \n");

			System.out.println("\nPress 'a' For Teachers Attendance Record");
			System.out.println("\nPress 'b' For Students Attendance Record");
			char d246 = dh.next().charAt(0);

			switch (d246) {
			case 'a':
//     make an object of class teacherr_att
				teacher_att obj1 = new teacher_att();

				System.out.println("\n\t\t\t__________________________________");
				System.out.println("\n\t\t\t<<<TEACHER ATTENDANCE RECORD>>>");
				System.out.print("\nEnter Teacher's ID: ");
				String t_id = dh.next();
				System.out.print("\nEnter Teacher's Name: ");
				String t_name = dh.next();
				System.out.print("\nEnter Subject of Teacher: ");
				String t_sub = dh.next();
//	calling method att & pass it's parameter
				obj1.att(t_name);

				break;

			case 'b':

//	make an object of class student_att	
				student_att obj2 = new student_att();
				System.out.println("\n\t\t\t__________________________________");
				System.out.println("\n\t\t\t<<<STUDENT ATTENDANCE RECORD>>>");
				System.out.print("\nEnter Student's ID: ");
				String s_id = dh.next();
				System.out.print("\nEnter Student's Name: ");
				String s_name = dh.next();
				System.out.print("\nEnter Student's Father Name: ");
				String f_name = dh.next();
//	calling method att & pass it's parameter
				obj2.att(s_name);

				break;

			default:
				System.out.println("\n\t\t<<<SYSTEM ERROR!>>>");
				break;
			}

			break;

		default:
			System.out.println(" SYSTEM ERROR !");
		}

	}

}

// NEW ADMISSION CLASS & CONSTRUCTOR
class NewAdmission {

// Instance Variables
	private String name;
	private String fname;
	private String add;
	private long cno;
	private String email;
	private int day;
	private int month;
	private int year;
	private int a_fees;
	private int paid_add_fees;

//Parameterised Constructor
	NewAdmission(String n, String f, String a, long c, String e, int d, int m, int y) {

		name = n;
		fname = f;
		add = a;
		cno = c;
		email = e;
		day = d;
		month = m;
		year = y;

	}

// Method  of new admission info.
	public void NewAddInfo() {

		System.out.println(" Candidate Name: " + name);
		System.out.println(" Candidate's Father's Name: " + fname);
		System.out.println(" Candidate's Residential Address: " + add);
		System.out.println(" Candidate's Contact No: " + cno);
		System.out.println(" Candidate's Email Address: " + email);
		System.out.println(" Candidate's Date Of Birth(dd/mm/yy): " + day + "/" + month + "/" + year);
		System.out.println("\t x-------x-------x-------x-------x \n");
		System.out.println("Hello, " + name + " " + fname + " \n");

	}

//Fees (Parameterised Constructor)
	NewAdmission(int a_f, int p_a_f) {
		a_fees = a_f;
		paid_add_fees = p_a_f;

	}

	public void AdmissionFees() {

		System.out.println("You Have Successfully Deposited Amount Of RS: " + paid_add_fees + " In School's Account");
		System.out.println("\t \" Now You Can Attempt Online Admission Test \" ");

	}

}

//Previous Record Class & Parameterised Method 
class PRecord {

	public void PreviousrecorD(String pc, String ps, double pp) {

		System.out.println(" Candidate Previous Class: " + pc);
		System.out.println(" Candidate's Previous School Name: " + ps);
		System.out.println(" Candidate's Percentage In Last Class: " + pp + " %.");
		System.out.println("\t x-------x-------x-------x-------x \n");

	}

}

// Student Info Class
class Stu_Info {

	String name;
	String Classs;
	int Roll_No;
	Long Stu_ID;
	String fname;

}

class Academic {
	long fees;

	void Dos_Donts() {

		System.out.println("\t<<< DO'S & DON'TS >>> ");
		System.out.println(
				"\n Following acts are strictly prohibited. Defaulters will be dealt in accordance with the college rules. \n");
		System.out.println(" *) Students must attend school in proper uniform. \n");
		System.out.println(" *) Late comers are not allowed to enter the school premises after the reporting time. \n");
		System.out.println(" *) No political activity is allowed in the school. \n");
		System.out.println(
				" *) Using unfair means in examinations/test, cheating, stealing, quarrelling, using foul language, telling lies, rowdyism and misconduct of any type including instances of moral turpitude. \n");
		System.out.println(
				" *) Smoking, possessing intoxicants, unauthorized medicines, material, bringing fireworks, knives or other weapons and firearms of any type within the school premises. \n");
		System.out.println(" *) Bringing pets, record players, mobile phones, radios of any sort to the School. \n");
		System.out
				.println(" *) Direct or indirect participation/involvement in any political or sectarian activity. \n");
		System.out.println(" *) Deliberately disfiguring, defacing or willfully damaging school property. \n");
		System.out.println(" *) Lending or borrowing money, betting and gambling. \n");
		System.out.println(" *) Violation of College rules enforced from time to time. \n");
		System.out.println(" *) Use of mobile phone is prohibited in the school. \n");

	}

	void Curriculum() {

		System.out.println("\t<<< Curriculum >>>\r\n" + "\r\n"
				+ "Our School aims to provide the highest quality educational opportunities in:\r\n" + "\r\n"
				+ "Literacy and numeracy skills.\r\n"
				+ "A broad and balanced range of knowledge, skills and understanding.\r\n"
				+ "The development of higher order and independent thinking skills.\r\n"
				+ "An enlightened awareness of Islam and tolerance of other religions\r\n"
				+ "Personal and social development. \n");

	}

	void Fee_Structure() {

		System.out.println("\t<<<School Tuition Fees >>>\r\n" + "\r\n"
				+ "School tuition fees cover the provision of tuition including English Language classes, outdoor education courses and visual arts courses. ");

		System.out.println("\t<<< Uniform >>>\r\n" + "\r\n"
				+ "The International Student Director will assist international students to purchase their uniform upon arrival in Dunedin. New and second-hand uniform items can be purchased.\r\n"
				+ " The school operates a second-hand uniform shop where good quality second-hand uniforms may be bought and sold.\n");

		System.out.println("1 Monthly Tuition Fee (Full Fee Category) Rs. 3,200/-\r\n"
				+ "2 Monthly Tuition Fee (Sibling Fee Category) Rs. 2,400/-\r\n"
				+ "3 Admission Fee (At the time of admission for all student categories) Rs. 2,500/-\r\n"
				+ "4 Security Deposit (Refundable) Rs. 2,500/-\r\n"
				+ "5 Annual Subscription Fee (Per Academic year for all student categories) Rs. 2,500/-");

		System.out.println("The following fees are payable:\r\n" + "A\r\n" + "Registration Fee Non-refundable\r\n"
				+ "B\r\n" + "Admission Fee Non-refundable\r\n" + "C\r\n" + "Security Fee Refundable\r\n" + "D\r\n"
				+ "Tuition Fee Payable every two months\r\n" + "E\r\n" + "Computer Fee Payable every two months");
	}

	void Admission_Pro() {

		System.out.println("\t<<< ADMISSION PROCEDURE >>> \n");
		System.out.println("Relevant Fee structure slip\r\n" + "Appointment card with testing date & time\r\n"
				+ "Registration receipt\r\n" + "Prospectus purchase cash receipt\r\n"
				+ "Admission and fee payment information\r\n" + "Prospectus & newsletter\r\n"
				+ "The documents to be attached with the Admission Form include:\r\n"
				+ "A photocopy of Provisional Certificate and Character Certificate from last institution attended\r\n"
				+ "2 recent passport size photographs\r\n" + "2 self-addressed envelopes\r\n"
				+ "Attested photocopy of Birth Certificate\r\n" + "Report card from last school");
	}
}

// Hierarchical Inheritance Of Online_Class
class Online_EXAM {
	String c_n;

	public void y_class(String c_n) {

		System.out.println(" Your Class Is : " + c_n);
	}

}

class class_1 extends Online_EXAM {

	public void Exam_1() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) English => 7th Oct, 2020");
		System.out.println(" *) Mathematics => 10th Oct, 2020");
		System.out.println(" *) Islamiat => 12th Oct, 2020");
		System.out.println(" *) Urdu => 14th Oct, 2020");
		System.out.println(" *) Science => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 05 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 03 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 07 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 01 To 10 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 06 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_2 extends Online_EXAM {

	public void Exam_2() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 7th Oct, 2020");
		System.out.println(" *) English => 10th Oct, 2020");
		System.out.println(" *) Urdu => 12th Oct, 2020");
		System.out.println(" *) Science => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_2() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 07 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 04 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 09 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 03 To 14 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 13 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_3 extends Online_EXAM {

	public void Exam_3() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 7th Oct, 2020");
		System.out.println(" *) English => 10th Oct, 2020");
		System.out.println(" *) Urdu => 12th Oct, 2020");
		System.out.println(" *) Science => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_3() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 12 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 05 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 10 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 03 To 11 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 06 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_4 extends Online_EXAM {

	public void Exam_4() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 7th Oct, 2020");
		System.out.println(" *) English => 10th Oct, 2020");
		System.out.println(" *) Urdu => 12th Oct, 2020");
		System.out.println(" *) Science => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_4() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 07 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 04 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 09 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 03 To 14 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 13 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_5 extends Online_EXAM {

	public void Exam_5() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 6th Oct, 2020");
		System.out.println(" *) English => 8th Oct, 2020");
		System.out.println(" *) Urdu => 11th Oct, 2020");
		System.out.println(" *) Science => 13th Oct, 2020");
		System.out.println(" *) Islamiat => 15th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_5() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 20 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 15 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 06 To 19 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 03 To 15 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 02 To 17 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_6 extends Online_EXAM {

	public void Exam_6() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 7th Oct, 2020");
		System.out.println(" *) English => 10th Oct, 2020");
		System.out.println(" *) Urdu => 12th Oct, 2020");
		System.out.println(" *) Science => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_6() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 07 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 16 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 02 To 08 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 05 To 14 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 13 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}

}

class class_7 extends Online_EXAM {

	public void Exam_7() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 5th Oct, 2020");
		System.out.println(" *) English => 6th Oct, 2020");
		System.out.println(" *) Urdu => 9th Oct, 2020");
		System.out.println(" *) Science => 12th Oct, 2020");
		System.out.println(" *) Islamiat => 15th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_7() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 07 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 09 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 17 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 02 To 14 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 13 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_8 extends Online_EXAM {

	public void Exam_8() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Mathematics => 7th Oct, 2020");
		System.out.println(" *) English => 10th Oct, 2020");
		System.out.println(" *) Urdu => 12th Oct, 2020");
		System.out.println(" *) Science => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_8() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 05 To 10 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 06 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 12 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SCIENCE >>> \n");
		System.out.println("*) Chapter # 04 To 15 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 02 To 12 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_9 extends Online_EXAM {

	public void Exam_9() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Biology / Computer => 7th Oct, 2020");
		System.out.println(" *) Pakistan Studies => 10th Oct, 2020");
		System.out.println(" *) Sindhi => 12th Oct, 2020");
		System.out.println(" *) English => 14th Oct, 2020");
		System.out.println(" *) Chemistry => 17th Oct, 2020");
		System.out.println(" *) Biology / Computer Practical => 20th Oct, 2020");
		System.out.println(" *) Chemistry Practical => 22nd Oct, 2020");
		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_9() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 20 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< SINDHI >>> \n");
		System.out.println("*) Chapter # 01 To 15 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< CHEMISTRY >>> \n");
		System.out.println("*) Chapter # 01 To 11 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< BIOLOGY >>> \n");
		System.out.println("*) Chapter # 01 To 19 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< PAKISTAN STUDIES >>> \n");
		System.out.println("*) Chapter # 01 To 06 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}
}

class class_10 extends Online_EXAM {

	public void Exam_10() {
		System.out.println("\t << EXAMINATION SCHEDULE >> \n");

		System.out.println(" *) Physics => 7th Oct, 2020");
		System.out.println(" *)  Urdu => 10th Oct, 2020");
		System.out.println(" *) Mathematics => 12th Oct, 2020");
		System.out.println(" *) English => 14th Oct, 2020");
		System.out.println(" *) Islamiat => 17th Oct, 2020");
		System.out.println(" *) Physics Practical => 20th Oct, 2020");

		System.out.println("\t x------x------x------x------x \n");

	}

	public void Exam_Timetable_10() {
		System.out.println("\t << EXAMINATION TIMETABLE >> \n");

		System.out.println("\t <<< ENGLISH >>> \n");
		System.out.println("*) Chapter # 01 To 25 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< MATHEMATICS >>> \n");
		System.out.println("*) Chapter # 01 To 15 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< URDU >>> \n");
		System.out.println("*) Chapter # 01 To 16 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< ISLAMIAT >>> \n");
		System.out.println("*) Chapter # 01 To 14 ");
		System.out.println("\t x------x------x------x------x------x \n");

		System.out.println("\t <<< PHYSICS >>> \n");
		System.out.println("*) Chapter # 01 To 20 ");
		System.out.println("\t x------x------x------x------x------x \n");

	}

}

// Homework class
// MultiLevel Inheritance
class hw_1 {

	public void work_1() {
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println(
				"\n*)English: Complete the worksheet of common nouns and proper nouns from the workbook page number 10-12");
		System.out.println("\n*)Mathematics: Write counting from 1-30");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\nNo recent assignments are given");
	}
}

class hw_2 extends hw_1 {
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)Mathematics: Do excercise #3.3");
		System.out.println("\n*)Science: Read chapter 2 from book");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)Mathematics: Do the following:");
		System.out.println("\t(i)222+310=? \n\t(ii)136-501=? \n\t(iii)14x7=?");
	}
}

class hw_3 extends hw_2 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)English: Revise today's class work");
		System.out.println("\n*)Mathematics: Do excercise #2");
		System.out.println("\n*)Science: Read chapter 4 thouroughly from book");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)Urdu: Make sentences given on page number 56");
		System.out.println("\n*)English: Make sentence of:");
		System.out.println("\t(i)grow \n\t(ii)fight \n\t(iii)make");
	}
}

class hw_4 extends hw_3 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)Mathematics: Do excercise #4.2");
		System.out.println("\n*)Islamiat: Read chapter 2 from book");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Make 2 sentences of each of the following:");
		System.out.println("\t(i)afraid \n\t(ii)drive \n\t(iii)storm");
	}
}

class hw_5 extends hw_4 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)Islamiat: Read chapter 2 from book");
		System.out.println("\n*)Science: Read chapter 4 thouroughly from book");
		System.out.println("\n*)Mathematics: Do excercise #6.9");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>");
		System.out.println("\n*)English: Write down summary of Chapter 3");
		System.out.println("\n*)Science: Draw diagram of the internal structure of flower");
		System.out.println("\n*)Urdu: Make sentences given on page number 56");
	}
}

class hw_6 extends hw_5 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)Islamiat: Read chapter 2 from book");
		System.out.println("\n*)Science: Read chapter 4 thouroughly from book");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Write down essay on 'A memorable picnic'");
		System.out.println("\n*)Science: Write down 5 differences between solids, liquids and gases");
		System.out.println("\n*)Urdu: Make sentences given on page number 45");
	}
}

class hw_7 extends hw_6 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)English: Complete the worksheet page number 78-81");
		System.out.println("\n*)Science: Read chapter 4 thouroughly from book");
		System.out.println("\n*)Mathematics: Do excercise # 3.2 and 3.3");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Revise the tenses");
		System.out.println("\n*)Science: Write a short note on Photosynthesis");
		System.out.println("\n*)Urdu: Complete the worksheet given on page number 66");
	}
}

class hw_8 extends hw_7 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)English: Complete the worksheet page number 78-81");
		System.out.println("\n*)Science: Read chapter 4 thouroughly from book");
		System.out.println("\n*)Mathematics: Do excercise # 3.2 Question number 1-5");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Revise the tenses");
		System.out.println("\n*)Mathematics: Solve the word problems on page number 32");
	}
}

class hw_9 extends hw_8 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("\n*)English: Complete the worksheet page number 78-81");
		System.out.println("\n*)Biology: Read chapter 4 thouroughly from book");
		System.out.println("\n*)Mathematics: Do excercise # 3.2 Question number 1-5");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Revise the tenses");
		System.out.println("\n*)Mathematics: Solve the word problems on page number 32");
		System.out.println("\n*)Computer Science: Revise the logic gates");
	}
}

class hw_10 extends hw_9 { // multilevel inheritance
	public void work_1() { // method overriding
		System.out.println("\n\t\t\t<<<<HOMEWORK>>>>\n");
		System.out.println("No recent homework is given");
		System.out.println("\n\t\tx-----x-------x-----x-------x------x");
		System.out.println("\n\t\t\t<<<<ASSIGNMENTS>>>>\n");
		System.out.println("\n*)English: Write down essay on 'Advantages and Disadvantages of internet'");
		System.out.println("\n*)Mathematics: Learn Theoren #3 and also practice trigonometric questions");
		System.out.println("\n*)Physics: Derive the equation of motions");
	}
}

class Time_1 {
	void Time() {
		System.out.println("\t\t Class 1 Weekly TimeTable: \n");
		System.out.println("\t\t Monday => 19th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Tuesday => 20th,oct,2020 => English: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Science: \n");

	}
}

class Time_2 {

	void Time() {
		System.out.println("\t\t Class 2 Weekly TimeTable: \n");
		System.out.println("\t\t Tuesday => 20th,oct,2020 =>  English: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 =>Mathematics: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Science: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Urdu: \n");

	}
}

class Time_3 {
	void Time() {
		System.out.println("\t\t Class 3 Weekly TimeTable: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 =>  Urdu: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Science: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Monday => 26th,oct,2020 => English: \n");

	}
}

class Time_4 {
	void Time() {

		System.out.println("\t\t Class 4 Weekly TimeTable: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 =>  Science: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Monday => 26th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Tuesday => 27th,oct,2020 => English: \n");

	}
}

class Time_5 {
	void Time() {

		System.out.println("\t\t Class 5 Weekly TimeTable: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 =>  Islamiat: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Science: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Monday => 26th,oct,2020 => English: \n");

	}
}

class Time_6 {
	void Time() {

		System.out.println("\t\t Class 6 Weekly TimeTable: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => English: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Monday => 26th,oct,2020 => Science: \n");

	}
}

class Time_7 {
	void Time() {
		System.out.println("\t\t Class 7 Weekly TimeTable: \n");
		System.out.println("\t\t Monday => 19th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Tuesday => 20th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 => English: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Science: \n");
	}
}

class Time_8 {
	void Time() {
		System.out.println("\t\t Class 8 Weekly TimeTable: \n");
		System.out.println("\t\t Monday => 19th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Wednesday => 20th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Friday => 21th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Monday => 22th,oct,2020 => English: \n");
		System.out.println("\t\t Tuesday => 23th,oct,2020 => Science: \n");
	}
}

class Time_9 {
	void Time() {
		System.out.println("\t\t Class 9 Weekly TimeTable: \n");
		System.out.println("\t\t Monday => 19th,oct,2020 => Sindhi: \n");
		System.out.println("\t\t Tuesday => 20th,oct,2020 => English: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Pakistan Studies: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Chemistry: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Chemistry Practical: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Biology: \n");
		System.out.println("\t\t Saturday => 24th,oct,2020 => Biology Practical: \n");
	}
}

class Time_10 {
	void Time() {
		System.out.println("\t\t Class 10 Weekly TimeTable: \n");
		System.out.println("\t\t Monday => 19th,oct,2020 => Mathematics: \n");
		System.out.println("\t\t Tuesday => 20th,oct,2020 => English: \n");
		System.out.println("\t\t Wednesday => 21th,oct,2020 => Urdu: \n");
		System.out.println("\t\t Thursday => 22th,oct,2020 => Islamiat: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Physics: \n");
		System.out.println("\t\t Friday => 23th,oct,2020 => Physics Practical: \n");

	}
}

// Student fees voucher generate class
class s_f {
	double mt_f;
	double ec_f;
	double l_f;
	int c;

//  parameterised constructor
	s_f(int c, double mt_f, double ec_f, double l_f) {
		this.mt_f = mt_f;
		this.ec_f = ec_f;
		this.l_f = l_f;
		this.c = c;
		int d = 0;
		double T = 0;
		String[] Stu = { "Ukasha", "Areeb", "Taseer", "Zahir", "Haseeb" };
		long[] Stu_Id = { 24621, 56789, 12345, 98765, 17246 };

		do {

			for (int h = 0; h < Stu_Id.length; h++) {

				System.out.println(" \t <<< STUDENT FEE VOUCHER >>> \n");
				System.out.println(" \t_______________________________ \n");

				System.out.println(" \t <<< BANK COPY >>>");
				System.out.println(" Student Name -> " + Stu[d] + " \n");
				System.out.println(" " + Stu[d] + " Id Is ->" + Stu_Id[h] + " \n");
				System.out.println(" Student Class -> " + c + " \n");
				System.out.println(" Monthly Tuition Fees -> Rupees: " + mt_f + " \n");
				System.out.println(" Extra Curriculum Activity Fees -> Rupees: " + ec_f + " \n");
				System.out.println(" Laboratory Fees -> Rupees: " + l_f + " \n");
				T = mt_f + ec_f + l_f;
				System.out.println(" " + Stu[d] + " Total Fees Is -> Rupees: " + T);
				System.out.println("\t << NOTE >> \r\n" + "*) Due Date Is -->  10 Oct, 2020 \r\n"
						+ "*) Ater Due Date Fees Will Be -> Rupees: " + (T + 500));
				System.out.println(" \t_______________________________ \n");

// NARROW TYPE CASTING
				long m = (long) mt_f;
				long e = (long) ec_f;
				long l = (long) l_f;

				System.out.println(" \t <<< STUIDENT COPY >>>");
				System.out.println(" Student Name -> " + Stu[d] + " \n");
				System.out.println(" " + Stu[d] + " Id Is ->" + Stu_Id[h] + " \n");
				System.out.println(" Student Class -> " + c + " \n");
				System.out.println(" Monthly Tuition Fees -> Rupees: " + m + " \n");
				System.out.println(" Extra Curriculum Activity Fees -> Rupees: " + e + " \n");
				System.out.println(" Laboratory Fees -> Rupees: " + l + " \n");
				T = m + e + l;
				System.out.println(" " + Stu[d] + " Total Fees Is -> Rupees: " + T);
				System.out.println("\t << NOTE >> \r\n" + "*) Due Date Is -->  10 Oct, 2020 \r\n"
						+ "*) Ater Due Date Fees Will Be -> Rupees: " + (T + 500));
				System.out.println(" \t_______________________________ \n");

				System.out.println(" \t <<< SCHOOL COPY >>>");
				System.out.println(" Student Name -> " + Stu[d] + " \n");
				System.out.println(" " + Stu[d] + " Id Is ->" + Stu_Id[h] + " \n");
				System.out.println(" Student Class -> " + c + " \n");
				System.out.println(" Monthly Tuition Fees -> Rupees: " + m + " \n");
				System.out.println(" Extra Curriculum Activity Fees -> Rupees: " + e + " \n");
				System.out.println(" Laboratory Fees: Rupees: " + l + " \n");
				T = m + e + l;
				System.out.println(" " + Stu[d] + " Total Fees Is -> Rupees:" + T);
				System.out.println("\t << NOTE >> \r\n" + "*) Due Date Is -->  10 Oct, 2020 \r\n"
						+ "*) Ater Due Date Fees Will Be -> Rupees: " + (T + 500));
				System.out.println(" \t_______________________________ \n");

				d++;
			}
		} while (d < Stu.length);
	}

}

//  Pay fee class
class Student {
	int rollno;
	String name;
	double fee;

//Pay fee constructor
	Student(int rollno, String name, double fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	public void display_info() {
		System.out.println(" Candidate Name: " + name);
		System.out.println(" Candidate's Roll No: " + rollno);
		System.out.println(" Amount you deposited is:  " + fee);
		System.out.println("\t __________________________________________________ \n");
	}
}

class annual_fees {
	void fees_structure() {
		System.out.println("\t\t <<<<<< FEES CRITERIA >>>>>> \n");
		System.out.println("1 Monthly Tuition Fee (Full Fee Category) Rs. 3,200/- \n");
		System.out.println("\"2 Monthly Tuition Fee (Sibling Fee Category) Rs. 2,400/- \n");
		System.out.println("\"3 Admission Fee (At the time of admission for all student categories) Rs. 2,500/-  \n");
		System.out.println("\"4 Security Deposit (Refundable) Rs. 2,500/- \n");
		System.out.println("\"5 Annual Subscription Fee (Per Academic year for all student categories) Rs. 2,500/- \n");
		System.out.println(
				"\"6 Admission Processing Fee (At the time of admission for all student categories) Rs. 200/- \n");
		System.out.println("\t __________________________________________________ \n");
	}
}

// grade class
class Grade {

	double per;

// RETURN VALUE METHOD
	double grading(double per) {
		this.per = per;
		int sum = 0;
		Scanner dh = new Scanner(System.in);

		int[] dd = new int[5];

		System.out.println("Enter Student's Obtained Marks In Five Subject: ");

		for (int d = 0; d < 5; d++) {
			dd[d] = dh.nextInt();
		}

		for (int h : dd) {
			sum = sum + h;
		}
		System.out.println("Obtained Student Marks :" + sum);
		per = 100 * sum / 500;

		if (per >= 80) {
			System.out.println(" Student's Grade -> \' A - One\' ");
		} else if (per >= 70 && per <= 79) {
			System.out.println(" Student's Grade -> \' A\' ");
		} else if (per >= 60 && per <= 69) {
			System.out.println(" Student's Grade -> \' B\' ");
		} else if (per >= 50 && per <= 59) {
			System.out.println(" Student's Grade -> \' C\' ");
		} else if (per >= 40 && per <= 49) {
			System.out.println(" Student's Grade -> \' E\' ");
		} else if (per >= 30 && per <= 49) {
			System.out.println(" Student's Grade -> \' FAIL\' ");
		}

		System.out.println(" Student's Percentage --> " + per + "%");
		return per;

	}

}

class emp {
	// Method Overloading
	public void Employee(String id, String f_name, String l_name, long cnic, long p_no, String email, String post,
			double sal, long e_no, String doh) {
		Scanner s = new Scanner(System.in);
		System.out.println("\n\t\t\tYour information has been saved in our record");
		System.out.print("\n\t\t\tTo view your entered information press 'v': ");
		char d = s.next().charAt(0);
		System.out.println("\n\t\t\t_____________________________________________________________");
		if (d == 'v') {
			System.out.println("\nID: " + id);
			System.out.println("\nFirst Name: " + f_name);
			System.out.println("\nCNIC Number: " + cnic);
			System.out.println("\nPhone Number: " + p_no);
			System.out.println("\nEmail Address: " + email);
			System.out.println("\nPost: " + post);
			System.out.println("\nSalary: " + sal);
			System.out.println("\nEmergency Phone Number: " + e_no);
			System.out.println("\nDate of Hiring: " + doh);
		} else {
			System.out.println("\n\t\t\tERROR OCCURRED!");
		}
		System.out.println("\n\t\t\t_____________________________________________________________");
	}

	// Method Overloading
	public void Employee(String id1, String att, String d_work) {
		System.out.println("\n\t\t\tYour information has been saved in our record");
		System.out.println("\n\t\t\tThankyou for inputing today's work");
		System.out.println("\n\t\t\t_____________________________________________________________");

	}
}

// Hierarchical Inheritance
class principal extends emp {
	double bp = 35000, da, hra, pf, scf;
	double gross_sal, net_sal;

	public void sal_slips() {
		da = 0.97 * bp;
		hra = 0.10 * bp;
		pf = 0.12 * bp;
		scf = 0.001 * bp;

		gross_sal = bp + da + hra;
		net_sal = gross_sal - pf - scf;
		System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
		System.out.println("\nBasic Salary: " + bp);
		System.out.println("\nDearness Allowance: " + da);
		System.out.println("\nHRA: " + hra);
		System.out.println("\nPF: " + pf);
		System.out.println("\nStaff Club Fund: " + scf);
		System.out.println("\n\t\t\t_____________________________________________________________");
		System.out.println("\n\t\tGross Salary: " + gross_sal);
		System.out.println("\n\t\tNet Salary: " + net_sal);
	}

}

class vice_pri extends emp {
	double bp = 25000, da, hra, pf, scf;
	double gross_sal, net_sal;

	// Overriding
	public void sal_slips() {
		da = 0.97 * bp;
		hra = 0.10 * bp;
		pf = 0.12 * bp;
		scf = 0.001 * bp;

		gross_sal = bp + da + hra;
		net_sal = gross_sal - pf - scf;
		System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
		System.out.println("\nBasic Salary: " + bp);
		System.out.println("\nDearness Allowance: " + da);
		System.out.println("\nHRA: " + hra);
		System.out.println("\nPF: " + pf);
		System.out.println("\nStaff Club Fund: " + scf);
		System.out.println("\n\t\t\t_____________________________________________________________");
		System.out.println("\n\t\tGross Salary: " + gross_sal);
		System.out.println("\n\t\tNet Salary: " + net_sal);
	}

}

class head_sub extends emp {
	double bp = 20000, da, hra, pf, scf;
	double gross_sal, net_sal;

	// Overriding
	public void sal_slips() {
		da = 0.97 * bp;
		hra = 0.10 * bp;
		pf = 0.12 * bp;
		scf = 0.001 * bp;

		gross_sal = bp + da + hra;
		net_sal = gross_sal - pf - scf;
		System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
		System.out.println("\nBasic Salary: " + bp);
		System.out.println("\nDearness Allowance: " + da);
		System.out.println("\nHRA: " + hra);
		System.out.println("\nPF: " + pf);
		System.out.println("\nStaff Club Fund: " + scf);
		System.out.println("\n\t\t\t_____________________________________________________________");
		System.out.println("\n\t\tGross Salary: " + gross_sal);
		System.out.println("\n\t\tNet Salary: " + net_sal);
	}

}

class teacher extends emp {
	double bp = 15000, da, hra, pf, scf;
	double gross_sal, net_sal;

	// Overriding
	public void sal_slips() {
		da = 0.97 * bp;
		hra = 0.10 * bp;
		pf = 0.12 * bp;
		scf = 0.001 * bp;

		gross_sal = bp + da + hra;
		net_sal = gross_sal - pf - scf;
		System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
		System.out.println("\nBasic Salary: " + bp);
		System.out.println("\nDearness Allowance: " + da);
		System.out.println("\nHRA: " + hra);
		System.out.println("\nPF: " + pf);
		System.out.println("\nStaff Club Fund: " + scf);
		System.out.println("\n\t\t\t_____________________________________________________________");
		System.out.println("\n\t\tGross Salary: " + gross_sal);
		System.out.println("\n\t\tNet Salary: " + net_sal);
	}

}

class peon extends emp {
	double bp = 5000, da, hra, pf, scf;
	double gross_sal, net_sal;

	// Overriding
	public void sal_slips() {
		da = 0.97 * bp;
		hra = 0.10 * bp;
		pf = 0.12 * bp;
		scf = 0.001 * bp;

		gross_sal = bp + da + hra;
		net_sal = gross_sal - pf - scf;
		System.out.println("\n\t\t\t<<<<Your Salary Details>>>>");
		System.out.println("\nBasic Salary: " + bp);
		System.out.println("\nDearness Allowance: " + da);
		System.out.println("\nHRA: " + hra);
		System.out.println("\nPF: " + pf);
		System.out.println("\nStaff Club Fund: " + scf);
		System.out.println("\n\t\t\t_____________________________________________________________");
		System.out.println("\n\t\tGross Salary: " + gross_sal);
		System.out.println("\n\t\tNet Salary: " + net_sal);
	}

}

//	Profile class
class Profile_ {

	String Dept;
	int class_student;

//    Parameterised Overloaded constructor with this keyword
	Profile_(String Dept) {

		this.Dept = Dept;

		String name[] = { "Sir TaQI", "Sir Javeed", "Sir Areeb", "Sir Ukasha", "Sir Imran", "Sir Zia", "Sir Manzoor",
				"Sir Jawaid", "Miss Sabeen", "MIss Misbah", "Mis Mahrukh", " Miss Anjum", " Miss Samina",
				" Sir Muzammil", " Sir Atir", " Sir Etezaz", " Miss Maheen ", " Miss Huma", " Miss Nimra", " Sir Anwar",
				" Miss Rumaisa", " Sir Faraz" };
//		        index              0   ,   1        ,      2        ,      3      ,  4        ,   5     ,     6      ,     7    ,       8     ,       9        ,         10       ,    11   ,     12        ,    13   ,          14      ,       15       ,   16          ,    17        ,    18       ,    19      ,    20     ,      21 
		String I_D[] = { " Taqi2456", "Javeed11344", "Areeb13451", "Ukasha54646", "Imran6546", "Zia21468",
				"Manzoor2465", "Jawaid2156", "Sabeen8995", "Misbah87496", "Mahrukh63564", "Anjum5464", "Samina65456",
				"Muzammil86964", "Atir54335", "Etezaz5425", "Maheen21322 ", "Huma53533", "Nimra3666", "Anwar31631",
				"Rumaisa5446", "Faraz24646" };
		// index 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 ,
		// 16 , 17 , 18 , 19 , 20 , 21

		if (Dept.equalsIgnoreCase("English")) {
			System.out.println(" \t <<<<< WELCOME TO ENGLISH DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[1]);
			System.out.println(" 2) School I'D  --> " + I_D[1]);
			System.out.println(" 3) " + name[1] + " Contact No --> 03000023623");
			System.out.println(" 4) " + name[1] + " Department --> English Department");
			System.out.println(" 5) " + name[1] + " Address --> B-2, Industrial Area, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[2]);
			System.out.println(" 2) School I'D  --> " + I_D[2]);
			System.out.println(" 3) " + name[2] + " Contact No --> 03686378633");
			System.out.println(" 4) " + name[2] + " Department --> English Department");
			System.out.println(" 5) " + name[2] + " Address --> A-66, Commercial Area, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t THIRD TEACHER INFORMATION  \n");
			System.out.println(" 1)  Name --> " + name[0]);
			System.out.println(" 2) School I'D  --> " + I_D[0]);
			System.out.println(" 3) " + name[0] + " Contact No --> 03300054911");
			System.out.println(" 4) " + name[0] + " Department --> English Department");
			System.out.println(" 5) " + name[0] + " Address --> AF-2, Clifton, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		} else if (Dept.equalsIgnoreCase("URDU")) {
			System.out.println(" \t <<<<< WELCOME TO URDU DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[3]);
			System.out.println(" 2) School I'D  --> " + I_D[3]);
			System.out.println(" 3) " + name[3] + " Contact No --> 03896892623");
			System.out.println(" 4) " + name[3] + " Department --> Urdu Department");
			System.out.println(" 5) " + name[3] + " Address --> F-5, Industrial Area, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[4]);
			System.out.println(" 2) School I'D  --> " + I_D[4]);
			System.out.println(" 3) " + name[4] + " Contact No --> 03687862633");
			System.out.println(" 4) " + name[4] + " Department --> Urdu Department");
			System.out.println(" 5) " + name[4] + " Address --> A-886, Commercial Area, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t THIRD TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[5]);
			System.out.println(" 2) School I'D  --> " + I_D[5]);
			System.out.println(" 3) " + name[5] + " Contact No --> 03300054911");
			System.out.println(" 4) " + name[5] + " Department --> Urdu Department");
			System.out.println(" 5) " + name[5] + " Address --> AF/T-2, North Karachi, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		}

		else if (Dept.equalsIgnoreCase("Islamiat")) {
			System.out.println(" \t <<<<< WELCOME TO ISLAMIAT DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[6]);
			System.out.println(" 2) School I'D  --> " + I_D[6]);
			System.out.println(" 3) " + name[6] + " Contact No --> 0386372300");
			System.out.println(" 4) " + name[6] + " Department --> Islamiat Department");
			System.out.println(" 5) " + name[6] + " Address --> AA-8, FB Area, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[7]);
			System.out.println(" 2) School I'D  --> " + I_D[7]);
			System.out.println(" 3) " + name[7] + " Contact No --> 03686446339");
			System.out.println(" 4) " + name[7] + " Department --> Islamiat Department");
			System.out.println(" 5) " + name[7] + " Address --> DH-246, S.M Society, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t THIRD TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[8]);
			System.out.println(" 2) School I'D  --> " + I_D[8]);
			System.out.println(" 3) " + name[8] + " Contact No --> 03304268211");
			System.out.println(" 4) " + name[8] + " Department --> Islamiat Department");
			System.out.println(" 5) " + name[8] + " Address --> CC05-2, New Karachi, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		}

		else if (Dept.equalsIgnoreCase("Science")) {
			System.out.println(" \t <<<<< WELCOME TO SCIENCE DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[9]);
			System.out.println(" 2) School I'D  --> " + I_D[9]);
			System.out.println(" 3) " + name[9] + " Contact No --> 03000898970");
			System.out.println(" 4) " + name[9] + " Department --> Science Department");
			System.out.println(" 5) " + name[9] + " Address --> AA-8, Near Karachi Cantt, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[10]);
			System.out.println(" 2) School I'D  --> " + I_D[10]);
			System.out.println(" 3) " + name[10] + " Contact No --> 03686446339");
			System.out.println(" 4) " + name[10] + " Department --> Science Department");
			System.out.println(" 5) " + name[10] + " Address --> DH21/246, Buhadrabad, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t THIRD TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[11]);
			System.out.println(" 2) School I'D  --> " + I_D[11]);
			System.out.println(" 3) " + name[11] + " Contact No --> 03304268211");
			System.out.println(" 4) " + name[11] + " Department --> Science Department");
			System.out.println(" 5) " + name[11] + " Address --> CC05-2, New Karachi, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		}

		else if (Dept.equalsIgnoreCase("Mathematics")) {
			System.out.println(" \t <<<<< WELCOME TO MATHEMATICS DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[12]);
			System.out.println(" 2) School I'D  --> " + I_D[12]);
			System.out.println(" 3) " + name[12] + " Contact No --> 03333327570");
			System.out.println(" 4) " + name[12] + " Department --> Mathematics Department");
			System.out.println(" 5) " + name[12] + " Address --> FF-8, Clifton Block # 03, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[13]);
			System.out.println(" 2) School I'D  --> " + I_D[13]);
			System.out.println(" 3) " + name[13] + " Contact No --> 03654736339");
			System.out.println(" 4) " + name[13] + " Department --> Mathematics Department");
			System.out.println(" 5) " + name[13] + " Address --> DH21/246, Near Teen Talwar, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t THIRD TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[14]);
			System.out.println(" 2) School I'D  --> " + I_D[14]);
			System.out.println(" 3) " + name[14] + " Contact No --> 03827268211");
			System.out.println(" 4) " + name[14] + " Department --> Mathematics Department");
			System.out.println(" 5) " + name[14] + " Address --> D-05/2, Malir, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		}

		else if (Dept.equalsIgnoreCase("Biology")) {
			System.out.println(" \t <<<<< WELCOME TO BIOLOGY DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[15]);
			System.out.println(" 2) School I'D  --> " + I_D[15]);
			System.out.println(" 3) " + name[15] + " Contact No --> 03335435470");
			System.out.println(" 4) " + name[15] + " Department --> Biology Department");
			System.out.println(" 5) " + name[15] + " Address --> Block Z-8, Gulshan -E- Iqbal, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[16]);
			System.out.println(" 2) School I'D  --> " + I_D[16]);
			System.out.println(" 3) " + name[16] + " Contact No --> 03654736339");
			System.out.println(" 4) " + name[16] + " Department --> Biology Department");
			System.out.println(" 5) " + name[16] + " Address --> DH17/06, Saddar,, Karachi Destrict South");

			System.out.println(" \t ______________________________________________ \n");

		}

		else if (Dept.equalsIgnoreCase("Physics")) {
			System.out.println(" \t <<<<< WELCOME TO PHYSICS DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[17]);
			System.out.println(" 2) School I'D  --> " + I_D[17]);
			System.out.println(" 3) " + name[17] + " Contact No --> 03335457570");
			System.out.println(" 4) " + name[17] + " Department --> Physics Department");
			System.out.println(" 5) " + name[17] + " Address --> S- 56 , Main Tariq Road, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[18]);
			System.out.println(" 2) School I'D  --> " + I_D[18]);
			System.out.println(" 3) " + name[18] + " Contact No --> 03655586339");
			System.out.println(" 4) " + name[18] + " Department --> Physics Department");
			System.out.println(" 5) " + name[18] + " Address --> 25-DH / 06, Clifton Block # 08, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		} else if (Dept.equalsIgnoreCase("Chemistry")) {
			System.out.println(" \t <<<<< WELCOME TO CHEMISTRY DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[19]);
			System.out.println(" 2) School I'D  --> " + I_D[19]);
			System.out.println(" 3) " + name[19] + " Contact No --> 0336467570");
			System.out.println(" 4) " + name[19] + " Department --> Chemistry Department");
			System.out.println(" 5) " + name[19] + " Address --> D- 06 , Badar Commercial DHA Phase # 06, Karachi");

			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t SECOND TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[20]);
			System.out.println(" 2) School I'D  --> " + I_D[20]);
			System.out.println(" 3) " + name[20] + " Contact No --> 03655586339");
			System.out.println(" 4) " + name[20] + " Department --> Chemistry Department");
			System.out.println(" 5) " + name[20] + " Address --> BT - 78, Near Bilawal Chorangi, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		} else if (Dept.equalsIgnoreCase("Computer")) {
			System.out.println(" \t <<<<< WELCOME TO COMPUTER DEPARTMENT >>>>> \n\n");
			System.out.println(" \t ______________________________________________ \n");

			System.out.println("\t FIRST TEACHER INFORMATION  \n");
			System.out.println(" 1) Name --> " + name[21]);
			System.out.println(" 2) School I'D  --> " + I_D[21]);
			System.out.println(" 3) " + name[21] + " Contact No --> 0336467570");
			System.out.println(" 4) " + name[21] + " Department --> Computer Department");
			System.out.println(" 5) " + name[21] + " Address --> DH - 246, Rahat Commercial DHA Phase # 04, Karachi");

			System.out.println(" \t ______________________________________________ \n");

		}

	}

// Overloaded Constructor with 'this' keyword
	Profile_(int class_student) {

		this.class_student = class_student;
		String name[] = { "Ahmed Khan", "Ali Hamza", "Areeb Khan", "Imran Shah", "Zia Ahmed Khan", "Abdullah",
				"Abdul Mughni", "Taha Qaiser", "Ayesha Furqan", "Fasih Shaukat", "Hamza Khan", "Junaid Khan",
				"Dua Faisal", " Easha Ukasha", " Taseer ", " Zahir khan", " Maheen Taha", "haseebullah  ",
				"Muhammad Areeb ", " Babar Anwar", " Rumaisa Khan", " Umer Ahsan", " Haris Khan", " Haadi Chauhan",
				" Muhammad Moiz ", "Danish Khan ", " Furqan Ayaz", " Muhammad Hannan", " Darakhshan Mujtaba" };
//		     index              0   ,      1        ,      2      ,      3      ,     4        ,     5     ,     6      ,          7    ,         8     ,          9        ,          10       ,    11   ,      12        ,     13   ,        14      ,      15       ,  16          ,   17        ,    18       ,        19      ,           20     ,      21       ,     22     ,          23      ,      24      ,        25     ,         26       ,     27              ,    28 
		int Roll[] = { 01, 02, 03, 19, 5, 119, 5, 6, 55, 68, 19, 01, 02, 03, 19, 5, 119, 5, 6, 55, 68, 19, 23, 51, 89,
				26, 12, 246, 21246 };
//		              0 ,  1,   2 , 3 ,4 , 5, 6,  7, 8, 9, 10,  11, 12 , 13, 14, 15, 16, 17,18,19,20, 21, 22,23, 24, 25,26, 27 ,28     

		if (class_student == 1) {
			System.out.println("\t <<< WELCOME TO CLASS # 01 >>> \n");
			System.out.println("*) Student's Information Of Class # 1 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[0] + " Roll No:" + Roll[0] + " \n");
			System.out.println(" *) Name: " + name[1] + " Roll No:" + Roll[1] + " \n");
			System.out.println(" *) Name: " + name[2] + " Roll No:" + Roll[2] + " \n");
			System.out.println(" *) Name: " + name[3] + " Roll No:" + Roll[3] + " \n");
			System.out.println(" *) Name: " + name[4] + " Roll No:" + Roll[4] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		} else if (class_student == 2) {
			System.out.println("\t <<< WELCOME TO CLASS # 02 >>> \n");
			System.out.println("*) Student's Information Of Class # 2 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[5] + " Roll No:" + Roll[5] + " \n");
			System.out.println(" *) Name: " + name[6] + " Roll No:" + Roll[6] + " \n");
			System.out.println(" *) Name: " + name[7] + " Roll No:" + Roll[7] + " \n");
			System.out.println(" *) Name: " + name[8] + " Roll No:" + Roll[8] + " \n");
			System.out.println(" *) Name: " + name[9] + " Roll No:" + Roll[9] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 3) {
			System.out.println("\t <<< WELCOME TO CLASS # 03 >>> \n");
			System.out.println("*) Student's Information Of Class # 3 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[10] + " Roll No:" + Roll[10] + " \n");
			System.out.println(" *) Name: " + name[11] + " Roll No:" + Roll[11] + " \n");
			System.out.println(" *) Name: " + name[12] + " Roll No:" + Roll[12] + " \n");
			System.out.println(" *) Name: " + name[13] + " Roll No:" + Roll[13] + " \n");
			System.out.println(" *) Name: " + name[14] + " Roll No:" + Roll[14] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 4) {
			System.out.println("\t <<< WELCOME TO CLASS # 04 >>> \n");
			System.out.println("*) Student's Information Of Class # 4 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[15] + " Roll No:" + Roll[15] + " \n");
			System.out.println(" *) Name: " + name[16] + " Roll No:" + Roll[16] + " \n");
			System.out.println(" *) Name: " + name[17] + " Roll No:" + Roll[17] + " \n");
			System.out.println(" *) Name: " + name[18] + " Roll No:" + Roll[18] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 5) {
			System.out.println("\t <<< WELCOME TO CLASS # 05 >>> \n");
			System.out.println("*) Student's Information Of Class # 5 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[11] + " Roll No:" + Roll[11] + " \n");
			System.out.println(" *) Name: " + name[16] + " Roll No:" + Roll[16] + " \n");
			System.out.println(" *) Name: " + name[19] + " Roll No:" + Roll[19] + " \n");
			System.out.println(" *) Name: " + name[13] + " Roll No:" + Roll[18] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 6) {
			System.out.println("\t <<< WELCOME TO CLASS # 06 >>> \n");
			System.out.println("*) Student's Information Of Class # 6 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[13] + " Roll No:" + Roll[19] + " \n");
			System.out.println(" *) Name: " + name[15] + " Roll No:" + Roll[20] + " \n");
			System.out.println(" *) Name: " + name[16] + " Roll No:" + Roll[21] + " \n");
			System.out.println(" *) Name: " + name[19] + " Roll No:" + Roll[22] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 7) {
			System.out.println("\t <<< WELCOME TO CLASS # 07 >>> \n");
			System.out.println("*) Student's Information Of Class # 7 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[13] + " Roll No:" + Roll[19] + " \n");
			System.out.println(" *) Name: " + name[18] + " Roll No:" + Roll[23] + " \n");
			System.out.println(" *) Name: " + name[16] + " Roll No:" + Roll[21] + " \n");
			System.out.println(" *) Name: " + name[19] + " Roll No:" + Roll[22] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 8) {
			System.out.println("\t <<< WELCOME TO CLASS # 08 >>> \n");
			System.out.println("*) Student's Information Of Class # 8 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[21] + " Roll No:" + Roll[21] + " \n");
			System.out.println(" *) Name: " + name[23] + " Roll No:" + Roll[23] + " \n");
			System.out.println(" *) Name: " + name[22] + " Roll No:" + Roll[22] + " \n");
			System.out.println(" *) Name: " + name[24] + " Roll No:" + Roll[24] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 9) {
			System.out.println("\t <<< WELCOME TO CLASS # 09 >>> \n");
			System.out.println("*) Student's Information Of Class # 9 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[21] + " Roll No:" + Roll[25] + " \n");
			System.out.println(" *) Name: " + name[25] + " Roll No:" + Roll[22] + " \n");
			System.out.println(" *) Name: " + name[20] + " Roll No:" + Roll[20] + " \n");
			System.out.println(" *) Name: " + name[21] + " Roll No:" + Roll[14] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 9) {
			System.out.println("\t <<< WELCOME TO CLASS # 09 >>> \n");
			System.out.println("*) Student's Information Of Class # 9 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[20] + " Roll No:" + Roll[25] + " \n");
			System.out.println(" *) Name: " + name[25] + " Roll No:" + Roll[26] + " \n");
			System.out.println(" *) Name: " + name[26] + " Roll No:" + Roll[21] + " \n");
			System.out.println(" *) Name: " + name[21] + " Roll No:" + Roll[22] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}

		else if (class_student == 10) {
			System.out.println("\t <<< WELCOME TO CLASS # 10 >>> \n");
			System.out.println("*) Student's Information Of Class # 10 Is Given Below: \n");
			System.out.println("______________________________________________________________________ \n\n ");
			System.out.println(" *) Name: " + name[23] + " Roll No:" + Roll[21] + " \n");
			System.out.println(" *) Name: " + name[26] + " Roll No:" + Roll[26] + " \n");
			System.out.println(" *) Name: " + name[27] + " Roll No:" + Roll[27] + " \n");
			System.out.println(" *) Name: " + name[28] + " Roll No:" + Roll[28] + " \n");

			System.out.println("______________________________________________________________________ \n\n ");

		}
	}

}

//  Communication class
class communication {
//	Parameterised Constructor
	String msg(String ms) {

		System.out.println("\t\t <<<<< MESSAGE >>>>> \r\n\n" + ms
				+ "\n\t\t __________________________________________________ \n ");
		System.out.println("\t\t Your message has been successfully sent to the students \n");
		System.out.println("\t\t ________________________________________________\n");
		return ms;
	}
}

// teacher attendance class
class teacher_att {
//	overloaded method
	public void att(String t_name) {
		Scanner val1 = new Scanner(System.in);
		System.out.println("\n\t\t\t__________________________________");

		System.out.print("\nEnter number of days teacher was present (out of 30 days): ");
		int p_days = val1.nextInt();
		int T_days = 30;
		double T_att = 100 * p_days / T_days;
		System.out.print("\nPercentage of Attendace of " + t_name + " is: " + T_att + "%");

	}

}

// student attendance class
class student_att {
//		  overloaded method
	public void att(String s_name) {
		Scanner val2 = new Scanner(System.in);
		System.out.println("\n\t\t\t__________________________________");
		System.out.print("\nEnter number of days student was present: ");
		int p_days = val2.nextInt();
		int T_days = 30;
		double T_att = 100 * p_days / T_days;
		System.out.print("\nPercentage of Attendace of " + s_name + " is: " + T_att + "%");
	}
}