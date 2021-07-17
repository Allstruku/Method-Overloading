package methodOverloadingExam;

// 매개변수의 수, 타입이 다를 경우 동일한 이름으로 메소드를 여러개  정의할 수 있다
// 예를 들어서, 메소드 3개 (정수 x, y를 받아서 정수 값을 돌려주는 메소드, 정수 x, y, z를 받아서 정수 값을
// 돌려주는 메소드 그리고 문자열 x, y를 받아서 문자열을 돌려주는 메소드) 가 있으면 동일한 이름을 사용해서 메소드 생성 가능
class MethodOverloading {
	public int plus(int x, int y) {
		return x + y;
	}
	public int plus(int x, int y, int z) {
		return x + y +z;
	}
	public String plus(String x, String y) {
		return x + y;
	}
	
// Number of parameters (매개변수 수)
// Data type of parameters (매개변수의 데이터 타입)
// Sequence of data type of parameters (매개변수의 데이터 타입 순서)
// 이 다르다면 Method Overloading 가능하다.
	
	
	public static void main(String[] args) {
		MethodOverloading plusMethod = new MethodOverloading();
			System.out.println(plusMethod.plus(4, 5));
			System.out.println(plusMethod.plus(4, 5, 6));
			System.out.println(plusMethod.plus("Hello", " World"));
	}
}
