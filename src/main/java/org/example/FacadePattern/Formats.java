package org.example.FacadePattern;


import java.util.Arrays;
import java.util.List;

public class Formats {
    private static String[] textExt = {"txt", "doc", "docs", "upd"};
    private static String[] imgExt = {"jpeg", "jpg", "gif", "psd", "raw", "bmp"};
    private static String[] presExt = {"ppt", "pptx", "pptjpeg", "pptpng"};
    private static String[] pdfExt = {"pdf"};

    public static EFormats GetFormat (String ext) {
        List<String[]> extList = Arrays.asList(textExt, imgExt, presExt, pdfExt);
        for (String[] format: extList) {
            for (String fext: format) {
                if (fext.contains(ext)) {
                    if (format == textExt)  return EFormats.text;
                    if (format == imgExt)   return EFormats.image;
                    if (format == presExt)  return EFormats.presentation;
                    if (format == pdfExt)   return EFormats.pdf;
                }
            }
        }
        return EFormats.undefined;
    }
}
