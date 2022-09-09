user_first_exam_score = input("Please enter your first exams score :")
user_second_exam_score = input("Please enter your second exams score :")
user_third_exam_score = input("Please enter your third exams score :")
average = (int(user_first_exam_score) + int(user_second_exam_score) + int(user_third_exam_score)) / 3
if average >= 90:
    print("Your average score is :" + str(average))
    print("Your grade is :A")
elif average >= 80 and average < 90:
    print("Your average score is :" +str(average))
    print("Your grade is :B")
elif average >= 70 and average < 80:
    print("Your average score is :" +str(average))
    print("Your grade is :C")
elif average < 70:
    print("Your average score is :" + str(average))
    print("Your grade is :F")
