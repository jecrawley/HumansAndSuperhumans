package crawley.james.HumansAndSuperhumans;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class HumansAndSuperhumans {
    public static void main (String[] args) {
        Human carl = new Human("Carl Johnson", "903 E West St.", "Business Analyst", 32, Gender.MALE);
        Human jimmy = new Human("Jimmy Harver", "264 Magnet Ln.", "Electrician", 46, Gender.MALE);
        Human whitney = new Human("Whitney Green", "432 Marlin Ave.", "Professional Wrestler", 26, Gender.FEMALE);
        Superhuman beth = new Superhuman("Beth Williams", "9233 Chester St.", "Interior Designer", 32,
                Gender.FEMALE, Alignment.GOOD, "Carpet Bomber", "Flight");
        Superhuman mark = new Superhuman("Mark Milton", "58 Sirloin Way", "Salesman", 28,
                Gender.MALE, Alignment.GOOD, "Dealbreaker", "Super Strength");
        Superhuman jessie = new Superhuman("Jessie", "675 Raven Blvd.", "Seamstress", 30,
                Gender.FEMALE, Alignment.BAD, "The Threader", "String manipulation");

        System.out.println("Name: "+ carl.getName() + "\nAddress: " + carl.getAddress() + "\nOccupation: " +
                carl.getOccupation() + "\nAge: " + carl.getAge() + "\nGender: " + carl.getGender() + "\n");
        System.out.println("Name: "+ jimmy.getName() + "\nAddress: " + jimmy.getAddress() + "\nOccupation: " +
                jimmy.getOccupation() + "\nAge: " + jimmy.getAge() + "\nGender: " + jimmy.getGender()+ "\n");
        System.out.println("Name: "+ whitney.getName() + "\nAddress: " + whitney.getAddress() + "\nOccupation: " +
                whitney.getOccupation() + "\nAge: " + whitney.getAge() + "\nGender: " + whitney.getGender()+ "\n");
        System.out.println("Name: "+ beth.getName() + "\nAddress: " + beth.getAddress() + "\nOccupation: " +
                beth.getOccupation() + "\nAge: " + beth.getAge() + "\nGender: " + beth.getGender()
                + "\nAlignment: " + beth.getAlignment() + "\nHero Name: " + beth.getHeroName()
                + "\nSuper Power: " + beth.getSuperPower()+ "\n");
        System.out.println("Name: "+ mark.getName() + "\nAddress: " + mark.getAddress() + "\nOccupation: " +
                mark.getOccupation() + "\nAge: " + mark.getAge() + "\nGender: " + mark.getGender()
                + "\nAlignment: " + mark.getAlignment() + "\nHero Name: " + mark.getHeroName()
                + "\nSuper Power: " + mark.getSuperPower()+ "\n");
        System.out.println("Name: "+ jessie.getName() + "\nAddress: " + jessie.getAddress() + "\nOccupation: " +
                jessie.getOccupation() + "\nAge: " + jessie.getAge() + "\nGender: " + jessie.getGender()
                + "\nAlignment: " + jessie.getAlignment() + "\nHero Name: " + jessie.getHeroName()
                + "\nSuper Power: " + jessie.getSuperPower()+ "\n");
    }
}
