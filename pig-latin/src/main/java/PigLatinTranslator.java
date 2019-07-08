class PigLatinTranslator{

String translate(String word){
String sentence = "";
String[] words = word.split("\\s+");
for (int j = 0; j < words.length; j++) {
if(words[j].length() == 1){
sentence += words[j]+ "ay";
}
String firstTwo = " ";
String firstThree = " ";
String lowerWord = words[j].toLowerCase();
int pos = -1;

if(lowerWord.length() >= 2){
firstTwo = lowerWord.substring(0,2);
}
if(lowerWord.length() >=3){
firstThree = lowerWord.substring(0,3);
}
if(firstTwo.equals("xr") || firstTwo.equals("yt") || firstThree.equals("hon")){
sentence += lowerWord + "ay ";
}
else{
for(int i=0; i<lowerWord.length(); i++){
char ch=lowerWord.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
pos=i;
break;
}
}

if(pos==0){
sentence += lowerWord + "ay ";
}
else if(pos >0){
String first = lowerWord.substring(0,pos);
String second = lowerWord.substring(pos);
int indqu = lowerWord.indexOf("qu");

if(indqu == -1){
sentence += second + first + "ay ";
}
else{
 if(indqu<pos){
 first = lowerWord.substring(0,pos+1);
 second = lowerWord.substring(pos+1);
sentence += second + first + "ay ";
 }
}

}
else{
int indy = lowerWord.indexOf("y");
if(indy > 0){
 sentence += lowerWord.substring(indy) + lowerWord.substring(0,indy) + "ay ";
 }
}
}}
sentence = sentence.substring(0,sentence.length()-1);
return sentence;
}
}