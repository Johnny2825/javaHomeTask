public class HomeTask1{
	public static void main(String[] args){
		
		//инициализация переменных
		byte b = 3;
		short s = 43;
		int i = -502;
		long l = 205827L;
		float f = -12.37f;
		double d = 8323.235;
		char c = 'G';
		boolean bool = true;
		System.out.println(b + "; " + s + "; " + i + "; " + l + "; " + f + "; " + d + "; " + c + "; " + bool);
		
		System.out.println(expression(2, 4, 10, 2));
		System.out.println(comparison1(30, -10));
		comparison2(33);
		System.out.println(comparison3(-5));
		helloName("Bob");
		whatYear(2016);
	}
	
	//метод для выражения a * (b + (c / d))
	public static int expression(int a, int b, int c, int d){
		int result = a * (b + (c / d));
		return result;
	}
	
	//метод для проверки суммы в диапазоне [10, 20] 
	public static boolean comparison1(int a, int b){
		boolean result = false;
		if (((a + b) >= 10) && ((a + b) <= 20)){
			result = true;
		}
		return result;
	}
	
	//метод для проверки положительное ли число
	public static void comparison2(int a){
		if (a >= 0){
			System.out.println("Число " + a + " положительное");
		} else {
			System.out.println("Число " + a + " отрицательное");
		}
	}
	
	//метод для проверки отрицательное ли число
	public static boolean comparison3(int a){
		if (a < 0){
			return true;
		} else {
			return false;
		}
	}
	
	//метод "привет"
	public static void helloName(String name){
		System.out.println("Привет, " + name + "!");
	}
	
	//метод какой год
	public static void whatYear(int year){
		if ((year % 4) == 0){
			if ((year % 100) != 0){
				System.out.println(year + " високосный");
			} else {
				if ((year % 400) == 0){
					System.out.println(year + " високосный");
				} else {
					System.out.println(year + " не високосный");
				}
			}
		} else {
			System.out.println(year + " не високосный");
		}
	}
}