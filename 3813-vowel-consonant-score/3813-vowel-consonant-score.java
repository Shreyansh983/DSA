class Solution {
    public int vowelConsonantScore(String s) {
        int vowelCount = 0;
        int constCount = 0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
                vowelCount++;
            else if(ch>='a' && ch<='z')
                constCount++;
        }
        if(constCount <= 0) return 0;
        return vowelCount/constCount;
    }
}