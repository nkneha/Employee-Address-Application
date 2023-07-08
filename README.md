# Employee-Address-Application
## Language and Framwork 

```bash
 Java , SpringBoot , JPA , MYSQL database , Swagger UI
```

## Data Flow

 1. Controller 

```bash
 #Apis for Address (AddressController)
  getAllAddress()
  getAddressByUserid
  addAddress()
  DeleteAddressById()
  UpdateAddress()

 #Apis for Event (EmployeeController)
  addEmployee()
  updateEmployee()
  deleteEmployee()
  getEmployeebyId()
  getAllEmployee()
```
2. Service (StudentSerice.java , EventService.java )

```bash
 #Service for Address (AddressController)
  getAllAddress()
  getAddressByUserid
  addAddress()
  DeleteAddressById()
  UpdateAddress()

 #Service for Event (EmployeeController)
  addEmployee()
  updateEmployee()
  deleteEmployee()
  getEmployeebyId()
  getAllEmployee()
```

3. Model

```bash
 Address()
 Employee()
```
4. Repository

```bash
 IAddressRepo()
 IEmployeeRepo()
```

## Data Structure Used

```bash
 MYSQL as database
```

## Project Summary

Employee Address is a system to handle activities related to Employee and Address and services
 
  #### Features for Employee

- you can Add/Create Employee.
- you can Get all Employee details.
- you can Get specific Employee details by Employee id.
- you can Update specific Employee details/lastName by Employee id.
- you can Delete/Remove specific Employee details/lastName by Employee id.

 #### Features for Address

- you can Add/Create Address.
- you can Get all Address details.
- you can Get specific Address details by Address id.
- you can Update specific Address details by Address id.
- you can Delete/Remove specific Address details by Address id.
