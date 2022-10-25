package utils;

import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

@NoArgsConstructor
public class ParserXLSX {

    private XSSFWorkbook workbook;
    private String out;
    private XSSFSheet sheet;


    private void init() {
        workbook = new XSSFWorkbook();
        this.out = "src/main/resources/xlsx-exported/Exported_Logs.xlsx";
    }


    public void parseAllExistingLogs() {
        init();
        int rowCount = 1;
        int columnCount = 0;
        Row row = null;
        Cell cell = null;
        // iterating over files in dir output-functions
        File dir = new File("src/main/resources/output-functions");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                sheet = workbook.createSheet(child.getName().substring(0, child.getName().length()-4));


                rowCount=1;
                columnCount = 0;
                try (BufferedReader br = new BufferedReader(new FileReader(child))) {
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        if (columnCount == 0) {
                            row = sheet.createRow(rowCount);
                        }


                        if (line.length() > 32766) {
                            cell = row.createCell(columnCount);
                            cell.setCellValue(line.substring(0, 32766));
                        } else {
                            cell = row.createCell(columnCount);
                            cell.setCellValue(line);
                        }


                        rowCount++;
                        columnCount++;
                        if (columnCount == 2) {
                            columnCount = 0;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }
        try (FileOutputStream outputStream = new FileOutputStream(this.out)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
