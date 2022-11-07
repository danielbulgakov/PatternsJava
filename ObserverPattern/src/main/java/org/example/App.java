package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        var cameraObservable = new CameraObservable();

        new Observer("1", cameraObservable);
        new Observer("2", cameraObservable);

        var observerToDelete = new Observer("3", cameraObservable);
        cameraObservable.removeObserver(observerToDelete);


        int[][] cameraMatrix = new int[10][10];
//        for (int i = 0; i < cameraMatrix.length; i++)
//            for (int j = 0; j < cameraMatrix[0].length; j++)
//                cameraMatrix[i][j] = 0;
//
//        cameraMatrix[0][0] = 1;
//        cameraObservable.setCameraMatrix(cameraMatrix);
//
//        cameraMatrix[0][1] = 1;
//        cameraObservable.setCameraMatrix(cameraMatrix);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                cameraMatrix[i][j] = scanner.nextInt();

        cameraObservable.setCameraMatrix(cameraMatrix);

    }
}

// Пример
/*
0 0 0 0 0 0 0 0 0 0
1 0 0 0 0 1 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 0 0
0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
Обозреватель с id 1 заметил движения на камере в (1,0) (1,5) (7,7) (8,3)
Обозреватель с id 2 заметил движения на камере в (1,0) (1,5) (7,7) (8,3)
 */
