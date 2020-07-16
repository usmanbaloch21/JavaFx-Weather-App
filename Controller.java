package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private TableView<Weather> tableView;

    @FXML
    private TableColumn<Weather, String> stationCol;

    @FXML
    private TableColumn<Weather,Float> tmaxCol;

    @FXML
    private TableColumn<Weather, Float> tminCol;

    @FXML
    private TableColumn<Weather, Integer> afCol;

    @FXML
    private TableColumn<Weather,Float> rainCol;
    @FXML
    private Button reportBtn;

  

    
    ObservableList<Weather> weatherOl = FXCollections.observableArrayList();
    List<String> csvFileList = new ArrayList<String>();
    
    @FXML
    void generateReport(ActionEvent event) throws FileNotFoundException, UnsupportedEncodingException {

	PrintWriter writer = new PrintWriter("report.txt", "UTF-8");
	int sequence=1;
	
	float rain11=0,rain12=0,rain13=0,rain14=0,rain15=0,rain16=0,rain17=0,rain18=0,rain19=0;
        int af11=0,af12=0,af13=0,af14=0,af15=0,af16=0,af17=0,af18=0,af19=0;
	    
	List<Float> tmaxList11 = new ArrayList<Float>();
        List<Float> tminList11 = new ArrayList<Float>();
        List<Float> tmaxList12 = new ArrayList<Float>();
        List<Float> tminList12 = new ArrayList<Float>();
        List<Float> tmaxList13 = new ArrayList<Float>();
        List<Float> tminList13 = new ArrayList<Float>();
        List<Float> tmaxList14 = new ArrayList<Float>();
        List<Float> tminList14 = new ArrayList<Float>();
        List<Float> tmaxList15 = new ArrayList<Float>();
        List<Float> tminList15 = new ArrayList<Float>();
        List<Float> tmaxList16 = new ArrayList<Float>();
        List<Float> tminList16 = new ArrayList<Float>();
        List<Float> tmaxList17 = new ArrayList<Float>();
        List<Float> tminList17 = new ArrayList<Float>();
        List<Float> tmaxList18 = new ArrayList<Float>();
        List<Float> tminList18 = new ArrayList<Float>();
        List<Float> tmaxList19 = new ArrayList<Float>();
        List<Float> tminList19 = new ArrayList<Float>();
        
	csvFileList.add("Aberporth.csv");
	csvFileList.add("Armagh.csv");
	csvFileList.add("Ballypatrick Forest.csv");
	csvFileList.add("Bradford.csv");
	csvFileList.add("Braemar.csv");
	csvFileList.add("Camborne.csv");
	csvFileList.add("Cambridge NIAB.csv");
	csvFileList.add("Cardiff Bute Park.csv");
	csvFileList.add("Chivenor.csv");
	csvFileList.add("Cwmystwyth.csv");
	csvFileList.add("Dunstaffnage.csv");
	csvFileList.add("Durham.csv");
	csvFileList.add("Eastbourne.csv");
	csvFileList.add("Eskdalemuir.csv");
	csvFileList.add("Heathrow.csv");
	csvFileList.add("Hurn.csv");
	csvFileList.add("Lerwick.csv");
	csvFileList.add("Leuchars.csv");
	csvFileList.add("Lowestoft.csv");
	csvFileList.add("Manston.csv");
	csvFileList.add("Nairn.csv");
	csvFileList.add("Newton Rigg.csv");
	csvFileList.add("Oxford.csv");
	csvFileList.add("Paisley.csv");
	csvFileList.add("Ringway.csv");
	csvFileList.add("Ross-on-Wye.csv");
	csvFileList.add("Shawbury.csv");
	csvFileList.add("Sheffield.csv");
	csvFileList.add("Southampton.csv");
	csvFileList.add("Stornoway Airport.csv");
	csvFileList.add("Sutton Bonington.csv");
	csvFileList.add("Tiree.csv");
	csvFileList.add("Valley.csv");
	csvFileList.add("Waddington.csv");
	csvFileList.add("Whitby.csv");
	csvFileList.add("Wick Airport.csv");
	csvFileList.add("Yeovilton.csv");

	for(int d=0 ; d<csvFileList.size();d++){
	
	 String csvFile = "C:\\Users\\usman\\Desktop\\[C1971213]\\src\\res\\"+csvFileList.get(d);
	        String line = "";
	        String cvsSplitBy = ",";

	        List<Weather> weatherList = new ArrayList<Weather>();
	        String[] country = null;
	       
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                 country = line.split(cvsSplitBy);
	                
	                Weather weather = new Weather("", Integer.parseInt(country[0]), Integer.parseInt(country[1]), Float.parseFloat(country[2]), Float.parseFloat(country[3]), Integer.parseInt(country[4]),Float.parseFloat(country[5]));
	                weatherList.add(weather);

	            }
	            
	            for(int i= 0 ;i<weatherList.size();i++){
	        	
	        	if(weatherList.get(i).getYear()==2011){
	        	    
	        	   tmaxList11.add(weatherList.get(i).getTmax());
	        	   tminList11.add(weatherList.get(i).getTmin());
	        	   af11 = af11 +weatherList.get(i).getAf();
	        	   rain11 = rain11 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2012){
	        	    
	        	   tmaxList12.add(weatherList.get(i).getTmax());
	        	   tminList12.add(weatherList.get(i).getTmin());
	        	   af12 = af12 +weatherList.get(i).getAf();
	        	   rain12 = rain12 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2013){
	        	    
	        	   tmaxList13.add(weatherList.get(i).getTmax());
	        	   tminList13.add(weatherList.get(i).getTmin());
	        	   af13 = af13 +weatherList.get(i).getAf();
	        	   rain13 = rain13 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2014){
	        	    
	        	   tmaxList14.add(weatherList.get(i).getTmax());
	        	   tminList14.add(weatherList.get(i).getTmin());
	        	   af14 = af14 +weatherList.get(i).getAf();
	        	   rain14 = rain14 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2015){
	        	    
	        	   tmaxList15.add(weatherList.get(i).getTmax());
	        	   tminList15.add(weatherList.get(i).getTmin());
	        	   af15 = af15 +weatherList.get(i).getAf();
	        	   rain15 = rain15 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2016){
	        	    
	        	   tmaxList16.add(weatherList.get(i).getTmax());
	        	   tminList16.add(weatherList.get(i).getTmin());
	        	   af16 = af16 +weatherList.get(i).getAf();
	        	   rain16 = rain16 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2017){
	        	    
	        	   tmaxList17.add(weatherList.get(i).getTmax());
	        	   tminList17.add(weatherList.get(i).getTmin());
	        	   af17 = af17 +weatherList.get(i).getAf();
	        	   rain17 = rain17 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2018){
	        	    
	        	   tmaxList18.add(weatherList.get(i).getTmax());
	        	   tminList18.add(weatherList.get(i).getTmin());
	        	   af18 = af18 +weatherList.get(i).getAf();
	        	   rain18 = rain18 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2019){
	        	    
	        	   tmaxList19.add(weatherList.get(i).getTmax());
	        	   tminList19.add(weatherList.get(i).getTmin());
	        	   af19 = af19 +weatherList.get(i).getAf();
	        	   rain19 = rain19 + weatherList.get(i).getRain();
	        	    
	        	}
	        	
	            }   
	           
	         
	                Weather weather = new Weather();
	                
	                weather.setStationName(csvFileList.get(d));
	               
	                writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList11));
	        	writer.println("Lowest: " + min(tminList11) );
	        	writer.println("Average annual af: " + af11);
	        	writer.println("Average annual rainfall: " + rain11);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList12));
	        	writer.println("Lowest: " + min(tminList12) );
	        	writer.println("Average annual af: " + af12);
	        	writer.println("Average annual rainfall: " + rain12);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList13));
	        	writer.println("Lowest: " + min(tminList13) );
	        	writer.println("Average annual af: " + af13);
	        	writer.println("Average annual rainfall: " + rain13);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList13));
	        	writer.println("Lowest: " + min(tminList13) );
	        	writer.println("Average annual af: " + af13);
	        	writer.println("Average annual rainfall: " + rain13);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList14));
	        	writer.println("Lowest: " + min(tminList14) );
	        	writer.println("Average annual af: " + af14);
	        	writer.println("Average annual rainfall: " + rain14);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList15));
	        	writer.println("Lowest: " + min(tminList15) );
	        	writer.println("Average annual af: " + af15);
	        	writer.println("Average annual rainfall: " + rain15);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList16));
	        	writer.println("Lowest: " + min(tminList16) );
	        	writer.println("Average annual af: " + af16);
	        	writer.println("Average annual rainfall: " + rain16);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList17));
	        	writer.println("Lowest: " + min(tminList17) );
	        	writer.println("Average annual af: " + af17);
	        	writer.println("Average annual rainfall: " + rain17);
	        	
	        	writer.println("Number: " + sequence);
	        	writer.println("Station: "+csvFileList.get(d));
		        writer.println("Highest: " + max(tmaxList18));
	        	writer.println("Lowest: " + min(tminList18) );
	        	writer.println("Average annual af: " + af19);
	        	writer.println("Average annual rainfall: " + rain19);
	        	sequence++;
	        	
	        	
	        	
	        	
	        	

	        } catch (IOException e) {
	            e.printStackTrace();

	        }
	        
	    
	       
	       
	}
	
		writer.close();
	        
	        Alert a = new Alert(AlertType.CONFIRMATION);
	        a.setContentText("Report Generated Successfully!");
	        a.show();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
	stationCol.setCellValueFactory(new PropertyValueFactory<>("stationName"));
	tmaxCol.setCellValueFactory(new PropertyValueFactory<>("tmax"));
	tminCol.setCellValueFactory(new PropertyValueFactory<>("tmin"));
	afCol.setCellValueFactory(new PropertyValueFactory<>("af"));
	rainCol.setCellValueFactory(new PropertyValueFactory<>("rain"));

	
	
	csvFileList.add("Aberporth.csv");
	csvFileList.add("Armagh.csv");
	csvFileList.add("Ballypatrick Forest.csv");
	csvFileList.add("Bradford.csv");
	csvFileList.add("Braemar.csv");
	csvFileList.add("Camborne.csv");
	csvFileList.add("Cambridge NIAB.csv");
	csvFileList.add("Cardiff Bute Park.csv");
	csvFileList.add("Chivenor.csv");
	csvFileList.add("Cwmystwyth.csv");
	csvFileList.add("Dunstaffnage.csv");
	csvFileList.add("Durham.csv");
	csvFileList.add("Eastbourne.csv");
	csvFileList.add("Eskdalemuir.csv");
	csvFileList.add("Heathrow.csv");
	csvFileList.add("Hurn.csv");
	csvFileList.add("Lerwick.csv");
	csvFileList.add("Leuchars.csv");
	csvFileList.add("Lowestoft.csv");
	csvFileList.add("Manston.csv");
	csvFileList.add("Nairn.csv");
	csvFileList.add("Newton Rigg.csv");
	csvFileList.add("Oxford.csv");
	csvFileList.add("Paisley.csv");
	csvFileList.add("Ringway.csv");
	csvFileList.add("Ross-on-Wye.csv");
	csvFileList.add("Shawbury.csv");
	csvFileList.add("Sheffield.csv");
	csvFileList.add("Southampton.csv");
	csvFileList.add("Stornoway Airport.csv");
	csvFileList.add("Sutton Bonington.csv");
	csvFileList.add("Tiree.csv");
	csvFileList.add("Valley.csv");
	csvFileList.add("Waddington.csv");
	csvFileList.add("Whitby.csv");
	csvFileList.add("Wick Airport.csv");
	csvFileList.add("Yeovilton.csv");

	for(int d=0 ; d<csvFileList.size();d++){
	
	 String csvFile = "C:\\Users\\usman\\Desktop\\[C1971213]\\src\\res\\"+csvFileList.get(d);
	        String line = "";
	        String cvsSplitBy = ",";

	        List<Weather> weatherList = new ArrayList<Weather>();
	        String[] country = null;
	       
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                 country = line.split(cvsSplitBy);
	                
	                Weather weather = new Weather("", Integer.parseInt(country[0]), Integer.parseInt(country[1]), Float.parseFloat(country[2]), Float.parseFloat(country[3]), Integer.parseInt(country[4]),Float.parseFloat(country[5]));
	                weatherList.add(weather);

	            }
	            
	            
	            List<Float> tmaxList = new ArrayList<Float>();
	            List<Float> tminList = new ArrayList<Float>();
	            
	            float rain=0;
	            int af=0;
	            
	            for(int i= 0 ;i<weatherList.size();i++){
	        	
	        	if(weatherList.get(i).getYear()==2019){
	        	    
	        	    
	        	   tmaxList.add(weatherList.get(i).getTmax());
	        	   tminList.add(weatherList.get(i).getTmin());
	        	   af = af +weatherList.get(i).getAf();
	        	   rain = rain + weatherList.get(i).getRain();
	        	    
	        	}
	        	
	            }
	            
	            float tmax=0,tmin=0;
	            
	            if(tminList.size()>0){
	        	tmin = tminList.get(0);
	            }else{
	        	tmin=0;
	            }
	             //tmax = Collections.max(tmaxList);
	             //tmin = Collections.min(tminList);

	            for(int f=0;f<tmaxList.size();f++){
	        	
	        	if(tmaxList.get(f)>tmax){
	        	    tmax = tmaxList.get(f);
	        	}
	            }
	            
	           
	            for(int f=1;f<tminList.size();f++){
	        	
	        	if(tminList.get(f)<tmin){
	        	    tmin = tminList.get(f);
	        	}
	            }
	                Weather weather = new Weather();
	                
	                weather.setStationName(csvFileList.get(d));
	                weather.setTmax(tmax);
	                weather.setTmin(tmin);
	        	weather.setRain(rain);
	        	weather.setAf(af);
	        	
	        	
	        	weatherOl.add(weather);
	        	tableView.setItems(weatherOl);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
    }

	
	tableView.setOnMouseClicked(e->{
	    Stage stage = new Stage();
	    
	    List<Weather> weatherList = new ArrayList<Weather>();
	   
	    float rain11=0,rain12=0,rain13=0,rain14=0,rain15=0,rain16=0,rain17=0,rain18=0,rain19=0;
            int af11=0,af12=0,af13=0,af14=0,af15=0,af16=0,af17=0,af18=0,af19=0;
	    
	    List<Float> tmaxList11 = new ArrayList<Float>();
            List<Float> tminList11 = new ArrayList<Float>();
            List<Float> tmaxList12 = new ArrayList<Float>();
            List<Float> tminList12 = new ArrayList<Float>();
            List<Float> tmaxList13 = new ArrayList<Float>();
            List<Float> tminList13 = new ArrayList<Float>();
            List<Float> tmaxList14 = new ArrayList<Float>();
            List<Float> tminList14 = new ArrayList<Float>();
            List<Float> tmaxList15 = new ArrayList<Float>();
            List<Float> tminList15 = new ArrayList<Float>();
            List<Float> tmaxList16 = new ArrayList<Float>();
            List<Float> tminList16 = new ArrayList<Float>();
            List<Float> tmaxList17 = new ArrayList<Float>();
            List<Float> tminList17 = new ArrayList<Float>();
            List<Float> tmaxList18 = new ArrayList<Float>();
            List<Float> tminList18 = new ArrayList<Float>();
            List<Float> tmaxList19 = new ArrayList<Float>();
            List<Float> tminList19 = new ArrayList<Float>();
            
	    String csvFile = "C:\\Users\\usman\\Desktop\\[C1971213]\\src\\res\\"+tableView.getSelectionModel().getSelectedItem().getStationName();
	        String line = "";
	        String cvsSplitBy = ",";

	      
	        String[] country = null;
	       
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                 country = line.split(cvsSplitBy);
	                
	                Weather weather = new Weather(tableView.getSelectionModel().getSelectedItem().getStationName(), Integer.parseInt(country[0]), Integer.parseInt(country[1]), Float.parseFloat(country[2]), Float.parseFloat(country[3]), Integer.parseInt(country[4]),Float.parseFloat(country[5]));
	                weatherList.add(weather);

	            }
	            
	            for(int i= 0 ;i<weatherList.size();i++){
	        	
	        	if(weatherList.get(i).getYear()==2011){
	        	    
	        	   tmaxList11.add(weatherList.get(i).getTmax());
	        	   tminList11.add(weatherList.get(i).getTmin());
	        	   af11 = af11 +weatherList.get(i).getAf();
	        	   rain11 = rain11 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2012){
	        	    
	        	   tmaxList12.add(weatherList.get(i).getTmax());
	        	   tminList12.add(weatherList.get(i).getTmin());
	        	   af12 = af12 +weatherList.get(i).getAf();
	        	   rain12 = rain12 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2013){
	        	    
	        	   tmaxList13.add(weatherList.get(i).getTmax());
	        	   tminList13.add(weatherList.get(i).getTmin());
	        	   af13 = af13 +weatherList.get(i).getAf();
	        	   rain13 = rain13 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2014){
	        	    
	        	   tmaxList14.add(weatherList.get(i).getTmax());
	        	   tminList14.add(weatherList.get(i).getTmin());
	        	   af14 = af14 +weatherList.get(i).getAf();
	        	   rain14 = rain14 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2015){
	        	    
	        	   tmaxList15.add(weatherList.get(i).getTmax());
	        	   tminList15.add(weatherList.get(i).getTmin());
	        	   af15 = af15 +weatherList.get(i).getAf();
	        	   rain15 = rain15 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2016){
	        	    
	        	   tmaxList16.add(weatherList.get(i).getTmax());
	        	   tminList16.add(weatherList.get(i).getTmin());
	        	   af16 = af16 +weatherList.get(i).getAf();
	        	   rain16 = rain16 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2017){
	        	    
	        	   tmaxList17.add(weatherList.get(i).getTmax());
	        	   tminList17.add(weatherList.get(i).getTmin());
	        	   af17 = af17 +weatherList.get(i).getAf();
	        	   rain17 = rain17 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2018){
	        	    
	        	   tmaxList18.add(weatherList.get(i).getTmax());
	        	   tminList18.add(weatherList.get(i).getTmin());
	        	   af18 = af18 +weatherList.get(i).getAf();
	        	   rain18 = rain18 + weatherList.get(i).getRain();
	        	    
	        	}
	        	if(weatherList.get(i).getYear()==2019){
	        	    
	        	   tmaxList19.add(weatherList.get(i).getTmax());
	        	   tminList19.add(weatherList.get(i).getTmin());
	        	   af19 = af19 +weatherList.get(i).getAf();
	        	   rain19 = rain19 + weatherList.get(i).getRain();
	        	    
	        	}
	        	
	            }
	             
	    		      

	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	
	    
		
        	ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
    		    
    		         new PieChart.Data("2011", max(tmaxList11)),
    		         new PieChart.Data("2012", max(tmaxList12)),
    		         new PieChart.Data("2013", max(tmaxList13)),
    		         new PieChart.Data("2014", max(tmaxList14)),
    		         new PieChart.Data("2015", max(tmaxList15)),
    		         new PieChart.Data("2016", max(tmaxList16)),
    		         new PieChart.Data("2017", max(tmaxList17)),
    		         new PieChart.Data("2018", max(tmaxList18)),
    		         new PieChart.Data("2019", max(tmaxList19))
    		         
        		
        		);
        		 
    		       
    		      //Creating a Pie chart 
    		      PieChart pieChart = new PieChart(pieChartData); 
    		              
    		      //Setting the title of the Pie chart 
    		      pieChart.setTitle("Highest monthly mean maximum temperature (tmax)"); 
    		       
    		      //setting the direction to arrange the data 
    		      pieChart.setClockwise(true); 
    		       
    		      //Setting the length of the label line 
    		      pieChart.setLabelLineLength(50); 

    		      //Setting the labels of the pie chart visible  
    		      pieChart.setLabelsVisible(true); 
    		       
    		      //Setting the start angle of the pie chart  
    		      pieChart.setStartAngle(180);     
    		      
    		      
    		      ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(

    			 new PieChart.Data("2011", min(tminList11)),
     		         new PieChart.Data("2012", min(tminList12)),
     		         new PieChart.Data("2013", min(tminList13)),
     		         new PieChart.Data("2014", min(tminList14)),
     		         new PieChart.Data("2015", min(tminList15)),
     		         new PieChart.Data("2016", min(tminList16)),
     		         new PieChart.Data("2017", min(tminList17)),
     		         new PieChart.Data("2018", min(tminList18)),
     		         new PieChart.Data("2019", min(tminList19))
     		         
    			      
    			      ); 
    			       
    			      //Creating a Pie chart 
    			      PieChart pieChart1 = new PieChart(pieChartData1); 
    			              
    			      //Setting the title of the Pie chart 
    			      pieChart1.setTitle("Lowest monthly mean minimum temperature (tmin)"); 
    			       
    			      //setting the direction to arrange the data 
    			      pieChart1.setClockwise(true); 
    			       
    			      //Setting the length of the label line 
    			      pieChart1.setLabelLineLength(50); 

    			      //Setting the labels of the pie chart visible  
    			      pieChart1.setLabelsVisible(true); 
    			       
    			      //Setting the start angle of the pie chart  
    			      pieChart1.setStartAngle(180);
    			      
    			      
    			      ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(

    		    			 new PieChart.Data("2011", rain11),
    		     		         new PieChart.Data("2012", rain12),
    		     		         new PieChart.Data("2013", rain13),
    		     		         new PieChart.Data("2014", rain14),
    		     		         new PieChart.Data("2015", rain15),
    		     		         new PieChart.Data("2016", rain16),
    		     		         new PieChart.Data("2017", rain17),
    		     		         new PieChart.Data("2018", rain18),
    		     		         new PieChart.Data("2019", rain19)  
    		    			    
    		    			      ); 
    		    			       
    		    			      //Creating a Pie chart 
    		    			      PieChart pieChart2 = new PieChart(pieChartData2); 
    		    			              
    		    			      //Setting the title of the Pie chart 
    		    			      pieChart2.setTitle("Total rainfall"); 
    		    			       
    		    			      //setting the direction to arrange the data 
    		    			      pieChart2.setClockwise(true); 
    		    			       
    		    			      //Setting the length of the label line 
    		    			      pieChart2.setLabelLineLength(50); 

    		    			      //Setting the labels of the pie chart visible  
    		    			      pieChart2.setLabelsVisible(true); 
    		    			       
    		    			      //Setting the start angle of the pie chart  
    		    			      pieChart2.setStartAngle(180);
    		    			      
    		    			      
    		    			  ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(

    	    		    			 new PieChart.Data("2011", af11),
    	    		     		         new PieChart.Data("2012", af12),
    	    		     		         new PieChart.Data("2013", af13),
    	    		     		         new PieChart.Data("2014", af14),
    	    		     		         new PieChart.Data("2015", af15),
    	    		     		         new PieChart.Data("2016", af16),
    	    		     		         new PieChart.Data("2017", af17),
    	    		     		         new PieChart.Data("2018", af18),
    	    		     		         new PieChart.Data("2019", af19)  
    	    		    			    
    	    		    			      ); 
    	    		    			       
    	    		    			      //Creating a Pie chart 
    	    		    			      PieChart pieChart3 = new PieChart(pieChartData3); 
    	    		    			              
    	    		    			      //Setting the title of the Pie chart 
    	    		    			      pieChart3.setTitle("Total air frost days"); 
    	    		    			       
    	    		    			      //setting the direction to arrange the data 
    	    		    			      pieChart3.setClockwise(true); 
    	    		    			       
    	    		    			      //Setting the length of the label line 
    	    		    			      pieChart3.setLabelLineLength(50); 

    	    		    			      //Setting the labels of the pie chart visible  
    	    		    			      pieChart3.setLabelsVisible(true); 
    	    		    			       
    	    		    			      //Setting the start angle of the pie chart  
    	    		    			      pieChart3.setStartAngle(180);
    			      
    			      
    			  HBox hbox1 = new HBox(pieChart,pieChart1);
    			  HBox hbox2 = new HBox(pieChart2,pieChart3);

    			  VBox root = new VBox(hbox1,hbox2);
    		      //Creating a scene object 
    		      Scene scene = new Scene(root, 900, 600);  
    		      
    		      //Setting title to the Stage 
    		      stage.setTitle("Pie chart"); 
    		         
    		      //Adding scene to the stage 
    		      stage.setScene(scene); 
    		         
    		      //Displaying the contents of the stage 
    		      stage.show();         
    	});
		         
		     
    }
    
    
     //tmax = Collections.max(tmaxList);
     //tmin = Collections.min(tminList);

   
    

public static Float min(List<Float> tminList){
	float tmin=0;
	 if(tminList.size()>0){
		tmin = tminList.get(0);
	    }else{
		tmin=0;
	    }
	return  tmin;
}


public static Float max(List<Float> tmaxList){
	
	float tmax=0;
	
	 for(int f=0;f<tmaxList.size();f++){
		
		if(tmaxList.get(f)>tmax){
		    tmax = tmaxList.get(f);
		}
		
	
	
}
	 return tmax;
}
}
