package domain;

public class OrderItem {
    private Integer quantity;
    private Medication medication;
    private Order order;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Medication medication, Order order) {
        this.quantity = quantity;
        this.medication = medication;
        this.order = order;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
