
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
    public static void main(String[] args) {


    }

}

