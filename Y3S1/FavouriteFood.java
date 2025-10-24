public class FavouriteFood { 
    public static void main(String[] args) {
        Food1 f1 = new Food1();
        System.out.println("Class 1 (Getter only): " + f1.getFood());

        Food2 f2 = new Food2();
        f2.setFood("Burger");
        System.out.println("Class 2 (Setter only): Cannot display food since no getter");

        Food3 f3 = new Food3();
        f3.setFood("Pasta");
        System.out.println("Class 3 (Getter + Setter): " + f3.getFood());

        Food4 f4 = new Food4();
        System.out.println("Class 4 (No getter/setter): " + f4.food);
    }
}

class Food1 {
    private String food = "Pizza";
    public String getFood() {
        return food;
    }
}

class Food2 {
    private String food;
    public void setFood(String food) {
        this.food = food;
    }
}

class Food3 {
    private String food;
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
}

class Food4 {
    public String food = "Sandwich";
}
