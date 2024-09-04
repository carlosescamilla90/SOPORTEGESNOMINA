import java.util.Date;

import clases.Complement;
import clases.Contrac;
import clases.Deduction;
import clases.Employee;
import clases.Paysheet;
import clases.Perception;
import clases.Position;
import clases.Section;
import clases.Triennium;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto de Employee
        Employee employee = new Employee("12345678", "Pedro", "Garcia", "313893925", "Calle 24 #23-45", "9016433545");
        
        //Crear un objeto de Position
        Position position = new Position("Gerente", new Date(), null, 5000f);
        employee.getListPosition().add(position);

        //Crear un objeto de Triennium
        Triennium triennium = new Triennium(new Date(), 150f, "A");

        //Crear un objeto de Complemento
        Complement complement = new Complement("Zona Roja", 200f, "Zona");

        //Crear un objeto de Contrac y asociar Triennium y Complement
        Contrac contrac = new Contrac(new Date(), null, "A", "Oficina Central", 3000f, employee, null, null);
        contrac.getListTriennium().add(triennium);
        contrac.getListComplement().add(complement);
        employee.getlistContrac().add(contrac);

        //Crear un objeto de Percepcion
        Perception perception = new Perception("Salario Base", 3000f);

        //Crear un objeto de Tramo para Deduction
        Section section = new Section(0f, 45000f, 24f);
        
        //Crear un objeto de Deduction y asociar Sections
        Deduction deduction = new Deduction("IRPF", null, null);
        deduction.getSectionsList().add(section);

        //Crear un objeto de Paysheet y asociar Perception y Deduction
        Paysheet paysheet = new Paysheet(new Date(), 3500f, 2800f, null, null);
        paysheet.getListPerception().add(perception);
        paysheet.getListDeduction().add(deduction);
        employee.getListPaysheet().add(paysheet);

        //Ejemplo de acceso a los datos creados
        System.out.println("Employee: " +employee.getName() +" "+employee.getLastName());
        System.out.println("Position: " + position.getnamePosition());
        System.out.println("Contract Base Salary: "+contrac.getBaseSalary());
        System.out.println("Perception in the Paysheet: "+perception.getDescription()+ " - Amount: "+perception.getAmount());
    }
}
