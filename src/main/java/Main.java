import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        ArrayList<Covid19Data> covidDataList = fileHandler.readFromFile("CovidData.csv");

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Menu:\n" +
                "Tast 1 for at udskrive data uden sortering\n" +
                "Tast 2 for at sortere alfabetisk efter region\n" +
                "Tast 3 for at sortere efter aldersgruppe\n" +
                "Tast 4 for at sortere alfabetisk efter region først og derefter aldersgruppe \n" +
                "Tast 5 for at sortere efter aldersgruppe og derefter region\n" +
                "Tast 6 for at udskrive menuen igen\n" +
                "Tast 7 for at afslutte");
        while (input != 7) {

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    fileHandler.printCovidDataList(covidDataList);
                case 2:
                    Collections.sort(covidDataList, new RegionComparator());
                    fileHandler.printCovidDataList(covidDataList);
                    break;
                case 3:
                    Collections.sort(covidDataList, new AldersGruppeComparator());
                    fileHandler.printCovidDataList(covidDataList);
                    break;
                case 4:
                    Collections.sort(covidDataList, new RegionComparator().thenComparing(new AldersGruppeComparator()));
                    fileHandler.printCovidDataList(covidDataList);
                    break;
                case 5:
                    Collections.sort(covidDataList, new AldersGruppeComparator().thenComparing(new RegionComparator()));
                    fileHandler.printCovidDataList(covidDataList);
                    break;
                case 6:
                    System.out.println("Menu:\n" +
                            "Tast 1 for at sortere alfabetisk efter region\n" +
                            "Tast 2 for at sortere efter aldersgruppe\n" +
                            "Tast 3 for at sortere alfabetisk efter region først og derefter aldersgruppe \n" +
                            "Tast 4 for at sortere efter aldersgruppe og derefter region\n" +
                            "Tast 5 for at udskrive menuen igen");
                    break;

                case 7:
                    System.out.println("System exit");
                    break;


                default:
                    System.out.println("Ugyldigt valg tast 1-7");
            }

        }

    }
}
