public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream vanilla = new IceCream("Vanilla", 1,1);
        IceCream rocky_road = new IceCream("Rocky Road", 3, 2);
        System.out.println(vanilla.getNumScoops() + " " + vanilla.getName() + " costs " + vanilla.getCost());
        System.out.println(rocky_road.getName() + " costs " + rocky_road.getCost());
        rocky_road.addTopping("Sprinkles");
        rocky_road.printToppings();
        System.out.println(rocky_road.getName() + " now costs " + rocky_road.getCost());
    }
}
