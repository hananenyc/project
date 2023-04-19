package gp4;
public class prhw1{
    //Prompt the user to enter person heights in inches.
    //Person should be classified as one of the following:
    //• short (under 60 inch)
    //• medium(between 60 -72 inch)
    //• tall (over 72 inch)
    public static void main(String[] args) {
            double[] temperature = {58, 75.5, 69.5, 81, 105, 93};
            double highestTemp = temperature[0];
            double lowestTemp =temperature[0] ;

            for (int i = 0; i <temperature.length ; i++) {
                if (temperature[i]>highestTemp){
                    highestTemp=temperature[i];
                }if (temperature[i]<lowestTemp){
                    lowestTemp=temperature[i];
                }
            }
            System.out.println("Highest temperature is "+highestTemp);
            System.out.println("Lowest temperature is "+lowestTemp);
        }
    }



