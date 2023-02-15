public class Archers extends Spartans{
    private int age;
    private String gender;

    public Archers(String name, int count, int age, String gender) {
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
        return "shoots ";
    }

    @Override
    public String toString() {
        return "archers  " +getName()+getCount()+" archer "+
                " age " + age +
                " gender " + gender +
                "\n"+ attack()+
                "";
    }
}
