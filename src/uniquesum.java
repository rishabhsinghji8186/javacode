import java.util.Scanner;

public class uniquesum {
    static  int uniquenum(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                ans =arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //taking elements of array by user
        System.out.println("Enter the elements of array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(uniquenum(arr));
    }
}
