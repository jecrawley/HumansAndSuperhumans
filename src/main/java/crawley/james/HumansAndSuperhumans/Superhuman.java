package crawley.james.HumansAndSuperhumans;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class Superhuman extends Human {

    private Alignment alignment;
    private String heroName;
    private String superPower;

    public Superhuman (String name, String address, String occupation, int age, Gender gender, Alignment alignment,
                       String heroName, String superPower) {
        super(name, address, occupation, age, gender);

        this.alignment = alignment;
        this.heroName = heroName;
        this. superPower = superPower;

    }

    public void setAlignment (Alignment alignment) {

        this.alignment = alignment;

    }

    public Alignment getAlignment () {

        return alignment;
    }

    public void setHeroName (String heroName) {

        this.heroName = heroName;

    }

    public String getHeroName () {

        return heroName;

    }

    public void setSuperPower(String superPower) {

        this.superPower = superPower;

    }

    public String getSuperPower () {

        return superPower;
    }
}
