String str='hello groovy!'

String getStr(){
	'hello groovy!'
}

String str1='hello'
String str2=' groovy!'
println 'hello groovy!'
println "hello groovy!"
println "$str"
println getStr()
println "${str1+str2}"
println 'hello $str2'

println ''' aa
bb

cc
'''

println ("hello")

// def a = 1, b = 2;
// def str = "hello"
// println a + b
// println str

// a = 1
// b = 2
// str = "hello"
// println a + b
// println str

// def int a = 1
// def int b = 2
// def String str = "hello"
// println a + b
// println str

println getString()

def  getString(){
	return "string"
}