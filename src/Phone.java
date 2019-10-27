import java.sql.Date;

public class Phone {
    private String orderNumber;
    private String owner;
    private double weight;
    public Date sendDate;
    public Date receiveDate;

    public Phone(String orderNumber, String owner, double weight, Date sendDate, Date receiveDate) {
        this.orderNumber = orderNumber;
        this.owner = owner;
        this.weight = weight;
        this.sendDate = sendDate;
        this.receiveDate = receiveDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}