package ru.mai.junior.lesson4;

import lesson3.Algorithm.Algorithm;
import lesson3.Algorithm.MyComparator;
import lesson3.Algorithm.MyGenericComparator;
import lesson3.object.Student;

public class TestSort {
	
/*	public class Comparator extends MyComparator
	{

		@Override
		public int compareTo(Object a, Object b) {
			
			return 0;
		}
		
	}*/

	
	public static void main( String[] args )
	{
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

		Algorithm.sort(students, new MyComparator()  
		{
			@Override
			public int  compareTo(Object a, Object b)
			{
				Student first = null, second = null; 
				if (a instanceof Student ) first = (Student)a;
				if (a instanceof Student ) second = (Student)b;
				if ( first.Avg() > second.Avg() ) return 1;
				else if ( first.Avg() > second.Avg() ) return -1;
				else   return 0;
			}
		});
		
	/*	Algorithm.sort2(students, new MyGenericComparator<Student>()  
		{
			@Override
			public int compareTo(Student first, Student second) {
						
				if ( first.Avg() >  second.Avg() ) return 1;
				else if (  first.Avg() > second.Avg() ) return -1;
				else   return 0;
			}
		
		});*/
		
		//Вывод отсортированных студентов
		for(Student stud : students)
			System.out.println(stud);
	

	}
}
