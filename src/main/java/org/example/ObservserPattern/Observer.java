package org.example.ObservserPattern;

import java.util.ArrayList;


interface  IObserver {
    void update(ArrayList<int[]> movements);
}
public class Observer implements IObserver {

    private String UUID;

    public Observer(String uuid, CameraObservable cameraObservable){
        this.UUID = uuid;
        cameraObservable.registerObserver(this);
    }
    @Override
    public void update(ArrayList<int[]> movements){
        System.out.print("Обозреватель с id " + UUID + " заметил движения на камере в ");
        for (int[] item: movements) {
            System.out.print("(" + item[0] + "," + item[1] + ") ");
        }
        System.out.println();
    }
}
