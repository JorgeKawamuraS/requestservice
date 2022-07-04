package upc.edu.pe.requestservice.services;

import upc.edu.pe.requestservice.entities.Request;

public interface RequestService extends CrudService<Request,Long> {
    Request createRequest(Request request);
}
