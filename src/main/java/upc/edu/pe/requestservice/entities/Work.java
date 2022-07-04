package upc.edu.pe.requestservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "works")
@Data
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private int totalCost;

    private Date workDate;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "request_id",nullable = false)
    @JsonIgnore
    private Request request;

    public Long getId() {
        return id;
    }

    public Work setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Work setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public Work setTotalCost(int totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public Work setWorkDate(Date workDate) {
        this.workDate = workDate;
        return this;
    }

    public Request getRequest() {
        return request;
    }

    public Work setRequest(Request request) {
        this.request = request;
        return this;
    }
}
