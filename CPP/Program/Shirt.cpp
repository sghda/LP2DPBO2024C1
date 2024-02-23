#include <iostream>
#include <string>
#include "Clothing.cpp"

class Shirt : public Clothing {
private:
    std::string color;
    std::string sleeveType;

public:
    Shirt(std::string name, std::string brand, int price, std::string size, std::string material, std::string gender, std::string color, std::string sleeveType)
        : Clothing(name, brand, price, size, material, gender) {
        this->color = color;
        this->sleeveType = sleeveType;
    }

    std::string getColor() {
        return color;
    }

    void setColor(std::string color) {
        this->color = color;
    }

    std::string getSleeveType() {
        return sleeveType;
    }

    void setSleeveType(std::string sleeveType) {
        this->sleeveType = sleeveType;
    }
};
