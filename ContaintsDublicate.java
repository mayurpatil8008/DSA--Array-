import java.util.HashSet;

public class ContaintsDublicate 
{
        // Program to check for duplicates in an array

       /*  public static boolean Duplicate(int[] nums)
	    {
		    // for every array element, check if it is found then returns true otherwise returns false
        
		    for (int i = 0; i < nums.length; i++)
		    {
			    for (int j = i + 1; j < nums.length; j++)
			    {
				    if((i != j) && (nums[i]==nums[j])) 
                    {
					    return true;
				    }
			    }
		    }

		    // no duplicate is found
		    return false;
	    } */
	
            public static boolean Duplicate(int[] nums) {
                HashSet<Integer> set = new HashSet<>();
                for(int i = 0; i < nums.length;i++){
                    set.add(nums[i]);
                }
                if(set.size() == nums.length){
                    return false;
                }
                return true;
            }
	public static void main(String args[])
	{
		int [] nums = { 1,2,3,4 };

        System.out.println(Duplicate(nums));
			
	}    
}
