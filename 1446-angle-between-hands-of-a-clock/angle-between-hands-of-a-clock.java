class Solution {
    public double angleClock(int hour, int minutes) {
        double hr=0.5*(hour*60+minutes);
        double mi=minutes*6;
        double ans=Math.abs(hr-mi);
        return Math.min(360-ans,ans);

    }
}