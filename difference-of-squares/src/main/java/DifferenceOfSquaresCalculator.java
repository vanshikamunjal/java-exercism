class DifferenceOfSquaresCalculator {


int computeSquareOfSumTo(int input) {
    int n = input;
    return (n*(n+1)/2)*(n*(n+1)/2);
}


int computeSumOfSquaresTo(int input) {
    int n = input;
    return (n*(n+1)/2)*(2*n+1)/3;
}


int computeDifferenceOfSquares(int input) {

    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
}


}
