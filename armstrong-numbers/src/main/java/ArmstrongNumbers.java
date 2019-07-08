class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck){
	boolean status = false;
        int sum = 0;
	String number = Integer.toString(numberToCheck);
        int length = number.length();
        for(int i=0; i<length; i++)
            sum+= Math.pow(Character.getNumericValue(number.charAt(i)),length);
        if(numberToCheck == sum)
           status = true;
        return status;
}


}
