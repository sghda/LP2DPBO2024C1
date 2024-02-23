<?php

// Definisi kelas Product
class Product {
    public static $last_id = 0;
    public $id_product;
    public $name;
    public $brand;
    public $price;

    public function __construct($name, $brand, $price) {
        self::$last_id++;
        $this->id_product = self::$last_id;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    public function getIdProduct() {
        return $this->id_product;
    }

    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function setBrand($brand) {
        $this->brand = $brand;
    }

    public function getPrice() {
        return $this->price;
    }

    public function setPrice($price) {
        $this->price = $price;
    }
}

// Definisi kelas Clothing
class Clothing extends Product {
    public $size;
    public $material;
    public $gender;

    public function __construct($name, $brand, $price, $size, $material, $gender) {
        parent::__construct($name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    public function getSize() {
        return $this->size;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}

// Definisi kelas Shirt
class Shirt extends Clothing {
    public $color;
    public $sleeveType;

    public function __construct($name, $brand, $price, $size, $material, $gender, $color, $sleeveType) {
        parent::__construct($name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }

    public function getColor() {
        return $this->color;
    }

    public function setColor($color) {
        $this->color = $color;
    }

    public function getSleeveType() {
        return $this->sleeveType;
    }

    public function setSleeveType($sleeveType) {
        $this->sleeveType = $sleeveType;
    }
}

?>