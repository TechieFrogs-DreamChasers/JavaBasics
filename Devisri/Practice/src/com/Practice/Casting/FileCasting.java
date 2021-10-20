package com.Practice.Casting;
interface FileFactory{
  String openFilePath(String path);
}
public class FileCasting {
    int getSize(){
        return 0;
    }
    String getExtension(){
        return null;
    }
    String getDate(){
        return null;
    }
}
class PDFFile extends FileCasting implements FileFactory{
    boolean isDigitalSign(){
        return true;
    }

    @Override
    int getSize() {
        return 10;
    }

    @Override
    String getExtension() {
        return "Pdf";
    }

    @Override
    String getDate() {
        return "19/10/2021";
    }

    @Override
    public String openFilePath(String path) {
        if(getExtension().equalsIgnoreCase("pdf")){
            return path;
        } else {
            return null;
        }
    }
}
class AudioFile extends FileCasting implements FileFactory{
    int getBitRate(){
        return 64;
    }
    String getArtist(){
        return "Adele";
    }
    String getSong(){
        return "Rolling in the Deep";
    }
    String getAlbum(){
        return "21";
    }

    @Override
    int getSize() {
        return 13;
    }

    @Override
    String getExtension() {
        return "mp3";
    }

    @Override
    String getDate() {
        return "2011";
    }

    @Override
    public String openFilePath(String path) {
        if(getExtension().equalsIgnoreCase("mp3")){
            return path;
        } else {
            return null;
        }
    }
}
class Main{
    public static void main(String[] args) {
        /*AudioFile af=new AudioFile();
        By doing this we can get access to all methods.
        No need of Down casting/ Up casting
        */
        FileCasting f1=new PDFFile();
        FileCasting f2=new AudioFile();
        System.out.println(((PDFFile)f1).openFilePath("pdf"));//pdf
        //System.out.println(((AudioFile)f1).openFilePath("pdf"));//class cast exception
        if(f1 instanceof AudioFile){//Always false
            System.out.println(((AudioFile)f1).openFilePath("pdf"));
        }
        System.out.println(((AudioFile)f2).openFilePath("pdf"));//pdf
        System.out.println(((AudioFile)f2).openFilePath("mp3"));//mp3
        System.out.println(((PDFFile)f1).openFilePath("mp3"));//mp3
    }
}