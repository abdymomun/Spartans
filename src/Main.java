public class Main {
    public static void main(String[] args) {

Spartans archers = new Archers("Ruslan ",5,20,"M ");
Spartans knights = new KNIGHTS("Musa ",5,21,"M ");
Spartans riders = new Riders("Adbymomun ",5,17,"M ");
Spartans philsophers = new PHILOSOPHERS("Stapbek ",1,34,"M ");
Spartans [] spartans1 = {archers,knights,riders,philsophers};
        for (Spartans v: spartans1) {
            System.out.println(v.toString());

        }
    }
}