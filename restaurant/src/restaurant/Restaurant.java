package restaurant;

public class Restaurant {
    private String nama;
    private String bulan;
    private double pendBruto;
    private double pengListAir;
    private double pengBahan;
    private double pendNet;
    private double manager;
    private double sewa;
    private double owner;
    private double csr;
    
    public Restaurant(){
        
    }
    
    public Restaurant(String nama, String bulan, double pendBruto, double pengListAir, double pengBahan){
        this.nama = nama;
        this.bulan = bulan;
        this.pendBruto = pendBruto;
        this.pengListAir = pengListAir;
        this.pengBahan = pengBahan;    
        calculatePendNet();
        calculateExpenses();
    }
        
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setBulan(String bulan){
        this.bulan = bulan;   
    }
    
    public void setPendBruto(double pendBruto) {
        this.pendBruto = pendBruto;
        calculatePendNet(); 
        calculateExpenses(); 
    }
    
     public void setPengListAir(double pengListAir) {
        this.pengListAir = pengListAir;
        calculatePendNet(); 
        calculateExpenses(); 
    }

    public void setPengBahan(double pengBahan) {
        this.pengBahan = pengBahan;
        calculatePendNet();
        calculateExpenses(); 
    }
    
     public String getNama() {
        return nama;
    }

    public String getBulan() {
        return bulan;
    }

    public double getPendBruto() {
        return pendBruto;
    }

    public double getPengListAir() {
        return pengListAir;
    }

    public double getPengBahan() {
        return pengBahan;
    }

    public double getPendNet() {
        return pendNet;
    }

    public double getManager() {
        return manager;
    }

    public double getSewa() {
        return sewa;
    }

    public double getOwner() {
        return owner;
    }

    public double getCsr() {
        return csr;
    }

    private void calculateExpenses() {
        this.manager = 0.30 * pendNet;
        this.sewa = 0.30 * pendNet;
        this.owner = 0.30 * pendNet;
        this.csr = 0.10 * pendNet;
    }

    private void calculatePendNet() {
        this.pendNet = pendBruto - pengListAir - pengBahan;
    }
    
    public static boolean isValidAmount(double amount) {
        return amount >= 0 && amount <= 100; 
    }
    
    public static void main(String[] args) {
    Restaurant rest1 = new Restaurant();
    rest1.setNama("Warung Padang Sederhana");
    rest1.setBulan("Juli");
    rest1.setPendBruto(1000000); 
    rest1.setPengListAir(50000);  
    rest1.setPengBahan(300000);  
        
    System.out.println("\n--- Data Restaurant 1 ---");
    System.out.println("Nama: " + rest1.getNama());
    System.out.println("Bulan: " + rest1.getBulan());
    System.out.println("Pendapatan Bruto: " + rest1.getPendBruto());
    System.out.println("Pengeluaran Listrik/Air: " + rest1.getPengListAir());
    System.out.println("Pengeluaran Bahan: " + rest1.getPengBahan());
    System.out.println("Pendapatan Net: " + rest1.getPendNet());
    System.out.println("Gaji Manager (30% dari Pendapatan Net): " + rest1.getManager());
    System.out.println("Sewa (30% dari Pendapatan Net): " + rest1.getSewa());
    System.out.println("Untuk Owner (30% dari Pendapatan Net): " + rest1.getOwner());
    System.out.println("CSR (10% dari Pendapatan Net): " + rest1.getCsr());
    
    Restaurant rest2 = new Restaurant("Mie Ayam Pak Slamet", "Juni", 5000000, 20000, 150000); 

    System.out.println("\n--- Data Restaurant 2 ---");
    System.out.println("Nama: " + rest2.getNama());
    System.out.println("Bulan: " + rest2.getBulan());
    System.out.println("Pendapatan Bruto: " + rest2.getPendBruto());
    System.out.println("Pengeluaran Listrik/Air: " + rest2.getPengListAir());
    System.out.println("Pengeluaran Bahan: " + rest2.getPengBahan());
    System.out.println("Pendapatan Net: " + rest2.getPendNet());
    System.out.println("Gaji Manager (30% dari Pendapatan Net): " + rest2.getManager());
    System.out.println("Sewa (30% dari Pendapatan Net): " + rest2.getSewa());
    System.out.println("Untuk Owner (30% dari Pendapatan Net): " + rest2.getOwner());
    System.out.println("CSR (10% dari Pendapatan Net): " + rest2.getCsr());
    }
    
}
