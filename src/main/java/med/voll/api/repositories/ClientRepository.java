package med.voll.api.repositories;

import med.voll.api.models.Activities_list;
import med.voll.api.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
   Optional<Client> findById(Long id);
    List<Client> findAll();
    Client save(Client client);
    void delete(Client client);
}
