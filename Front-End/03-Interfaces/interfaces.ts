//interfaces allow us to create contracts of other classes or objects which have to be implemented
//It allows to use them to defien custome types without creating classes
//interfaces are not compiled to js. its just for validating done by ts compiler

//Example interface
interface User
{
    username: String;
    password: String;
    confirmPassword?: String; //optinal property -> does no thave to be implemented
}

let User:User; //user variable is implementing the user interface

//this value does satisfy the interface
User = {username:'Matt',password:'test123'}

//value does not staisfy
//User = {username:'Matt',anyNumber: 5}

//interfaace can conatin functions
interface CanDrive
{
    accerlarate(speed:number): void;
}

let car1:CanDrive = 
{
    accerlarate:function(speed:number)
    {
        //....
    }
};