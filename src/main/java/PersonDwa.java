
public class PersonDwa {
    private String name;
    private String surname;
    private Integer age;
    private  Integer agePlus;
    PersonDwa(){}
    public PersonDwa(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAgePlus(Integer agePlus) {
        this.agePlus = agePlus;
    }

    public Integer getAgePlus(){
        return agePlus;
    }
}