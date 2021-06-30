package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu newMenu = new Menu();
        newMenu.addMenuItem(new MenuItem("main course","Lentil Soup",5,false));
        newMenu.addMenuItem(new MenuItem("main course","Grill Steak",20,false));
        newMenu.addMenuItem(new MenuItem("main course","Green Salad",5,false));
        newMenu.addMenuItem(new MenuItem("dessert","Cheesecake",10,true));
        newMenu.addMenuItem(new MenuItem("appetizer","Humus Dip",5,false));
        newMenu.addMenuItem(new MenuItem("dessert","Cheesecake",10,true));
        System.out.println(newMenu);
        System.out.println(newMenu.getMenu().get(0));
        newMenu.removeMenuItem(new MenuItem("appetizer","Humus Dip",5,false));
        System.out.println(newMenu);

    }
}
