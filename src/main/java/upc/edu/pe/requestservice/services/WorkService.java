package upc.edu.pe.requestservice.services;

import upc.edu.pe.requestservice.entities.Work;

public interface WorkService extends CrudService<Work,Long> {
    Work createWork(Long requestId,Work work);
}
