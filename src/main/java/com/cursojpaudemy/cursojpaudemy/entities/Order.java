package com.cursojpaudemy.cursojpaudemy.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

    @ManyToOne    //  Associação "muitos para um"
    @JoinColumn(name = "client_id")
    private User client;


    //CONSTRUTORES
    public Order() {
    }

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
