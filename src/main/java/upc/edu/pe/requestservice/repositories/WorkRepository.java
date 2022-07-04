package upc.edu.pe.requestservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.requestservice.entities.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work,Long> {
}
