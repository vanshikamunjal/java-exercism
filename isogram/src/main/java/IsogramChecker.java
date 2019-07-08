import java.util.Arrays;
class IsogramChecker {

    boolean isIsogram(String phrase) {
 
phrase= phrase.toLowerCase();
phrase = phrase.replaceAll("\\s+", "");
int len = phrase.length();
char charArr[] = phrase.toCharArray();
Arrays.sort(charArr);
for(int i=0; i<len-1; i++){
if(charArr[i] != '-'){
if(charArr[i] == charArr[i+1]){
return false;
}
}
}
return true;       

    }

}
