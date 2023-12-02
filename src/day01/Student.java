package day01;

import java.util.Scanner;

public class Student {
	int englishmarks;
	int Socialmarks;
	int  mathmarks;
	int sciencemarks;
	int tm;
	float avg;
	
	 void totalmarks() {
		tm = englishmarks+Socialmarks+mathmarks+sciencemarks;
		System.out.println("Total Marks : " + tm);
	}
	 void Average() {
		 avg = englishmarks+Socialmarks+mathmarks+sciencemarks/4;
		 System.out.println("Total Average : " + avg);
	 }
		
	
	public static void main(String[] args) {
		//System.out.println("Total Marks : " + tm);
		//totalmarks();
		//System.out.println("Total Marks : " +tm);
		
		Student stu1 = new Student();
		stu1.englishmarks = 88;
		stu1.Socialmarks = 97;
		stu1.mathmarks = 88;
		stu1.sciencemarks = 77;
		stu1.totalmarks();
		stu1.Average();
		
		Student stu2 = new Student();
		stu2.englishmarks = 100;
		stu2.Socialmarks = 59;
		stu2.mathmarks = 90;
		stu2.sciencemarks = 67;
		stu2.totalmarks();
		stu2.Average();
		
		Student stu3 = new Student();
		stu3.englishmarks = 50;
		stu3.Socialmarks = 90;
		stu3.mathmarks = 78;
		stu3.sciencemarks = 89;
		stu3.totalmarks();
		stu3.Average();
		
		Student stu4 = new Student();
		stu4.englishmarks = 100;
		stu4.Socialmarks = 100;
		stu4.mathmarks = 100;
		stu4.sciencemarks = 100;
		stu4.totalmarks();
		stu4.Average();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter englishmarks");
		int englishmarks = sc.nextInt();
		stu1.englishmarks = englishmarks;
		System.out.println("Please enter Socialmarks");
		int Socialmarks = sc.nextInt();
		stu1.Socialmarks = Socialmarks;
		System.out.println("Please enter mathmarks");
		int mathmarks = sc.nextInt();
		stu1.mathmarks = mathmarks;
		System.out.println("Please enter sciencemarks");
		int sciencemarks = sc.nextInt();
		stu1.sciencemarks = sciencemarks;
		stu1.totalmarks();
		stu1.Average();
				
	}
	
	

}
