package crawley.james.HumansAndSuperhumans;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class Human {

    private String name;
    private int age;
    private String address;
    private Gender gender;
    private String occupation;


    public Human (String name, String address, String occupation, int age, Gender gender) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.occupation = occupation;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {

        this.age = age;
    }

    public int getAge () {

        return age;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender (Gender gender) {
        this.gender = gender;
    }

    public Gender getGender () {
        return gender;
    }

    public void setOccupation (String occupation) {

        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }



}
