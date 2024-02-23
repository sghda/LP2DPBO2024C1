class Product:
    last_id = 0

    def __init__(self, name, brand, price):
        Product.last_id += 1
        self.id_product = Product.last_id
        self.name = name
        self.brand = brand
        self.price = price

    def get_id_product(self):
        return self.id_product

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_brand(self):
        return self.brand

    def set_brand(self, brand):
        self.brand = brand

    def get_price(self):
        return self.price

    def set_price(self, price):
        self.price = price
        
        
class Clothing(Product):
    def __init__(self, name, brand, price, size, material, gender):
        super().__init__(name, brand, price)
        self.size = size
        self.material = material
        self.gender = gender

    def get_size(self):
        return self.size

    def set_size(self, size):
        self.size = size

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def get_gender(self):
        return self.gender

    def set_gender(self, gender):
        self.gender = gender


class Shirt(Clothing):
    def __init__(self, name, brand, price, size, material, gender, color, sleeve_type):
        super().__init__(name, brand, price, size, material, gender)
        self.color = color
        self.sleeve_type = sleeve_type

    def get_color(self):
        return self.color

    def set_color(self, color):
        self.color = color

    def get_sleeve_type(self):
        return self.sleeve_type

    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type


def display_shirt_list(shirt_list):
    # Mencari panjang maksimum untuk setiap kolom
    max_lengths = {
        "ID": len("ID"),
        "Nama": len("Nama"),
        "Brand": len("Brand"),
        "Harga": len("Harga"),
        "Ukuran": len("Ukuran"),
        "Bahan": len("Bahan"),
        "Gender": len("Gender"),
        "Warna": len("Warna"),
        "Tipe Lengan": len("Tipe Lengan")
    }

    # Mencari panjang maksimum untuk setiap data dalam list
    for shirt in shirt_list:
        max_lengths["ID"] = max(max_lengths["ID"], len(str(shirt.get_id_product())))
        max_lengths["Nama"] = max(max_lengths["Nama"], len(shirt.get_name()))
        max_lengths["Brand"] = max(max_lengths["Brand"], len(shirt.get_brand()))
        max_lengths["Harga"] = max(max_lengths["Harga"], len(str(shirt.get_price())))
        max_lengths["Ukuran"] = max(max_lengths["Ukuran"], len(shirt.get_size()))
        max_lengths["Bahan"] = max(max_lengths["Bahan"], len(shirt.get_material()))
        max_lengths["Gender"] = max(max_lengths["Gender"], len(shirt.get_gender()))
        max_lengths["Warna"] = max(max_lengths["Warna"], len(shirt.get_color()))
        max_lengths["Tipe Lengan"] = max(max_lengths["Tipe Lengan"], len(shirt.get_sleeve_type()))

    # Tampilkan header tabel
    print("+", end="")
    for column, length in max_lengths.items():
        print("-" * (length + 2) + "+", end="")
    print()

    # Tampilkan baris header
    for column, length in max_lengths.items():
        print(f"| {column:>{length}} ", end="")
    print("|")

    # Tampilkan garis pemisah antara header dan data
    print("+", end="")
    for column, length in max_lengths.items():
        print("-" * (length + 2) + "+", end="")
    print()

    # Tampilkan data produk
    for shirt in shirt_list:
        print(f"| {shirt.get_id_product():>{max_lengths['ID']}} "
              f"| {shirt.get_name():<{max_lengths['Nama']}} "
              f"| {shirt.get_brand():<{max_lengths['Brand']}} "
              f"| {shirt.get_price():>{max_lengths['Harga']}} "
              f"| {shirt.get_size():<{max_lengths['Ukuran']}} "
              f"| {shirt.get_material():<{max_lengths['Bahan']}} "
              f"| {shirt.get_gender():<{max_lengths['Gender']}} "
              f"| {shirt.get_color():<{max_lengths['Warna']}} "
              f"| {shirt.get_sleeve_type():<{max_lengths['Tipe Lengan']}} |")

    # Tampilkan garis penutup
    print("+", end="")
    for column, length in max_lengths.items():
        print("-" * (length + 2) + "+", end="")
    print()


