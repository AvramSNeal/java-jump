//classes allow us to create 'blueprints' for objects
//in ng 8 we use classes a lot, we use in creating components, services, directives, pipes. etc.
//How to ccreate a class
var Car = /** @class */ (function () {
    function Car(speed) {
        this.speed = speed || 0; //assigning speed to 0 as part of the constructor
    }
    Car.prototype.accelerate = function () {
        this.speed++;
    };
    Car.prototype.throtle = function () {
        this.speed--;
    };
    Car.prototype.getSpeed = function () {
        console.log(this.speed);
    };
    Car.numberWheels = function () {
        return 4;
    };
    return Car;
}());
//creating an object from a class
var car = new Car(5);
car.accelerate();
car.getSpeed();
console.log(Car.numberWheels());
