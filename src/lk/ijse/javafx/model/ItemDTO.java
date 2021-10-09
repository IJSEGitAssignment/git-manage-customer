package lk.ijse.javafx.model;

/**
 * @author Janidu Ayeshan <janiduayeshan16@gmail.com>
 * @since 10/9/2021
 */
public class ItemDTO {
    private String ItCode;
    private String ItName;
    private int price;

    public ItemDTO() {
    }

    public ItemDTO(String itCode, String itName, int price) {
        ItCode = itCode;
        ItName = itName;
        this.price = price;
    }

    public String getItCode() {
        return ItCode;
    }

    public void setItCode(String itCode) {
        ItCode = itCode;
    }

    public String getItName() {
        return ItName;
    }

    public void setItName(String itName) {
        ItName = itName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
