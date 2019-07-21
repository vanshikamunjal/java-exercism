public class Palindrome {
    public String convert(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        return s;
    }
    public boolean check(String s){
        s = convert(s);
        for (int i=0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}

