package main

import "fmt"

func main() {
	for i := 0; i < 5; i++ {
		fmt.Print(i)
	}
	fmt.Println()

	numbers := []int{1, 2, 3, 4, 5}

	for _, number := range numbers {
		fmt.Print(number)
	}
	fmt.Println()
	fmt.Println("Калькулятор")

	var num1, num2, result float64
	var operator string

	fmt.Println("Enter two numbers and an operator (+, -, *, /): ")
	fmt.Scanf("%f %f %s", &num1, &num2, &operator)

	switch operator {
	case "+":
		result = num1 + num2
	case "-":
		result = num1 - num2
	case "*":
		result = num1 * num2
	case "/":
		result = num1 / num2
	default:
		fmt.Println("Invalid operator")
	}

	fmt.Printf("%f %s %f = %f", num1, operator, num2, result)
}
