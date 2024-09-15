import java.util.Scanner;

public class pairsum {
    static  int tripletsum(int arr[],int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {   //pick the ist element
            for (int j = i + 1; j < arr.length; j++) {  //2nd number
                for (int k = j + 1; k < arr.length; k++) {  //3rd number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
   //this is used for by addition of 2 no

 //   static  int pairofsum(int arr[],int target){
   //     int ans =0;
  //     for (int i=0;i<arr.length;i++){   //pick the ist element
  //         for (int j=i+1;j<arr.length;j++){
    //           if (arr[i] + arr[j] == target){
    //               ans++;
    //           }
   //        }
   //    }
   //    return ans;
  //  }
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
        System.out.println("Enter the target sum");
        int target= sc.nextInt();

        System.out.println(tripletsum(arr,target));


    }
}
