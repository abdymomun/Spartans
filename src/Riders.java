public class Riders extends Spartans{
    private int age;
    private String gender;

    public Riders(String name, int count, int age, String gender) {
        super(name, count);
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String attack() {
        return "goes to attack ";
    }

    @Override
    public String toString() {
        return "Riders " +getName()+getCount()+" riders "+
                " age " + age +
                " gender " + gender +
                "\n"+attack()+
                "";
    }
}
