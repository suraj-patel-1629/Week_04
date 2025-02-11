package com.generics.dynamiconlinemarket;



// Clothing category product
class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Clothing: " + getName() + " | Price: $" + getPrice());
    }
}