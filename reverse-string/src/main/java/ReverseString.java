class ReverseString {

    String reverse(String inputString) {

char[] strArray = inputString.toCharArray();
inputString="";
for(int i = strArray.length-1; i>=0; i--)
inputString+=strArray[i];
return inputString;
}

}