class Employee
{
     _firstName;
     _lastName;
     _employeeId;
     _town
     _email;   
     


    constructor(_firstName,_lastName,_employeeId,_town,_email)
    {
        this._firstName=_firstName;
        this._lastName=_lastName;
        this._employeeId=_employeeId;
        this._town=_town;
        this._email=_email;
        console.log('within parameterized constructor');
    }

      getDetails()
     {
         return 'Employee ID: '+this._employeeId+' First Name: '+this._firstName+' Last Name: '+this._lastName+'Town: '+this._town+ ' Email: '+this._email;
     }

}


let employee1=new Employee('John','Doe',100,'knl','john@email.com');
console.log(employee1.getDetails());
let employee2=new Employee('Marry','Public',200,'vizag','marry@email.com');
console.log(employee2.getDetails());