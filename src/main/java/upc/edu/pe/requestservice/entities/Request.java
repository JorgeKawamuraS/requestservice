package upc.edu.pe.requestservice.entities;

import lombok.Data;
import upc.edu.pe.requestservice.model.Worker;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "requests")
@Data
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date requestDate;

    @Transient
    private Worker worker;

    private Long workerId;

    public Long getId() {
        return id;
    }

    public Request setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public Request setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    public Worker getWorker() {
        return worker;
    }

    public Request setWorker(Worker worker) {
        this.worker = worker;
        return this;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public Request setWorkerId(Long workerId) {
        this.workerId = workerId;
        return this;
    }
}
