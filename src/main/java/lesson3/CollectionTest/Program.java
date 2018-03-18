package lesson3.CollectionTest;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import lesson3.object.Student;

public class Program {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(10);
		list.add(new Student("Семенов", "Григорий"));
		
		LinkedList<Student> list2 = new LinkedList<Student>();
		list.add(new Student("Семенов", "Григорий"));            // Добавить в очередь
		
		
		Student s = list.get(0);   //Получить элемнент по индексу
		
		
		
		
		Hashtable hash = new Hashtable();    
		hash.put("Красный", "Red");                   // 
		
		String str = (String) hash.get("Красный");   //Получить  соответствие слову красный на английском
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Student me = new Student("Семенов", "Григорий");
		Hashtable<Student, Integer> exam_data = new Hashtable<>();
		exam_data.put(me, 100);
		 for (Entry<Student, Integer> entry : exam_data.entrySet()) {
		        System.out.println("ID =  " + entry.getKey().toString() + "Данные = " + entry.getValue().toString());           
		  
		 System.out.println( exam_data.get(me));
		 
		 Queue q = new LinkedList();
		 PriorityQueue pq = new PriorityQueue(); 
		 Stack st = new  Stack();
		 st.push(me);   //Втолкнуть в стек
		 q.add(me); //Добавить в очередь
		 
		 
		 }
		
	}

}
