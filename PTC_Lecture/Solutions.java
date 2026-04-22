//TWO SUM

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
        
//         for(int i = 0; i < n-1; i++){
//             for(int j = i+1; j< n; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }


//Longest Substring Without Repeating Characters

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> set = new HashSet<>();
//         int l = 0;
//         int maxLen = 0;
        
//         for(int r = 0; r < s.length(); r++){
//             while(set.contains(s.charAt(r))){
//                 set.remove(s.charAt(l));
//                 l++;
//             }

//             set.add(s.charAt(r));
//             maxLen = Math.max(maxLen , r - l +1);
//         }
//         return maxLen;
//     }
// }


//Check Anagram

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length())return false;
//        HashMap<Character , Integer> map = new HashMap<>();

//        for(int i = 0 ; i< s.length() ; i++){
//         map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) ,0)+1);
//        }


//        for(int i = 0; i< t.length() ; i++){
//         char ch = t.charAt(i);
//         if(!map.containsKey(ch) || map.get(ch) == 0){
//             return false;
//         }

//         map.put(ch , map.get(ch)-1);
//        }

//        return true;


//     }
// }


//Find the Duplicate Number

// class Solution {
//     public int findDuplicate(int[] arr) {
//        int i = 0;
//          while(i < arr.length){


//             if(arr[i] != i+1){
//                 int correct = arr[i]-1;

//                 if(arr[i] != arr[correct]){
//                     swap(arr , i , correct);
//                 }else{
//                     i++;
//                 }   
//             }else{
//                 i++;
//             }
//         }
//         for(int j =0; j< arr.length; j++){
//             if(arr[j] != j+1){
//                 return arr[j];
//             }
//         }

//         return -1;
//     }

    

//     public void swap(int[]arr , int first, int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }


// Rotate Array by K Steps

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;

//         reverse(nums , 0 , n-1);
//         reverse(nums , 0 , k-1);
//         reverse(nums, k , n-1);
//     }

//     public static void reverse(int[] arr , int l , int r){
//         while(l<=r){
//             int temp = arr[l];
//             arr[l] = arr[r];
//             arr[r] = temp;
//             l++;
//             r--;
//         }
//     }
// }


//Merge Two Sorted Arrays


// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int i = m- 1;
//         int j = n-1;
//         int k = m+n -1;

//         while(i >= 0 && j >=0){
//             if(nums1[i] > nums2[j]){
//                 nums1[k] = nums1[i];
//                 i--;
//             }else{
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }

//         while(j >= 0){
//             nums1[k] = nums2[j];
//             j--;
//             k--;
//         }
//     }
// }


//Find missing no

// class Solution {
//     public int missingNumber(int[] nums) {
//         int xor = 0;


//         for(int i = 0; i < nums.length ; i++){
//             xor = xor ^ i ^ nums[i];

//         }

//         xor = xor ^ nums.length;

//         return xor;
        
//     }
// }



//Reverse Words in a Sentence


// class Solution {
//     public String reverseWords(String ss) {
//         String[] words = ss.split(" ");
//         int left = 0;
//         int right = words.length - 1;

//         while(left<= right){
//             String temp = words[left];
//             words[left] = words[right];
//             words[right] = temp;
//             left++;
//             right--;
//         }

//         StringBuilder s = new StringBuilder();

//         for(String word : words){
//             if(!word.isEmpty()){
//                 if(s.length() > 0){
//                     s.append(" ");

//                 }
//                 s.append(word);
//             }
//         }

//         return s.toString();
//     }
// }


//  Palindrome Number


// class Solution {
//     public boolean isPalindrome(int x) {
//         int half = 0;
//         if(x < 0 || (x % 10 == 0 && x != 0) ) return false;


//         while(x > half){
//             int last = x % 10;
//             x = x/10;
//             half = (half * 10) + last; 
//         }

//         return (x == half || x == half/10);
        
//     }
// }



//class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         int candidate = 0;

//         for(int num : nums){
//             if(count == 0){
//                 candidate = num;
//             }

//             if(num == candidate){
//                 count++;
//             }else{
//                 count--;
//             }
//         }

//         return candidate;
        
//     }
// }


