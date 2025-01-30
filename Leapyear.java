public class Leapyear {
    public static boolean isleapyear(int year) {
        if ((year%4==0&&year%100!=0) ||(year%400==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year=2025;
     System.out.println(year+"is a leapyear?"+ isleapyear (year));
    }
}
