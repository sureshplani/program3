package project3;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4,5},{1,20,30,40,50}};
		int rows=2,columns=5;
         for(int j=0;j<columns;j++) 
             {
	  for(int i=0;i<rows;i++) 
                    {
		      if(i==0)
                        System.out.print(arr[i][j]);
		  
              else
	                    System.out.print(" "+arr[i][j]);
			  
                     } 
                        System.out.println();
                         }
	                        }
                              }

                       
