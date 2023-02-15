public class KNIGHTS extends Spartans{
    private int age;
    private String gender;

    public KNIGHTS(String name, int count, int age, String gender) {
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
        return "will defend the homeland ";
    }

    @Override
    public String toString() {
        return "KNIGHTS " +getName()+getCount()+" knights "+
                " age " + age +
                " gender " + gender +
                "\n"+attack()+
                "";
    }
}
