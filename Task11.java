package JavaProject2;

public class Task11 {

    private String color;
    private double price;


    public Task11(String color, double price ) {
        this.color = color;
        this.price = price;
    }
    double calculateSalePrice(){
        return price;
    }
}

class Sedan extends Task11 {
    private int length;

    public Sedan(String color, double price, int length) {
        super(color, price);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.05;
        } else {
            return super.calculateSalePrice() * 0.10;
        }
    }
}

        class Truck extends Task11 {
            private double weight;

            public Truck(String color, int price, double weight) {
                super(color, price);
                this.weight = weight;
            }

            @Override
            double calculateSalePrice() {
                if (weight > 2000) {
                    return super.calculateSalePrice() * 0.10;
                } else {
                    return super.calculateSalePrice() * 0.20;
                }
            }
        }

            class Tester {
                public static void main(String[] args) {
                    Sedan s = new Sedan("Red", 35000, 15);
                    System.out.println("Sedan price" + s.calculateSalePrice());


                    Truck t = new Truck("Black", 75000, 3000);
                    System.out.println("Truck price " + t.calculateSalePrice());



                }
            }





