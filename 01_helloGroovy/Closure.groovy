def aClosure={
	int a,int b->
	a+b
}

println aClosure(1,2)
println aClosure.call(1,2)

def aa={
	println "this is a Closure"
}

aa()

def sayHello={"hello ${it}"}

println sayHello("Jim")

def sayHello1={it->"hello ${it}"}
println sayHello1("Jim")

def noParams={->println "noParams"}

noParams();
// noParams(1)

def bClosure={
	 a,b->
	a+b
}

println bClosure(1,2)