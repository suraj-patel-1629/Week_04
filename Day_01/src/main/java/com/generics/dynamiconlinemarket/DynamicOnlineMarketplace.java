package com.generics.dynamiconlinemarket;



public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        // Creating catalogs for different product types
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 499));
        bookCatalog.addProduct(new Book("Data Structures", 399));

       ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 1999));
        clothingCatalog.addProduct(new Clothing("Jeans", 4499));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 59999));
        gadgetCatalog.addProduct(new Gadget("Headphones", 7999));

        // Displaying catalogs
        System.out.println("=== Books Catalog ===");
        bookCatalog.displayCatalog();

        System.out.println("\n=== Clothing Catalog ===");
        clothingCatalog.displayCatalog();

        System.out.println("\n=== Gadgets Catalog ===");
        gadgetCatalog.displayCatalog();

        // Applying discount dynamically
        System.out.println("\nApplying 10% discount to Java Programming Book...");
        ProductCatalog.applyDiscount(bookCatalog.getProducts().get(0), 10);

        System.out.println("\nApplying 15% discount to Jeans...");
       ProductCatalog.applyDiscount(clothingCatalog.getProducts().get(1), 15);

        System.out.println("\nApplying 20% discount to Smartphone...");
       ProductCatalog.applyDiscount(gadgetCatalog.getProducts().get(0), 20);
    }
}