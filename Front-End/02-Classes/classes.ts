//classes allow us to create 'blueprints' for objects
//in ng 8 we use classes a lot, we use in creating components, services, directives, pipes. etc.

//How to ccreate a class
class Car
{
    engineName: String;
    gears: number;
    private speed: number;

    constructor(speed: number)
    {
        this.speed = speed || 0; //assigning speed to 0 as part of the constructor
    }

    accelerate(): void
    {
        this.speed++;
    }

    throtle(): void
    {
        this.speed--;
    }

    getSpeed(): void
    {
        console.log(this.speed);
    }

    static numberWheels(): number
    {
        return 4;
    }
}

//creating an object from a class
let car = new Car(5);
car.accelerate();
car.getSpeed();
console.log(Car.numberWheels());