import kotlin.properties.Delegates

fun main(args: Array<String>) {
	var n:Int by Delegates.vetoable(20){property,oldValue,newValue->
		println("Old Value: $oldValue")
		println("New Value: $newValue")
		newValue>=20
	}
	
	println("Current Value : $n\n")
	
	println("On value Change")
	n=8
	
	println("Current Value : $n\n")
	
	println("On again value Change")
	n=98
	println("Current Value : $n\n")
	
	//Basically this Delegate proptery will only assign value when condition is true else default value or current value will remain as it is
}