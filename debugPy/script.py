def divide_numbers(a, b):
    try:  
        return a / b
    except ZeroDivisionError:
        return "ERROR - Not divisible"
    
result = divide_numbers(10, 2)
print(f"Result is: {result}")