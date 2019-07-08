class Scrabble {
     String word;    
     Scrabble(String word) {
        this.word = word.toLowerCase();
     }
    int getScore() {
        int score=0;
	char[] wordArray = word.toCharArray();
	for(Character ch : wordArray)
	    score += getValue(ch);
        return score;
    }
    int getValue(char l){
	switch(l){
	  case 'd':
	  case 'g': return 2;
	  case 'b':
	  case 'c':
	  case 'm':
	  case 'p': return 3;
	  case 'f':
	  case 'h':
	  case 'v':
	  case 'w':
	  case 'y': return 4;
	  case 'k': return 5;
	  case 'j':
	  case 'x': return 8;
	  case 'q':
	  case 'z': return 10;
	  default: return 1;
       }
    }
}
