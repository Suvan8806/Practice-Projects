

package QueueLab3;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

class IntQueue {
	
   //option 1
   public int[] nums;
   public int numInts;

   public IntQueue(){
	   int nums[] = null;
	   numInts = 0;
   }

   public void add(int item){
	   if(nums==null) {
		   numInts = 0;
	   } else {
		   numInts = nums.length; 
	   }
	   int temp[] = new int[numInts + 1];
	   for(int i = 0; i < numInts; i++) {
	         temp[i] = nums[i]; 
	      }
	   temp[numInts] = item;
	   nums = temp;
   }

   public int remove(){
	   numInts = nums.length;
	   int what = nums[0];
	   int temp[] = new int[numInts - 1];
	   int k = 0;
	   for(int i = 1; i < numInts; i++) {
	         temp[k] = nums[i]; 
	         k++;
	      }
	   nums = temp;
	   return what;
   }

   public boolean isEmpty(){
	   if (nums.length == 0) {
		   return true;
	   }
 	return false;
   }

   public int peek(){
	   return nums[0];
   }

   public String toString(){
	   return(Arrays.toString(nums)); 
   }
}




