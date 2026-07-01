class Bus extends Vehicle {

    double fuelCost(int km) {
        return km * 20;
    }
}

class Bike extends Vehicle {

    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    double fuelCost(int km) {
        return km * 1.5;
    }
}

class TransportDemo {

    public static void main(String[] args) {

        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        for (Vehicle v : fleet) {

            System.out.println("Fuel Cost = " + v.fuelCost(100));

            if (v instanceof Car) {
                Car c = (Car) v;
                c.openDoor();
            }
        }
    }
}