interface Size {
    width : number
    height: number
    printArea(); 
}

class Shapes implements Size {
    width: number;
    height: number;
    constructor (width:number, height:number) {
        this.width = width;
        this.height = height;
    }
    printArea() {
        console.log("Area: "+this.height*this.width);
    }
}

let  area=new Shapes(4,5);
area.printArea();
area.height=12;
area.width=3;
area.printArea();

