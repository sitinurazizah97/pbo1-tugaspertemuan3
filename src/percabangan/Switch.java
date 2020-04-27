package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan = 4;
        switch (jalanJalan) {
            case 1:
                System.out.println("Urang Lapas");
                break;
            case 2:
                System.out.println("Urang acayan");
                break;
            case 3:
                System.out.println("Ubat Nyamuk");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            case 5:
                System.out.println("mahluk halus");
                break;
        }
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs     : \"Terima kasih Pak\"");
                System.out.println("Dosen   : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"kenapa Ulun kada dapat A, pak?\"");
                System.out.println("Dosen   : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs     : \"Hihihi...\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Bujur jua kah?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \"*menceleng\"");
                System.out.println("Mhs     : \"kabur\"");
                break;
        }

    }
}
