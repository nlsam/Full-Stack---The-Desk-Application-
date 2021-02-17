import java.util.ArrayList;

public class QuickSort {
	int partition(ArrayList<Integer> arrayList, int low, int high)
    {
        int pivot = arrayList.get(high);
        int i = (low-1); 
        for (int j=low; j<high; j++)
        { 
            if (arrayList.get(j) <= pivot)
            {
                i++;
                int temp = arrayList.get(i);
                arrayList.set(i,arrayList.get(j));
                arrayList.set(j,temp);
            }
        }
        int temp = arrayList.get(i+1);
        arrayList.set(i+1,arrayList.get(high));
        arrayList.set(high,temp);
        return i+1;
    }
    void sort(ArrayList<Integer> arrayList, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arrayList, low, high);
            sort(arrayList, low, pi-1);
            sort(arrayList, pi+1, high);
        }
    } 
}
