/*

Question 2:

Create a Car class.

Private variable: speed

Speed must be between 0–200    //This is call Validation

 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Maruti");
        car1.setSpeed(100);

        System.out.println(car1.getBrand());
        System.out.println(car1.getSpeed());

    }
}

class Car {

    private String Brand;
    private int speed;

    //Here private entity is private so not accessable by main class, so we need public getter and setter function
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getBrand() {
        return Brand;
    }

    //setter getter for speed
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Please Enter Valid Speed");
        }

    }

    public int getSpeed() {
        return speed;
    }
}
