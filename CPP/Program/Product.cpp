#include "Product.h"

int Product::last_id = 0;

Product::Product(std::string name, std::string brand, int price) {
    last_id++;
    id_product = last_id;
    this->name = name;
    this->brand = brand;
    this->price = price;
}

int Product::getIdProduct() {
    return id_product;
}

std::string Product::getName() {
    return name;
}

void Product::setName(std::string name) {
    this->name = name;
}

std::string Product::getBrand() {
    return brand;
}

void Product::setBrand(std::string brand) {
    this->brand = brand;
}

int Product::getPrice() {
    return price;
}

void Product::setPrice(int price) {
    this->price = price;
}
