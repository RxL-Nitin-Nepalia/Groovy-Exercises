def l = 1..10
println l
def y = []
l.each{y<<it}
y.each{el -> if(el%2 == 0){
println el}
}
