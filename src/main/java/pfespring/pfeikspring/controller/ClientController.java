package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.ClientService;
import pfespring.pfeikspring.entity.Client;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable int id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client client) {
        Client updatedClient = clientService.updateClient(id, client);
        if (updatedClient == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedClient, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
