class IsbnVerifier {
boolean isValid(String stringToVerify) {
   boolean status = false;
   int multiFactor=10, sumOfProducts=0;
   int pos=-1;
   if(stringToVerify.length() == 13)
      stringToVerify = stringToVerify.replaceAll("[//-]","");
   if(stringToVerify.length() == 10){
      for(int i=0; i<10; i++){
         if(Character.isLetter(stringToVerify.charAt(i))){
             pos = i;
             break;
         }
         else{
             sumOfProducts += 
            Character.getNumericValue(stringToVerify.charAt(i))*multiFactor;
             multiFactor -= 1;
         }
      }
      if(pos == 9)
         if(stringToVerify.charAt(9) == 'X')
            sumOfProducts += 10;
      if(pos == 9 || pos == -1)
         if(sumOfProducts%11 == 0)
            status = true;
   }
return status;
}
}
