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


println p.@Name+"\n"+p.@Age+"\n"+p.@Gender+"\n"+p.@Address+"\n"+p.@empid+"\n"+p.@company+"\n"+p.@salary