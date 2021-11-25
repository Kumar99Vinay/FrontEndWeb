var Shapes = /** @class */ (function () {
    function Shapes(width, height) {
        this.width = width;
        this.height = height;
    }
    Shapes.prototype.printArea = function () {
        console.log("Area: " + this.height * this.width);
    };
    return Shapes;
}());
var area = new Shapes(4, 5);
area.printArea();
area.height = 12;
area.width = 3;
area.printArea();
