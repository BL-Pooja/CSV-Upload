import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final String CSV_FILE_PATH
            = "/home/pooja/Downloads/getNewLeadUserWithInterval (3).csv";

    public static void main(String[] args) {

        System.out.println("Read All Data at Once and Hide the Header also \n");
        readAllDataAtOnce(CSV_FILE_PATH);
        System.out.println("_______________________________________________");
    }

    public static void readAllDataAtOnce(String file)
    {
        try {

            // Create an object of filereader class
            // with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object
            // and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();

            List<Student> destination = new ArrayList<>(allData.size());

            for (String[] row : allData) {
                for(int i = 0; i < 1 ;i++){
                    destination.add(new Student(row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7],row[8],row[9],row[10],row[11],row[12],row[13],row[14]
                            ,row[15],row[16],row[17]));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
