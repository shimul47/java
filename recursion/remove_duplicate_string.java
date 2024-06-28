public class remove_duplicate_string {
    public static void main(String[] args) {
        String name="adsgdgqaiojiosjajge";
        System.out.println(remove(name,0,new StringBuilder(" "),new boolean[26]));
    }
    public static String remove(String name,int idx,StringBuilder sb,boolean map[]){
if(idx==name.length()){     
            return sb.toString();
        }
        char temp=name.charAt(idx);
        if (map[temp-'a']==true){
            return remove(name,idx+1,sb,map);
        }
        else{
            map[temp-'a']=true;
            return remove(name,idx+1,sb.append(temp),map);
        }
    }
     
}
