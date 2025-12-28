class Palindrome {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]", "");
        res = res.toLowerCase();
        int n = res.length();
        for(int i=0; i<n/2; i++){
            if(res.charAt(i) != res.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}