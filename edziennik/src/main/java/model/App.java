package model;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;






public class App {
    public static void main( String[] args ){
    	
    	 
    	String csvFile = "/media/ko/Dane/Projekty/e-dziennik/edziennik/resources/MOCK_DATA.csv";
    	
   //      CSVReader reader = null;
         try {
        	 
             List<Person> people = new CsvToBeanBuilder(new FileReader(csvFile)).withType(Person.class).build().parse();
             
             for (Person person : people) {
            	 System.out.println(person.getFirstName());
             }
             
             
             
//             
//             CSVReader reader = new CSVReader(new FileReader(csvFile));
//             
//             
//             String[] line;
//    
             
             
//             
//             
//             while ((line = reader.readNext()) != null) {
//                 System.out.println("Person [id= " + line[0] + ", name= " + line[1] + ", lastName= " + line[2] + ", email= "  + line[3] + 
//                		 ", gender= " + line[4] + ", birthDate= " + line[5] + "]");
//                 
//                 Date date = new Date();
//                 System.out.println(line[5].toString());
//                   
//                 SimpleDateFormat birthDate = new SimpleDateFormat("E yyyy/mm/dd");
//          //       System.out.println(birthDate.format(date));
//                 
//           
//             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         
         

     }

}











// TODO INNY SPOSÓB WYDRUK

//private	static final String csvFile = "/Users/User/Desktop/MOCK_DATA.csv";
//
////      CSVReader reader = null;
// 	 public static void main(String[] args) throws IOException {
// 	        try (
// 	            Reader reader = Files.newBufferedReader(Paths.get(csvFile));
// 	            CSVReader csvReader = new CSVReader(reader);
// 	        ) {
// 	        	List<String[]> records = csvReader.readAll();
// 	        	for (String[] record : records) {
// 	        		System.out.println("id : " + record[0]);
// 	        		System.out.println("name : " + record[1]);
// 	        	    System.out.println("lastName : " + record[2]);
// 	        	    System.out.println("email : " + record[3]);
// 	        	    System.out.println("gender : " + record[4]);
// 	        	    System.out.println("birthDate : " + record[5]);
// 	        	    System.out.println("---------------------------");
//    
//    	
