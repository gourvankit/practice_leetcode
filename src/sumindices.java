import java.util.*;
public class sumindices {
    static public int[] twoSumAgain(int[] nums,int target){
        int[] arr=new int[2];
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            ls.add(nums[i]);
        }
        for(int i=0;i< nums.length;i++){
            int toFind=target-nums[i];
            if(ls.contains(toFind) && i!=ls.indexOf(toFind)){
                arr[0]=i;
                arr[1]=ls.indexOf(toFind);
            }
        }
        return arr;
    }
    static public int[] twoSum(int[] nums, int target) {
        int[] a ={0,0};
        int n;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            n=target-nums[i];
            if(hm.containsKey(n) && i!=hm.get(n))
            {
                a[0]=i;
                a[1]=hm.get(n);
                break;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int l=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] num =new int[l];
        for(int i=0;i<l;i++)
            num[i]=sc.nextInt();
        System.out.println("Enter target number:");
        int tar=sc.nextInt();
       sumindices ob=new sumindices();
        if (ob.twoSumAgain(num,tar)[0]==ob.twoSumAgain(num,tar)[1])
        {
            System.out.println("Nothing");
        }
        else {
            int[] arr = ob.twoSumAgain(num,tar);
            for (int i = 0; i < 2; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    }
}
