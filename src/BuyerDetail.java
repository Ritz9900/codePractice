public class BuyerDetail {
    private String BuyerName;
    private String mobileNumber;
    private String OrderItem;
    private int OrderAmount;

    public BuyerDetail(String buyerName, String mobileNumber, String orderItem, int orderAmount) {
        BuyerName = buyerName;
        this.mobileNumber = mobileNumber;
        OrderItem = orderItem;
        OrderAmount = orderAmount;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String buyerName) {
        BuyerName = buyerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(String orderItem) {
        OrderItem = orderItem;
    }

    public int getOrderAmount() {
        return OrderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        OrderAmount = orderAmount;
    }
}
