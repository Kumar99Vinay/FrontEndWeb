class A{
    readonly num1:Number;
    public static readonly country:string="India";
    constructor(){
        this.num1=45;
    }
    test():void{
        console.log("Inside A");
    }
    test1():string{
        return "Test1 A";
    }
}

class B extends A{
    test():string{
return "Inside B Test"; 
   }
    test1():string{
        return "Test1 B";
    }
}
let a = new A();
let b = new B();
console.log(a.test());
console.log(a.test1());
console.log("--------------");

console.log(b.test());
console.log(b.test1());