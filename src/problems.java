import java.util.Scanner;
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
    public static int[] check(int num[]) {
        int[] result = new int[num.length];
        int index = 0;
        for(int i = num.length - 1; i >= 0; i--){
            result[index] = num[i];
            index++;
        }
        return result;
    }
    public static void employee(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scn.nextLine();
        System.out.print("Enter the ID: ");
        int id = scn.nextInt();
        System.out.print("Enter the gender(M/F): ");
        char gender = scn.next().charAt(0);
        System.out.print("id: "+id+" name: "+name+" gender: "+gender);
    }
    // Check leap year ------------------------>
    public static void leapYear(int year){
       if((year%4==0 && year%100!=0)||year%400==0 ){
           System.out.print("leap year");
       }else{
           System.out.print("not leap year");
       }
    }
    //consonant and vowel ----------------->
    public static void checkDigit(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the character :");
       char ch = Character.toLowerCase(scn.next().charAt(0));
        if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
    // Check uppercase,lowercase,digit and special character------------->
    public static void checkKey(){
       while(true){ Scanner scn = new Scanner(System.in);
        System.out.print("Enter the character :");
        char ch = scn.next().charAt(0);
      if(Character.isUpperCase(ch)){
          System.out.println("Uppercase");
      }else if(Character.isLowerCase(ch)){
          System.out.println("Lowercase");
      }else if(Character.isDigit(ch)){
          System.out.println("Digit");
      }else{
          System.out.println("Special character");
      }
    }}
    //check triangle is valid or not-------------->
    public static void checkTriangle(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the side A :");
        int a = scn.nextInt();
        System.out.print("Enter the side B :");
        int b = scn.nextInt();
        System.out.print("Enter the side C :");
        int c = scn.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.print("Triangle is valid");
        }
        else{
            System.out.print("Triangle is not valid");
        }
    }
    //check triangle is Equilateral,Isosceles,Scalene-------------->
    public static void checkTriangleType(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the side A :");
        int a = scn.nextInt();
        System.out.print("Enter the side B :");
        int b = scn.nextInt();
        System.out.print("Enter the side C :");
        int c = scn.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Triangle is valid");
            if(a==b && b==c){
                System.out.print("Triangle is Equilateral");
            }else if(a==b||b==c||c==a){
                System.out.print("Triangle is Isosceles");
            }else{
                System.out.print("Triangle is Scalene");
            }
        }
        else{
            System.out.print("Triangle is not valid");
        }
    }
    //check weather two number are odd, even, one even and one odd------------>
    public static void checkNum(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first Number  :");
        int a = scn.nextInt();
        System.out.print("Enter the second Number  :");
        int b = scn.nextInt();
        if(a%2==0 && b%2==0){
            System.out.print("numbers are Even");
        }else if((a%2!=0 && b%2!=0)){
            System.out.print("numbers are Odd");
        }else{
            System.out.print("One number is Even and one is Odd");
        }
    }
    //check the place of alphabet a-z-------------------->
    public static void checkAlpha(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Character  :");
        char ch = Character.toLowerCase(scn.next().charAt(0));
        if(ch>='a' && ch<='m'){
            System.out.print("char is betn a to m");
        }else{
            System.out.print("char is betn n to z");
        }
    }
    // Check Days using switch condition------------------>
    public static void checkDays(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number  :");
        int day = scn.nextInt();

        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid Number");
        }
    }
    // Check Days in month using switch condition------------------>
    public static void checkMonth(){
        Scanner scn = new Scanner(System.in);
        while(true){System.out.print("Enter the month  :");
        String month = scn.next();

        switch(month){
            case "jan":
                System.out.println("31");
                break;
            case "feb":
                System.out.println("28");
                break;
            case "mar":
                System.out.println("31");
                break;
            case "apr":
                System.out.println("30");
                break;
            case "may":
                System.out.println("31");
                break;
            case "jun":
                System.out.println("30");
                break;
            case "jul":
                System.out.println("31");
                break;
            case "aug":
                System.out.println("31");
                break;
            case "sep":
                System.out.println("30");
                break;
            case "oct":
                System.out.println("31");
                break;
            case "nov":
                System.out.println("30");
                break;
            case "dec":
                System.out.println("31");
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Invalid Number");
        }
     }
        }
    //check all digits are distinct in 3 digit number-------------->
    public static void distinctNum(int num){
           int a=0 ,b=0,c=0 ;
             a = num %10;
             num = num/10;
             b = num %10;
             num = num/10;
             c = num % 10;
         if(a!=b && b!=c && a!=c){
          System.out.print("numbers are distinct");
         }else{
             System.out.print("numbers are not distinct");
         }
    }
    // given integer is single digit,double digit and multi-digit--------->
    public static void CheckNumbers(int num){
           num = Math.abs(num);
       if(num<=9){
           System.out.print("Single digit");
       }else if(num<=99){
           System.out.print("Double digit");
       }else{
           System.out.print("Multi digit");
       }
    }
    //check if an amount can be evenly divided into 2000,500,100------->
    public static void checkAmount(int amount ){
          int amt2000= 0,amt500= 0,amt100= 0;
            amt2000 = amount/2000;
            amount = amount%2000;
            amt500 = amount/500;
            amount = amount%500;
            amt100 = amount/100;
        System.out.println("2000 : "+amt2000);
        System.out.println("500 : "+amt500);
        System.out.println("100 : "+amt100);
    }
    //check number is perfect squre--------------------->
    public static void perfectSqure(int num){
            boolean perfectSqure = false;
       for(int i=1;i*i<=num;i++){
           if(i*i==num){
               perfectSqure = true;
           }
       }
        if(perfectSqure){
            System.out.println("Number is perfect squre");
        }else{
            System.out.println("Number is not perfect squre");
        }
    }
    //check character is a letter,digit or neither--------------->
    public static void checkChar(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = Character.toLowerCase(scn.next().charAt(0));
        if(Character.isLetter(ch)){
            System.out.println("Letter");
        }else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }else{
            System.out.println("Neither letter nor digit");
        }
    }
    public static void main(String[] args) {
        checkChar();
    }
}

