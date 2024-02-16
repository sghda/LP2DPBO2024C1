import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int more_input = 1;

        // menambahkan data produk
        products.add(new Shirt("Kemeja", "Gucci", 500000, "M", "Katun", "Pria", "Putih", "Pendek"));
        products.add(new Shirt("Kemeja Lucu", "Gucci", 800000, "M", "Flanel", "Pria", "Pink", "Panjang"));

        // Menampilkan data awal
        System.out.println("Daftar Produk:");
        displayProducts(products);

        // Menambahkan data baru dari input user
        while (more_input == 1) {
            System.out.println("\nTambah Data Produk Baru dengan id " + (products.size() + 1));
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Merek: ");
            String brand = scanner.nextLine();
            System.out.print("Harga: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ukuran: ");
            String size = scanner.nextLine();
            System.out.print("Bahan: ");
            String material = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Warna: ");
            String color = scanner.nextLine();
            System.out.print("Tipe Lengan: ");
            String sleeveType = scanner.nextLine();

            // Membuat objek baru dan menambahkannya ke daftar produk
            Shirt newShirt = new Shirt(name, brand, price, size, material, gender, color, sleeveType);
            products.add(newShirt);

            // Menampilkan data setelah penambahan
            System.out.println("\nDaftar Produk Setelah Penambahan:");
            displayProducts(products);

            System.out.println("\nApakah Anda ingin menambahkan data produk lagi? (1 = Ya, 0 = Tidak)");
            more_input = scanner.nextInt();
            scanner.nextLine();
        }


        scanner.close();
    }

    // Metode untuk menampilkan data produk
    private static void displayProducts(ArrayList<Product> products) {
        int maxIdLength = 2;
        int maxNameLength = 4;
        int maxBrandLength = 5;
        int maxPriceLength = 5;
        int maxSizeLength = 4;
        int maxMaterialLength = 8;
        int maxGenderLength = 6;
        int maxColorLength = 5;
        int maxSleeveTypeLength = 11;
        
        for (Product product : products) {
            if (product instanceof Shirt) {
                Shirt shirt = (Shirt) product;
                if (shirt.getIdProduct() > maxIdLength) {
                    maxIdLength = shirt.getIdProduct();
                }
                if (shirt.getName().length() > maxNameLength) {
                    maxNameLength = shirt.getName().length();
                }
                if (shirt.getBrand().length() > maxBrandLength) {
                    maxBrandLength = shirt.getBrand().length();
                }
                if (String.valueOf(shirt.getPrice()).length() > maxPriceLength) {
                    maxPriceLength = String.valueOf(shirt.getPrice()).length();
                }
                if (shirt.getSize().length() > maxSizeLength) {
                    maxSizeLength = shirt.getSize().length();
                }
                if (shirt.getMaterial().length() > maxMaterialLength) {
                    maxMaterialLength = shirt.getMaterial().length();
                }
                if (shirt.getGender().length() > maxGenderLength) {
                    maxGenderLength = shirt.getGender().length();
                }
                if (shirt.getColor().length() > maxColorLength) {
                    maxColorLength = shirt.getColor().length();
                }
                if (shirt.getSleeveType().length() > maxSleeveTypeLength) {
                    maxSleeveTypeLength = shirt.getSleeveType().length();
                }
            }
        }


        System.out.print("+");
        for (int i = 0; i < maxIdLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxNameLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxBrandLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxPriceLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSizeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxMaterialLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxGenderLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxColorLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSleeveTypeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.printf("| %-" + maxIdLength + "s | %-" + maxNameLength + "s | %-" + maxBrandLength + "s | %-" + maxPriceLength + "s | %-" + maxSizeLength + "s | %-" + maxMaterialLength + "s | %-" + maxGenderLength + "s | %-" + maxColorLength + "s | %-" + maxSleeveTypeLength + "s |\n", "ID", "Nama", "Brand", "Harga", "Size", "Material", "Gender", "Warna", "Sleeve Type");
        
        System.out.print("+");
        for (int i = 0; i < maxIdLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxNameLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxBrandLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxPriceLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSizeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxMaterialLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxGenderLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxColorLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSleeveTypeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (Product product : products) {
            if (product instanceof Shirt) {
                Shirt shirt = (Shirt) product;
                System.out.printf("| %-" + maxIdLength + "d | %-" + maxNameLength + "s | %-" + maxBrandLength + "s | %-" + maxPriceLength + "d | %-" + maxSizeLength + "s | %-" + maxMaterialLength + "s | %-" + maxGenderLength + "s | %-" + maxColorLength + "s | %-" + maxSleeveTypeLength + "s |\n",
                        shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(), shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType());
            }
        }

        System.out.print("+");
        for (int i = 0; i < maxIdLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxNameLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxBrandLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxPriceLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSizeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxMaterialLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxGenderLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxColorLength + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxSleeveTypeLength + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
