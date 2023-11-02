import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        ArrayList<Covid19Data> covidDataList = fileHandler.readCSVFile("CovidData.csv");
        fileHandler.printCovidDataList(covidDataList);
    }
}