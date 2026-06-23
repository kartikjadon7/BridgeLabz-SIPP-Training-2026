class Package {
    private String trackingId;
    private double weight;

    public Package(String trackingId, double weight) {
        this.trackingId = trackingId;
        this.weight = weight;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than 0.0");
        }
    }
}

class ExpressPackage extends Package {
    private String priorityLevel;

    public ExpressPackage(String trackingId, double weight, String priorityLevel) {
        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void printShippingLabel() {
        System.out.println("Tracking ID : " + getTrackingId());
        System.out.println("Weight      : " + getWeight() + " kg");
        System.out.println("Priority    : " + getPriorityLevel());
    }
}

public class Main {
    public static void main(String[] args) {
        ExpressPackage p = new ExpressPackage("EXP101", 2.5, "Critical");

        p.printShippingLabel();

        p.setWeight(-1.5);
        p.setWeight(0.0);

        System.out.println("Current Weight : " + p.getWeight() + " kg");
    }
}