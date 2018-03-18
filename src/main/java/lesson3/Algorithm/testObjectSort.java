package lesson3.Algorithm;

import java.util.Arrays;
import java.util.Collections;

import lesson3.object.Student;


//Тестируем сортировку объектов
public class testObjectSort {
	
	public static void main(String[] args) {
		
		//Создание массивова студентов
		Student[] students = new Student[4];
		students[0] = new Student("Иван", "Иванов");
		students[0].passMath(3);
		students[0].passPhys(3);
		students[0].passProg(3);
		
		students[1] = new Student("Петр", "Петров");
		students[1].passMath(4);
		students[1].passPhys(4);
		students[1].passProg(4);

		students[2] = new Student("Григорий", "Семенов");
		students[2].passMath(5);
		students[2].passPhys(5);
		students[2].passProg(5);

		students[3] = new Student("Ольга", "Иванова");
		students[3].passMath(5);
		students[3].passPhys(5);
		students[3].passProg(4);

		//Библиотечная сортировка (приоритет функция CompareTo)
		Arrays.sort(students, Collections.reverseOrder());
	
		//Вывод отсортированных студентов
		for(Student stud : students)
			System.out.println(stud);
	
	}
	
	
}
