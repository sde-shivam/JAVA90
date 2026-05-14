import java.util.*;
import java.lang.String;
import java.util.Arrays;
class Main {

    //Bionomial Function------->
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int bionomialFact(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);
        int ncr = n_fact / (r_fact * nmr_fact);
        return ncr;
    }

    //Check Prime Number or Not ------>
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Prime number in Range ------->

    public static void primeinRange(int n) {
        for (int i = 2; i < n; i++) {
            boolean checkPrime = isPrime(i);
            if (checkPrime) {
                System.out.print(i + ",");
            }
        }
    }

    // Binary to decimal convertion---->
    public static void binaryToDecimal(int binNum) {
        int myNumber = binNum;
        int decNumber = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNumber = lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;

        }
        System.out.print("Decimal of binary number " + myNumber + " is = " + decNumber);
    }

    // Decimal to binary conversion--------->
    public static void decToBin(int num) {
        int pow = 0;
        int binNum = 0;
        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.print("Binary of Decimal number is = " + binNum);
    }

    //Hollow Rectangle pattern-------------->
    public static void hollowRect(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Inverted & Rotated half pyramid------------->
    public static void invertRotatePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted half pyramid with numbers -------->
    public static void invertedHalfPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Floyd's Triangle Pattern--------------------->
    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    //0-1 Triangle ------------------->
    public static void binTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //Butterfly pattern ---------------------->
    public static void butterflyPtrn(int n) {
        for (int i = 1; i <= n; i++) {
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces---->2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces---->2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars--->n
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Solid Rhombus ------------>
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces--->
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars----->
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus ------------>
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces--->
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars----->
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Diamond pattern------------>
    public static void diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Print the Reverse number ----------------->
    public static void reverseNum(int num) {
        while (num > 0) {
            int last_digit = num % 10;
            System.out.print(last_digit);
            num = num / 10;
        }

    }

    //Reverse the original number-------------->
    public static void reverseOgNum(int num) {
        int rev = 0;
        while (num > 0) {
            int last_digit = num % 10;
            rev = (rev * 10) + last_digit;
            num = num / 10;
        }
        System.out.print(rev);
    }

    //Bigger in 3 numbers--------------------->
    public static void bigNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.print("A is bigger");
        } else if (b > c) {
            System.out.print("B is bigger");
        } else {
            System.out.print("c is bigger");
        }
    }

    //Update array by argument ------------------->
    public static void updateArr(int marks[]) {
        for (int i = 0; i < marks.length; i++)
            marks[i] = marks[i] + 2;
    }

    //Linear search in array----------------> Complexity = O(n)
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
      /* Main fn -------->
       int arr[]={3,20,10,40,60};
         int target =10;
         int result = linearSearch(arr,target);
         System.out.print("Target is at index : "+ result); */

    //Linear search in array more than 1 same target index---------------->
    public static void linearSearch2(int arr[], int target) {
        List<Integer> Result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                Result.add(i);
            }
        }
        System.out.print(Result);
    }
      /* int arr[]={3,20,10,40,10};
                int target =10;
             linearSearch2(arr,target);  */

    //Largest Element in Array---------------->
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //----------For -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    //Smallest Element in Array---------------->
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; //----------For +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    //Binary Search --------------------->
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    /* int numbers[]={10,11,12,13,14,15,16,17};
       int key = 11;
        int result = binarySearch(numbers,key);
        System.out.print("Element present at index : "+result); */

    //Reverse an array ----------------->
    public static void reverseArr(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = 0;
            int end = numbers.length - 1;
            while (start < end) {
                //swap ------>
                int temp = numbers[end];
                numbers[end] = numbers[start];
                numbers[start] = temp;
                start++;
                end--;
            }
        }
    }

    /*int numbers[] = {2,3,4,5,6,7,8};
      reverseArr(numbers);
      for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
     } */
    //print the pairs of a number from array ----------->
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];//2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Number of pairs = " + tp);
    }

    // Print the number of possible subarrays from an array and their sum and min,max------------>
    public static void printSubArr(int numbers[]) {
        int ts = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; //Sum
                    if (max < sum) {   //max value
                        max = sum;
                    }
                    if (min > sum) {   //min value
                        min = sum;
                    }
                }

                System.out.println("------>Sum : " + sum);

                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum is  : " + min);
        System.out.println("Maximum sum is  : " + max);
        System.out.print("Total number of subarray : " + ts);

    }

    /*int numbers[] = {2,4,6,8,10};
      printSubArr(numbers);*/
    //Calculate the max sum of sub-array by Brute force method---->
    public static void maxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("CurrSum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max sum of sub-array : " + maxSum);
    }
       /*int numbers[]={1,2,3,4,5,6};
        maxSum(numbers);*/

    // Odd and Even numbers present in array----------------->
    public static void numberArr(int numbers[]) {
        int even = 0;
        int odd = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        System.out.println("Max value : " + max);
    }

    //Find missing number in array --------------->
    public static int missNum(int numbers[], int n) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] != 1) {
                return numbers[i] + 1;
            }
            if (numbers[numbers.length - 1] != n) {
                return n;
            }
        }
        return -1;
    }
     /*int numbers[]={1,2,3,4,6,7,8,9,10};
        int n = 10;
        int result = missNum(numbers,n);
        System.out.println("Missing number is :"+result);*/

    //move all 0 in array at last index------------->
    public static void zeroAtLast(int num[]) {
        int pos = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[pos] = num[i];
                pos++;
            }
        }
        while (pos < num.length) {
            num[pos] = 0;
            pos++;
        }
    }
    /*int num[]={0,0,1,2,3,4};
        zeroAtLast(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);*/

    //Count of even & odd numbers in array---------------->
    public static void evenOdd(int num[]) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Count of even numbers :" + even);
        System.out.print("Count of odd numbers :" + odd);
    }

    //Majority element in array (Brute force)------->
    public static int majorityEl(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return num[i];
            }
        }
        return -1;
    }

    /*int num[]={1,2,2,3,2,4,2};
    System.out.print(majorityEl(num));*/
    //missing and repete number -------------->
    public static void findNum(int myNum[]) {
        Arrays.sort(myNum);
        int repeat = -1;
        int missing = -1;
        for (int i = 0; i < myNum.length - 1; i++) {
            if (myNum[i + 1] - myNum[i] > 1) {
                missing = myNum[i] + 1;
            }
            if (myNum[i] == myNum[i + 1]) {
                repeat = myNum[i];

            }
        }
        System.out.println("Missing number is - " + missing);
        System.out.println("Repeat number - " + repeat);
    }
    /*int myNum[]={1,2,4,4,2,3,5,2,1};
        findNum(myNum);
        }*/

    //Average of elements present in array--------->
    public static float avgOfEl(int num[]) {
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return (float)sum/num.length;
    }
}
       /* int num[]={1,2,3,4};
        float result = Main.avgOfEl(num);
       System.out.print("avg : "+result);*/

    //Two sum in array(brute force)------------>
    public static int twoSum(int num[],int target){
       for(int i=0;i<num.length;i++){
            int start=i;
           for(int j=i+1;j<num.length;j++){
               int end=j;
               if(num[start]+num[end]==target){
                   System.out.print(start+","+end+" ");

               }
           }
       }
       return -1;
    }
    /*int num[]={11,32,13,24,76,14};
        int target = 38;
        twoSum(num,target);*/
    //Count the Odd numbers in given range ------->
    public static int oddNum(int start,int end){
       int count=0;
       for(int i=start;i<=end;i++){
           if(i % 2 != 0){
               count++;
           }
       }
       return count;
    }
    //
    /*int result = oddNum(1,5);
        System.out.println("Count : "+result);*/
    //Best Time to Buy and Sell Stock(Brute force)-------->
     public static int buySell(int num[]){
         int maxProfit=0;
         for(int buy=0;buy<num.length-1;buy++){
             for(int sell=buy+1;sell<num.length;sell++){
                 int profit = num[sell]-num[buy];
                 if(profit>maxProfit){
                     maxProfit=profit;
                 }
             }
         }
         return maxProfit;
     }
     /*int num[]={7,5,5,3,6,4,10};
        int result = buySell(num);
        System.out.print(result);*/
    //Second largest number in array----------->
    public static int secLargest(int num[]){
      int largest=Integer.MIN_VALUE;
      int secLargest=Integer.MIN_VALUE;
      for(int i=0;i<num.length;i++){
          if(num[i]>largest){
              secLargest=largest;
              largest=num[i];
          }else if(num[i]>secLargest && secLargest!=largest){
                 secLargest=num[i];
          }
      }
        return secLargest;
    }
    /*int num[]={1,2,3,4,5};
        int r = secLargest(num);
        System.out.print(r);*/
    //Skip a number which is divisible ny 10 in array------>
   public static void skipNum(int num[]){
       for(int i=0;i<num.length;i++){
           if(num[i]%10==0){
               continue;
           }else{
           System.out.println(num[i]);
       }
       }
   }
    /* int num[]={13,22,30,41,50,11,43,12,90};
        skipNum(num);*/
   //Calculate sum of subarray (prefix sum)---------->
    public static void sumSubArray(int num[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){   // prefix array created...
            prefix[i]=prefix[i-1]+num[i];
        }
         for(int i=0;i<num.length;i++){
                int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;

             currSum = start==0 ? prefix[end]: prefix[end]-prefix[start-1];
            if(max<currSum){
                max=currSum;
            }
            }
        }
         System.out.print("Max sum : "+max);

    }
    /*int num[]={1,2,4};
        sumSubArray(num);*/
    //Calculate max sum of subarray(kadanes Algoritham)------------>
    public static void kadanes(int num[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currSum=currSum+num[i];
          if(currSum<0){
              currSum=0;
          }
           max=Math.max(currSum,max);
        }
        System.out.print("Max sum : "+max);
    }
    /*int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);*/
    //Calculate the frequency of a character
    public static void freq(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int AcsiiOfCh = ch;  //Can be - int AcsiiOfCh = (int)ch;
            freq[AcsiiOfCh]++;  //Each charater is converted to ACSII value
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]); //Converting ACSII TO CHARACTER
            }
        }
    }
 //Find Duplicate in array (optimize soln by hashset)------>
