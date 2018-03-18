package lesson3.Algorithm;

public class Algorithm {
	
	//Пузырьковая сортировка
	static public void sort( int arr[] ) 
    {
    	int temp;
    	boolean unsorted;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		unsorted = false;
    		for(int j = 0; j < i; j++)
    		{
       			if (arr[j] > arr[j + 1])
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				unsorted = true;       //Была сделана перестановка, значит массив не отсортирован
    			}
    		}
    		if ( !unsorted ) return;
    	}
    }
	
	static public void sort( Object arr[] ) 
    {
    	Object temp;
    	boolean unsorted;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		unsorted = false;
    		for(int j = 0; j < i; j++)
    		{
       			if ( ((Comparable)arr[j]).compareTo(arr[j + 1])  == 1)
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				unsorted = true;       //Была сделана перестановка, значит массив не отсортирован
    			}
    		}
    		if ( !unsorted ) return;
    	}
    }
	
	static public void sort( Object arr[], MyComparator comp ) 
    {
    	Object temp;
    	boolean unsorted;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		unsorted = false;
    		for(int j = 0; j < i; j++)
    		{
       			if ( comp.compareTo(arr[j], arr[j + 1]) == 1)
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				unsorted = true;       //Была сделана перестановка, значит массив не отсортирован
    			}
    		}
    		if ( !unsorted ) return;
    	}
    }
	
	static public <T> void sort2( T arr[], MyGenericComparator<T> comp ) 
    {
    	T temp;
    	boolean unsorted;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		unsorted = false;
    		for(int j = 0; j < i; j++)
    		{
       			if ( comp.compareTo(arr[j], arr[j + 1]) == 1)
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				unsorted = true;       //Была сделана перестановка, значит массив не отсортирован
    			}
    		}
    		if ( !unsorted ) return;
    	}
    }
	

	
	//Разбиение массива следующим образом первый элемент в центре (слева элементы меньше него справа больше)
	private static int partition (int p, int r, int A[])
    {
    	int x = A[p];
    	int k = p;
    	int l = r+1;
    	int t;
    	do k++; while ((A[k] <= x) && (k < r));
    	do l--; while (A[l] > x);
    	while (k < l) {
    		t = A[k]; A[k] = A[l]; A[l] = t;
    		do k++; while (A[k] <= x);
    		do l--; while (A[l] > x);
    	}
    	t = A[p]; A[p] = A[l]; A[l] = t;
    	return l;
    }

    public static void qsort(int p, int r, int A[])
    {
    	if (p < r) {
    		int q = partition(p, r, A);
    		qsort (p, q-1, A);
    		qsort(q+1, r, A);
    	}
    }
    
    
    public static int BinarySearch(int[] A, int key)
	{
		int left = 0;
		int right = A.length - 1;
		int mid;
		while(left < right)
		{
			mid = (left + right) / 2;
			if (A[mid] > key)
			{
				left = mid + 1;
			}
			else if (A[mid] < key) 
                                                                                                                                                                                       			{
				right = mid - 1;
			}
			else
			{
				return mid;
			}
		}

		return -1;
	}
    
}
