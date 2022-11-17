function large3(){

num1 = Prompt("Enter num 1")\

num2 = Prompt("Enter num 2")

num3 = Prompt("Enter num 3")

if(num1 >= num2 && num1 >= num3) {
    largest = num1;
}
else if (num2 >= num1 && num2 >= num3) {
    largest = num2;
}
else {
    largest = num3;
}
}
// display the result
console.log("The largest number is " + largest);