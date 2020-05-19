package day19;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//
	public static Student StudentAdd(Scanner scan, Student tmp[], Student arr[]){
		return null;
	}
	/* 기능 : 학생정보를 입력받아 입력받은 학생정보를 저장하고 저장된 학생정보를 학생정보가있는 배열에 추가하여 알려주는 메소드
	 * 매개변수 : 입력, 학생정보를 저장하고, 학생정보가 있는 배열 => Scanner scan, Student tmp[], Student arr []
	 * 리턴타입 : void
	 * 메소드명 : StudentAdd
	 */
	public static boolean StudentModify(Student arr [], String num){
		return true;
	}
	/* 기능 : 학생정보가 있는 배열에 해당 학생의 학번을 검색하여 배열에 있는지 없는지 확인하여  있으면 수정하여 반환하는 메소드
	 * 매개변수 : 학생정보가 있는 배열, 해당 학생의 학번을 검색  => Student arr [], String num
	 * 리턴타입 : boolean
	 * 메소드명 : StudentModify
	 */
	public static boolean StudentDelete(Student arr [], String num){
		return true;
	}
	/* 기능 : 학생정보가 있는 배열에 해당학생의 학번을 검색하여 학생정보가 있는지 없는지 확인하여  있으면 삭제하여 반환하는 메소드
	 * 매개변수 : 학생정보가 있는 배열, 해당학생의 학번 => Student arr [], String num
	 * 리턴타입 : boolean
	 * 메소드명 : StudentDelete
	 */

class Student{
	String name; //이름
	String num;  //학번 => 고유번호
	String major;//전공
	String grade;//학년
}
}