public class string_compression {
    public static void main(String[] args) {
        String sr = "aaaabbbbcddddeexxx";
        System.out.println(stringCompress(sr));
    }
    
    public static String stringCompress(String x){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < x.length(); i++){
            Integer count = 0;
            while(i < x.length()-1 && x.charAt(i)== x.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(x.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
