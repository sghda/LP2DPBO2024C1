# main.py
from shirt import Shirt
from shirt import display_shirt_list

def main():
    shirt_list = []

    # Memasukkan produk ke dalam list shirt_list
    shirt_list.append(Shirt("Kemeja", "Gucci", 500000, "M", "Katun", "Pria", "Putih", "Pendek"))
    shirt_list.append(Shirt("Kemeja Lucu", "Gucci", 800000, "M", "Flanel", "Pria", "Pink", "Panjang"))

    # Menampilkan data awal
    print("Daftar Produk:")
    display_shirt_list(shirt_list)

    # Menambahkan data baru dari input pengguna
    more_input = 1
    while more_input == 1:
        print("\nTambah Data Produk Baru dengan id", len(shirt_list) + 1)
        name = input("Nama: ")
        brand = input("Merek: ")
        price = int(input("Harga: "))
        size = input("Ukuran: ")
        material = input("Bahan: ")
        gender = input("Gender: ")
        color = input("Warna: ")
        sleeve_type = input("Tipe Lengan: ")

        # Membuat objek baru dan menambahkannya ke dalam list shirt_list
        new_shirt = Shirt(name, brand, price, size, material, gender, color, sleeve_type)
        shirt_list.append(new_shirt)

        # Menampilkan data setelah penambahan
        print("\nDaftar Produk Setelah Penambahan:")
        display_shirt_list(shirt_list)

        more_input = int(input("\nApakah Anda ingin menambahkan data produk lagi? (1 = Ya, 0 = Tidak)"))

    print("Terima kasih telah menggunakan program ini!")

if __name__ == "__main__":
    main()
