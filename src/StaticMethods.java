public class StaticMethods {
    public static long abs(long y){
        return (y < 0) ? -y : y;
    }
    
    public static void main(String[] args) {
        System.out.println(abs(-10));
        System.out.println(abs(10));
    }
}
