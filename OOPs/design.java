public class design {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Blue");
        
        p1.setTip(5);
        
        student s1 = new student();
        s1.calculatePercentage(10,10,10);
        System.out.println(s1.cgpa);
        bankAccount myAc = new bankAccount();
        myAc.username="Shimul";
        myAc.setpassword("adgadg");
    }
}
class pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class student{
    String name;
    int age;
    float cgpa;
    void calculatePercentage(int phy,int che,int math){
        cgpa=(phy+che+math)/3;
    }
}
class bankAccount{
     public String username;
     private String password;
     public void setpassword(String pass){
        password = pass;
     }
}