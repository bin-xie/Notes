package Notes.day10;

/**
 * 冒泡排序  (外层length-1 、 外层length-1-i)
 */
public class Test003 {
    public static void main(String[] args) {
        // 相邻的两个值比较大小，互换位置。（升序）
        int[] nums={4,3,5,2,1};
        /**
         * 下面的综合版 (外层length-1 、 外层length-1-i)
         */
        //外层
        for (int i=0;i<nums.length-1;i++){    //i=1
            //内层 （一轮）
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + "\t");
        }

  //----------------------------------------------------

        /*//第一轮
        for (int j=0;j<nums.length-1;j++){
            if (nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        //第二轮
        for (int j=0;j<nums.length-1-1;j++){
            if (nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        //第三轮
        for (int j=0;j<nums.length-1-2;j++){
            if (nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        //第四轮
        for (int j=0;j<nums.length-1-3;j++){
            if (nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + "\t");
        }*/


    }
}
