package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 45000;
        double uangDiDompet = 62000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uangnya Kurang, Kurangi Jajan Anda");
        }else{
            System.out.println("Uangnya cukup, Berelaan lah Sanak");
        }
    }
}
