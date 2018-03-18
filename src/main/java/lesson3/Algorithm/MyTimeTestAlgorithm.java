package lesson3.Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MyTimeTestAlgorithm {

	public static void main(String[] args) {

		int size = 10000000;
		//
		int A[] = new int[size];

		//начальное значение для генерации случайных чисел
		Random rnd = new Random(System.currentTimeMillis()); 


		int min = 0;
		for(int i = 0; i < A.length; i++)
			A[i] =  min + rnd.nextInt( size - min - 1);  

		System.out.println("1. Быстрая сортировка");
		System.out.println("2. Пузырьковая");
		System.out.println("3. Библиотечная");

		Scanner scan = new Scanner(System.in);
		int chosenValue = scan.nextInt();
		long startTime = System.nanoTime();    //Получаем время в кол-ве наносекунд

		switch(chosenValue)
		{
		case 1:
			Algorithm.qsort(0, A.length - 1, A);  //Быстрая сортировка
			break;
		case 2:
			Algorithm.sort(A);   //Пузырьковая сортировка
			break;
		case 3: 
			Arrays.sort(A);     //Библиотечная сортировка
			break;
		default:
			System.out.println("Неверное значение");
			return;
		}

		//Вычисляем длительность работы алгоритма
		long estimatedTime = System.nanoTime() - startTime;   

		System.out.println("Время " + estimatedTime * 1E-9);
		int index = 0;
		//Печать первых 20 элементов
		for(int a : A)
		{
			System.out.printf(a + "  ");
			index++;
			if (index > 20 )
			{
				System.out.print(" .....");
				break;
			}
		}

		scan.close();
	}
}
