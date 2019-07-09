Map m = ['Computing':['Computing':600,'Information Systems':300],'Engineering':['Civil':200,'Mechanical':100],'Management':['Management':800]]
List<String> list = []
m.each{key,value->
list.add(key)
value.each{k,v->list.add(k)}}
println "number of departments are "+list.size()
def l = m.'Computing'.values() as List
println l.sum{it}

println m.'Engineering'.'Civil'