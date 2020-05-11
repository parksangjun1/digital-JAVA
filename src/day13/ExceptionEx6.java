package day13;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//예외가 발생할수있는경우 try안에넣어준다.
			throw new MyException(100, "예외 상황입니다."); //아래와 동일하다..
			//MyException e = new MyException(100, "예외 상황입니다."); 
			// throw e;
		}catch(MyException e) {//예외가 발생하면 해당되는 문장에 넣어주는 
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception 입니다.");
		}
	}

}
/* 이름에 예외가 들어간 MyException이라는 클래스를 만들는 것이 아니라
 * 예외처리에서 사용할 수 있는 MyException 클래스의 생성
 */
class MyException extends Exception{
	private final int ERR_CODE;
	public MyException(int err_code, String msg) {
		super(msg);
		ERR_CODE = err_code;
	}
	public MyException() {
		ERR_CODE = -1;
	}
	public MyException(int err_code) {
		ERR_CODE = err_code;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	public int getERR_CODE() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		
		return "ERR_CODE : "+ ERR_CODE + ", MSG : " + super.getMessage();
	}
}