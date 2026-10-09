public class MainBentuk {
    public static void main(String[] args) {
        // Bujursangkar
        BujurSangkar bujurSangkar = new BujurSangkar(5.0, "Merah");

        bujurSangkar.setWarna("Biru");
        bujurSangkar.setSisi(7.0);

        String warnaBujurSangkar = bujurSangkar.getWarna();
        double luasBujurSangkar = bujurSangkar.hitungLuas();

        bujurSangkar.printInfo();
        System.out.println("Warna: " + warnaBujurSangkar);
        System.out.println("Luas: " + luasBujurSangkar);

        System.out.println();

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(3.0, "Hijau");

        lingkaran.setWarna("Kuning");
        lingkaran.setRadius(4.0);

        String warnaLingkaran = lingkaran.getWarna();
        double luasLingkaran = lingkaran.hitungLuas();

        lingkaran.printInfo();
        System.out.println("Warna: " + warnaLingkaran);
        System.out.println("Luas: " + luasLingkaran);

        System.out.println();

        // Silinder
        Silinder silinder = new Silinder(10.0, 3.0, "Hitam");

        silinder.setWarna("Putih");
        silinder.setRadius(2.0);
        silinder.setTinggi(5.0);

        String warnaSilinder = silinder.getWarna();
        double volumeSilinder = silinder.hitungVolume();

        silinder.printInfo();
        System.out.println("Warna: " + warnaSilinder);
        System.out.println("Tinggi: " + silinder.getTinggi());
        System.out.println("Radius: " + silinder.getRadius());
        System.out.println("Volume: " + volumeSilinder);
    }
}