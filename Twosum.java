import java.util.*;
public class Twosum {
    public static  int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        a[0]=i;
                        a[1]=j;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N=sc.nextInt();
        int[] nums=new int[N];
        System.out.println("enter elements of the array");
        for (int i = 0; i < N; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target value");
        int target=sc.nextInt();
        int[] result=twoSum(nums,target);
        System.out.println("possible targeted sum values are");
        for(int i:result){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
