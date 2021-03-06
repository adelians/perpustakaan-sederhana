package com.company;

public class CakramDigital extends Koleksi {
    private String jenisMedia;

    public CakramDigital(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                         String status, String jenisMedia) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.jenisMedia = jenisMedia;
    }

    public String getJenisMedia() {
        return jenisMedia;
    }

    @Override
    public void display() {
        System.out.println("No Koleksi                  : " + getNoKoleksi() +
                "\nJudul Koleksi               : " + getNama() +
                "\nPenerbit                    : " + getPenerbit() +
                "\nTanggal Terbit              : " + getTanggalTerbit() +
                "\nJenis Koleksi               : " + getJenis() +
                "\nStatus Koleksi              : " + getStatus() +
                "\nJenis Media                 : " + getJenisMedia());
        System.out.println("*****************************************************");
    }
}
