package day1;

import java.util.Scanner;

public class ExamVariable {

	
		//main은 콘솔응용프로그램이 실행되기 위해 꼭 필요한 것(메소드기능)
		  public static void main(String[] args) {
		    /*콘솔에 원하는 문자열을 출력한 후 
		    엔터를 치는 것(메소드_)*/
		    System.out.println("Hello world!");
		    System.out.println(7+7);
		    System.out.println(""+(7+7));
		    System.out.println();
		    System.out.print("안뇽*\n");
		    System.out.println(""+(7+7));
		    double dnum = 1.23;
		    System.out.println(dnum);
		    System.out.printf("%1f\n",dnum);
		    System.out.printf("%.4f\n",dnum);
		    System.out.printf("%7.4f\n",dnum);

		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    System.out.println(num);
		    char ch = scan.next().charAt(1);
		    System.out.println(ch);
		    String str = new String();
		    str = scan.next();
		    System.out.println(str);
		    scan.close();
	}

}
