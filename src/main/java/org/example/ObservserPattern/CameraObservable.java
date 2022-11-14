package org.example.ObservserPattern;

import java.util.ArrayList;
import java.util.List;

interface ICameraObserver {

    void registerObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();

}

public class CameraObservable implements ICameraObserver{

    private List<Observer> observerList = new ArrayList<>();
    private int[][] cameraMatrix;
    private ArrayList<int[]> movements;

    public void setCameraMatrix(int[][] cameraMatrix) {
        this.cameraMatrix = cameraMatrix;
        movements = checkForMovements(cameraMatrix);
        if (movements.size() >= 2)
            notifyObservers();
    }

    private ArrayList<int[]> checkForMovements(int[][] cameraMatrix){

        ArrayList<int[]> moveFoundAt = new ArrayList<>();

        for (int i = 0; i < cameraMatrix.length; i++)
            for (int j = 0; j < cameraMatrix[0].length; j++){
                if (cameraMatrix[i][j] != 0) {
                    moveFoundAt.add(new int[]{i,j});
                }
            }

        return moveFoundAt;
    }

    @Override
    public void registerObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observerList)
            obj.update(movements);
    }
}



