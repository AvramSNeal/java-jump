// Typescripts are strong typing which allows us to define types for our variables and class members.
var myString;
myString = 'This is a String';
//myString = 4;
// Hence there is a compilation error encountered when wrong datatype values are assigned
// Typescript many only infers values when those values are assigned at the declaration.
var yetAnotherString;
yetAnotherString = "This is a string";
// Typescript does not know the type in the above declaration, therefore we don't get an error.. Here we are
// also ignoring TypeScripts strength: Typing
yetAnotherString = 5;
// TypeScript can also infer types
var anotherString = 'This is a string without :string'; // => Type 'string' was inferred from the assigned
// value
// TypeScript will still result in a compilation error if a number is assigned to the above variable declaration.
//anotherString = 5;
// Other basic types
var aString;
var aNumber;
var aBoolean;
var anArray; // This is a generic type => May only hold 'strings' in this case
var anything; // Any can be used if we don't know the actual type ==> use it rarely!
// we also get void(=> nothing) and enums (a set of numeric values).
