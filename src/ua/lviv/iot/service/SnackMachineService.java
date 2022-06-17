package ua.lviv.iot.service;

import org.springframework.stereotype.Service;
import ua.lviv.iot.Storage.SnackMachineStorage;
import ua.lviv.iot.models.SnackMachine;

import java.util.Map;
import java.util.Set;

@Service
public class SnackMachineService {
    public SnackMachine getById (int id) {
        SnackMachine snackMachine = new SnackMachine();
        SnackMachine snackMachine1 = new SnackMachine();
        snackMachine1.setId(2);
        SnackMachineStorage storage = new SnackMachineStorage();
        storage.add(snackMachine);
        storage.add(snackMachine1);
        return storage.getById(id);
    }

    public Set<Map.Entry<Integer, SnackMachine>> getAll () {
        SnackMachine snackMachine = new SnackMachine();
        SnackMachine snackMachine1 = new SnackMachine();
        snackMachine1.setId(2);
        SnackMachineStorage storage = new SnackMachineStorage();
        storage.add(snackMachine);
        storage.add(snackMachine1);
        return storage.getAll();
    }
}
