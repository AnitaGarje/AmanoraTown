package cust;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annu
 */
public class Customer {

    public Customer(ResultSet rs) throws SQLException {
        
        this.Id=rs.getInt("Id");
        this.Fname=rs.getString("Fname");
        this.Mname=rs.getString("Mname");
        this.Lname=rs.getString("Lname");
        this.Phone1=rs.getString("Phone1");
        this.Phone2=rs.getString("Phone2");
        this.Email=rs.getString("Email");
        this.Address1=rs.getString("Address1");
        this.Address2=rs.getString("Address2");
        this.Address3=rs.getString("Address3");
        this.Flat=rs.getString("Flat");
        this.Gender=rs.getString("Gender");
        
}

    public Customer() {
    
    }

    @Override
    public String toString() {
        return "Customer{" + "Id=" + Id + ", Fname=" + Fname + ", Mname=" + Mname + ", Lname=" + Lname + ", Email=" + Email + ", Address1=" + Address1 + ", Address2=" + Address2 + ", Address3=" + Address3 + ", Flat=" + Flat + ", Gender=" + Gender + ", Phone1=" + Phone1 + ", Phone2=" + Phone2 + '}';
    }
     public String ToSqlCreate() {
         
        return "INSERT INTO `customer`(`Fname`, `Mname`, `Lname`,`Email`,`Address1`, `Address2`, `Address3`, `Flat`,`Gender`,`Phone1`, `Phone2`) VALUES ( '"+ Fname +"','"+ Mname+"','"+ Lname + "','"+ Email+"','" + Address1+"','" +Address2+"','" +Address3+"','"+ Flat+"','" +Gender+"','"+ Phone1+"','" +Phone2+"' )";
    }
     public String ToSqlDelete()
     {
         return "Delete from `customer` where `Id`="+Id;
     }
     
    public String ToSqlUpdate()
    {
      return "UPDATE `customer` SET `Fname`='"+Fname+"',`Mname`='"+Mname+"',`Lname`='"+Lname+"',`Phone1`='"+Phone1+"',`Phone2`='"+Phone2+"',`Email`='"+Email+"',`Address1`='"+Address1+"',`Address2`='"+Address2+"',`Address3`='"+Address3+"',`Gender`='"+Gender+"',`Flat`='"+Flat+"' WHERE Id="+Id;  
     
    }
 public String getEmailUser()
 {
     for (StringTokenizer stringTokenizer = new StringTokenizer(Email,"@"); stringTokenizer.hasMoreTokens();) {
         String token = stringTokenizer.nextToken();
          return token;
         
     }
    return null;
 }
 public String IsMale()
 {
   if(Gender.equals("M"))
   {
       return "checked";
   }
   return "";
 }
  public String IsFemale()
 {
   if(Gender.equals("F"))
   {
       return "checked";
   }
   return "";
 }
private  int Id;
private String Fname,Mname,Lname,Email,Address1,Address2,Address3,Flat,Gender,Phone1 ,Phone2;

    public int getId() {
        return Id;
    }

    public String getFname() {
        return Fname;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public void setAddress3(String Address3) {
        this.Address3 = Address3;
    }

    public void setFlat(String Flat) {
        this.Flat = Flat;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setPhone1(String Phone1) {
        this.Phone1 = Phone1;
    }

    public void setPhone2(String Phone2) {
        this.Phone2 = Phone2;
    }

    public String getMname() {
        return Mname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getAddress3() {
        return Address3;
    }

    public String getFlat() {
        return Flat;
    }

    public String getGender() {
        return Gender;
    }

    public String getPhone1() {
        return Phone1;
    }

    public String getPhone2() {
        return Phone2;
    }







    
}
