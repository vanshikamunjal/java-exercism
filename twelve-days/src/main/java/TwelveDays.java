class TwelveDays {
    String[] ordinal = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String[] gifts = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
    String structure = "On the %s day of Christmas my true love gave to me, %s"; 

    String verse(int verseNumber) {
        int index = verseNumber - 1;
        String tail = ""; 
        for (int i=index; i>=0; i--) {
            tail += gifts[i];
            if (i == 1) {
                tail += ", and ";
            } else if (i == 0) {
                tail += ".\n";
            } else {
                tail += ", ";
            }
        }
        return String.format(structure,ordinal[index],tail).replaceFirst(",",":");
    }

    String verses(int startVerse, int endVerse) {
        String lines = "";
        for (int i=startVerse; i<=endVerse; i++) {
            lines += verse(i);
            if (i != endVerse) {
                lines+= "\n";
            }
        }
        return lines; 
    }
    
    String sing() {
        return verses(1,12);
    }
}