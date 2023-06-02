/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ambulance.service.system;

/**
 *
 * @author It Zone
 */
public class Emergency_CallData {
    
    
    private String Patient_Name;
    private String Phone_No;
    private String Location;
    private String Condition;

public Emergency_CallData(String Patient_Name, String Phone_No,  String Location, String Condition){
        this.Patient_Name = Patient_Name;
        this.Phone_No = Phone_No;
        this.Location = Location;
        this.Condition = Condition;
}
public String getPatient_Name()
    {
      return Patient_Name;   
    }
public String getPhone_No()
    {
      return Phone_No;   
    }
public String getLocation()
    {
      return Location;   
    } 
public String getCondition()
    {
      return Condition;   
    }
}
