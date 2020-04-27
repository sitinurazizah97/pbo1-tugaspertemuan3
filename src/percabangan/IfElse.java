package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 45000;
        double uangDiDompet = 62000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang Kurangnya, Kurangi Jajan Anda");
        }else if(uangDiDompet>totalBelanja){
            double kembaliannya = uangDiDompet - totalBelanja;
            System.out.println("Uangnya cukup, kembaliannya : " + kembaliannya);
        }else{
            System.out.println("Uangnya Pas.. Terimakasih..");
        }
    }
}
