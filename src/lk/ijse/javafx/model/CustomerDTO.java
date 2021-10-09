package lk.ijse.javafx.model;

/**
 * @author Janidu Ayeshan <janiduayeshan16@gmail.com>
 * @since 10/9/2021
 */
public class CustomerDTO {
    private String cid;
    private String name;
    private int age;

    public CustomerDTO() {
    }

    public CustomerDTO(String cid, String name, int age) {
        this.cid = cid;
        this.name = name;
        this.age = age;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
