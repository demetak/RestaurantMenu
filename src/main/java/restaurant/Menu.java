package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    protected void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    protected void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem item){
        if (!this.menu.contains(item)){
            this.getMenu().add(item);
        }else{
            System.out.println("This item is already added! " + item);
        }
    }

    public void removeMenuItem(MenuItem item){
        if (this.menu.contains(item)){
            this.getMenu().remove(item);
        }
    }

    public void setMenuItemAsNew(MenuItem item){
        item.setNew(true);
        getMenu().set(getMenu().indexOf(item),item);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
