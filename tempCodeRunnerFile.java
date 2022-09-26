class calculate{
    public static void add(float a,float b){
        float c=a+b;
        System.out.println("Add :"+c);

    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("Add :"+c);

    }
    public static void add(String a,String b){
        String c=a+b;
        System.out.println("Add :"+c);
    }
}
class CalculateAdd{
    public static void main(String[] args){
        calculate c=new calculate();
        c.add(1,5);
        c.add("aman","anman");
        c.add(2.99f,4.33f);
    }
}