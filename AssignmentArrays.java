
package assignment.arrays;

/**
 *
 * @author knrai
 */
public class AssignmentArrays {

    public static int findNumber(int [] A){   
		int x=0;
		for(int i=0;i<A.length;i++){
			x= x^A[i];
		}
		return x;
	}

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //QUESTION NO 1 -: program to find the largest and smallest element in the given array.
        System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 1 ");
        
        int[] arr = { 5,6,36,2,77,2,85,68,90,3};
        
    int min = arr[0], max = arr[0];
        for (int i : arr){
            if (min >= i) {
                min = i;
                
            }
            if (max <= i) 
          {
                max = i;
            }
            
        }
            System.out.println("largest no in array is " +max);
             System.out.println("smallest no in array is " +min);
             
             
             
          //QUESTION NO 2 -: program to check whether the element "x" present in the array or not .
          System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 2 ");
          
              int[] A = {67,9,65,43,84,254,23,2,54,57,67,43,26,365,26,4633,252};
              int search = 75;
              boolean flag=false;
        for (int i : A) {
              if (i == search) {
                System.out.println(search +" is present in array A[]");
                flag=true;
              }
            }
        if (flag==false) {
            System.out.println(search +" is not present in array A[]");
                }
        
  


//QUESTION NO 3 -:  program to sort the array.
       
System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 3 ");
     
       //selection sort sort
       
       ;
         for (int i=0; i<A.length; i++){    
            
             for(int j=i+1; j<A.length; j++){
                  if (A[i] > A[j]) 
                {
                   int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                
                   
                     
                 }
                 
             }
         }
          System.out.println("array A[] in asscending order");
          
          for (int i : A){
              System.out.println(i);
          }
          
          
          
//QUESTION NO 4 -: program to print the numbers which are occuring odd number of times.
       
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 4 ");
       
       int[] testarr={34,23,3,7,5,6,7,5,6,34,34,90};
      
       
        // sorting
        
         for (int i=0; i<testarr.length ; i++){    
             
             for(int j=i; j<testarr.length; j++){
                  if (testarr[i] > testarr[j]) 
                {
                   int temp = testarr[i];
                    testarr[i] = testarr[j];
                    testarr[j] = temp;
                
                  
                     
                 }
                 
             }
         }
         
         boolean isodd=true;
         
         for(int i=0;i<testarr.length-1;i++){
            
             if (testarr[i+1]==testarr[i]) {  //check if two consequitive numbers are same
                 isodd= isodd?false:true;     // toggle isodd
                 
                 isodd=i==testarr.length-2 ? !isodd :isodd;  //checking for last number
             }
             
             else {
                 if(isodd)
                     System.out.println(testarr[i]+" is occuring odd numbers of times");
                 
                  if(i==testarr.length-2)
                     System.out.println(testarr[i+1]+" is occuring odd number of times");
                  
                  isodd=true;
                   
                     
             }   
         }
          
        
        
        
        
        
        
        
        
        
        //QUESTION NO 5 -: program to find the missing number in integer array of 1 to 100.
       
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 5 ");
        
       int[] Array = {1, 2, 4,  10, 11,9, 12, 13, 14,7, 15, 6,99,16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
     
       int[] arr1=new int[101];
       for(int x:Array){
           arr1[x]=1;
       }
        
       for(int i=1;i<=100;i++){
           if (arr1[i]==0) {
               System.out.println(i+" is missing");
           }
       }
       
       
       
       //QUESTION NO 6 -: program to find duplicate element in an integer array.
       
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 6 ");
       
       
         for (int i=0; i<A.length; i++){
             for(int j=i+1; j<A.length; j++){
                  if (A[i] == A[j]) 
                {
                    System.out.println(A[i]+ "is duplicate no");
                    
                   

                     
                 }
                 
             }
         }
       
         
        //QUESTION NO 7 -:program to reverse the given array.
       
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 7 ");
       
       int[] firstArray = {1,2,5,56,4,3,9,34,1,66,64,86,59};
       int[] CopiedArray = new int[firstArray.length];
         int j = 0;
        for (int i=firstArray.length-1; i>=0; i--){
            CopiedArray[j] = firstArray[i];
             j++;
        }
        System.out.println("PREVIOUS ARRAY IS");
        for (int i:firstArray){
            System.out.print(i+" ");
        }
         System.out.println("");
         System.out.println("REVERSED ARRAY IS");
        for (int i:CopiedArray){
            System.out.print(i+" ");
        }
       
        
        //QUESTION NO 8 -:A program to find third smallest element in the given array.
       
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 8 ");
       
       int[] array = {5,8,9,7,4,12,2,3,35,40,78};
       
       //sorting
        for (int i=0; i<3; i++){
             for(int k=i; k<array.length; k++){
                  if (array[i] > array[k]) 
                {
                   int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp; 
   
                 }
                 
             }
           
         }
         System.out.println(array[2]);
    
         
         
         
         //QUESTION NO 9 -:can you store String in array of integer
         
         /*  no we can not change the size of the array
             however we can create a new array of required size and copy the elements.
         */
         
         
        
         
         
         
           //QUESTION NO 10 -:can you store String in array of integer
      
           /*
           yes we can store string in an array of integer character by character
           */
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 10 ");
       
       
       String s = "KRISHNA";
       int[] intArr=new int[s.length()];
         for(int i=0;i<s.length();i++){
             intArr[i]=s.charAt(i);
         }
         
         for(int i=0;i<s.length();i++){
             System.out.print((char)intArr[i]);
         }
         
         
        
        
}
}