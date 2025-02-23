package lk.ijse.pos.leyard.entity;


public class SupplyDetails {
    private String supplier_id;
    private String part_id;
    private String supply_date;
    private int quantity;
    private double total;

    public SupplyDetails() {}

    public SupplyDetails(String supplier_id, String part_id, String supply_date, int quantity, double total) {
        this.supplier_id = supplier_id;
        this.part_id = part_id;
        this.supply_date = supply_date;
        this.quantity = quantity;
        this.total = total;
    }

    public String getSupplier_id() {return supplier_id;}

    public void setSupplier_id(String supplier_id) {this.supplier_id = supplier_id;}

    public String getPart_id() {return part_id;}

    public void setPart_id(String part_id) {this.part_id = part_id;}

    public String getSupply_date() {return supply_date;}

    public void setSupply_date(String supply_date) {this.supply_date = supply_date;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public double getTotal() {return total;}

    public void setTotal(double total) {this.total = total;}


}
