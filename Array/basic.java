import java.util.*;
public class basic {
    public static void main(String[] args) {
        int marks[]=new int[50];
        int numbers[]={1,2,3};
        int more_numbers[]={4,5,6};
        String fruits[]={"apple","mango","orange"};
        System.out.println(numbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phy marks: ");
        marks[0]=sc.nextInt();
        
        marks[0]=100;
        System.out.println("Congratulations\nyou got "+marks[0]+" in Physics");
        System.out.println(marks.length);

        String st = "hello my name is shimul.";
        System.out.println(touppercase(st));
    }
    
        
    
    public static String touppercase(String x){
        StringBuilder st = new StringBuilder ("");
        char ch = Character.touppercase(x.charAt(0));
        st.append(ch);
        for (int i = 1; i<x.length();i++){
            if (x.charAt(i)==' ' && i<x.length()-1){
                st.append(x.charAt(i));
                i++;
                st.append(Character.touppercase(x.charAt(i)));

            }else{
                st.append(x.charAt(i));
            }

        }
        return st.toString();
    }
    
}

