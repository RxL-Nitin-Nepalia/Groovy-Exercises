def l = [11,12,1,3,5,6,8]
def l2 = []
for(int i=1;i<l.size();i+=2)
l2.add(l[i])
l.removeAll(l2)
println l