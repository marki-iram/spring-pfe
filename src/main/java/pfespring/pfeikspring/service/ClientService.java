package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.ClientRepository;
import pfespring.pfeikspring.entity.Client;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(int id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        return optionalClient.orElse(null);
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(int id, Client client) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            client.setId(id);
            return clientRepository.save(client);
        }
        return null;
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}
