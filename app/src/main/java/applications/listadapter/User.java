package applications.listadapter;

/**
 * Created by Mitch on 2016-05-13.
 */
public class User {
    private String FirstName;
    private String LastName;
    private String FavFood;

    public User(String fName,String lName, String fFood){
        FirstName = fName;
        LastName = lName;
        FavFood = fFood;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFavFood() {
        return FavFood;
    }

    public void setFavFood(String favFood) {
        FavFood = favFood;
    }
}
