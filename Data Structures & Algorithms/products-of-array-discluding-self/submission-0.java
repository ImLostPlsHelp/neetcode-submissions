class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Usually its straight up multiply everything then divide by the i right,
        //But since the follow up is to not use division...modulo?
        //Technically it isn't a division, but the leftovers of divi-
        //Ok maybe not module?

        //I've solved this before, interesting

        //I've understood the solution once more
        //1). Make twoo loops
        //2). The first one is to handle the suffix products, 
        //    basically fill the result with product and multiply product with element of nums[i]
        //3). Second loop is to handle the postfix product,
        //    basically almost like the first loop but multiply the result rather than replace with current
        //    product and multiply product with element of nums[i]

        int[] result = new int[nums.length];

        for(int i = 0, product = 1; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }

        for(int i = nums.length - 1, product = 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }
}  
