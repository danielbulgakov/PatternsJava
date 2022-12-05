package org.example.FacadePattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

import static org.example.FacadePattern.Formats.GetFormat;


public class Converter {
    public static int convert(String filePath, String ext, String outPath) {
        EFormats eFormats = GetFormat(FilenameUtils.getExtension(filePath));
        if (eFormats == EFormats.text)          ConvertText.convert(filePath, ext, outPath);
        if (eFormats == EFormats.image)         ConvertImage.convert(filePath, ext, outPath);
        if (eFormats == EFormats.presentation)  ConvertPPTX.convert(filePath, ext, outPath);
        if (eFormats == EFormats.pdf)           ConvertPDF.convert(filePath, ext, outPath);
        if (eFormats == EFormats.undefined)     return -1;
        return 0;
    }
}



class ConvertText{
    public static int convert(String filePath, String ext, String outPath) {
        // Используется "очень сложный" механизм конвертации
        System.out.println("Конвертирую текст");
        File in = new File(filePath);
        File out = new File(outPath + "\\"+ FilenameUtils.getBaseName(filePath) + "." + ext);
        try {
            out.createNewFile();
            FileUtils.copyFile(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}

class ConvertImage{
    public static int convert(String filePath, String ext, String outPath) {
        // Используется "очень сложный" механизм конвертации
        System.out.println("Конвертирую картинку");
        File in = new File(filePath);
        File out = new File(outPath + "\\"+ FilenameUtils.getBaseName(filePath) + "." + ext);
        try {
            out.createNewFile();
            FileUtils.copyFile(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}

class ConvertPDF{
    public static int convert(String filePath, String ext, String outPath) {
        // Используется "очень сложный" механизм конвертации
        System.out.println("Конвертирую pdf");
        File in = new File(filePath);
        File out = new File(outPath + "\\"+ FilenameUtils.getBaseName(filePath) + "." + ext);
        try {
            out.createNewFile();
            FileUtils.copyFile(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}

class ConvertPPTX{
    public static int convert(String filePath, String ext, String outPath) {
        // Используется "очень сложный" механизм конвертации
        System.out.println("Конвертирую презентацию");
        File in = new File(filePath);
        File out = new File(outPath + "\\"+ FilenameUtils.getBaseName(filePath) + "." + ext);
        try {
            out.createNewFile();
            FileUtils.copyFile(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}



