import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public ArrayList<Covid19Data> readCSVFile(String filePath) {
        ArrayList<Covid19Data> covidDataList = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] covid19Data = line.split(";");

                String region = covid19Data[0];
                String aldersgruppe = covid19Data[1];
                int tilfældeIAlt = Integer.parseInt(covid19Data[2].trim());
                int døde = Integer.parseInt(covid19Data[3].trim());
                int indlagtePåIntensiv = Integer.parseInt(covid19Data[4].trim());
                int indlagte = Integer.parseInt(covid19Data[5].trim());
                String dato = covid19Data[6];


                Covid19Data covidData = new Covid19Data(region, aldersgruppe, tilfældeIAlt, døde, indlagtePåIntensiv, indlagte, dato);
                covidDataList.add(covidData);
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return covidDataList;
    }

    public void printCovidDataList(ArrayList<Covid19Data> covidDataList) {
        for (Covid19Data data : covidDataList) {
            System.out.println("Region: " + data.getRegion() + ", Aldersgrupe: " + data.getAldersgruppe() +
                    ", Tilfælde i alt: " + data.getTilfældeIAlt() + ", Døde: " + data.getDøde() + ", Indlagte på intensiv: " + data.getIndlagtePåIntensiv() + ", Indlagte: " + data.getIndlagte() + ", Dato: " + data.getDato());
        }
    }
}