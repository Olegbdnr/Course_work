package ua.lviv.iot.Storage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.lviv.iot.models.SnackMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class SnackMachineStorage {
    private Map<Integer, SnackMachine> storage = new HashMap<>();

    public void add(SnackMachine machine) {
        storage.put(machine.getId(), machine);
    }

    public Set<Map.Entry<Integer, SnackMachine>> getAll() {
        return storage.entrySet();
    }

    public SnackMachine getById(int id) {
        return storage.get(id);
    }
}
