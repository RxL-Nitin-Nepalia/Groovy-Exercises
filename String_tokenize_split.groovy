String s = "this string needs to be split"
println s.split(" ")
println s.split(/\s/)

String s1 = "this string needs to be split"
println s1.tokenize(" ")
println s1.tokenize()
println s1.tokenize(/\s/)

String s2 = "are.you.trying.to.split.me.mister?"
println s2.tokenize(".")
println s2.split(".")
