import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.printf(" ");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
        int midindex;
        if(a.length%2!=0){
           midindex=a.length/2;
           
           System.out.println(a[midindex]);
        }
        else{
            int first=a.length/2;
            int second=first+1;
            int midelement=(first+second)/2;
            System.out.println(a[midelement]);
        }
    }
}
