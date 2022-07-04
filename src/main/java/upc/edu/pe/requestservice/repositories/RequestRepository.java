package upc.edu.pe.requestservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.requestservice.entities.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
}
