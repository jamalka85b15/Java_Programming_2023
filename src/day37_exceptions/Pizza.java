package day37_exceptions;

public class Pizza {
    private char size;
    private int numberOfCheeseToppings;
    private int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniTopping) {
        setSize(size);
       setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseToppings + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseToppings + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseToppings + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: "+size);

        }

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total Cost=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof Pizza )){ // if the specified object is not pizza
            System.err.println("Invalid object: "+obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza)obj;

        if(size ==   pizza.getSize()   ){
            if( numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()){
                return true;
            }
        }

        return false;
    }
}
