import java.io.*;
import java.util.Random;

public class HomeTask3_1{
	
	public static void main(String[] args){
		
		do{
			startGame();
		} while(exitGame());
		
	}
	
	static void startGame(){
		
		int attept = 3;
		
		Random random = new Random();
		int numberFromGame = (int)(random.nextInt(10));
		
		System.out.println("Компьютер загадал " + numberFromGame);
		
		while(attept > 0){
			System.out.println("Введите число от 0 до 9");
			int userInput = input();
			if(userInput > numberFromGame){
				System.out.println("Загаданное число меньше");
			} else {
				if (userInput < numberFromGame){
					System.out.println("Загаданное число больше");
				} else {
					System.out.println("Вы угадали");
					break;
				}
			}
			if (attept == 1){
				System.out.println("Количество попыток кончилось, вы проиграли");
			}
			attept --;
		}
	}
	
	static int input(){
		boolean etc = false;
		String numbers = "0123456789";
		String line = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(!etc){
				line = br.readLine();
				if ((line.length() != 0) & (numbers.contains(line))){
					etc = true;
					} else {
						System.out.println("Неверный ввод");
					}
			}
									
		} catch (Exception e) {
			e.printStackTrace();
		}
		int numberUser = Integer.parseInt(line);
		return numberUser;
	}
	
	static boolean exitGame(){
		int tmp;
		System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");	
		while (true){
				tmp = input();
				switch (tmp){
					case 0:
						return false;
					case 1:
						return true;
				}
				System.out.println("Неверный ввод");
		}
	}
}