def l = [1,2,3,4,5,7,8]
def x = {list,a ->
list.any{it==a}
}
println x(l,4)