employee_file = open("employee.txt", "r")  # open file in read mode

if employee_file.readable():
    for employee in employee_file.readlines():
        print(employee)

employee_file.close()
# =========================================
employee_file = open("employee.txt", "a")  # open file in append mode
employee_file.write("\nemp4    - HR")  # append new line at the end of file

employee_file.close()

# =========================================

employee_file = open("employee_new.txt", "w")  # open file in write mode, it will create new file if not exist
employee_file.write("\nemp_new    - Something")  # overwrite all existing data

employee_file.close()



