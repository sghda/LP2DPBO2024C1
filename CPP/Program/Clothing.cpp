#include <iostream>
#include <string>
#include "Product.h"

class Clothing : public Product {
private:
    std::string size;
    std::string material;
    std::string gender;

public:
    Clothing(std::string name, std::string brand, int price, std::string size, std::string material, std::string gender)
        : Product(name, brand, price) {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    std::string getSize() {
        return size;
    }

    void setSize(std::string size) {
        this->size = size;
    }

    std::string getMaterial() {
        return material;
    }

    void setMaterial(std::string material) {
        this->material = material;
    }

    std::string getGender() {
        return gender;
    }

    void setGender(std::string gender) {
        this->gender = gender;
    }
};
