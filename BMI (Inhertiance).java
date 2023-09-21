import java.util.Scanner;
public class MyClass extends BMI {
    public static void main(String args[]) {
      Scanner input = new Scanner ( System.in);
      System.out.println ("Enter your weight: ");
      double weight = input.nextDouble ();
      System.out.println ("Enter your height: ");
      double height = input.nextDouble ();
      BMI bmi = new BMI ();
      BMI.calaulation (height,weight);
      
    }
}

 class BMI {
    public static void calaculation (double weight, double height) {
        
    
double BMI = 703 * (weight / (height * height));

      System.out.println("Your BMI is: " +BMI);
    
    if (BMI < 18.5) {
        System.out.println ("You are underweight");
    }
    if (BMI > 18.5 && BMI < 24.9) {
        System.out.println ("You have normal weight");
    }
    if (BMI > 18.5 && BMI < 30) {
        System.out.println ("Your weight is considered overweight");
    }
    else {
        System.out.println ("Your weight is considered obese");
    }
}
}