package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.dtos.ClientDTOS.CreateClientDTO;
import med.voll.api.models.Client;
import med.voll.api.services.Clientes.CreateClientService;
import med.voll.api.services.Clientes.ReadAllClientService;
import med.voll.api.services.Clientes.ReadOnlyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("clients")
public class ClientController {


        @Autowired
        private CreateClientService services;

        @Autowired
        private ReadAllClientService readsAll;

        @Autowired
        private ReadOnlyClientService readOnly;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Client create(@RequestBody @Valid CreateClientDTO clientDTO){
            return services.createClient(clientDTO);
        }
        @GetMapping
        public List<Client> getAllBoards() {
                return readsAll.execute();
        }
        @GetMapping("{id}")
        public Client getById(@PathVariable String id) {
                return readOnly.execute(Long.valueOf(id));
        }



}
