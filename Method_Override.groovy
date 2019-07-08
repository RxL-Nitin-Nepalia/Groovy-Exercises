class Person{
String Name
Integer Age
String Gender
String Address
Integer empid
String company
Integer salary
}

Person p = new Person()

p.setName("Nitin")
p.setAge(21)
p.setGender("Male")
p.setAddress("New Delhi")
p.empid = 22
p.company = "Rxlogix"
p.salary = 1000000

def toString = {para -> println "$para.Name is a $para.Age years old $para.Gender who lives in $para.Address. He works for $para.company with employee id $para.empid and earns $para.salary"}

toString(p)