import java.util.Scanner;
import java.util.Random;
//import java.io.*;

public class HomeTask4{
	
	public static final char DOT_EMPTY = '_';
	public static final char DOT_X = 'X';
	public static final char DOT_O = 'O';
	public static int counterStep = 0;
	public static int x, y;
	
	
	
	public static void main(String[] args){

		game(createdField());
	}
	
	static void game(char[][] field){
		boolean etc = true;
		while(etc){
			outputInConsole(field);
			userStep(field);
			counterStep++;
			if(winCheck(field, DOT_X)){
				outputInConsole(field);
				System.out.println("Вы победили!");
				return;
			}
			
			if(checkStep(field, counterStep)){
				outputInConsole(field);
				System.out.println("Ничья");
				return;
			}
			outputInConsole(field);
			compStep(field);
			counterStep++;
			if(winCheck(field, DOT_O)){
				outputInConsole(field);
				System.out.println("Вы проиграли!");
				return;
			}
			
			if(checkStep(field, counterStep)){
				outputInConsole(field);
				System.out.println("Ничья");
				return;
			}
		}
	}
	
	static char[][] userStep(char [][] field){
		
		boolean etc = true;
				
		System.out.println("Ваш ход");
			while(etc){
				System.out.println("Введите строку ");
				x = input() -1;
				System.out.println("Введите столбец ");
				y = input() - 1;
				if(x >= 0 && x < field.length && y>=0 && y < field.length){
					if(field[x][y] == DOT_EMPTY){
						field[x][y] = DOT_X;
						etc = false;
					} else {
						System.out.println("Вы не может сюда походить");
					}
				} else {
					System.out.println("Вы вышли за границы поля");
				}
			}
		
		return field;
	}
	
	static char[][] compStep(char [][] field){
		boolean etc = true;
		Random random = new Random();
		int xPrev, yPrev;
		System.out.println("Ходит компьютер");
		System.out.println(x + " " + y);
		while(etc){
			if(field[field.length/2][field.length/2] == DOT_EMPTY){
				field[field.length/2][field.length/2] = DOT_O;
				return field;
			}
			
			if ((x + 1 < field.length) && (field[x + 1][y] == DOT_EMPTY)){
				field[x + 1][y] = DOT_O;
				return field;
			}
			
			if ((x - 1 > -1) && (field[x - 1][y] == DOT_EMPTY)){
				field[x - 1][y] = DOT_O;
				return field;
			}
			
			if ((y + 1 < field.length) && (field[x][y + 1] == DOT_EMPTY)){
				field[x][y + 1] = DOT_O;
				return field;
			}
			
			if ((y - 1 > -1) && (field[x][y - 1] == DOT_EMPTY)){
				field[x][y - 1] = DOT_O;
				return field;
			}
			
			xPrev = x;
			yPrev = y;
			
		}
		return field;
	}
	
	static boolean winCheck(char [][] field, char symbol){
		
		int etc = field.length;
		if (field.length == 5){
			etc = field.length - 1;
		}
		for(int i = 0; i < field.length; i++){
			int x = 0, y = 0, d1 = 0, d2 = 0;
			for(int j = 0; j < field.length; j++){     
				x += field[i][j] == symbol ? 1 : 0;
                y += field[j][i] == symbol ? 1 : 0;
                d1 += field[j][j] == symbol ? 1 : 0;
				d2 += field[j][field.length - j - 1] == symbol ? 1 : 0;
				if ((x == etc) || (y == etc) || (d1 == etc) || (d2 == etc)){
					return true;
				}
			}
		}
		return false;
	}				
				
		
	static boolean checkStep(char [][] field, int counterStep){  //проверка на ничью
	 				
		if (counterStep == field.length * field.length){
					return true;
		}
		return false;
	}
	
	
	
	static int input(){
	
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		return in;
	}
	
	
	
	static char[][] createdField(){
		
		int size;
		
		while(true){
			System.out.println("Введите размер поля ");
			size = input();
			if (size > 1){
				break;
			} else {
				System.out.println("Слишком маленькое поле");
			}	
		}
					
		char[][] field = new char [size][size];
		
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field.length; j++){
				field[i][j] = DOT_EMPTY;
			}
		}
		return field;
	}
	
	
	static void outputInConsole(char[][] field){
		
		System.out.printf("%4s", " ");
		for(int i =0; i < field.length; i++){
			System.out.printf("%4d ", (i + 1));
		}
		for(int i = 0; i < field.length; i++){
			System.out.println();
			System.out.printf("%3d", (i + 1));
			System.out.printf("%3s", " |");
			for(int j = 0; j < field.length; j++){
				System.out.printf("%2s", field[i][j]);
				System.out.printf("%2s", " |");
			}
		}
		System.out.println();
	}
}