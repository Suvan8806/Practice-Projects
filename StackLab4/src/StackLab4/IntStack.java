package StackLab4;
import java.util.Arrays;

class IntStack {

   private int[] nums;
   private int numInts;


   public IntStack(int[] n) {
	   nums = n;
	   numInts = nums.length;
   }

   public void push(int item){
	   int temp[] = new int[numInts + 1];
	   for(int i = 0; i < numInts; i++) {
	         temp[i] = nums[i]; 
	      }
	   temp[numInts] = item;
	   nums = temp;
   }

   public int pop(){
	   numInts = nums.length;
	   
	   int temp[] = new int[numInts - 1];
	   for(int i = 0; i < numInts-1; i++) {
	         temp[i] = nums[i]; 
	      }
	   int what = nums[numInts-1];
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
	return nums[numInts-1];
   }

   public String toString(){
	   return(Arrays.toString(nums)); 
   }
}
