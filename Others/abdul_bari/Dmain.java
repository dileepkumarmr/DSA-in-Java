import java.util.*;

public  class Dmain{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String str=sc.next(); 
   int n=sc.nextInt(); 
    sc.close();
   int startIndex[]=new int[n];
   int endIndex[]=new int[n];

   for(int i=0;i<n;i++)
     startIndex[i]=sc.nextInt();
   
   for(int i=0;i<n;i++)
     endIndex[i]=sc.nextInt();
   
   int count=0;

   for(int i=0;i<n;i++){
    count=0;
    String sub=str.substring(startIndex[i]-1,endIndex[i]);
    int start= sub.indexOf("|");
    int end=sub.lastIndexOf("|");
    for(int j=start;j<end;j++)
      if(sub.charAt(j)=='*')
         count++; 
    System.out.print(count+" ");
  } 
 }
}