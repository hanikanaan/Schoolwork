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
