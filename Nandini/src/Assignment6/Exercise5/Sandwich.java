package Assignment6.Exercise5;

public class Sandwich implements FastFood {

    public String veggieSandwich(){

        String[] veg = new String[5];
        veg[0] = "Potato";
        veg[1] = "Onion";
        veg[2] = "Tomatoe";
        veg[3] = "Ranch";
        veg[4] = "Spicy Sauce";

        String ingredients = " ";

        for(int i=0;i<veg.length;i++){

            ingredients += ( veg[i]+", ");
        }

        return ingredients;

    }

    public String chickenSandwich(){

        String[] chicken = new String[5];
        chicken[0] = "Potato";
        chicken[1] = "Onion";
        chicken[2] = "Tomatoe";
        chicken[3] = "Ranch";
        chicken[4] = "Spicy Sauce";

        String ingredients = " ";

        for(int i=0;i<chicken.length;i++){

            ingredients += ( chicken[i]+", ");
        }

        return ingredients;

    }


}
