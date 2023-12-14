
class NegativeException extends exception
{
    public String toString () {
        return "Dimension cannot be negative";
    }
}
public class Exception1 {
    static int sum(int a,int b) throws NegativeDimensionException
     {
        if(a<0 || b<0)
        throw new NegativeDimensionException();
        return a/b;
     }
    static void sum() throws NegativeDimensionException 
    {
        int c = sum(-10, 5);
         
        System.out.println("Area : "+c);
    }
    public static void main(String[] args) {
        try{
            sum();
        }
        catch(NegativeDimensionException e){

        

        System.out.println(e);
        }
    }


}
