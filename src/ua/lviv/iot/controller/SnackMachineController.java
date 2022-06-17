package ua.lviv.iot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.models.SnackMachine;
import ua.lviv.iot.service.SnackMachineService;
import java.util.Map;
import java.util.Set;

@RestController
public class SnackMachineController {
    private final SnackMachineService service;

    public SnackMachineController(SnackMachineService service) {
        this.service = service;
    }

    @GetMapping(path = "machines")
    public Set<Map.Entry<Integer, SnackMachine>> getAll() {
        return service.getAll();
    }

    @GetMapping(path = "machines/{machineId}")
    public SnackMachine getById(@PathVariable int machineId) {
        return service.getById(machineId);
    }
}
