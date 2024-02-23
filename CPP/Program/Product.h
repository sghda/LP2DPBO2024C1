#ifndef PRODUCT_H
#define PRODUCT_H

#include <string>

class Product {
private:
    static int last_id;
    int id_product;
    std::string name;
    std::string brand;
    int price;

public:
    Product(std::string name, std::string brand, int price);

    int getIdProduct();

    std::string getName();
    void setName(std::string name);

    std::string getBrand();
    void setBrand(std::string brand);

    int getPrice();
    void setPrice(int price);
};

#endif // PRODUCT_H
