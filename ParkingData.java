/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.service.system;

/**
 *
 * @author Altaf Hussain
 */
public class ParkingData {
    
    private String Model;
    private String ArrTime;
    private String DepTime;
    private String TotalAmb;
            
    public ParkingData(String Model, String ArrTime, String DepTime, String TotalAmb){
        this.Model = Model;
        this.ArrTime = ArrTime;
        this.DepTime = DepTime;
        this.TotalAmb = TotalAmb;   
    }
    
    public String getModel()
    {
      return Model;   
    }
    
    public String getArrTime()
    {
      return ArrTime;   
    }
    
    public String getDepTime()
    {
      return DepTime;   
    }
    
    public String getTotalAmb()
    {
      return TotalAmb;   
    }
}
