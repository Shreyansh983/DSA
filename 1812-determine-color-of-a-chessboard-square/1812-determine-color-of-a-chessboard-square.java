class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a = coordinates.charAt(0);
        int num1 = a - 'a' + 1;
        int num2 = coordinates.charAt(1) - '0';
        return ((num1+num2)%2)!=0;
    }
}