Map m = ['Computing':['Computing':600,'Information Systems':300],'Engineering':['Civil':200,'Mechanical':100],'Management':['Management':800]]
println "number of departments are "+m.keySet().size()

def l = m.'Computing'.values() as List
println l.sum{it}

println m.'Engineering'.'Civil'