public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x(-1, -2) == "ly") {
            return true; 
        } else { 
        return false;
        } 
    }

    public String conCat(String s1, String s2) {
        if (s1(-1) == s2(1)) { 
            return (s1 + s2 - s1(-1)); 
        } else { 
            return (s1 + s2); 
        }
    }

    public String withoutX(String s1) {
        if (str(0) == "x") {
            return ""; 
        }
        return "";
    }

    public String fizzString(String s1) {
        if (s1(0) == "f") {
            return "Fizz"; 
        } else if (s1(-1) == "b") {
            return "Buzz"; 
        } else if (s1(0) =="f" && s1(-1) == "b") {
            return "FizzBuzz"; 
        }  else {
            return s1; 
        }
        return "";
    }

    public String fizzString2(int x) {
        x = 15; 
        if (x % 3 == 0) { 
            return "Fizz!"; 
        } else if (x % 5 == 0) {
            return "Buzz!"; 
        } else if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!"; 
        } else {
            return x + "!"; 
        } 
    } 
    public static void main(String[] args) { 
    } 
}
