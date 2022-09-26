public class Abcc{
    public static void main(String[] args){
        int a[]={34,55,44,33,7};
        min(a);
    }
    public static void min(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("\nminimum value is "+min);
    }
}