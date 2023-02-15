public class PHILOSOPHERS extends Spartans{
    private int age;
    private String gender;

    public PHILOSOPHERS(String name, int count, int age, String gender) {
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
        return "invent weapons ";
    }

    @Override
    public String toString() {
        return "PHILOSOPHERS " + getName() + getCount()+" pholosophers "+
                " age " + age +
                " gender " + gender +
                "\n"+attack()+
                "";
    }
}
