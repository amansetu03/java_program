class Studentname{
    String name,address;
    int rollnumber,phonenumber;
    
    public static void main(String[] args){
        Studentname s1=new Studentname();
        Studentname s2=new Studentname();
        
        s1.name="aman sharma";
        s1.rollnumber=1;
        s1.address="Bihar";
        s1.phonenumber=630448;

        s2.name="yuvraj kumar";
        s2.rollnumber=2;
        s2.address="Bihar";
        s2.phonenumber=635555;

       
        System.out.println(s1.name);
        System.out.println(s1.rollnumber);
        System.out.println(s1.address);
        System.out.println(s1.phonenumber+"\n");

        System.out.println(s2.name);
        System.out.println(s2.rollnumber);
        System.out.println(s2.address);
        System.out.println(s2.phonenumber+"\n");
    }
}