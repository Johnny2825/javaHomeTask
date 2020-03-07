import java.io.*;
import java.util.Random;

public class HomeTask3_2{
	public static void main(String[] args){
		game();
	}
	
	static void game(){
		Random random = new Random();
		String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
		"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
		"pepper", "pineapple", "pumpkin", "potato"};
		String wordFromGame = words[(random.nextInt(words.length))];
		System.out.println("Для отладки, комп загадал " + wordFromGame);
		String wordFromUser = input();
		int i = 0;
		String answer = "";
		
		while(true){
			if(!(wordFromUser.equals(wordFromGame))){
				if ((wordFromUser.length() > i) && (wordFromGame.length() > i) && (wordFromGame.charAt(i) == wordFromUser.charAt(i))){
					answer = wordFromUser.substring(0, i); //
					i++;
				} else {
					answer = wordFromUser.substring(0, i);
					while (answer.length() != 15){
						answer += "#";
					}
					System.out.println(answer);
					System.out.println("Попробуй другое слово");
					wordFromUser	= input();
					i = 0;
				}
			} else {
				System.out.println("Вы угадали слово " + wordFromUser);
				break;
			}
		}
	}
	
	static String input(){
		boolean etc = false;
		String line = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(!etc){
				System.out.println("Введите слово");
				line = br.readLine();
				if ((line.length() != 0)){
					etc = true;
					} else {
						System.out.println("Введите слово");
					}
			}
									
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  line.toLowerCase();
	}
}