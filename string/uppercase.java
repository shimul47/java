public class uppercase {
    public static void main(String[] args) {
        String st = "hello, mY name is shimul.";
        System.out.println(make_it_upper(st));
        
    }
    public static String make_it_upper(String x){
        StringBuilder st = new StringBuilder ("");
        char ch = Character.toUpperCase(x.charAt(0));
        st.append(ch);
        for (int i = 1; i<x.length();i++){
            if (x.charAt(i)==' ' && i<x.length()-1){
                st.append(x.charAt(i));
                i++;
                st.append(Character.toUpperCase(x.charAt(i)));

            }else{
                st.append(Character.toLowerCase(x.charAt(i)));
            }

        }
        return st.toString();
    }
    
}