public static boolean findDuplicate(int num[]) {
    Set<Integer> visited = new HashSet<>();
    for (int i = 0; i < num.length; i++) {
        if (visited.contains(num[i])) {
            return true;
        } else {
            visited.add(num[i]);
        }
    }
    return false;
}
/*int num[]={1,2,3,4,5};
    boolean ans = findDuplicate(num);
    System.out.print(ans);*/
//Product of array except self(brute Force)----------->
 public static void productArr(int num[]){
     int result[]=new int[num.length];
     for(int i=0;i<num.length;i++){
         int product=1;
       for(int j=0;j<num.length;j++){
         if(j!=i){
             product*=num[j];
         }
       }
       result[i]=product;
     }
     for(int i=0;i<result.length;i++){
         System.out.print(result[i]+",");
     }
 } /*int num[]={1,2,3,4};
     productArr(num);*/
// Find the missing number--------------------->
public static int missingNumber(int[] nums) {
    int n = nums.length + 1;
    int expected = n * (n + 1) / 2;
    int actual = 0;
    for (int num : nums) {
        actual += num;
    }
    return expected - actual;
}
//Move all zeroes to End------------------------->
public static void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
}
//Move All Negative Numbers to One Side---------------->
   public static void moveNegative(int[] arr) {
      int left = 0, right = arr.length - 1;
      while (left <= right) {
        if (arr[left] < 0) {
            left++;
        } else if (arr[right] >= 0) {
            right--;
        } else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
        }
      }
  // Sort an Array of 0s, 1s and 2s----------------------->
  public static void sort012(int[] arr) {
      int low = 0, mid = 0, high = arr.length - 1;
      while (mid <= high) {
          if (arr[mid] == 0) {
              int temp = arr[low];
              arr[low] = arr[mid];
              arr[mid] = temp;
              low++;
              mid++;
          }
          else if (arr[mid] == 1) {
              mid++;
          }
          else {
              int temp = arr[mid];
              arr[mid] = arr[high];
              arr[high] = temp;
              high--;
          }
      }
  }
