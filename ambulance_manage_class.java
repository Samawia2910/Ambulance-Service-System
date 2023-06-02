package ambulance.service.system;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class ambulance_manage_class {
    private String Driver_Name;
    private String Model_No;
    private String AC;
    private String available;
    
    
    public ambulance_manage_class( String Driver_Name, String Model_No, String AC, String available)
    {    
        this.Driver_Name = Driver_Name;
        this.Model_No = Model_No;
        this.AC = AC;
        this.available = available;
    }
    
     public String getDriverName()
    {
      return Driver_Name;   
    }
    
    public String getModelNo()
    {
      return Model_No;   
    }
    
    public String getAC()
    {
      return AC;   
    }
    
    public String getavailable()
    {
      return available;   
    }
}
