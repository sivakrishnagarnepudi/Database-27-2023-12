public class fibonacciwithrecursion {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[]args){
        int n=10;
        for (int i=0;i<10;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }


}
