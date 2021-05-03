package com.group7ooec.gamevendor.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shopping cart")
public class shoppingCart {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "operating_system")
    private String operating_system;

    public int getPrice() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

}
