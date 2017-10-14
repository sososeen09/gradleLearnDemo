def map=["key1":"hello","key2":"groovy","key3":true]
println map.size()

map.forEach{
	key,value->
	println "$key :$value"
}

println map.'key1'
println map['key1']

map.'key4'='android'
println map['key4']