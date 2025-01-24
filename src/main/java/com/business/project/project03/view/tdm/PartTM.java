package com.business.project.project03.view.tdm;

public class PartTM implements Comparable<PartTM>{

    private String part_id;
    private String name;
    private double price;
    private int quantity;

    public PartTM(){}

    public PartTM(String part_id, String name, double price, int quantity) {
        this.part_id = part_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getPart_id() {return part_id;}

    public void setPart_id(String part_id) {this.part_id = part_id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public String toString() {
        return "PartTM{" +
                "part_id='" + part_id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(PartTM o) {
        return part_id.compareTo(getPart_id());
    }
}
