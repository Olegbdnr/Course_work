package ua.lviv.iot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SnackMachine {
    private int id = 1;
    private String streetLocation = "Zubrivska, 17";
    private List<Snack> snackList = new LinkedList<>();
    private List<Snack> soldSnackList = new LinkedList<>();
    private float cashCounterInUSD = 300.50f;
    private LocalDate cashLoadDate = LocalDate.now();
    private LocalDate cashCollectedDate = LocalDate.now();
    private String lastSnackLoaderName = "Ivan";
    private LocalDate lastLoadingDate = LocalDate.now();

    public SnackMachine(String streetLocation, List<Snack> snackList, float cashCounterInUSD) {
        this.streetLocation = streetLocation;
        this.snackList = snackList;
        this.cashCounterInUSD = cashCounterInUSD;
    }

    public void sellSnack (Snack snack){
        snackList.remove(snack);
    }
    public void loadSnack (Snack snack, String loaderName){
        snackList.add(snack);
        this.lastSnackLoaderName = loaderName;
    }
    public void loadCash (float cashNumInUSD) {
        cashCounterInUSD += cashNumInUSD;
    }
    public void collectCash (float cashNumInUSD) {
        cashCounterInUSD -= cashNumInUSD;
    }

}
