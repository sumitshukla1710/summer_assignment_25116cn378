//binary searching..
import java.util.Scanner;
public class Problem71 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the length of the array:");
        int n=input.nextInt();
        int [] arr=new int[n];
        System.out.println("please enter the elements of the array in sorted form;");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("olease enter the elemnt you want to search: ");
        int target=input.nextInt();
        int low=0;
        int high=n-1;
        int found=0;
        int mid=-1;
        
        while(low<=high){

             mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
                
            }
            else if(arr[mid]<target){
                low=mid+1;
                
            }
            else{
                found=1;
                break;
                
            }
            

        }
        if(found==1){
        System.out.println("element is fount at postion "+ (mid+1));
        }
        else{
            System.out.println("element not bfound.");
        }
    }
    
}
