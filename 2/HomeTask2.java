import java.util.Random;

public class HomeTask2{
	public static void main(String[] args){
		
		System.out.println("Задание 1");
		task1();
		
		System.out.println();
		System.out.println("Задание 2");
		task2();
		
		System.out.println();
		System.out.println("Задание 3");
		task3();
		
		System.out.println();
		System.out.println("Задание 4");
		task4();
		
		System.out.println();
		System.out.println("Задание 5");
		task5();
		
		System.out.println();
		System.out.println("Задание 6");
		int[] arrayTask6 = {1, 4, 4, 7, 2};
		System.out.println(task6(arrayTask6));
		
		System.out.println();
		System.out.println("Задание 7");
		Random random = new Random();
		int n = 1;
		int[] arrayTask7 = new int[10];
		for(int i = 0; i < arrayTask7.length; i++){
			arrayTask7[i] = (int)(random.nextInt(10));
		}
		task7(arrayTask7, n);

	}
	
	// задание 1
	public static void task1(){
		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++){
			array[i] =random.nextInt(2);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++){
			switch (array[i]){
				case 0:
					array[i] = 1;
					break;
				case 1:
					array[i] = 0;
					break;
			}
			System.out.print(array[i] + " ");
		}
	}
	
	//задание 2
	public static void task2(){
		int[] array = new int[8];
		for(int i = 0; i < array.length; i++){
			array[i] = 3 * i;
			System.out.print(array[i] + " ");
		}
	}
	
	//задание 3
	public static void task3(){
		int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < array.length; i++){
			if (array[i] < 6){
				array[i] *= 2;
			}
			System.out.print(array[i ] + " ");
		}
	}
	
	//задание 4
	public static void task4(){
		Random random = new Random();
		int[][] array = new int[7][7];
		
		for(int i = 0; i < array.length; i++){
			System.out.println();
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = (int)(random.nextInt(10));
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++){
			System.out.println();
			for(int j = 0; j < array[i].length; j++){
				if ((i == j) || (i + j == array.length -1)){
					array[i][j] = 1;
				}
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	//задание  5
	public static void task5(){
		Random random = new Random();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(random.nextInt(21));
			System.out.print(array[i] + " ");
		}
		
		int max = array[0];
		int min = array[0];
		
		for(int i = 0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
			}
			if (array[i] < min){
				min = array[i];
			}
		}
		System.out.println();
		System.out.println("Max = " + max + " Min = " + min);
	}
	
	//задание 6
	public static boolean task6(int checkBalance[]){
		Random random = new Random();
		boolean tmp = false;
		
		 
		for(int i = 0; i < checkBalance.length; i++){
			//checkBalance[i] = (int)(random.nextInt(10)); заполнение массива рандомными числами
			System.out.print(checkBalance[i] + " ");
		}
		System.out.println();
		
		int sumLeft = 0;
		int sumRight = 0;
		for(int i = 1; i < checkBalance.length; i++){
			for(int j = 0; j < i; j++){
				sumLeft += checkBalance[j];
			}
			for(int k = i; k < checkBalance.length; k++){
				sumRight += checkBalance[k];
			}
			if(sumLeft == sumRight){
				tmp = true;
				System.out.println("Граница перед " + checkBalance[i]);
			}
			sumLeft = 0;
			sumRight = 0;
		}
		return tmp;
	}
	
	//задание 7
	public static void task7(int[] array, int n){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int tmp;
		
		if(n > 0){
			for(int i = 0; i < n; i++){
				tmp = array[array.length - 1];
				for(int j = array.length -1; j > 0; j--){
					array[j] = array[j-1];
				}
				array[0] = tmp;
			}
		} else {
			for(int i = 0; i < Math.abs(n); i++){
				tmp = array[0];
				for(int j = 0; j < array.length - 1; j++){
					array[j] = array[j+1];
				}
				array[array.length -1] = tmp;
			}
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}