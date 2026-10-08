public abstract class Animal {
    private String nama;
    private String asal;
    private int jumlahKaki;

    public Animal(String nama, String asal, int jumlahKaki) {
        this.nama = nama;
        this.asal = asal;
        this.jumlahKaki = jumlahKaki;
    }

    public String getNama() { return nama; }
    public String getAsal() { return asal; }
    public int getJumlahKaki() { return jumlahKaki; }

    public abstract void toShout();

    public void toEat() {
        System.out.println("like to eat");
    }

    public void displayInfo() {
        System.out.printf("%-6s : %s\n", "Nama", nama);
        System.out.printf("%-6s : %s\n", "Asal", asal);
        System.out.printf("%-6s : %d\n", "Kaki", jumlahKaki);
        System.out.printf("%-6s : ", "Suara");
        toShout();
        System.out.printf("%-6s : ", "Makan");
        toEat();
    }
}