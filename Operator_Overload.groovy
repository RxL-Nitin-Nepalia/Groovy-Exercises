class HourMinute
{
Integer hour
Integer minute
def plus(HourMinute h1)
{
    def h3 = new HourMinute()
    h3.hour = 0
    h3.minute = 0
    h3.minute = h1.minute + this.minute
    if(h3.minute>=60)
    {
    h3.hour = h3.hour + 1
    h3.minute = h3.minute-60
    }
    h3.hour=h3.hour+h1.hour+this.hour
    if(h3.hour>=12)
    h3.hour = h3.hour - 12
    return h3    
}
}
def h1 = new HourMinute()
h1.hour = 12
h1.minute = 34
def h2 = new HourMinute()
h2.hour = 3
h2.minute = 28
def h4 = h1+h2
println h4