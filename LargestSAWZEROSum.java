package HASHING;
import java.util.*;
public class LargestSAWZEROSum {
    public static void main(String args[]){
        int arr[] = {15,2,-2,-8,1,7,10,23};
        HashMap<Integer,Integer> hm= new HashMap<>();
        int sum = 0;
        int length = 0;
        for(int j = 0; j<arr.length; j++){
            sum  += arr[j];
            if(hm.containsKey(sum)){
                length = Math.max(length,j-hm.get(sum));
            }else{
                hm.put(sum,j);
            }

        }
        System.out.println("largest subarry which is equal to 0 is "+length);
            }
}
