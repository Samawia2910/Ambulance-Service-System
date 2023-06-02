package ambulance.service.system;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Altaf Hussain
 */
public class EmployeeData {
    
    private String Name;
    private String Shift;
    private String Age;
    private String CNIC;
    private String Dsg;
    private String PhoneNo;
    private String Gender;
    
    
    public EmployeeData(String Name, String Shift,  String Age,String CNIC,String Dsg,String PhoneNo, String Gender){
        this.Name = Name;
        this.Shift = Shift;
        this.Age = Age;
        this.CNIC = CNIC;
        this.Dsg = Dsg;
        this.PhoneNo = PhoneNo;
        this.Gender = Gender;
        
    }
    
    public String getEMPName()
    {
      return Name;   
    }
    
    public String getEMPShift()
    {
      return Shift;   
    }
      
    public String getEMPAge()
    {
      return Age;   
    }
       
    public String getEMPCnic()
    {
      return CNIC;   
    }
       
    public String getEMPDsg()
    {
      return Dsg;   
    }
    
    public String getEMPPhoneNo()
    {
      return PhoneNo;   
    }
    
     public String getEMPGender()
    {
      return Gender;   
    }
}
