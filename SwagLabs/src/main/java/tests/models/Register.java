package tests.models;
import com.opencsv.bean.CsvBindByName;

public class Register {
    @CsvBindByName(column = "First Name", required = true)
    public String firstName;
    @CsvBindByName(column = "Last Name", required = true)
    public String lastName;
    @CsvBindByName(column = "Address", required = true)
    public String address;
    @CsvBindByName(column = "City", required = true)
    public String city;
    @CsvBindByName(column = "State", required = true)
    public String state;
    @CsvBindByName(column = "Zip Code", required = true)
    public String zipCode;
    @CsvBindByName(column = "Phone #", required = false)
    public String phone;
    @CsvBindByName(column = "SSN", required = true)
    public String ssn;
    @CsvBindByName(column = "Username", required = true)
    public String userame;
    @CsvBindByName(column = "Password", required = true)
    public String password;
    @CsvBindByName(column = "Confirm", required = true)
    public String confirm;
}