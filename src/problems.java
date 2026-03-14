
public class problems {
    // Check number is prime or not------------->
    public static void primeNum(int num) {

        boolean primeNum=true;
        if(num<=1) {
            System.out.print("Not Prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                primeNum=false;
                break;
            }
        }
        if(primeNum) {
            System.out.print("Prime");
        }else {
            System.out.print("Not Prime");
        }
    }

    // convert array into 2D array than tranpose that array

    public static void conArr() {
        int num[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        int row = 2;
        int col = 5;
        int num2[][] = new int[num.length][num.length];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num2[i][j] = num[index];
                index++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------->");
        int newIndex = 0;
        for(int s=0;s<col;s++){
            for(int t=0;t<row;t++){
                  num2[s][t]= num[newIndex];
                  newIndex++;
                }
             }
        for(int s=0;s<col;s++){
            for(int t=0;t<row;t++){
                System.out.print(num2[s][t]);
            }
            System.out.println();
            }
    }

    //First non-repeateing character(Brute force)-------------------->
    public static char nonRepeateChar1(String s) {

        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            boolean isUnique = true;

            // Check left side
            for(int j = 0; j < i; j++) {
                if(x == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Check right side only if still unique
            for(int j = i + 1; j < s.length() && isUnique; j++) {
                if(x == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if(isUnique) {
                return x;
            }
        }

        return '_';
    }
    //First non-repeateing character(Optimize way)-------------------->
    public static char nonRepeateChar2(String s) {

        int[] freq = new int[256];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '_';
    }
    /*char ans =  nonRepeateChar("aaccdebe");
       System.out.print(ans);*/
    //find Second Largest Element----------------->
    public static Integer findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    //Max Sum of Sub Array---------------------->
    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    // product Except Self ------------------------>
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
    //First Non Repeating Element -------------------------->
    public static void firstNonRepeating(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
    /* firstNonRepeating("sshhiivam");*/
    //Reverse a String --------------------------------->
    public static void reverse(String s) {

        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }
    /*reverse("shivam");*/

    // Count Vowels ----------------------->
    public static void countVowels(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
    // Find Largest number in array-------------------->
    public static int findLargest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    // String is palindrome or not ------------------------>
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Swap Two Numbers (Without Using Third Variable)----------->
    public static void swapNumbers(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
        /* int temp = a;
            a = b;
            b = temp; */

        //Count Number of Words in a String
        public static void countWords(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                    count++;
                }
            }
            System.out.println(count);
        }
        // Reverse a String ------------->
        public static String reverseStr(String str){
            StringBuilder sb = new StringBuilder();
                for (int i = str.length() - 1; i >= 0; i--) {
                    sb.append(str.charAt(i));
                }
                return sb.toString();
            }
    // Check if a Number is Palindrome------------------------>
    public static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }
    // Count Even and Odd Numbers in an Array------------------->
    public static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
    public static void starPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void eachEl(int num[]){
       for(int el :num){
           System.out.print(el+",");
       }
    }
    public static void main(String[] args) {
        int num[]={12,23,348,48,56,68};
        eachEl(num);
    }
}

