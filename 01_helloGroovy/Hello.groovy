class HelloWorld{
	String msg='hello world'
    
    HelloWorld(){
		
	}

	HelloWorld(String msg){
		this.msg=msg
	}

	void sayHello(){
		println msg
	}
}

int increment(Closure closure,int count){
	closure()+count
}

def say={
	new HelloWorld('hello').sayHello()
}

def getMsg={
	new HelloWorld().msg
}

say()
println getMsg()

assert increment({1+1},1)==3


class Child {
   private String name
}

class Parent {
   Child child = new Child();

   void configChild(Closure c) {
      c.delegate = child
      c.setResolveStrategy Closure.DELEGATE_FIRST
      c()
   }
}

def parent = new Parent()
parent.configChild {
name = "child name"
}

println parent.child.name

class Test {
    def x = 30
    def y = 40

    def run() {
        def data = [ x: 10, y: 20 ]
        def cl = { 
         	y = x + y 
        }
        cl.delegate = data
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
        assert x == 30
        assert y == 40
        assert data == [x:10, y:30]
    }
}

new Test().run()