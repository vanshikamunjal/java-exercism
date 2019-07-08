class RnaTranscription {


String transcribe(String dnaStrand){
   String rnaStrand = "";
   for(int i=0; i<dnaStrand.length(); i++){
       char ch = dnaStrand.charAt(i);
       if(ch == 'G')
          rnaStrand += 'C';
       else if(ch == 'C')
          rnaStrand += 'G';
       else if(ch == 'T')
          rnaStrand += 'A';
       else if(ch == 'A')
          rnaStrand += 'U';
   }
   return rnaStrand;
}


}
