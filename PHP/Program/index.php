<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shirt List</title>
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>Shirt List</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Nama</th>
        <th>Brand</th>
        <th>Harga</th>
        <th>Size</th>
        <th>Material</th>
        <th>Gender</th>
        <th>Warna</th>
        <th>Tipe Lengan</th>
    </tr>
<?php
require_once "shirt.php";

$shirt_list = array();

$shirt_list[] = new Shirt("Kemeja", "Gucci", 500000, "M", "Katun", "Pria", "Putih", "Pendek");
$shirt_list[] = new Shirt("Kemeja Lucu", "Gucci", 800000, "M", "Flanel", "Pria", "Pink", "Panjang");

foreach ($shirt_list as $shirt) {
    echo "<tr>";
    echo "<td>" . $shirt->getIdProduct() . "</td>";
    echo "<td>" . $shirt->getName() . "</td>";
    echo "<td>" . $shirt->getBrand() . "</td>";
    echo "<td>" . $shirt->getPrice() . "</td>";
    echo "<td>" . $shirt->getSize() . "</td>";
    echo "<td>" . $shirt->getMaterial() . "</td>";
    echo "<td>" . $shirt->getGender() . "</td>";
    echo "<td>" . $shirt->getColor() . "</td>";
    echo "<td>" . $shirt->getSleeveType() . "</td>";
    echo "</tr>";
}
?>
</table>

</body>
</html>
