public class PriceCalculator {



    public  static int calculateTotalPrice(int numberOfCopies) {
    int maxCopy = 30000;
        int pricePerCopy = 0;
        // if (numberOfCopies < 1){
        // return "number of copies cannot be less than 1";
        // }

        if (numberOfCopies > 1 && numberOfCopies <= 4) {
            pricePerCopy = 2000;
        } else if (numberOfCopies >= 5  && numberOfCopies <=9) {
            pricePerCopy = 1800;
        } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            pricePerCopy = 1600;
        } else if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            pricePerCopy = 1500;
        }else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            pricePerCopy = 1300;
        }else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            pricePerCopy = 1200;
        }else if (numberOfCopies >= 200 && numberOfCopies <= 499) {
            pricePerCopy = 1100;
        }else if (numberOfCopies > 500) {
            pricePerCopy = 1000;
        }

        int totalPrice = numberOfCopies * pricePerCopy;
        return totalPrice;
        //return Math.min(totalPrice, maxCopy);
    }
}
