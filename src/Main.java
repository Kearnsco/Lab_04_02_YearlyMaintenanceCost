public class Main {
    public static void main(String[] args)
    {
        int springCost = 190;
        int summerCost = 250;
        int fallCost = 500;
        int winterCost = 140;
        int yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The maintenance cost for spring is $" + springCost);
        System.out.println("The maintenance cost for summer is $" + summerCost);
        System.out.println("The maintenance cost for fall is $" + fallCost);
        System.out.println("The maintenance cost for winter is $" + winterCost);
        System.out.println("Your total yearly maintenance cost is $" + yearlyCost);
    }
}