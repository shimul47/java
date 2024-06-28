
public class topic1 {
    public static int hello(int a,int b){//parameters
        System.out.println("hello world");
        return a+b+10;
    }

    public static void main(String[] args) {
        
       int a = 5;
       int b = 8;
       int x = hello(a,b);//arguments
       System.out.println("Your sum is: "+x);
        

    }
}
