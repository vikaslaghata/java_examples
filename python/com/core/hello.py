from math import sqrt # load math module

num1 = 10
str1 = "Hello world"
print(str1.upper()+" \n\nfrom python " + str(num1 + len(str1))) # upper, new line, length, convert number to string

print(str(str1.index("wor"))) # index

print(str1.replace("Hello", "Hi")) # replace
print(str1) # no change even after replace

#number = input("Enter any number for square root: ")

#print("Square root of 16 is "+str(sqrt(float(number))))  # convert number to float, sqrt and then convert into string

list_of_friends = ["f1", "f2", "f3"]
print(list_of_friends)  # print complete list
print("Your second friend is: "+list_of_friends[1])
print(list_of_friends[1:3])  # print list from index 1 to 3(3 is not included)
print(list_of_friends[2:])  # print all elements from index 2
print(list_of_friends.index("f3"))  # check if f3 present in the list

list_of_friends.append("f4")
list_of_friends.insert(2, "f_in_between")
list_of_friends.remove("f3")
print(list_of_friends)

list_of_friends.sort()
print(list_of_friends)

list_of_friends.reverse()
print(list_of_friends)

coordinate = (4, 5)  # Tuple, you can't change the value once initialized, check the difference with list
print(coordinate[1])


def say_hello(user_name, age):  # Functions defination
    print("Hello "+user_name+" your age: "+str(age))
    return True


if say_hello("Vikas", 35):  # call to function and if condition
    print("Function worked perfectly")
else:
    print("Something is wrong in say_hello function")


