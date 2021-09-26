
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        String password;
        String enteredPassword;
        String HungaryNot;
        String isDrink=null;
        String foods;
        String drinkChoice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello welcome to the food app");
        System.out.println("Please Create a password");
        password = sc.nextLine();
        System.out.println("Enter your Password to get in");
        enteredPassword = sc.nextLine();
        while (!password.equals(enteredPassword)) {
            System.out.println("Password incorrect Try again");
            System.out.println("Enter your Password to get in");
            enteredPassword = sc.nextLine();

        }
        System.out.println("access granted");                        //user authentication Protocol

        System.out.println("Are you hungry yes or no");                //input iof hungry
        HungaryNot = sc.nextLine();
        if (HungaryNot.equalsIgnoreCase("yes")) {
            System.out.println("Today's Menu");
            System.out.println("1>Chinese");
            System.out.println("2>Continental");
            System.out.println("3>Indian");
            foods = sc.nextLine();


            while (!foods.equalsIgnoreCase("chinese") && !foods.equalsIgnoreCase("continental") && !foods.equalsIgnoreCase("indian")) {
                System.out.println("Your chosen  " + foods + " which is not present in the menu");
                System.out.println("Enter a valid option from the menu");
                foods = sc.nextLine();
            }                                                                       //loop to check valid menu input


            if (foods.equalsIgnoreCase("chinese") || foods.equalsIgnoreCase("continental") || foods.equalsIgnoreCase("indian")) {
                System.out.println("Do you want something to drink ");
                isDrink = sc.nextLine();                                                //condition for food(always true)

                if (isDrink.equalsIgnoreCase("yes")) {

                    System.out.println("What do you want to have 'Coke' or 'Juice'  ");
                    drinkChoice=sc.nextLine();                                              //condition for true isDrink



                    while (!drinkChoice.equalsIgnoreCase("coke") && !drinkChoice.equalsIgnoreCase("juice")) {
                        System.out.println("Sorry we don't have the " + isDrink + " Choose one from the menu");
                        isDrink = sc.nextLine();


                    }                                                                       //loop  for  valid drink choice
                    if(drinkChoice.equalsIgnoreCase("coke")|| drinkChoice.equalsIgnoreCase("juice")){
                        System.out.println("You have chosen " + foods + " in foods and " + drinkChoice + " on drinks");
                        System.out.println("Enter your password to checkout");
                        enteredPassword = sc.nextLine();
                                                                                            //condition for  valid drinkChoice(Always true)

                        while (!password.equals(enteredPassword)) {
                            System.out.println("Password incorrect Try again");
                            System.out.println("Enter your Password to get in");
                            enteredPassword = sc.nextLine();                                //password authentication


                        }

                        System.out.println("Greetings your order is on the way Have a great day");

                    }



                }

                                                                                                        //condition for isDrink if No
            if (isDrink.equalsIgnoreCase("no")) {
                System.out.println("You have chosen " + foods);
                System.out.println("Enter your password to checkout");
                enteredPassword = sc.nextLine();

                                                                                                        //Authentication
                while (!password.equals(enteredPassword)) {
                    System.out.println("Password incorrect Try again");
                    System.out.println("Enter your Password to get in");
                    enteredPassword = sc.nextLine();


                }

                System.out.println("Greetings your order is on the way Have a great day");
            }
        }


                                                                                                    //condition for isHungry false
        } else {
            System.out.println("Have a good Day");

        }

    }

}
