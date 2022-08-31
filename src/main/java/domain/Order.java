package domain;

import java.time.LocalDate;
import java.util.List;

public class Order extends Entity<Integer> {
    private LocalDate date;
    private List<OrderItem> items;
    private Practitioner placer;
    private OrderStatus status;

    public Order() {
    }

    public Order(LocalDate date, List<OrderItem> items, Practitioner placer) {
        this.date = date;
        this.items = items;
        this.placer = placer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Practitioner getPlacer() {
        return placer;
    }

    public void setPlacer(Practitioner placer) {
        this.placer = placer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }
}
