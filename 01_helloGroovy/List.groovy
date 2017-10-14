def lists=['groovy','gradle','android']

println lists.size

lists.each{
	list->println list
}


assert lists[0]=='groovy'
lists[100]=100
println lists.size
println lists[99]