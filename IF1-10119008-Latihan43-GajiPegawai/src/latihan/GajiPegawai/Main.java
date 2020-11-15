package latihan.GajiPegawai;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {

    public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Raihan Giffari");
        pegawai.setAlamat("Kp. Sudimampir Asano RW 06 RT 01");
        pegawai.setGajiPokok(4500000);
        pegawai.setUangTunjangan(250000);
        pegawai.setUangTransport(300000);
        pegawai.setTotalGaji(
                pegawai.totalGaji(
                        pegawai.getUangTunjangan(),
                        pegawai.getUangTransport(),
                        pegawai.getGajiPokok()
                )
        );
        pegawai.tampilData(
                pegawai.getNama(),
                pegawai.getAlamat(),
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getGajiPokok(),
                pegawai.getTotalGaji()
        );
    }
}
