package day13;

import java.util.Scanner;

public class homeworkEx3 {

	public static void main(String[] args) {
		/*상품을 등록하고, 등록된 상품을 출력하는 코드를 작성하세요.
		예)
		상품을 등록하시겠습니까?(Y/N) : Y
		상품명 : 가방
		가격 : 10,000원
		상품을 등록하시겠습니까?(Y/N) : Y
		상품명 : 마우스
		가격 : 1,000원
		상품을 등록하시겠습니까?(Y/N) : N
		지금까지 등록된 상품 리스트
		1.상품명 : 가방, 가격 : 10,000원
		2.상품명 : 마우스, 가격 : 1,000원*/
		
		int size = 50;
		Product product[] = new Product[size];		
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		//현재저장된 제품의 개수
		int cnt = 0;				
		//1.반복문 사용
		while(menu != 'n') {
			//2.입력을 받음(y/n)
			System.out.print("상품을 등록하시겠습니까 ? (y/n)");
			menu = scan.next().charAt(0);
			//3.입력받은 값을 통해 제품 리스트를 출력할지 제품을 등록할지를 결정
			if(menu=='y') {
				//제품등록
				System.out.print("상품명 : ");
				String name  = scan.next();
				System.out.print("가격 : ");
				String price = scan.next();
				product[cnt] = new Product(name,price);
				cnt++;
			}
		}
		int total = 0;
		//등록된 제품리스트 출력
		for(int i = 0; i < cnt; i++) {
			product[i].print(i+1);
			
			
			total += Integer.parseInt(product[i].getPrice());
		}
		System.out.println("총 가격 : " + total + "원");
		scan.close();
	}


}
class Product{
	private String name;
	private String price;
	
	public Product() {}

	public Product(String name, String price) {
		//super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public void print() {
		System.out.printf("상품명 : %s, 가격 : %d원\n", name, price );
	}
	public void print(int num) {
		System.out.print(num + ". ");
		print();
	}			
}
