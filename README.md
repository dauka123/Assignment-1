# Assignment-1
Explanations my tasks 
## Task 1
**Description**: Return the minimum value of an array

**Explanation:** In this code you need to find the minimum digit, for this I used recursion where the digits go from the very last to the very first.

**Solution:**
```ruby
    public static int getMin(int n, int[] arr){
        int min1 = arr[n - 1];
        if (n == 1){
            return min1;
        }
        int min2 = getMin(n -1, arr);
        if (min1 < min2){ // find the minimum
            return min1;
        }
        else{
            return min2;
        }
    }
```
## Task 2
**Description**: Return average value of array

**Explanation:** In this task I used two functions, the first is to find the sum of all the numbers in the array using recursion. In the second is to find the average number. 

**Solution:**
```ruby
    public static float getAverage(int n, int[] arr){
        float average = getSum(n, arr) / n; // find the average of array
        return average;
    }
    public static float getSum(int n, int[] arr){
        int sum = arr[n-1];
        if (n == 1){
            return sum;
        }
        sum += getSum(n-1,arr); // find the sum of array
        return sum;
    }
```
## Task 3
**Description:** Check a number for a prime

**Explanation:** Checking a prime number or not. For this I used the X variable so that when a given number is divided without a remainder by numbers other than itself and 1 we can find out about it.

**Solution:**
```ruby
    public static String checkPrime(int num){
        int x = 1;
        for (int i = 2; i < num-1; i++){
            if (num % i == 0) {
                x += 1; // if number have any other dividers we will know
            }
        }
        if (x == 1){
            return "Prime";
        }
        else{
            return "Composite";
        }
    }
```
## Task 4
**Description:** Return factorial number

**Explanation:** Each time we multiply the number by (num-1) and when (num) reaches 1 stop it so that it does not also multiply by 0.

**Solution:**
```ruby
    public static int findFactorial(int num){
        if (num == 1){
            return num;
        }
        num *= findFactorial(num-1); // find the factorial of number
        return num;
    }
```
## Task 5
**Description:** Return the number on n-th position of fibonacci sequence

**Explanation:** Using the formula and recursion we find the number based on the sequence. 

**Solution:**
```ruby
    public static int findFibNum(int num){
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return findFibNum(num-1) + findFibNum(num-2); // formula to find the number in seq
    }
```
## Task 6
**Description:** Return base in power n

**Explanation:** Having two numbers using recursion multiply the number by itself until (n) equals 1.

**Solution:**
```ruby
    public static int findDegree(int a, int n){
        int degree = a;
        if (n == 1){
            return degree;
        }
        degree *= findDegree(a, n-1); // find the degree and return
        return degree;
    }
```
## Task 7
**Description:** Reverse an array

**Explanation:** We take the very first and last number, then gradually swap them until all the numbers are at their positions.

**Solution:**
```ruby
    public static void reverseOrder(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseOrder(arr, start+1, end-1); // change numbers order
    }
```
## Task 8
**Description:** Check is provided string is integer

**Explanation:** Take the first character of the string 's', then check that character. If it is a number, check the other characters individually, but this time start with the next number and in the end return 'true' or 'false'.

**Solution:**
```ruby
    public static boolean CheckDigit(String s) {
        if (s.length() == 0) {
            return true;
        }
        else {
            char a = s.charAt(0);
            if (Character.isDigit(a)) { // check zero's index character
                return CheckDigit(s.substring(1)); // start with the next character
            }
            else {
                return false;
            }
        }
    }
```
## Task 9
**Description:** Return binomial coefficient of n and k params

**Explanation:** A formula is available to us, by which we can easily find the binomial coefficient.

**Solution:**
```ruby
    public static int findBinCoefficient(int n, int k) {
        if(n == k || k == 0){
            return 1;
        }
        else{
            return findBinCoefficient(n-1, k-1) + findBinCoefficient(n-1, k); // just a formula
        }
    }
```
## Task 10
**Description:** Return GCD of a and b

**Explanation:** Using the Euclidean algorithm, find the smallest common divisor of two numbers.

**Solution:**
```ruby
    public static int findGCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return findGCD(b, a % b); // Euclidean Algorithm
    }
```
