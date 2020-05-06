package day10;

public class polymorphismEx2 {

	public static void main(String[] args) {
		
		/*제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리 할 수 있다.
		 * 
		
		Car[]arr = new Car[10]; //입고차량을 관리하기 위한 배열
		arr[0] = KiaCar();
		arr[1] = HyundaiCar();
		/* 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어서 관리해야한다.
		 * 
		
		KiaCar karr[] = new KiaCar[10];
		HyundaiCar harr[] = new HyundaiCar[10];
		karr[0] = new KiaCar();
		harr[0] = new HyundaiCar();
		*/
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그랜져");
		showCar(arr);
	}
	
	public static void showCar(Car []arr) {
		System.out.println("--입고된 차량 리스트--");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i] instanceof KiaCar) {									
				System.out.println(arr[i].manufacturer +" : " + arr[i].name + " : " +((KiaCar)arr[i]).Kia);
				}
				if(arr[i] instanceof HyundaiCar) {									
					System.out.println(arr[i].manufacturer +" : " + arr[i].name + " : " +((HyundaiCar)arr[i]).h);
					}
			}			
		}
	}
}
class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	
	//생성자
	public Car() {}
	
	public Car(String manufacturer,String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
	
}
class KiaCar extends Car{
	String Kia = "기아자동차 입니다.";
	public KiaCar() { manufacturer = "Kia";}
	
	public KiaCar(String name) {
		super("Kia",name);
	}
	
}
class HyundaiCar extends Car{
	String h = "현대자동차 입니다.";
	public HyundaiCar() { manufacturer = "HyundaiCar";}
	
	public HyundaiCar(String name) {
		super("Hyundai",name);
	}
	
}
