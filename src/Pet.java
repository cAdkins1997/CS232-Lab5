import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {
    private final Format f = new SimpleDateFormat("MM/dd/yy");
    private String type;
    private String name;
    private String owner;
    private double weight;
    private String sex;
    private String color;
    private String birthDate = f.format(new Date());

    void speak(){

    }

    void getTag(){
        System.out.println("If lost, call "  + owner + "\n");
    }

    public Format getF() {
        return f;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Type='" + type + '\'' + "\n" +
                "Name='" + name + '\'' + "\n" +
                "Owner='" + owner + '\'' + "\n" +
                "Weight=" + weight + "\n" +
                "Sex='" + sex + '\'' + "\n" +
                "Color='" + color + '\'' + "\n" +
                "BirthDate='" + birthDate + '\'' + "\n";
    }

    public Pet(String type, String name, String owner, double weight, String sex, String color, String birthDate) {
        this.type = type;
        this.name = name;
        this.owner = owner;
        this.weight = weight;
        this.sex = sex;
        this.color = color;
        this.birthDate = birthDate;
    }

    public Pet() {
        this.type = "a pet";
        this.name = "a lil guy";
        this.owner = "some person";
        this.weight = 0.0000001;
        this.sex = "I dunno";
        this.color = "some kinda colour";
        this.birthDate = "01/01/0001";
    }
}
