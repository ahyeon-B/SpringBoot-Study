package mini.mini_proj1.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int deliveryFee;

    public Order(Long memberId, String itemName, int itemPrice, int deliveryFee) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.deliveryFee = deliveryFee;
    }

    public int calculatePrice() {
        return itemPrice + deliveryFee;
    }
}