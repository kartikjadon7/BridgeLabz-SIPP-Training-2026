
public class HospitalBilling {

    public static void main(String[] args) {

        try {
            int items = 0;

            if (items == 0) {
                throw new ZeroItemsException(
                        "Billing Error: Number of items cannot be zero."
                );
            }

        } catch (ZeroItemsException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] patients = {101, 102, 103};
            int index = 5;

            if (index >= patients.length) {
                throw new InvalidPatientException(
                        "Patient Error: Invalid patient index."
                );
            }

        } catch (InvalidPatientException e) {
            System.out.println(e.getMessage());
        }

        try {
            String input = "ABC";

            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new InvalidInputException(
                        "Input Error: Please enter a valid number."
                );
            }

        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        try {
            int bill = 5000;
            int payment = 3000;

            if (payment < bill) {
                throw new InsufficientFundsException(
                        "Payment Error: Insufficient funds."
                );
            }

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ZeroItemsException extends Exception {
    public ZeroItemsException(String message) {
        super(message);
    }
}

class InvalidPatientException extends Exception {
    public InvalidPatientException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}