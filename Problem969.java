import java.util.ArrayList;
import java.util.List;

class Problem969
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A[] = {2,3,1,5,4};
		pancakeSort(A);
	}
	
	public static List<Integer> pancakeSort(int[] A)
    {
        List<Integer> l = new ArrayList<>();
        
        for(int i=A.length;i>1;i--)
        {
            int index = search(A, i);
            if(index!=0)
            {
                l.add(index+1);
                A = flip(A, index);
            }
            A = flip(A, i-1);
            l.add(i);
        }
        
        return l;
    }
    
    public static int search(int A[], int n)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == n)
                return i;
        }
        return -1;
    }
    
    public static int[] flip(int A[], int k)
    {
        int temp[] = new int[k+1];
        int j=0;
        for(int i=k;i>=0;i--)
        {
            temp[j] = A[i];
            j+=1;
        }
        for(int i=0;i<=k;i++)
            A[i] = temp[i];
        return A;
    }
}
