/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.service.system;

/**
 *
 * @author uswa nasir
 */
public class Ambulance_service {
    private String Patient_Name;
    private String Model_No;
    private String EMP_Name;
    
    
    public Ambulance_service( String Patient_Name, String Model_No, String EMP_Name)
    {    
        this.Patient_Name = Patient_Name;
        this.Model_No = Model_No;
        this.EMP_Name = EMP_Name;
    }
    
     public String getPatientName()
    {
      return Patient_Name;   
    }
    
    public String getModelNo()
    {
      return Model_No;   
    }
    
    public String getEmployeeName()
    {
      return EMP_Name;   
    }
}
