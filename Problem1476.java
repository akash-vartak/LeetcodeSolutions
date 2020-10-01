public class Problem1476
{
	public static void main(String args[])
	{
		int rectangle[][] = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};
		
		SubrectangleQueries obj = new SubrectangleQueries(rectangle);
		
		System.out.println("getValue(1, 2):" + obj.getValue(1, 2));
		obj.updateSubrectangle(0, 0, 2, 1, 5);
	}

}

class SubrectangleQueries {

    public static int rectangle[][];
    
    public SubrectangleQueries(int[][] rectangle)
    {
        this.rectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
    {
        for(int i=row1;i<=row2;i++)
        {
        	for(int j=col1;j<=col2;j++)
        	{
        		this.rectangle[i][j] = newValue;
        	}
        }
        
        for(int i=0;i<rectangle.length;i++)
        {
        	for(int j=0;j<rectangle[0].length;j++)
        	{
        		System.out.print(this.rectangle[i][j]+" ");
        	}
        	System.out.println();
        }
    }
    
    public int getValue(int row, int col)
    {
        return(this.rectangle[row][col]);
    }
}
