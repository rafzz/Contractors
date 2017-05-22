package main;

/**
*
* @author Rafzz
*/
public class Contractor  {
   
   private String companyName;
   private String agentFirstName;
   private String agentLastName;
   
   public Contractor(String companyName, String agentFirstName, String agentLastName) {
       this.companyName = companyName;
       this.agentFirstName = agentFirstName;
       this.agentLastName = agentLastName;
   }

   public String getCompanyName() {
       return companyName;
   }

   public void setCompanyName(String companyName) {
       this.companyName = companyName;
   }

   public String getAgentFirstName() {
       return agentFirstName;
   }

   public void setAgentFirstName(String agentFirstName) {
       this.agentFirstName = agentFirstName;
   }

   public String getAgentLastName() {
       return agentLastName;
   }

   public void setAgentLastName(String agentLastName) {
       this.agentLastName = agentLastName;
   }

   @Override
   public String toString() {
       return "Company Name: " + companyName + ", Agent: " + agentFirstName +" "+ agentLastName ;
   }
   
   
   
   

   
}
