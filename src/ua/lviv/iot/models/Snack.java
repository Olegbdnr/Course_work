package ua.lviv.iot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Snack {
    private int id;
    private String name = "Creesps";
    private String producer = "Lays";
    private int numberOfSnack = 50;

    public Snack (String name, String producer, int numberOfSnack) {
        this.name = name;
        this.producer = producer;
        this.numberOfSnack = numberOfSnack;
    }

}
