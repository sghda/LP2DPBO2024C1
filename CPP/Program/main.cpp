#include <iostream>
#include <vector>
#include <iomanip> 
#include <map> 
#include "Shirt.cpp" 

using namespace std;

void displayShirtList(vector<Shirt>& shirt_list) {
    int max_id = 2;
    int max_name = 4;
    int max_brand = 5;
    int max_price = 5;
    int max_size = 4;
    int max_material = 8;
    int max_gender = 6;
    int max_color = 5;
    int max_sleeveType = 11;
    
    for (Shirt& shirt : shirt_list) {
        max_id = max(max_id, static_cast<int>(to_string(shirt.getIdProduct()).length()));
        max_name = max(max_name, static_cast<int>(shirt.getName().length()));
        max_brand = max(max_brand, static_cast<int>(shirt.getBrand().length()));
        max_price = max(max_price, static_cast<int>(to_string(shirt.getPrice()).length()));
        max_size = max(max_size, static_cast<int>(shirt.getSize().length()));
        max_material = max(max_material, static_cast<int>(shirt.getMaterial().length()));
        max_gender = max(max_gender, static_cast<int>(shirt.getGender().length()));
        max_color = max(max_color, static_cast<int>(shirt.getColor().length()));
        max_sleeveType = max(max_sleeveType, static_cast<int>(shirt.getSleeveType().length()));
    }

    // Tampilkan header tabel
        cout << ("+");
        for (int i = 0; i < max_id + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_name + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_brand + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_price + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_size + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_material + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_gender + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_color + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_sleeveType + 2; i++) {
            cout << ("-");
        }
        cout << "+";

        // Tampilkan baris header
        cout << "\n| " << setw(max_id) << left << "ID"
              << " | " << setw(max_name) << left << "Nama"
              << " | " << setw(max_brand) << left << "Brand"
              << " | " << setw(max_price) << left << "Harga"
              << " | " << setw(max_size) << left << "Size"
              << " | " << setw(max_material) << left << "Material"
              << " | " << setw(max_gender) << left << "Gender"
              << " | " << setw(max_color) << left << "Warna"
              << " | " << setw(max_sleeveType) << left << "Sleeve Type"
              << " |" << endl;
        
        cout << ("+");
        for (int i = 0; i < max_id + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_name + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_brand + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_price + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_size + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_material + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_gender + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_color + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_sleeveType + 2; i++) {
            cout << ("-");
        }
        cout << "+\n";

        // Tampilkan data produk
        for (Shirt shirt : shirt_list) {
            cout << "| " << setw(max_id) << left << shirt.getIdProduct()
                    << " | " << setw(max_name) << left << shirt.getName()
                    << " | " << setw(max_brand) << left << shirt.getBrand()
                    << " | " << setw(max_price) << left << shirt.getPrice()
                    << " | " << setw(max_size) << left << shirt.getSize()
                    << " | " << setw(max_material) << left << shirt.getMaterial()
                    << " | " << setw(max_gender) << left << shirt.getGender()
                    << " | " << setw(max_color) << left << shirt.getColor()
                    << " | " << setw(max_sleeveType) << left << shirt.getSleeveType()
                    << " |" << endl;
        }

        cout << ("+");
        for (int i = 0; i < max_id + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_name + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_brand + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_price + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_size + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_material + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_gender + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_color + 2; i++) {
            cout << ("-");
        }
        cout << ("+");
        for (int i = 0; i < max_sleeveType + 2; i++) {
            cout << ("-");
        }
        cout << "+\n";

}


int main() {
    // Buat vektor untuk menyimpan objek-objek Shirt
    vector<Shirt> shirt_list;

    // Menambahkan objek-objek Shirt ke dalam vektor
    shirt_list.push_back(Shirt("Kemeja", "Gucci", 500000, "M", "Katun", "Pria", "Putih", "Pendek"));
    shirt_list.push_back(Shirt("Kemeja Lucu", "Gucci", 800000, "M", "Flanel", "Pria", "Pink", "Panjang"));

    // Menampilkan data awal
    cout << "Daftar Produk:\n";
    displayShirtList(shirt_list);

    // Menambahkan data baru dari input pengguna
    int more_input = 1;
    while (more_input == 1) {
        cout << "\nTambah Data Produk Baru dengan id " << shirt_list.size() + 1 << "\n";
        string name, brand, size, material, gender, color, sleeveType;
        int price;
        cout << "Nama: ";
        getline(cin, name);
        cout << "Merek: ";
        getline(cin, brand);
        cout << "Harga: ";
        cin >> price;
        cout << "Ukuran: ";
        cin >> ws; // Membersihkan whitespace
        getline(cin, size);
        cout << "Bahan: ";
        getline(cin, material);
        cout << "Gender: ";
        getline(cin, gender);
        cout << "Warna: ";
        getline(cin, color);
        cout << "Tipe Lengan: ";
        getline(cin, sleeveType);

        // Membuat objek baru dan menambahkannya ke dalam vektor shirt_list
        Shirt new_shirt(name, brand, price, size, material, gender, color, sleeveType);
        shirt_list.push_back(new_shirt);

        // Menampilkan data setelah penambahan
        cout << "\nDaftar Produk Setelah Penambahan:\n";
        displayShirtList(shirt_list);

        cout << "\nApakah Anda ingin menambahkan data produk lagi? (1 = Ya, 0 = Tidak) ";
        cin >> more_input;
    }

    cout << "Terima kasih telah menggunakan program ini!\n";

    return 0;
}