//Remove Duplicates from Sorted Array-------------------->
public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
// Best Time to Buy and Sell Stock -------------------------------->
public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
    }
    return maxProfit;
}
// Best Time to Buy and Sell Stock 2 --------------------------->
/*Input: [7,1,5,3,6,4]
Output: 7
Explanation:
Buy at 1 → Sell at 5 = +4
Buy at 3 → Sell at 6 = +3
Total = 7*/
public static int maxProfit2(int[] prices) {
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }
    return profit;
}
// get smallest and largest substring (alphabetical order)------------->
String getSmallAndLarge(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);
    for (int i = 1; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        if (sub.compareTo(smallest) < 0) smallest = sub;
        if (sub.compareTo(largest) > 0) largest = sub;
    }
    return smallest + "\n" + largest;
}
//Check anagrams (two strings have the exact same characters with the same frequency)->
// By inbuilt methods
public static boolean anagram(String s1,String s2) {
    if (s1.length() != s2.length()) return false;
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
}
//Check anagrams(By ASCII value)-------------------->
static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    boolean isAnagram = true;
    int[] freq = new int[128];  // 128 includes a-z & A-Z
    for (char c : a.toCharArray())
        freq[c]++;
    for (char c : b.toCharArray())
        freq[c]--;
    for (int f : freq) {
        if (f != 0) {
            isAnagram = false;
        }
    }
    return isAnagram;
}
// Find unique element in array(XOR METHOD (A^A=0 & A^0=A) Basically it eleminate the pair )---------------->
public static int uniqueEl(int num[]){
    int unique = 0;
    for(int i=0;i<num.length;i++){
        unique=unique^num[i];
    }
    return unique;
}
//Find a factorial of a number (Recursion method)---------------->
public static int factorialOfNum(int num){
   if (num==0){
       return 1;
   }else{
       return num * factorialOfNum(num-1);
   }
}
// Sum of N natural number using Recursion method -------------------->
public static int sumOfNum(int num){
    if (num==0){
        return 0;
    }else{
        return num + sumOfNum(num-1);
    }
}
// sum of incremental numbers------------->
public static void sumOf(int num[]){
    int sum=1;
    for(int i=1;i<num.length;i++){
        sum += num[i];
        if(sum==10){
            continue;
        }
         System.out.println(sum-num[i]+" + "+num[i]+" = "+sum);
    }
}
// Median of 3 value------------->
public static int medianNum(int a,int b,int c){
    int median = a+b+c - Math.min(a,Math.min(b,c))-Math.max(a,Math.max(b,c));
    return median;
}
//s2 is substring of s1----------------->
public static void isSubstring(String s1, String s2){
    if(s1.contains(s2)){
        System.out.println("s2 is substring of s1");
    }else{
        System.out.println("s2 is not substring of s1");
    }
}
//Find the "AM" "PM" using time Hr and minutes -------------->
public static void timeCal(int hr,int min){
    if((hr>=0 && hr<=23) && (min>=0 && min<=59)){
        if(hr<12){
            System.out.println("AM");
        }else{
            System.out.println("PM");
        }
    }else{
        System.out.println("Invalid time selected");
    }
}
//determine days (1-7) weekday or weekend------------------------>
public static void weekdayOrWeekend(int day){
    String[] arr = {"mon","Tue","Wed","Thur","Fri","Sat","Sun"};
    if(day >0 && day<=5){
        System.out.println(arr[day-1]+" is "+"Weekday");
    }else if(day>5 && day<=7){
        System.out.println(arr[day-1]+" is "+"Weekend");
    }else{
        System.out.println("Invalid number");
    }
}
//Check a password (length>=8 and contains at least one digit)------------->
public static void passwordCheck(String s){
    if(s.length()>=8 && s.matches(".*[0-9].*")){     // Regex
        System.out.println("Correct password");
    }else{
        System.out.println("Incorrect password");
    }
}
// calculate the electricity units consumed and calculate the bill as per slab ------->
public static void electricityBill(int unit){
    double bill =0;
    if(unit <=0){
        System.out.println("Incorrect reading");
    }
    else if(unit<=100){
        System.out.println("First slab");
        bill += 100*1.5;
    }else if(unit<=200){
        System.out.println("Second slab");
        bill +=100*1.5+(unit-100)*2.5;
    }else if(unit<=300){
        System.out.println("Third slab");
        bill +=100*1.5+100*2.5+(unit-200)*0.5;
    }
    System.out.println("Electricity bill : "+bill);
}
// pythagorean Triplet----------------->
public static void pythagoreanTriplet(int a,int b,int c){
    int x = Math.max(a,Math.max(b,c));
    int y,z;
    if(x==a){
        y=b;
        z=c;
    }else if(x==b){
        y=a;
        z=c;
    }else{
        y=a;
        z=b;
    }
    if(x*x == (y*y + z*z)){
        System.out.println("Pythagorean Triplet");
    }else{
        System.out.println("Not a Pythagorean Triplet");
    }
}
//check month and day is valid or not--------------------->
public static void  checkDate(int month,int day){
    int maxDay=0;
    if(month<1 || month>12){
        System.out.println("Invalid month");
        return;
    }
    if(month==2){
        maxDay=28;
    }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
        maxDay=31;
    }else{
        maxDay=30;
    }
    if(day>=1 && day<=maxDay){
        System.out.println("Valid Day");
    }else{
        System.out.println("Invalid Day");
    }
}
//check the sum of its digit is greater than the product of its digit------------------------->
public static void checkNumber(int num){
    int sum=0;
    int product=1;
    while(num>0){
       int lastDigit = num % 10;
       sum+=lastDigit;
       product*=lastDigit;
       num=num/10;
    }
    if(sum>product){
        System.out.println("Sum is greater");
    }else{
        System.out.println("Product is greater");
    }
}
//Count the digits------------------->
public static void countNum(){
    int num = 52356378;
    int count = 0;
    while(num>0){
        count++;
        num = num/10;
    }
    System.out.println(count);
}
// print reverse of number------------------>
public static void revNum(){
    int num = 12345;
    int rev=0;
    while(num>0){
        int lastDigit= num % 10;
        rev = rev * 10 + lastDigit;
        num=num/10;
     }
     System.out.println(rev);
}
// Check Armstrong number----------------->
public static void armNum(int num){
    int original = num;
    int cubeSum = 0;
    while(num>0){
        int lastDigit = num % 10;
        cubeSum += Math.pow(lastDigit,3);
        num = num/10;
    }
    if(original == cubeSum){
        System.out.println("Armstrong Number");
    }else{
        System.out.println("Not a Armstrong Number");
    }
}
//check perfect number ------------------>
public static void  perfectNum(int num){
    int original = num;
    int numSum = 1;
    for(int i=2;i<=num/2;i++){
        if(num % i == 0){
            numSum += i;
        }
    }
    if(original == numSum){
        System.out.println("Perfect number");
    }else{
        System.out.println("Not a Perfect number");
    }
}
// prime number from 1 - 100 ---------------->
public static boolean primeNumber(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            System.out.println("Invalid number");
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    //prime num till 100------------->
public static void primeNumTill100() {
    for (int num = 2; num <= 100; num++) {
        boolean isPrime = true;
        if (num <= 1) {
            System.out.println("Invalid number");
            isPrime = false;
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.print(num + " , ");
        }
    }
}
//swap two numbers----------------->
public static void swapNum(int a,int b){
    int temp = a;
    a=b;
    b=temp;
    System.out.print("a :"+a+", b :"+b);
}
//swap two numbers (Optimize way XOR)------------->
public static void swapNumbers(int a,int b){
    a = a ^ b;            //a = a + b
    b = a ^ b;            //b = a - b
    a = a ^ b;            //a = a - b
    System.out.print("a :"+a+", b :"+b);
}
// Fibonacii series---------------->
public static void fiboSeries(int num){
    int a=0,b=1;
    for(int i=0;i<=num;i++){
        System.out.print(a+" , ");
        int next = a+b;
        a=b;
        b = next;
    }
}
//Sum of n Fibonacii series--------------------->
public static void sumFibo(int n){
    int a = 0,b=1,sum=0;
    for(int i=0;i<=n;i++){
        System.out.print(a+" , ");
        sum+=a;
        int next = a+b;
        a=b;
        b = next;
    }
    System.out.println();
    System.out.println("sum : "+sum);
}
//Reverse a String ------------------->
public static void revString(String s){
    String rev = "";
    for(int i=s.length()-1;i>=0;i--){
        char ch = s.charAt(i);
        rev+=ch;
    }
    System.out.println("Reverse : "+rev);
}
//Squre of a number----------------->
public static void sqrNum(int num){
    for(int i=0;i<=num;i++){
        int squre =(int)Math.pow(i,2);
        System.out.print(squre+" , ");
    }
}
// numbers divisible by 7 (a to b)--------------->
public static void divBy7(int a,int b){
    for(int i=a;i<=b;i++){
       if(i%7==0){
           System.out.print(i+" , ");
       }
    }
}
// Find factors ---------------->
public static void factors(int num){

    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            System.out.print(i+" , ");
        }
    }
}
// Find sum of factors ---------------->
public static void factorSum(int num){
    int sum=0;
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            System.out.print(i+" , ");
            sum += i;
        }
    }
    System.out.println();
    System.out.print("Sum : "+sum);
}
// Find HCF ------------------->
public static int hcf(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
// Find LCM ------------------------->
public static void lcm(int a, int b) {
    int max = Math.max(a, b);
    while (true) {
        if (max % a == 0 && max % b == 0) {
            System.out.println("LCM = " + max);
            break;
        }
        max++;
    }
}
// AP till n term------------------->
public static void arithSeries(int a,int d,int n){
    int term = a;
    for(int i=1;i<=n;i++){
        System.out.print(term+" , ");
        term += d;
    }
}
//GP till n term---------------------->
public static void geomeSeries(int a,int r,int n){
    int term = a;
    for(int i=1;i<=n;i++){
        System.out.print(term+" , ");
        term *=r;
    }
}
//Anagram of big string ---------------->
public static int[] anagramString(String big, String small) {
    big = big.toLowerCase();
    small = small.toLowerCase();

    char[] smallSorted = small.toCharArray();
    Arrays.sort(smallSorted);

    ArrayList<Integer> matches = new ArrayList<>();
    for (int i = 0; i <= big.length() - small.length(); i++) {
        char[] window = big.substring(i, i + small.length()).toCharArray();
        Arrays.sort(window);

        if (Arrays.equals(window, smallSorted)) {
            matches.add(i);
        }
    }
    int[] result = new int[matches.size()];
    for (int i = 0; i < matches.size(); i++) {
        result[i] = matches.get(i);
    }
    return result;
}
//Palindrome number from 1 - 500----------------->
public static boolean palindromNum(int num){
    int original = num;
    int rev = 0;
    while(num>0){
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num/10;
    }
    return original == rev;
}
//for (int i=0;i<=500;i++) {
//        boolean ans = palindromNum(i);
//        if(ans){
//        System.out.println(i);
//    }}

//number 1-100 whose sum of digits is divisible by 3--------------------->
public static void sumOfDigitMulOf3(){
    for(int i=3;i<=100;i+=3){
      int x = i % 10;
      int y = i / 10;
      if((x+y)%3==0){
          System.out.println(i);
      }
    }
}
//Largest and smallest digit in a number -------------->
public static void smallestAndLargest(int num){
    int largest = 0;
    int smallest = 9;
    while(num>0){
        int lastDigit = num % 10;
        if(lastDigit>largest){
            largest = lastDigit;
        }else if(lastDigit < smallest){
            smallest = lastDigit;
        }
        num = num/10;
    }
    System.out.println("Largest digit : "+largest);
    System.out.println("Smallest digit : "+smallest);
}
// Factorial from 1 - n ----------------------->
public static void factToN(int n){
    long fact =1;
    for(int i=1;i<=n;i++){
      fact *= i;
    }
    System.out.println("Factorial of "+n+" : "+fact);
}
//for(int i=1;i<=50;i++) {
//        factToN(i);
//    }

// Take input of 5 number and print the sum (Continue for 0)------------------------>
public static void printSum(){
    Scanner scn =new Scanner(System.in);
    int sum=0;
    for (int i=1;i<=5;i++){
        System.out.print("Enter the number : ");
       int num = scn.nextInt();
       if(num==0){
           continue;
       }else{
           sum+=num;
       }
    }
    System.out.println("Sum of numbers : "+sum);
}
//odd digit and even digit sum in a number------------------>
public static void oddEvenDigitSum(int num){
    int oddSum = 0,evenSum = 0;
    while(num>0){
        int digit = num%10;
        if(digit % 2==0){
            evenSum+=digit;
        }else{
            oddSum+= digit;
        }
        num = num/10;
    }
    System.out.println("Even Digit Sum : "+evenSum);
    System.out.println("Odd Digit Sum : "+oddSum);
}
// Each row i print i*i---------------------------->
public static void printi2(int row){
    for(int i=1;i<=row;i++){
        System.out.println(i*i);
    }
}
// Print 1 - n using recursion------------------>
public static void printNumber(int n){
    if(n==0) return;
    printNumber(n-1);
    System.out.println(n);
}
// Print n - 1 using recursion--------------------->
public static void printNumberDown(int n){
    if(n==0) return;
    System.out.println(n);
    printNumberDown(n-1);
}
//print Even Number using recursion------------------>
public static void printEvenNumber(int num){
    if(num==0)return;
    printEvenNumber(num-1);
   if(num % 2==0){
       System.out.println(num);
   }
}
//sum of numbers 1 - n using recursion------------------->
public static int printSum(int num){
    if (num==0) return 0;
    else return num +printSum(num-1);
}
// Print Even sum from 1-n using recursion----------------->
public static int printEvenSum(int num){
    if (num<=0) return 0;
    if(num % 2==0){
       return num +printEvenSum(num-2);
    }
    return printEvenSum(num-1);
}
//Print pyramid --------------------->
public static void printPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i)-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
//Second Largest number in Array ------------------------>
public static void secondHighest(int num[]){
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int i=0;i<=num.length-1;i++){
       if(num[i]>largest){
           secondLargest = largest; //if any new number is bigger than largest so update the secondLargest
           largest = num[i];        //and assign the new number to largest
       } else if(num[i]>secondLargest && num[i] < largest ){ //But if any number is not bigger than largest but it can be a second largest number
           secondLargest = num[i];      //So we check each number and than check it should not be equal to largest
       }
    }
    System.out.println("Largest : "+largest);
    System.out.println("secondLargest : "+secondLargest);
}
// Fibonacii series with proper algorithm--------------------->
public static void fibo(int n){
    int first = 0;
    int second = 1;
    System.out.print(first+",");
    System.out.print(second+",");
    for(int i=3;i<=n;i++){
        int next = first + second;
        System.out.print(next+",");
        first = second;
        second = next;
    }
}
//find the frequency of characters in a string--------------->
public static void freqOfChar(String s){
    s = s.toLowerCase();
    int[] freq = new int[128];
    for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          freq[ch]++;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]>0){
            System.out.println((char)i +":"+ freq[i]);
        }

    }
}
//Bubble sorting--------------------->
public static void bubble(int[]arr){
    int a = arr.length;
    for(int i=0;i<a;i++){
        for(int j=i+1;j<a;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int k : arr){
        System.out.print(k+",");
    }
}
//Power of number using recursion--------------------->
public static int powOfNum(int num,int pow){
    if(pow==0) return 1;
    else return num * powOfNum(num,pow-1);
}
// Calculate profit % -------------------->
public static void profitPer(int cp,int sp){
    int profit = sp-cp;
    double profitPer = ((double)profit/cp)*100;
    System.out.print(profitPer+" %");
}
// Find nth fibonacii number recursively--------------------->
public static int nthFiboNumber(int num){
    if(num==0) return 0;
    if(num==1) return 1;
    return nthFiboNumber(num-1) + nthFiboNumber(num-2);
}
// Find the series of fibonacii n numbers using recursion------------->
public static void fiboNumSeries(int num,int a,int b){
    if(num==0) return;
    System.out.print(a+",");
    fiboNumSeries(num-1,b,a+b);
}
//Non Repeating character in a string ---------------------->
public static void nonRepeatingChar(String str){
    for(int i=0;i<str.length();i++){
        boolean isRepeting = false;
        for(int j=0;j<str.length();j++){
            if(i!=j && str.charAt(i)==str.charAt(j)){
                isRepeting = true;
            }
        }
        if(!isRepeting){
            System.out.print(str.charAt(i));
        }
    }
}
//Sift Zeroes in Last position---------------->
public static void siftZeroesInLast(int[] num){
    int index=0;
    for(int i=0;i<num.length;i++){
        if(num[i]!=0){
            num[index]=num[i];
            index++;
        }
    }
    while(index<num.length){
            num[index]=0;
            index++;
    }
    for(int i :num){
        System.out.print(i);
    }
}
// Sum of digit recursively------------------>
public static int sumOfDigit(int num){
    int sum=0;
    if(num==0) return 0;
    sum += num % 10;
    num=num/10;
    return sumOfDigit(num) + sum;
}
//count the number of digit recursively--------------------->
public static int countOfDigit(int num){
    int count=0;
    if(num==0) return 0;
    num=num/10;
    count++;
    return countOfDigit(num) + count;
}
//Reverse a number recursively------------------>
public static int reverseNumber(int num,int rev){
    if(num==0) return rev;
    int lastDigit = num % 10;
    rev = rev * 10 + lastDigit;
    num = num/10;
    return reverseNumber(num,rev);
}
// Number is a palindrome using recursion----------------->
public static String palindromeNum(int num,int rev,int original){
    if(num==0) return (original==rev)? "Palindrom":"Not Palindrom";
    int lastDigit = num % 10;
    rev = rev * 10+lastDigit;
    return palindromeNum(num/10,rev,original);
}
//Product of digits of a number using recursion----------------->
public static int productNum(int num,int product){
    if(num==0) return product;
    int lastDigit = num %10;
    product *=lastDigit;
    num=num/10;
    return productNum(num,product);
}
// Decimal to Binary ------------------------>
public static int  numberToBinary(int num){
    if(num==0 || num==1) return num;
    int rem = num % 2;
    return numberToBinary(num/2) * 10 + rem;
}
// Binary to decimal-------------------->
public static int binaryToDecimal(int num,int power){
    if(num==0) return 0;
    int lastDigit = num % 10;
    int term = (int)Math.pow(2,power) * lastDigit;
    return binaryToDecimal(num/10,power+1)+term;
}
//Sum of even numbers recursively-------------------->
public static int evenSum(int num){
    int sum=0;
    if(num==0) return sum;
    if(num %2==0){
        sum +=num;
    }
    return evenSum(num-1)+sum;
}
// Print line of  n star recursively------------->
public static String starPrint(int n){
    if(n==1) return "*";
    System.out.print("*");
    return starPrint(n-1);
}
//Print a squre of star recursively------------->
public static void squreStarPrint(int n,int row){
    if(n==row) return;
    starPrint(6);
    System.out.println();
    squreStarPrint(n,row+1);
}
// Sum of all element in array--------------->
public static void sumArray(int[] num){
    int sum =0;
    for(int i=0;i<num.length;i++){
      sum += num[i];
  }
    System.out.print(sum);
}
//Average of array elements----------------->
public static void avgArray(int[] num){
    float sum =0;
    int size = num.length;
    for(int i=0;i<num.length;i++){
        sum += num[i];
    }
    float avg = sum/size;
    System.out.print(avg);
}
// Return index of max element in Array--------------->
public static int returnIndex(int[] num){
    int max = Integer.MIN_VALUE;
    int index=0;
    for(int i=0;i<num.length;i++){
        if(max<num[i]){
            max = num[i];
            index=i;
        }
    }
    return index;
}
//Check if all the element in an array is unique----------->
public static boolean uniqueElement(int[] num){
    Set<Integer> element= new HashSet<>();
    for(int i=0;i<num.length;i++){
        element.add(num[i]);
    }
    return num.length==element.size();
}
//Find sum of even numbers in array-------------->
public static void  evenSumArray(int[] num){
    int sum=0;
    for(int i=0;i<num.length;i++){

        if(num[i] % 2==0){
            System.out.println(num[i]);
            sum+=num[i];
        }
    }
    System.out.println("sum : "+sum);
}
// Find sum of odd numbers in array-------------->
public static void  oddSumArray(int[] num){
    int sum=0;
    for(int i=0;i<num.length;i++){

        if(num[i] % 2!=0){
            System.out.println(num[i]);
            sum+=num[i];
        }
    }
    System.out.println("sum : "+sum);
}
// Find the count of prime number in array---------------->
public static void  primeElementInArray(int[] num){
    int count = 0;
    for(int i=0;i<num.length;i++){
        boolean isPrime = true;
        if(num[i]<=1){
            isPrime = false;
        }
        for(int j=2;j<=Math.sqrt(num[i]);j++){
            if(num[i] % j==0){
               isPrime = false;
               break;
            }
        }
        if(isPrime){
            System.out.print(num[i] + ",");
            count++;
        }
   }
    System.out.println();
    System.out.print("count :"+count);
  }

//count the element in an array which is divisible by 3 and 5 both----------------->
public static void divNumbers(int[] num){
    int count = 0;
    for(int i=0;i<num.length;i++){
        if(num[i] % 15 ==0){
           System.out.print(num[i]+",");
           count++;
        }
    }
    System.out.println();
    System.out.print("Count :"+count);
}
//Count how many element is perfect squre is array------------>
public static void perfectSqureInArr(int[] num){
    int count = 0;
    for(int i=0;i<num.length;i++){
        int sqrt = (int)Math.sqrt(num[i]);
        if( sqrt * sqrt== num[i]){
            System.out.print(num[i]+",");
            count++;
        }
    }
    System.out.println();
    System.out.print("count : "+count);
  }
 //Create new array with squre of each element ------------->
public static void squreArr(int[] num){
    int[] squre = new int[num.length];
    for(int i=0;i<num.length;i++){
        squre[i] = num[i] * num[i];
    }
    for(int squres : squre){
        System.out.print(squres+",");
    }
}
// Replce every negative number with zero--------------->
public static void replaceWithZero(int[] num){
    int[] newArr = new int[num.length];
    for(int i=0;i<num.length;i++){
        if(num[i]<0){
            newArr[i] = 0;
        }else{
            newArr[i] = num[i];
        }
    }
    for(int el : newArr){
        System.out.print(el+",");
    }
}
// Replce every Even number with 1 and odd number with zero--------------->
public static void replaceWithZeroAndOne(int[] num){
    int[] newArr = new int[num.length];
    for(int i=0;i<num.length;i++){
        if(num[i]<1){
            newArr[i]= -1;
        }else if(num[i] % 2==0){
            newArr[i] = 1;
        }else{
            newArr[i] = 0;
        }
    }
    for(int el : newArr){
        System.out.print(el+",");
    }
}
//swap first and last element --------------->
public static void replaceFirstAndLastEl(int[] num) {
    int temp = num[0];
    num[0] = num[num.length - 1];
    num[num.length - 1] = temp;
     for (int el : num) {
        System.out.print(el + ",");
    }
}
// Reverse an array------------>
public static void reverseArr(int[] num){
    for(int i=num.length-1;i>=0;i--){
        System.out.print(num[i] + ",");
    }
}
//Rotate an array by one position to the left------------>
public static  void rotateArrOneLeft(int[] num){
    int first = num[0];
    for(int i=0;i<num.length-1;i++){
        num[i] = num[i+1];
    }
    num[num.length-1] = first;
    for(int el: num){
        System.out.print(el + ",");
    }
}
//Rotate an array by one position to the Right------------>
public static  void rotateArrOneRight(int[] num){
    int last = num[num.length-1];
    for(int i=num.length-1;i>0;i--){
        num[i] = num[i-1];
    }
    num[0]=last;
    for(int el: num){
        System.out.print(el + ",");
    }
}
//Swap alternate element in array--------------->
public static void alternateSwap(int[] num){
    for(int i=0;i<num.length-1;i+=2){
        int temp = num[i];
        num[i] = num[i+1];
        num[i+1] = temp;
    }
    for(int j : num){
        System.out.print(j+",");
    }
}
//Copy one array to another----------------->
public static void newArr(int[] num ){
    int[] newArr = new int[num.length];
    for(int i=0;i<num.length;i++){
        newArr[i] = num[i];
    }
    for(int el:newArr){
        System.out.print(el+",");
    }

}
//Compare two array(same element,same order & size)--------------->
public static void compareTwoArr(int[] arr1, int[] arr2){
    boolean equalValues = true;
    if(arr1.length != arr2.length){
        System.out.print("Arr is not equal");
        return;
    }
    for(int i=0;i<arr1.length;i++){
        if(arr1[i] != arr2[i]){
            equalValues = false;
        }
    }
    if(equalValues){
        System.out.print("values are equal");
    }else{
        System.out.print("values are not equal");
    }
}
//Compare array if they contain the same element(ignore order)----->
public static void compareArr(int[] arr1,int[] arr2){
    boolean equalValues = true;
    if(arr1.length != arr2.length){
        System.out.print("Arr is not equal");
        return;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
        if(arr1[i] != arr2[i]){
            equalValues = false;
        }
    }
    if(equalValues){
        System.out.print("values are equal");
    }else{
        System.out.print("values are not equal");
    }
}
public static void main (String args[]){
    compareArr(new int[] {1,2,3,4,5,6},new int[] {6,2,4,3,5,1});

}










