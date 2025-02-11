package com.generics.dynamiconlinemarket;



import java.util.ArrayList;
import java.util.List;

// Generic catalog class that stores various products
class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    // Method to add a product to the catalog
    public void addProduct(T product) {
        products.add(product);
    }

    // Method to retrieve all stored products
    public List<T> getProducts() {
        return products;
    }

    // Method to display all products in the catalog
    public void displayCatalog() {
        for (T product : products) {
            product.displayProduct();
        }
    }

    // Generic method to apply a discount dynamically to a product
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + product.getPrice());
    }
}
