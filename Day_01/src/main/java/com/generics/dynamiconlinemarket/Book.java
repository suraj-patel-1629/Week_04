package com.generics.dynamiconlinemarket;



// Book category product
class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Book: " + getName() + " | Price: $" + getPrice());
    }
}
