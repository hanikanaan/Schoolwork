import random


def strings():
	name = input('What is your name? ')
	favorite_color = input('What is your favorite color? ')
	print(name + "'s favorite color is " + favorite_color)
	birth_year = int(input('What year were you born? '))
	age = 2021 - birth_year
	print(type(birth_year))
	print('You are ' + str(age) + ' years old')
	weight_in_lbs = input('What is your weight in pounds? ')
	weight_in_kgs = int(weight_in_lbs) / 2.2
	print('Your weight in kilograms is ' + str(weight_in_kgs) + '.')
	name = 'Jennifer'
	print(name[1:-1])
	x = 10
	for i in range(10):
		x *= 2
		print(x)


def find_max():
	numbers = []
	user_input = ''
	while user_input.lower() != 'exit':
		user_input = input('Enter a number or "exit" to exit: ')
		if user_input.lower() == 'exit':
			break
		else:
			numbers.append(int(user_input))
		user_input = ''
	while user_input.lower() != 'exit':
		user_input = input('Enter a number or "exit" to exit: ')
		if user_input.lower() == 'exit':
			break
		else:
			numbers.append(int(user_input))
	i = 1
	max = numbers[0]
	for i in range(len(numbers)):
		if max < numbers[i]:
			max = numbers[i]
			i += 1
	print(max)


def find_max_given(numbers):
	max = numbers[0]
	for i in range(len(numbers)):
		if max < numbers[i]:
			max = numbers[i]
			i += 1
	print(max)


def conditionals():
	good_credit = True
	price = 1000000
	if good_credit:
		downpayment = price * 0.1
	else:
		downpayment = price * 0.2
	print(f"Down payment: ${downpayment}")
	has_high_income = False
	has_good_credit = False
	if has_good_credit or has_high_income:
		print("Eligible for a loan.")
	else:
		print("Not eligible for a loan.")
	has_good_credit = True
	has_criminal_record = True
	if has_good_credit and not has_criminal_record:
		print("Eligible for loan")
	else:
		print("Not eligible for loan")
	name = input('Please enter your name: ')
	if len(name) < 3:
		print('ERROR: NAME MUST BE AT LEAST 3 CHARACTERS.')
	elif len(name) > 50:
		print('ERROR: NAME MUST BE AT MOST 50 CHARACTERS')
	else:
		print('Hello, ' + name)
	weight = input('Enter your weight: ')
	units = input('Enter the unit, L for pounds or K for kilograms: ')
	if units.upper() == 'L':
		weight_converted = int(weight) / 2.2
		print(f'You weigh {round(weight_converted)}kgs')
	else:
		weight_converted = int(weight) * 2.2
		print(f'You weigh {round(weight_converted)}lbs')
	secret = random.randint(1, 10)
	i = 0
	max_guess_count = 3
	while i < max_guess_count:
		guess = input('Guess the number: ')
		if int(guess) == secret:
			print(f'Correct! The secret number is {guess}!')
			break
		else:
			print('Incorrect! Please try again.')
		i += 1
		if i == max_guess_count:
			print(f"Sorry, you were unable to guess the secret number, which is {secret}")
			break

	car_is_started = False
	while True:
		user_input = input("> ").lower()
		if user_input == "start" and not car_is_started:
			print("Car started...ready to go!")
			car_is_started = True
		elif user_input == "start" and car_is_started:
			print("Car is already on!")
		elif user_input == "stop" and car_is_started:
			print("Car stopped.")
			car_is_started = False
		elif user_input == "stop" and not car_is_started:
			print("Car is already stopped!")
		elif user_input == "quit":
			break
		elif user_input == "help":
			print("""start - to start the car\nstop - to stop the car\nquit - to quit""")
		else:
			print("I don't understand that...")


def lists():
	names = ['John', 'Bob', 'Mosh', 'Sarah', 'Mary']
	print(names[0])
	numbers = []
	user_input = ''
	while user_input.lower() != 'exit':
		user_input = input('Enter a number or "exit" to exit: ')
		if user_input.lower() == 'exit':
			break
		else:
			numbers.append(int(user_input))
		user_input = ''
	while user_input.lower() != 'exit':
		user_input = input('Enter a number or "exit" to exit: ')
		if user_input.lower() == 'exit':
			break
		else:
			numbers.append(int(user_input))
	i = 1
	max = numbers[0]
	for i in range(len(numbers)):
		if max < numbers[i]:
			max = numbers[i]
			i += 1
	print(max)
	uniques = []
	for number in numbers:
		if number not in uniques:
			uniques.append(number)
	print(uniques)


def dictionary():
	digits_mapping = {
		"1": "One",
		"2": "Two",
		"3": "Three",
		"4": "Four",
		"5": "Five",
		"6": "Six",
		"7": "Seven",
		"8": "Eight",
		"9": "Nine",
		"0": "Zero"
	}
	phone = input("Phone: ")
	output = ''
	for ch in phone:
		output += digits_mapping.get(ch, "!") + " "
	print(output)


class Point:
	def __init__(self, x, y):
		self.x = x
		self.y = y

	def move(self):
		print("move")

	def draw(self):
		print("draw")


class Person:
	def __init__(self, name):
		self.name = name

	def talk(self):
		print(f"Hi, I am {self.name}")


class Dice:
	def roll(self):
		first = random.randint(1, 6)
		second = random.randint(1, 6)
		return first, second


dice = Dice()

print(dice.roll())
