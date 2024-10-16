
public class RumusCosinus {
    public static void main(String[] args) {
        
        double a = 5; 
        double b = 7; 
        double gamma = 45; 
        String nama = "Nur Fadilah";
        String nim = "0110223075";
        
        double gammaRadian = Math.toRadians(gamma);
        
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gammaRadian));
        
        System.out.println("nama : " + nama);
        System.out.println("NIM : " + nim);

        System.out.println("Panjang sisi c adalah: " + c);
    }
}
