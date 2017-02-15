public class var10Class implements var10 {
    public double logika(double d1, double d2, double d3){
        double min = d1;
        double max = d1;
        if(d2 < min){
            min = d2;
        }
        if(d3 < min){
            min = d3;
        }
        if(d2 > max){
            max = d2;
        }
        if(d3 > max){
            max = d3;
        }
        return max % min;
    }
    public int poka(double P){
        int count = 0;
        for(double i = 1000; i <= 1100; i *= P){
            count++;
        }
        return count;
    }

    private boolean checkParity(double a){
        return (a % 2 > 0);
    }

    public boolean massivy(double[] A){
        boolean currentParity = checkParity(A[0]);
        for(int i = 1; i < A.length; i++){
            if(checkParity(A[i]) == currentParity){
                return false;
            }
            else{
                currentParity = checkParity(A[i]);
            }
        }
        return true;
    }
}
