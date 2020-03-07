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
		String wordFromGame = words[(random.nextInt(1))];
		String wordFromUser = input();
		
		System.out.println(wordFromGame);
		System.out.println(wordFromUser);
		System.out.println(wordFromGame.length());
		
		int minSizeWord = 0;
		
		if(wordFromGame.length() >= wordFromUser.length()){  //перенести в цикл
			minSizeWord = wordFromUser.length();
		} else {
			minSizeWord = wordFromGame.length();
		}
		System.out.println(minSizeWord);
		
		int i = 0;
		//System.out.println(wordFromUser.charAt(4)  + "метка");
		//System.out.println(wordFromGame.equals(wordFromUser)  + " метка");
		String answer = "";
		
		while(true){
			if(!(wordFromGame.equals(wordFromUser))){
				while(i < minSizeWord){
					if((wordFromUser.charAt(i) == wordFromGame.charAt(i))){
							answer += wordFromUser.charAt(i);
							System.out.println("Ответ: " + answer  + " " + i);
							i++;
					}
				}
				answer += "###############";
				System.out.println("Ответ: " + answer);
				answer = "";
				wordFromUser = input();
			} else {
				System.out.println("Ответ верный " +wordFromGame);
				break;
			}
		}
	}
	
	static String input(){
		boolean etc = false;
		//сделать алфавит
		//toLowerCase() нижний регистр
		String line = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(!etc){
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
		return line;
	}
}