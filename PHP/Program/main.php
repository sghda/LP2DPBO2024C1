<?php

require_once "shirt.php";

// Array untuk menyimpan daftar produk
$shirt_list = array();

// Menambahkan produk ke dalam array $shirt_list
$shirt_list[] = new Shirt("Kemeja", "Gucci", 500000, "M", "Katun", "Pria", "Putih", "Pendek");
$shirt_list[] = new Shirt("Kemeja Lucu", "Gucci", 800000, "M", "Flanel", "Pria", "Pink", "Panjang");

// Inisialisasi nilai minimum maksimum untuk setiap kolom
$min_max_lengths = array(
    'ID' => 3, 
    'Nama' => 5, 
    'Brand' => 6, 
    'Harga' => 5, 
    'Size' => 4, 
    'Material' => 7, 
    'Gender' => 6, 
    'Warna' => 5, 
    'Tipe Lengan' => 12 
);

// Menentukan nilai maksimum aktual untuk setiap kolom
$max_lengths = array();
foreach ($shirt_list as $shirt) {
    $max_lengths['ID'] = max(strlen((string) $shirt->getIdProduct()), isset($max_lengths['ID']) ? $max_lengths['ID'] : 0);
    $max_lengths['Nama'] = max(strlen($shirt->getName()), isset($max_lengths['Nama']) ? $max_lengths['Nama'] : 0);
    $max_lengths['Brand'] = max(strlen($shirt->getBrand()), isset($max_lengths['Brand']) ? $max_lengths['Brand'] : 0);
    $max_lengths['Harga'] = max(strlen((string) $shirt->getPrice()), isset($max_lengths['Harga']) ? $max_lengths['Harga'] : 0);
    $max_lengths['Size'] = max(strlen($shirt->getSize()), isset($max_lengths['Size']) ? $max_lengths['Size'] : 0);
    $max_lengths['Material'] = max(strlen($shirt->getMaterial()), isset($max_lengths['Material']) ? $max_lengths['Material'] : 0);
    $max_lengths['Gender'] = max(strlen($shirt->getGender()), isset($max_lengths['Gender']) ? $max_lengths['Gender'] : 0);
    $max_lengths['Warna'] = max(strlen($shirt->getColor()), isset($max_lengths['Warna']) ? $max_lengths['Warna'] : 0);
    $max_lengths['Tipe Lengan'] = max(strlen($shirt->getSleeveType()), isset($max_lengths['Tipe Lengan']) ? $max_lengths['Tipe Lengan'] : 0);
}

// Menentukan nilai minimum maksimum aktual untuk setiap kolom
foreach ($max_lengths as $column => $length) {
    $max_lengths[$column] = max($length, $min_max_lengths[$column]);
}

// Menampilkan daftar produk dalam tabel
echo "Shirt List\n";
echo "+";
foreach ($max_lengths as $length) {
    echo str_repeat("-", $length + 2) . "+";
}
echo "\n";

echo "|";
foreach ($max_lengths as $column => $length) {
    printf(" %-" . ($length + 1) . "s|", $column);
}
echo "\n";

echo "+";
foreach ($max_lengths as $length) {
    echo str_repeat("-", $length + 2) . "+";
}
echo "\n";

foreach ($shirt_list as $shirt) {
    echo "|";
    printf(" %-" . ($max_lengths['ID'] + 1) . "s|", $shirt->getIdProduct());
    printf(" %-" . ($max_lengths['Nama'] + 1) . "s|", $shirt->getName());
    printf(" %-" . ($max_lengths['Brand'] + 1) . "s|", $shirt->getBrand());
    printf(" %-" . ($max_lengths['Harga'] + 1) . "s|", $shirt->getPrice());
    printf(" %-" . ($max_lengths['Size'] + 1) . "s|", $shirt->getSize());
    printf(" %-" . ($max_lengths['Material'] + 1) . "s|", $shirt->getMaterial());
    printf(" %-" . ($max_lengths['Gender'] + 1) . "s|", $shirt->getGender());
    printf(" %-" . ($max_lengths['Warna'] + 1) . "s|", $shirt->getColor());
    printf(" %-" . ($max_lengths['Tipe Lengan'] + 1) . "s|", $shirt->getSleeveType());
    echo "\n";
}

echo "+";
foreach ($max_lengths as $length) {
    echo str_repeat("-", $length + 2) . "+";
}
echo "\n";

?>
