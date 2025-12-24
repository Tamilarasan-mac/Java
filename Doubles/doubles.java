package Doubles;

public class doubles {
    public static void main(String[] args){
        double[] price = new double[2];
        price[0] = 199.90;
        price[1] = 200.45;
        price[2] = 100.01;
        price[3] = 1000.99;

        for(int d = 2; d < price.length; d++){
                System.out.println("Price = " + price[d]);
        }



    }
    
}
