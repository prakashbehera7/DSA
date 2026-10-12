class Solution {
    public double[] convertTemperature(double celsius) {
        double kel=celsius+273.15;
        double faranheit=(1.8)*celsius+32;
        return new double[]{kel,faranheit};
    }
}