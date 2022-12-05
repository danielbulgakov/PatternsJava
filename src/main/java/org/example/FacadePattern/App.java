package org.example.FacadePattern;

public class App {
    public static void main(String[] args) {
        // Конвертация по сути копирует файл и меняет его расширение
        // Но для разных типов расширений вызываются разные классы конвертеры
        // При запуске в консоль выводится конвертер, что запустился
        Converter.convert("C:\\Users\\User\\Desktop\\testdir\\a.pdf",
                "bmp",
                "C:\\Users\\User\\Desktop\\testdir");
    }
}
