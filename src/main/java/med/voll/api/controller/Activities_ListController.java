package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.dtos.ActivitiesListDTOS.CreateActivityListDTO;
import med.voll.api.dtos.ClientDTOS.CreateClientDTO;
import med.voll.api.models.Activities_list;
import med.voll.api.models.Client;
import med.voll.api.services.Activities_List.CreateActivities_ListService;
import med.voll.api.services.Clientes.CreateClientService;
import med.voll.api.services.Clientes.ReadAllClientService;
import med.voll.api.services.Clientes.ReadOnlyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("activitieslist")
public class Activities_ListController {


    @Autowired
    private CreateActivities_ListService services;



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Activities_list create(@RequestBody @Valid CreateActivityListDTO createActivityListDTO){
        return services.execute(createActivityListDTO);
    }
//    @GetMapping
//    public List<Client> getAllBoards() {
//        return readsAll.execute();
//    }
//    @GetMapping("{id}")
//    public Client getById(@PathVariable String id) {
//        return readOnly.execute(Long.valueOf(id));
//    }



}