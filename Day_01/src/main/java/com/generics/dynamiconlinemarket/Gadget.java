package com.generics.dynamiconlinemarket;


// Gadgets category product
class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Gadget: " + getName() + " | Price: $" + getPrice());
    }
}
