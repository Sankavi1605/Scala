object ex4{
    val coverPrice=24.95
    val discount=0.4
    def calDiscount(price:Double,discount:Double):Double={
    price*(1-discount)
    
    }
    def calshippingCost(copies:Int):Double={
        if(copies<=50){
            3.00
        }
        else{
            3+(copies-50)*0.75
        }
    }
    def totalCost(copies:Int):Double={
        copies*calDiscount(coverPrice,discount)+ calshippingCost(copies)
    }
   def main(args:Array[String]):Unit={
   println(totalCost(60)) 
   }
}

