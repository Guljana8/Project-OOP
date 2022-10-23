package PROJECT;
public class Task3 {
 /*
    - Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    - which should be returning a price of the car.

    - Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation
    - of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then
    - returned price car should include 10% discount, otherwise 20% discount.
    - The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    - if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

    public static void main(String[] args) {
       Truck truck = new Truck();
       System.out.println("The final price of car with all discounts: "+truck.calculateSalePrice(15000,1900));

       Sedan sedan = new Sedan();
       System.out.println("The final price of car with all discounts: "+sedan.calculateSalePrice(11000,25));
    }
}

class Car {
    double carPrice;
    double salePrice;

    double calculateSalePrice(double carPrice, int weight) {
        return salePrice;
    }
}

class Sedan extends Car {
    int length;
    @Override
    double calculateSalePrice(double carPrice, int length) {
        if (length > 20) {
            salePrice = carPrice *0.95;
        } else {
            salePrice = carPrice * 0.9;
        } return salePrice;
    }
}

class Truck extends Car {
    int weight;
    @Override
    double calculateSalePrice(double carPrice, int weight) {
        if (weight > 2000) {
            salePrice = carPrice * 0.9;
        } else {
            salePrice = carPrice * 0.8;
        } return salePrice;
    }
}
